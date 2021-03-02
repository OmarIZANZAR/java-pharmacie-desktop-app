package controlers;

import java.sql.*;
import java.util.ArrayList;

public class Client {
    public int id;
    public String nom;
    public String prenom;
    public String cin;
    public String phone;
    public String adresse;
    public String carte_num;
    public String carte_date_exp;
    public int carte_code_cvc;
    public int balance;
    public Date date_dernier_virment;
    public int quantite_dernier_virment;
    public Timestamp date_creation;

    // C O N S T R U C T O R S :
    public Client(int id, String nom, String prenom, String cin, String phone, String adresse, String carte_num,
            String carte_date_exp, int carte_code_cvc, int balance, Date date_dernier_virment,
            int quantite_dernier_virment, Timestamp date_creation) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.phone = phone;
        this.adresse = adresse;
        this.carte_num = carte_num;
        this.carte_date_exp = carte_date_exp;
        this.carte_code_cvc = carte_code_cvc;
        this.balance = balance;
        this.date_dernier_virment = date_dernier_virment;
        this.quantite_dernier_virment = quantite_dernier_virment;
        this.date_creation = date_creation;
    }

    public Client(String nom, String prenom, String cin, String phone, String adresse, String carte_num,
            String carte_date_exp, int carte_code_cvc, int balance, Date date_dernier_virment,
            int quantite_dernier_virment) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.phone = phone;
        this.adresse = adresse;
        this.carte_num = carte_num;
        this.carte_date_exp = carte_date_exp;
        this.carte_code_cvc = carte_code_cvc;
        this.balance = balance;
        this.date_dernier_virment = date_dernier_virment;
        this.quantite_dernier_virment = quantite_dernier_virment;
    }
    
    // M E T H O D S :
    // buy a medic.
    // boost balance.

    // S T A T I C ___ M E T H O D S :
    public static ArrayList<Client> getClients(Connection conn) {
        ArrayList<Client> clients = new ArrayList<Client>();

        try {
            Statement mysql = conn.createStatement();
            String query = "SELECT * FROM clients";
            ResultSet data = mysql.executeQuery(query);

            while (data.next()) {
                int id = data.getInt("id");
                String nom = data.getString("nom");
                String prenom = data.getString("prenom");
                String cin = data.getString("cin");
                String phone = data.getString("phone");
                String adresse = data.getString("adresse");
                String carte_num = data.getString("carte_num");
                String carte_date_exp = data.getString("carte_date_exp");
                int carte_code_cvc = data.getInt("carte_code_cvc");
                int balance = data.getInt("balance");
                Date date_dernier_virment = data.getDate("date_dernier_virment");
                int quantite_dernier_virment = data.getInt("quantite_dernier_virment");
                Timestamp date_creation = data.getTimestamp("date_creation");

                Client client = new Client(id, nom, prenom, cin, phone, adresse, carte_num, carte_date_exp,
                        carte_code_cvc, balance, date_dernier_virment, quantite_dernier_virment, date_creation);

                clients.add(client);
            }

            mysql.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("CANNOT GET CLIENTS");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return clients;
    }

    public static Client getClient(Connection conn, int client_id) {
        Client client = null;

        try {
            Statement mysql = conn.createStatement();

            String query = "SELECT * FROM clients WHERE id=" + client_id;

            ResultSet data = mysql.executeQuery(query);

            if (data.next()) {
                int id = data.getInt("id");
                String nom = data.getString("nom");
                String prenom = data.getString("prenom");
                String cin = data.getString("cin");
                String phone = data.getString("phone");
                String adresse = data.getString("adresse");
                String carte_num = data.getString("carte_num");
                String carte_date_exp = data.getString("carte_date_exp");
                int carte_code_cvc = data.getInt("carte_code_cvc");
                int balance = data.getInt("balance");
                Date date_dernier_virment = data.getDate("date_dernier_virment");
                int quantite_dernier_virment = data.getInt("quantite_dernier_virment");
                Timestamp date_creation = data.getTimestamp("date_creation");

                client = new Client(id, nom, prenom, cin, phone, adresse, carte_num, carte_date_exp, carte_code_cvc,
                        balance, date_dernier_virment, quantite_dernier_virment, date_creation);
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

        return client;
    }

    public static ArrayList<Client> searchClients(Connection conn, String client_name) {
        ArrayList<Client> clients = new ArrayList<Client>();

        try {
            Statement mysql = conn.createStatement();
            String query = "SELECT * FROM clients WHERE nom LIKE '%" + client_name + "%' OR prenom LIKE '%"
                    + client_name + "%'";

            ResultSet data = mysql.executeQuery(query);

            while (data.next()) {
                int id = data.getInt("id");
                String nom = data.getString("nom");
                String prenom = data.getString("prenom");
                String cin = data.getString("cin");
                String phone = data.getString("phone");
                String adresse = data.getString("adresse");
                String carte_num = data.getString("carte_num");
                String carte_date_exp = data.getString("carte_date_exp");
                int carte_code_cvc = data.getInt("carte_code_cvc");
                int balance = data.getInt("balance");
                Date date_dernier_virment = data.getDate("date_dernier_virment");
                int quantite_dernier_virment = data.getInt("quantite_dernier_virment");
                Timestamp date_creation = data.getTimestamp("date_creation");

                Client client = new Client(id, nom, prenom, cin, phone, adresse, carte_num, carte_date_exp,
                        carte_code_cvc, balance, date_dernier_virment, quantite_dernier_virment, date_creation);

                clients.add(client);
            }

            mysql.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("CANNOT GET CLIENTS");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return clients;
    }

    public static int insertClient(Connection conn, Client newClient) {
        try {
            Statement mysql = conn.createStatement();

            String query = "INSERT INTO clients ( nom, prenom, cin, phone, adresse, carte_num, carte_date_exp, carte_code_cvc, balance, date_dernier_virment, quantite_dernier_virment) VALUES ('"
                    + newClient.nom + "', '" + newClient.prenom + "', '" + newClient.cin + "', '" + newClient.phone
                    + "', '" + newClient.adresse + "', '" + newClient.carte_num + "', '" + newClient.carte_date_exp
                    + "', '" + newClient.carte_code_cvc + "', '" + newClient.balance + "', '"
                    + newClient.date_dernier_virment + "', '" + newClient.quantite_dernier_virment + "')";

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

    public static int updateClient(Connection conn, Client newClient) {
        try {
            Statement mysql = conn.createStatement();

            String query = "UPDATE clients SET " + "nom = '" + newClient.nom + "', " + "prenom = '" + newClient.prenom
                    + "', " + "cin = '" + newClient.cin + "', " + "phone = '" + newClient.phone + "', " + "adresse = '"
                    + newClient.adresse + "', " + "carte_num = '" + newClient.carte_num + "', " + "carte_date_exp = '"
                    + newClient.carte_date_exp + "', " + "carte_code_cvc = '" + newClient.carte_code_cvc + "', "
                    + "balance = '" + newClient.balance + "', " + "date_dernier_virment = '"
                    + newClient.date_dernier_virment + "', " + "quantite_dernier_virment = '"
                    + newClient.quantite_dernier_virment + "' " + "WHERE id=" + newClient.id;

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

    public static int deleteClient(Connection conn, int client_id) {
        try {
            Statement mysql = conn.createStatement();

            String query = "DELETE FROM clients WHERE id=" + client_id;

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

