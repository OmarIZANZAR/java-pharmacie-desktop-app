package controlers;

import java.sql.*;
import java.util.ArrayList;

public class Achat {
    public int id;
    public int client_id;
    public String client_nom;
    public int medic_id;
    public String medic_nom;
    public int quantite;
    public String methode_paiment;
    public Timestamp date_creation;

    // C O N S T R U C T O R S :
    public Achat(int id, int medic_id, String medic_nom, int client_id, String client_nom, int quantite, String methode_paiment, Timestamp date_creation) {
        this.id = id;
        this.client_id = client_id;
        this.client_nom = client_nom;
        this.medic_id = medic_id;
        this.medic_nom = medic_nom;
        this.quantite = quantite;
        this.methode_paiment = methode_paiment;
        this.date_creation = date_creation;
    }

    public Achat(int medic_id, String medic_nom, int client_id, String client_nom, int quantite, String methode_paiment) {
        this.client_id = client_id;
        this.client_nom = client_nom;
        this.medic_id = medic_id;
        this.medic_nom = medic_nom;
        this.quantite = quantite;
        this.methode_paiment = methode_paiment;
    }
    
    public Achat(int medic_id, String medic_nom, int quantite, String methode_paiment) {
        this.medic_id = medic_id;
        this.medic_nom = medic_nom;
        this.quantite = quantite;
        this.methode_paiment = methode_paiment;
    }

    // S T A T I C ___ M E T H O D S :
    public static ArrayList<Achat> getAchats(Connection conn) {
        ArrayList<Achat> achats = new ArrayList<Achat>();

        try {
            Statement mysql = conn.createStatement();
            String query = "SELECT * FROM achats";
            ResultSet data = mysql.executeQuery(query);

            while (data.next()) {
                int id = data.getInt("id");
                int client_id = data.getInt("client_id");
                String client_nom = data.getString("client_nom");
                int medic_id = data.getInt("medic_id");
                String medic_nom = data.getString("medic_nom");
                int quantite = data.getInt("quantite");
                String methode_paiment = data.getString("methode_paiment");
                Timestamp date_creation = data.getTimestamp("date_creation");

                Achat achat = new Achat(id, medic_id, medic_nom, client_id, client_nom, quantite, methode_paiment, date_creation);

                achats.add(achat);
            }

            mysql.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("CANNOT GET ACHATS");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return achats;
    }

    public static Achat getAchat(Connection conn, int achat_id) {
        Achat achat = null;

        try {
            Statement mysql = conn.createStatement();

            String query = "SELECT * FROM achats WHERE id=" + achat_id;

            ResultSet data = mysql.executeQuery(query);

            if (data.next()) {
                int id = data.getInt("id");
                int client_id = data.getInt("client_id");
                String client_nom = data.getString("client_nom");
                int medic_id = data.getInt("medic_id");
                String medic_nom = data.getString("medic_nom");
                int quantite = data.getInt("quantite");
                String methode_paiment = data.getString("methode_paiment");
                Timestamp date_creation = data.getTimestamp("date_creation");

                achat = new Achat(id, medic_id, medic_nom, client_id, client_nom, quantite, methode_paiment, date_creation);
            } else {
                return null;
            }

            mysql.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return achat;
    }

    public static ArrayList<Achat> searchAchats(Connection conn, String searchText) {
        ArrayList<Achat> achats = new ArrayList<Achat>();

        try {
            Statement mysql = conn.createStatement();
            String query = "SELECT * FROM achats WHERE client_nom LIKE '%" + searchText + "%' OR medic_nom LIKE '%"
                    + searchText + "%'";

            ResultSet data = mysql.executeQuery(query);

            while (data.next()) {
                int id = data.getInt("id");
                int client_id = data.getInt("client_id");
                String client_nom = data.getString("client_nom");
                int medic_id = data.getInt("medic_id");
                String medic_nom = data.getString("medic_nom");
                int quantite = data.getInt("quantite");
                String methode_paiment = data.getString("methode_paiment");
                Timestamp date_creation = data.getTimestamp("date_creation");

                Achat achat = new Achat(id, medic_id, medic_nom, client_id, client_nom, quantite, methode_paiment, date_creation);

                achats.add(achat);
            }

            mysql.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("CANNOT GET ACHATS");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return achats;
    }

    public static int insertAchat(Connection conn, Achat newAchat) {
        try {
            Statement mysql = conn.createStatement();

            String query = "INSERT INTO achats (client_id, client_nom, medic_id, medic_nom, quantite, methode_paiment) VALUES ('"
                    + newAchat.client_id + "', '"
                    + newAchat.client_nom + "', '"
                    + newAchat.medic_id + "', '"
                    + newAchat.medic_nom + "', '" 
                    + newAchat.quantite + "', '" 
                    + newAchat.methode_paiment + "')";

            mysql.executeUpdate(query);
            
            mysql.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());

            return 0;
        }

        return 1;
    }

}


