package controlers;

import java.sql.*;
import java.util.ArrayList;

public class Medicament {
    public int id;
    public String nom;
    public int quantite;
    public int prix;
    public String description;
    public Timestamp date_modification;
    public Timestamp date_creation;

    // C O N S T R U C T O R S :
    public Medicament(int id, String nom, int quantite, int prix, String description, Timestamp date_modification, Timestamp date_creation) {
        this.id = id;
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
        this.description = description;
        this.date_modification = date_modification;
        this.date_creation = date_creation;
    }

    public Medicament(String nom, int quantite, int prix, String description) {
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
        this.description = description;
    }

    // S T A T I C ___ M E T H O D S :
    public static ArrayList<Medicament> getMedics(Connection conn) {
        ArrayList<Medicament> medics = new ArrayList<Medicament>();

        try {
            Statement mysql = conn.createStatement();
            String query = "SELECT * FROM medicaments";
            ResultSet data = mysql.executeQuery(query);

            while (data.next()) {
                int id = data.getInt("id");
                String nom = data.getString("nom");
                int prix = data.getInt("prix");
                int quantite = data.getInt("quantite");
                String description = data.getString("description");
                Timestamp date_modification = data.getTimestamp("date_modification");
                Timestamp date_creation = data.getTimestamp("date_creation");

                Medicament medic = new Medicament(id, nom, quantite, prix, description, date_modification, date_creation);
                
                medics.add(medic);
            }

            mysql.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("CANNOT GET MEDICAMANTS");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return medics;
    }

    public static Medicament getMedic(Connection conn, int medic_id) {
        Medicament medic = null;

        try {
            Statement mysql = conn.createStatement();

            String query = "SELECT * FROM medicaments WHERE id=" + medic_id;

            ResultSet data = mysql.executeQuery(query);

            if (data.next()) {
                int id = data.getInt("id");
                String nom = data.getString("nom");
                int prix = data.getInt("prix");
                int quantite = data.getInt("quantite");
                String description = data.getString("description");
                Timestamp date_modification = data.getTimestamp("date_modification");
                Timestamp date_creation = data.getTimestamp("date_creation");

                medic = new Medicament(id, nom, quantite, prix, description, date_modification, date_creation);
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

        return medic;
    }

    public static ArrayList<Medicament> searchMedics(Connection conn, String medic_name) {
        ArrayList<Medicament> medics = new ArrayList<Medicament>();

        try {
            Statement mysql = conn.createStatement();
            String query = "SELECT * FROM medicaments WHERE nom LIKE '%" + medic_name +"%'";
            ResultSet data = mysql.executeQuery(query);

            while (data.next()) {
                int id = data.getInt("id");
                String nom = data.getString("nom");
                int prix = data.getInt("prix");
                int quantite = data.getInt("quantite");
                String description = data.getString("description");
                Timestamp date_modification = data.getTimestamp("date_modification");
                Timestamp date_creation = data.getTimestamp("date_creation");

                Medicament medic = new Medicament(id, nom, quantite, prix, description, date_modification, date_creation);
                
                medics.add(medic);
            }

            mysql.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("CANNOT GET MEDICAMENTS");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return medics;
    }

    public static int insertMedic(Connection conn, Medicament newMedic) {
        try {
            Statement mysql = conn.createStatement();

            String query = "INSERT INTO medicaments ( nom, quantite, prix, description) VALUES ('"
                    + newMedic.nom + "', '" + newMedic.quantite + "', '" + newMedic.prix + "', '" + newMedic.description + "')";

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

    public static int updateMedic(Connection conn, Medicament newMedic) {
        try {
            Statement mysql = conn.createStatement();

            String query = "UPDATE medicaments SET " 
                    + "nom = '" + newMedic.nom + "', " 
                    + "quantite = '" + newMedic.quantite + "', " 
                    + "prix = '" + newMedic.prix + "', " 
                    + "description = '" + newMedic.description + "' " 
                    + "WHERE id=" + newMedic.id;

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

    public static int deleteMedic(Connection conn, int medic_id) {
        try {
            Statement mysql = conn.createStatement();

            String query = "DELETE FROM medicaments WHERE id=" + medic_id;

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


