import controlers.*;

import java.util.ArrayList;
import java.sql.*;
import java.time.Instant;
import javax.swing.table.DefaultTableModel;
//import java.util.*;

public class pharmacie extends javax.swing.JFrame {
    public pharmacie() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        acheter_medic_input = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        acheter_medic_table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        acheter_quantite = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        acheter_client_input = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        acheter_clients_table = new javax.swing.JTable();
        acheter_medic_btn = new javax.swing.JButton();
        acheter_client_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        checker_cash = new javax.swing.JRadioButton();
        checker_solde = new javax.swing.JRadioButton();
        checker_carte = new javax.swing.JRadioButton();
        acheterBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        acheter_medic_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        acheter_client_id = new javax.swing.JTextField();
        acheter_message = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        cin_label = new javax.swing.JPanel();
        nom_label = new javax.swing.JLabel();
        nom_input = new javax.swing.JTextField();
        prenom_label = new javax.swing.JLabel();
        prenom_input = new javax.swing.JTextField();
        cin_input = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        phone_label = new javax.swing.JLabel();
        phone_input = new javax.swing.JTextField();
        adresse_label = new javax.swing.JLabel();
        adresse_input = new javax.swing.JTextField();
        carte_num_label = new javax.swing.JLabel();
        carte_num_input = new javax.swing.JTextField();
        carte_date_label = new javax.swing.JLabel();
        carte_date_input = new javax.swing.JTextField();
        carte_cvc_label = new javax.swing.JLabel();
        carte_cvc_input = new javax.swing.JTextField();
        balance_label = new javax.swing.JLabel();
        balance_input = new javax.swing.JTextField();
        addClientButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clients_table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        chercher_client_label = new javax.swing.JLabel();
        chercher_client_input = new javax.swing.JTextField();
        searchClientButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        chercher_clients_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        cin_input1 = new javax.swing.JLabel();
        carte_cvc_input1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        phone_label1 = new javax.swing.JLabel();
        phone_input1 = new javax.swing.JTextField();
        updateClientButton = new javax.swing.JButton();
        adresse_label1 = new javax.swing.JLabel();
        adresse_input1 = new javax.swing.JTextField();
        carte_num_label1 = new javax.swing.JLabel();
        carte_num_input1 = new javax.swing.JTextField();
        carte_date_label1 = new javax.swing.JLabel();
        nom_label1 = new javax.swing.JLabel();
        nom_input1 = new javax.swing.JTextField();
        prenom_label1 = new javax.swing.JLabel();
        carte_date_input1 = new javax.swing.JTextField();
        prenom_input1 = new javax.swing.JTextField();
        carte_cvc_label1 = new javax.swing.JLabel();
        modifier_client_id_label = new javax.swing.JLabel();
        modifier_client_id_input = new javax.swing.JTextField();
        deleteClientButton = new javax.swing.JButton();
        verser_input = new javax.swing.JTextField();
        verser_label = new javax.swing.JLabel();
        verserButton = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        achats_table = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        achats_chercher_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        achats_chercher_input = new javax.swing.JTextField();
        achat_chercher_buttonn = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        cin_label1 = new javax.swing.JPanel();
        medic_nom = new javax.swing.JLabel();
        medic_nom_input = new javax.swing.JTextField();
        medic_prix = new javax.swing.JLabel();
        medic_prix_input = new javax.swing.JTextField();
        medic_quantite = new javax.swing.JLabel();
        medic_quantite_input = new javax.swing.JTextField();
        medic_description = new javax.swing.JLabel();
        addMedicButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        medics_table = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        medic_description_input = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        chercher_client_label1 = new javax.swing.JLabel();
        chercher_medic_input = new javax.swing.JTextField();
        searchMedicButton = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        chercher_medics_table = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        cin_input3 = new javax.swing.JLabel();
        updateMedicButton = new javax.swing.JButton();
        nom_label3 = new javax.swing.JLabel();
        modifier_medic_nom_input = new javax.swing.JTextField();
        prenom_label3 = new javax.swing.JLabel();
        modifier_medic_prix_input = new javax.swing.JTextField();
        modifier_client_id_label1 = new javax.swing.JLabel();
        modifier_medic_id_input = new javax.swing.JTextField();
        deleteMedicButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        modifier_medic_description_input = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        modifier_medic_quantite_input = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setText("nom du médicament");

        acheter_medic_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nom", "prix", "quantite", "description"
            }
        ));
        jScrollPane10.setViewportView(acheter_medic_table);

        jLabel4.setText("quantité voulé");

        jLabel5.setText("nom du client");

        acheter_clients_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nom", "prenom", "cin", "balance"
            }
        ));
        jScrollPane9.setViewportView(acheter_clients_table);

        acheter_medic_btn.setText("verifier medicament");
        acheter_medic_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acheter_medic_btnMouseClicked(evt);
            }
        });

        acheter_client_btn.setText("verifier client");
        acheter_client_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acheter_client_btnMouseClicked(evt);
            }
        });

        jLabel6.setText("choisir la methode de paiment");

        checker_cash.setText("cash");
        checker_cash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checker_cashMouseClicked(evt);
            }
        });

        checker_solde.setText("solde");
        checker_solde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checker_soldeMouseClicked(evt);
            }
        });

        checker_carte.setText("carte bancaire");
        checker_carte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checker_carteMouseClicked(evt);
            }
        });

        acheterBtn.setText("effectuer l'achat");
        acheterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acheterBtnMouseClicked(evt);
            }
        });

        jLabel8.setText("id du medicament");

        jLabel9.setText("id du client");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checker_carte)
                            .addComponent(jLabel6)
                            .addComponent(checker_cash)
                            .addComponent(checker_solde))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(acheter_medic_input)
                                        .addComponent(acheter_client_input, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                    .addComponent(acheter_medic_btn)
                                    .addComponent(acheter_client_btn)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(acheter_client_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(acheter_quantite, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                        .addComponent(acheter_medic_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(367, 367, 367)
                                .addComponent(acheterBtn)
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(acheter_message)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(acheter_medic_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acheter_medic_btn))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acheter_client_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acheter_client_btn))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checker_cash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checker_solde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checker_carte)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(acheter_quantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(acheter_medic_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acheter_client_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acheterBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(acheter_message)
                .addGap(52, 52, 52))
        );

        jTabbedPane1.addTab("home", jPanel1);

        nom_label.setText("nom");

        prenom_label.setText("prenom");

        cin_input.setText("cin");

        phone_label.setText("phone");

        adresse_label.setText("adresse");

        carte_num_label.setText("numérau du carte bancaire");

        carte_date_label.setText("date d'expiration du carte bancaire");

        carte_cvc_label.setText("code cvc");

        balance_label.setText("balance");

        addClientButton.setText("ajouter");
        addClientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addClientButtonMouseClicked(evt);
            }
        });

        clients_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nom", "prenom", "cin", "phone", "adresse", "balance", "date de creation"
            }
        ));
        jScrollPane1.setViewportView(clients_table);

        javax.swing.GroupLayout cin_labelLayout = new javax.swing.GroupLayout(cin_label);
        cin_label.setLayout(cin_labelLayout);
        cin_labelLayout.setHorizontalGroup(
            cin_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cin_labelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cin_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carte_date_label, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(balance_input)
                    .addComponent(carte_date_input)
                    .addComponent(carte_num_input)
                    .addComponent(adresse_input)
                    .addComponent(phone_input)
                    .addComponent(jTextField3)
                    .addComponent(prenom_input)
                    .addComponent(nom_input)
                    .addComponent(carte_cvc_input)
                    .addGroup(cin_labelLayout.createSequentialGroup()
                        .addGroup(cin_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nom_label)
                            .addComponent(cin_input)
                            .addComponent(phone_label)
                            .addComponent(adresse_label)
                            .addComponent(carte_num_label)
                            .addComponent(carte_cvc_label)
                            .addComponent(balance_label)
                            .addComponent(prenom_label)
                            .addComponent(addClientButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
        );
        cin_labelLayout.setVerticalGroup(
            cin_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cin_labelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cin_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cin_labelLayout.createSequentialGroup()
                        .addComponent(nom_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nom_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(prenom_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prenom_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cin_input)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adresse_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adresse_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carte_num_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carte_num_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carte_date_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carte_date_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carte_cvc_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carte_cvc_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balance_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(balance_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(addClientButton))
                    .addComponent(jScrollPane1))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ajouter un client", cin_label);

        chercher_client_label.setText("chercher un client");

        searchClientButton.setText("chercher");
        searchClientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchClientButtonMouseClicked(evt);
            }
        });

        chercher_clients_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nom", "prenom", "cin", "phone", "adresse", "balance", "numerau carte bancaire", "date d'expiration de la carte", "code cvc", "date du dernier virment", "quantité du dernier virment ", "date de creation"
            }
        ));
        jScrollPane2.setViewportView(chercher_clients_table);
        if (chercher_clients_table.getColumnModel().getColumnCount() > 0) {
            chercher_clients_table.getColumnModel().getColumn(4).setHeaderValue("phone");
            chercher_clients_table.getColumnModel().getColumn(5).setHeaderValue("adresse");
            chercher_clients_table.getColumnModel().getColumn(7).setHeaderValue("numerau carte bancaire");
            chercher_clients_table.getColumnModel().getColumn(8).setHeaderValue("date d'expiration de la carte");
            chercher_clients_table.getColumnModel().getColumn(9).setHeaderValue("code cvc");
            chercher_clients_table.getColumnModel().getColumn(10).setHeaderValue("date du dernier virment");
            chercher_clients_table.getColumnModel().getColumn(11).setHeaderValue("quantité du dernier virment ");
            chercher_clients_table.getColumnModel().getColumn(12).setHeaderValue("date de creation");
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(chercher_client_label)
                        .addGap(18, 18, 18)
                        .addComponent(chercher_client_input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchClientButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chercher_client_label)
                    .addComponent(chercher_client_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchClientButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("chercher un client", jPanel4);

        cin_input1.setText("cin");

        phone_label1.setText("phone");

        updateClientButton.setText("modifier");
        updateClientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateClientButtonMouseClicked(evt);
            }
        });

        adresse_label1.setText("adresse");

        carte_num_label1.setText("numérau du carte bancaire");

        carte_date_label1.setText("date d'expiration du carte bancaire");

        nom_label1.setText("nom");

        prenom_label1.setText("prenom");

        carte_cvc_label1.setText("code cvc");

        modifier_client_id_label.setText("id du client a modifier ou supprimer");

        deleteClientButton.setText("supprimer");
        deleteClientButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteClientButtonMouseClicked(evt);
            }
        });

        verser_label.setText("entrer la montant du virment dans le solde du client");

        verserButton.setText("verser");
        verserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verserButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carte_date_label1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateClientButton)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(carte_cvc_input1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(adresse_input1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(phone_input1)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(jTextField4)
                                                            .addComponent(prenom_input1, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(nom_input1, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(modifier_client_id_label, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(nom_label1, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(prenom_label1, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(cin_input1, javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(modifier_client_id_input, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                                        .addComponent(phone_label1)))
                                                .addComponent(adresse_label1))
                                            .addComponent(carte_num_label1)
                                            .addComponent(carte_date_input1)
                                            .addComponent(carte_num_input1))
                                        .addComponent(carte_cvc_label1)))
                                .addGap(18, 18, 18)
                                .addComponent(deleteClientButton)
                                .addGap(173, 173, 173)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(verser_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(verser_input)
                                    .addComponent(verserButton))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifier_client_id_label)
                    .addComponent(verser_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifier_client_id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteClientButton)
                    .addComponent(verser_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom_label1)
                    .addComponent(verserButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nom_input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prenom_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prenom_input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cin_input1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phone_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phone_input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adresse_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adresse_input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carte_num_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carte_num_input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carte_date_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carte_date_input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carte_cvc_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(carte_cvc_input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(updateClientButton)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("modifier ou supprimer client", jPanel3);

        jTabbedPane1.addTab("clients", jTabbedPane2);

        achats_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nom medicament", "nom client", "quantite", "methode de paiment", "date d'achat"
            }
        ));
        jScrollPane4.setViewportView(achats_table);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("tableau des achats", jPanel5);

        achats_chercher_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nom medicament", "nom client", "quantite", "methode de paiment", "date d'achat"
            }
        ));
        jScrollPane3.setViewportView(achats_chercher_table);

        jLabel1.setText("chercher un achat par nom du client ou nom du medicament: ");

        achat_chercher_buttonn.setText("chercher");
        achat_chercher_buttonn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                achat_chercher_buttonnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(achats_chercher_input, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(achat_chercher_buttonn)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(achats_chercher_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(achat_chercher_buttonn))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("chercher un achat", jPanel6);

        jTabbedPane1.addTab("achats", jTabbedPane3);

        medic_nom.setText("nom");

        medic_prix.setText("prix");

        medic_quantite.setText("quantite");

        medic_description.setText("description");

        addMedicButton.setText("ajouter");
        addMedicButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMedicButtonMouseClicked(evt);
            }
        });

        medics_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nom", "prix", "quantite", "description", "date de modification", "date_creation"
            }
        ));
        jScrollPane5.setViewportView(medics_table);

        medic_description_input.setColumns(20);
        medic_description_input.setRows(5);
        jScrollPane7.setViewportView(medic_description_input);

        javax.swing.GroupLayout cin_label1Layout = new javax.swing.GroupLayout(cin_label1);
        cin_label1.setLayout(cin_label1Layout);
        cin_label1Layout.setHorizontalGroup(
            cin_label1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cin_label1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cin_label1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medic_quantite_input)
                    .addComponent(medic_prix_input)
                    .addComponent(medic_nom_input)
                    .addGroup(cin_label1Layout.createSequentialGroup()
                        .addGroup(cin_label1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medic_nom)
                            .addComponent(medic_quantite)
                            .addComponent(medic_description)
                            .addComponent(medic_prix)
                            .addComponent(addMedicButton))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );
        cin_label1Layout.setVerticalGroup(
            cin_label1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cin_label1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cin_label1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cin_label1Layout.createSequentialGroup()
                        .addComponent(medic_nom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medic_nom_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(medic_prix)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medic_prix_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medic_quantite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medic_quantite_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medic_description)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addMedicButton))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cin_label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cin_label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("tableau des medicaments", jPanel2);

        chercher_client_label1.setText("chercher un medicament ");

        searchMedicButton.setText("chercher");
        searchMedicButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMedicButtonMouseClicked(evt);
            }
        });

        chercher_medics_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nom", "prix", "quantite", "description", "date de modification", "date_creation"
            }
        ));
        jScrollPane8.setViewportView(chercher_medics_table);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chercher_client_label1)
                .addGap(18, 18, 18)
                .addComponent(chercher_medic_input, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchMedicButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chercher_client_label1)
                    .addComponent(chercher_medic_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchMedicButton))
                .addContainerGap(507, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(57, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(57, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 799, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("chercher dans medicaments", jPanel7);

        cin_input3.setText("description");

        updateMedicButton.setText("modifier");
        updateMedicButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMedicButtonMouseClicked(evt);
            }
        });

        nom_label3.setText("nom");

        prenom_label3.setText("prix");

        modifier_client_id_label1.setText("id du medicament a modifier ou supprimer");

        deleteMedicButton.setText("supprimer");
        deleteMedicButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMedicButtonMouseClicked(evt);
            }
        });

        modifier_medic_description_input.setColumns(20);
        modifier_medic_description_input.setRows(5);
        jScrollPane6.setViewportView(modifier_medic_description_input);

        jLabel2.setText("quantite");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateMedicButton)
                    .addComponent(jLabel2)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(modifier_medic_quantite_input, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modifier_medic_prix_input, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modifier_medic_nom_input, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modifier_client_id_label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nom_label3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenom_label3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cin_input3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modifier_medic_id_input, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(deleteMedicButton)))
                .addContainerGap(496, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modifier_client_id_label1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifier_medic_id_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteMedicButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nom_label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifier_medic_nom_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prenom_label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifier_medic_prix_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modifier_medic_quantite_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cin_input3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateMedicButton)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane4.addTab("modifier ou supprimer medicament", jPanel8);

        jTabbedPane1.addTab("medicaments", jTabbedPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //____________________CLIENTS:
    // GET ALL CLIENTS:
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.getClients();
        this.getAchats();
        this.getMedics();
    }//GEN-LAST:event_formWindowOpened

    // ADD CLIENT:
    private void addClientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addClientButtonMouseClicked
        // TODO add your handling code here:
        String nom = nom_input.getText();
        String prenom = prenom_input.getText();
        String cin = cin_input.getText();
        String phone = phone_input.getText();
        String adresse = adresse_input.getText();
        String carte_num = carte_num_input.getText();
        String carte_date_exp = carte_date_input.getText();
        int carte_code_cvc = Integer.parseInt(carte_cvc_input.getText());
        int balance = Integer.parseInt(balance_input.getText());
        Date date_dernier_virment = new Date(Instant.now().toEpochMilli());
        int quantite_dernier_virment = balance;

        Client newClient = new Client(nom, prenom, cin, phone, adresse, carte_num, carte_date_exp, carte_code_cvc, balance, date_dernier_virment,
            quantite_dernier_virment);

        Client.insertClient(conn, newClient);
        System.out.println("client inserted");

        this.getClients();
    }//GEN-LAST:event_addClientButtonMouseClicked

    // SEARCH IN CLIENTS:
    private void searchClientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchClientButtonMouseClicked
        // TODO add your handling code here:
        DefaultTableModel chercher_clients_table_model = (DefaultTableModel) chercher_clients_table.getModel();
        
        int nr = chercher_clients_table_model.getRowCount();
        chercher_clients_table_model.setRowCount(0);
                
        ArrayList<Client> clients = Client.searchClients(conn, chercher_client_input.getText());
        clients.forEach( (client) -> {
            System.out.println(client.date_creation.toString());
            String date = client.date_creation.toString();
            chercher_clients_table_model.addRow(new Object[]{client.id, client.nom, client.prenom, client.cin, client.phone, client.adresse, client.balance, client.carte_num, client.carte_date_exp, client.carte_code_cvc, client.date_dernier_virment, client.quantite_dernier_virment, client.date_creation, });
        });
    }//GEN-LAST:event_searchClientButtonMouseClicked

    // UPDATE A CLIENT:
    private void updateClientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateClientButtonMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(modifier_client_id_input.getText());
        String nom1 = nom_input1.getText();
        String prenom1 = prenom_input1.getText();
        String cin1= cin_input1.getText();
        String phone1 = phone_input1.getText();
        String adresse1 = adresse_input1.getText();
        String carte_num1 = carte_num_input1.getText();
        String carte_date_exp1 = carte_date_input1.getText();
        int carte_code_cvc1 = 0;
        
        if(!carte_cvc_input1.getText().isEmpty()){
            carte_code_cvc1 = Integer.parseInt(carte_cvc_input1.getText());
        }
        
        System.out.println("before search");
        Client oldClient = Client.getClient(conn, id);
        System.out.println("after search");
        
        if(!nom1.isEmpty() && !nom1.equals(oldClient.nom)){
            oldClient.nom = nom1;
        }

        if(!prenom1.isEmpty() && !prenom1.equals(oldClient.prenom)){
            oldClient.prenom = prenom1;
        }

        if(!cin1.isEmpty() && !cin1.equals(oldClient.cin)){
            oldClient.cin = cin1;
        }

        if(!phone1.isEmpty() && !phone1.equals(oldClient.phone)){
            oldClient.phone = phone1;
        }

        if(!adresse1.isEmpty() && !adresse1.equals(oldClient.adresse)){
            oldClient.adresse = adresse1;
        }

        if(!carte_num1.isEmpty() && !carte_num1.equals(oldClient.carte_num)){
            oldClient.carte_num = carte_num1;
        }

        if(!carte_date_exp1.isEmpty() && !carte_date_exp1.equals(oldClient.carte_date_exp)){
            oldClient.carte_date_exp = carte_date_exp1;
        }

        if( carte_code_cvc1 > 0 && carte_code_cvc1 != oldClient.carte_code_cvc){
            oldClient.carte_code_cvc = carte_code_cvc1;
        }

        Client.updateClient(conn, oldClient);

        this.getClients();
    }//GEN-LAST:event_updateClientButtonMouseClicked

    // DELETE A CLIENT:
    private void deleteClientButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteClientButtonMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(modifier_client_id_input.getText());
        Client.deleteClient(conn, id);
        this.getClients();
    }//GEN-LAST:event_deleteClientButtonMouseClicked

    // EDIT CLIENTS SOLDE:
    private void verserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verserButtonMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(modifier_client_id_input.getText());
        int newBalance = 0;
        
        if(!verser_input.getText().isEmpty()){
            newBalance = Integer.parseInt(verser_input.getText());
            
            Client oldClient = Client.getClient(conn, id);

            oldClient.balance = newBalance;

            Client.updateClient(conn, oldClient);
            
            this.getClients();
        }
    }//GEN-LAST:event_verserButtonMouseClicked

    //___________________ACHATS:
    // SEARCH FOR ACHATS:
    private void achat_chercher_buttonnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_achat_chercher_buttonnMouseClicked
        // TODO add your handling code here:
        DefaultTableModel achats_chercher_table_model = (DefaultTableModel) achats_chercher_table.getModel();
        
        int nr = achats_chercher_table_model.getRowCount();
        achats_chercher_table_model.setRowCount(0);
                
        ArrayList<Achat> achats = Achat.searchAchats(conn, achats_chercher_input.getText());
        achats.forEach( (achat) -> {
            achats_chercher_table_model.addRow(new Object[]{achat.medic_nom, achat.client_nom, achat.quantite, achat.methode_paiment, achat.date_creation });
        });
    }//GEN-LAST:event_achat_chercher_buttonnMouseClicked

    //_________________MEDICS:
    // ADD MEDICAMENT:
    private void addMedicButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMedicButtonMouseClicked
        // TODO add your handling code here:
        String nom = medic_nom_input.getText();
        int prix = Integer.parseInt(medic_prix_input.getText());
        int quantite = Integer.parseInt(medic_quantite_input.getText());
        String description = medic_description_input.getText();

        Medicament medic = new Medicament(nom, quantite, prix, description);

        Medicament.insertMedic(conn, medic);

        this.getMedics();
    }//GEN-LAST:event_addMedicButtonMouseClicked

    // SEARCH MEDICAMENT:
    private void searchMedicButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMedicButtonMouseClicked
        // TODO add your handling code here:
        DefaultTableModel chercher_medics_table_model = (DefaultTableModel) chercher_medics_table.getModel();
        
        int nr = chercher_medics_table_model.getRowCount();
        chercher_medics_table_model.setRowCount(0);
        
        ArrayList<Medicament> medics = Medicament.searchMedics(conn, chercher_medic_input.getText());
        
        medics.forEach( (medic) -> {
            chercher_medics_table_model.addRow(new Object[]{medic.id, medic.nom, medic.prix, medic.quantite, medic.description, medic.date_modification, medic.date_creation });
        });
    }//GEN-LAST:event_searchMedicButtonMouseClicked

    // UPDATE MEDICAMENT:
    private void updateMedicButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMedicButtonMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(modifier_medic_id_input.getText());
        String nom = modifier_medic_nom_input.getText();
        int prix = 0;
        int quantite = 0;
        String description = modifier_medic_description_input.getText();
        
        Medicament oldMedic = Medicament.getMedic(conn, id);
        
        if(!nom.isEmpty() && !nom.equals(oldMedic.nom)){
            oldMedic.nom = nom;
        }

        if(!modifier_medic_prix_input.getText().isEmpty()){
            oldMedic.prix = Integer.parseInt(modifier_medic_prix_input.getText());;
        }

        if(!modifier_medic_quantite_input.getText().isEmpty()){
            oldMedic.quantite = Integer.parseInt(modifier_medic_quantite_input.getText());
        }
        
        if(!description.isEmpty() && !description.equals(oldMedic.description)){
            oldMedic.description = description;
        }

        Medicament.updateMedic(conn, oldMedic);

        this.getMedics();
    }//GEN-LAST:event_updateMedicButtonMouseClicked

    // DELETE MEDICAMENT:
    private void deleteMedicButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMedicButtonMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(modifier_medic_id_input.getText());
        Medicament.deleteMedic(conn, id);
        this.getMedics();
    }//GEN-LAST:event_deleteMedicButtonMouseClicked

    //___________HOME:
    // VERIFY MEDICS:
    private void acheter_medic_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acheter_medic_btnMouseClicked
        // TODO add your handling code here:
        DefaultTableModel acheter_medic_table_model = (DefaultTableModel) acheter_medic_table.getModel();
        
        int nr = acheter_medic_table_model.getRowCount();
        acheter_medic_table_model.setRowCount(0);
        
        ArrayList<Medicament> medics = Medicament.searchMedics(conn, acheter_medic_input.getText());
        
        medics.forEach( (medic) -> {
            acheter_medic_table_model.addRow(new Object[]{medic.id, medic.nom, medic.prix, medic.quantite, medic.description});
        });
    }//GEN-LAST:event_acheter_medic_btnMouseClicked

    // VERIFY CLIENT:
    private void acheter_client_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acheter_client_btnMouseClicked
        // TODO add your handling code here:
        DefaultTableModel acheter_clients_table_model = (DefaultTableModel) acheter_clients_table.getModel();
        
        int nr = acheter_clients_table_model.getRowCount();
        acheter_clients_table_model.setRowCount(0);
        
        ArrayList<Client> clients = Client.searchClients(conn, acheter_client_input.getText());
        
        clients.forEach( (client) -> {
            acheter_clients_table_model.addRow(new Object[]{client.id, client.nom, client.prenom, client.cin, client.balance});
        });
    }//GEN-LAST:event_acheter_client_btnMouseClicked

    // EFFECTUER L'ACHAT:
    private void acheterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acheterBtnMouseClicked
        // TODO add your handling code here:
        acheter_message.setText("achat en cours");
        
        int quantite = 0;
        if(!acheter_quantite.getText().isEmpty()){
            quantite = Integer.parseInt(acheter_quantite.getText());
        }

        int medic_id = 0;
        Medicament medic = null;
        if(!acheter_medic_id.getText().isEmpty()){
            medic_id = Integer.parseInt(acheter_medic_id.getText());
            medic = Medicament.getMedic(conn, medic_id);
        }

        int client_id = 0;
        Client client = null;
        if(!acheter_client_id.getText().isEmpty()){
            client_id = Integer.parseInt(acheter_client_id.getText());
            client = Client.getClient(conn, client_id);
        }
        
        if( medic_id != 0 || quantite != 0 ){
            if(checker_cash.isSelected()){
                Achat newAchat = null;
                if(client_id == 0){
                    newAchat = new Achat( medic_id, medic.nom, quantite, "cash");
                    medic.quantite -= quantite;
                    Medicament.updateMedic(conn, medic);
                }else{
                    newAchat = new Achat( medic_id, medic.nom, client_id, client.nom, quantite, "cash");
                }

                Achat.insertAchat(conn, newAchat);
                acheter_message.setText("achat effectuer");
            }

            if(checker_solde.isSelected()){
                Achat newAchat = null;
                if(client_id == 0){
                    acheter_message.setText("impossible d'effectuer un paiment par solde pour un client non enregistrer");
                }else{
                    if(client.balance >= medic.prix * quantite){
                        newAchat = new Achat( medic_id, medic.nom, client_id, client.nom, quantite, "solde");

                        medic.quantite -= quantite;
                        Medicament.updateMedic(conn, medic);

                        client.balance -= quantite * medic.prix;
                        Client.updateClient(conn, client);

                        Achat.insertAchat(conn, newAchat);
                        acheter_message.setText("achat effectuer");
                    } else {
                        acheter_message.setText("le client " + client.nom + "na pas du solde suffisant");
                    }
                }
            }

            if(checker_carte.isSelected()){
                Achat newAchat = null;
                if(client_id == 0){
                    acheter_message.setText("impossible d'effectuer un paiment par carte pour un client non enregistrer");
                }else{
                    newAchat = new Achat( medic_id, medic.nom, client_id, client.nom, quantite, "carte");

                    medic.quantite -= quantite;
                    Medicament.updateMedic(conn, medic);

                    Achat.insertAchat(conn, newAchat);
                    acheter_message.setText("achat effectuer");
                }
            }
            
            this.getAchats();
            this.getClients();
            this.getMedics();
        } else {
            acheter_message.setText("pas de medicament ou quantite choisit");
        }
    }//GEN-LAST:event_acheterBtnMouseClicked

    private void checker_cashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checker_cashMouseClicked
        // TODO add your handling code here:
        if(checker_solde.isSelected()){
            checker_solde.doClick();
        }
        
        if(checker_carte.isSelected()){
            checker_carte.doClick();
        }
    }//GEN-LAST:event_checker_cashMouseClicked

    private void checker_soldeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checker_soldeMouseClicked
        // TODO add your handling code here:
        if(checker_cash.isSelected()){
            checker_cash.doClick();
        }
        
        if(checker_carte.isSelected()){
            checker_carte.doClick();
        }
    }//GEN-LAST:event_checker_soldeMouseClicked

    private void checker_carteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checker_carteMouseClicked
        // TODO add your handling code here:
        if(checker_solde.isSelected()){
            checker_solde.doClick();
        }
        
        if(checker_cash.isSelected()){
            checker_cash.doClick();
        }
    }//GEN-LAST:event_checker_carteMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pharmacie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pharmacie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pharmacie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pharmacie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /** START MY CODE **/
        Connection connection = PharmacieDB.connectDB();
        setConnection(connection);
        
        /** END MY CODE **/
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pharmacie().setVisible(true);
            }
        });
        
        // CLOSE DB CONNECTION:
        //PharmacieDB.closeConnection(conn);
    }

    public static Connection conn = null;
    private static void setConnection(Connection connection){
        conn = connection;
    }
    
    private void getClients(){        
        DefaultTableModel clients_table_model = (DefaultTableModel) clients_table.getModel();
        
        int nr = clients_table_model.getRowCount();
        clients_table_model.setRowCount(0);
                
        ArrayList<Client> clients = Client.getClients(conn);
        clients.forEach( (client) -> {
            clients_table_model.addRow(new Object[]{client.nom, client.prenom, client.cin, client.phone, client.adresse, client.balance, client.date_creation });
        });
    }
    
    public void getAchats() {
        DefaultTableModel achats_table_model = (DefaultTableModel) achats_table.getModel();
        
        int nr = achats_table_model.getRowCount();
        achats_table_model.setRowCount(0);
                
        ArrayList<Achat> achats = Achat.getAchats(conn);
        achats.forEach( (achat) -> {
            achats_table_model.addRow(new Object[]{achat.medic_nom, achat.client_nom, achat.quantite, achat.methode_paiment, achat.date_creation });
        });
    }
 
    public void getMedics(){
        DefaultTableModel medics_table_model = (DefaultTableModel) medics_table.getModel();
        
        int nr = medics_table_model.getRowCount();
        medics_table_model.setRowCount(0);
                
        ArrayList<Medicament> medics = Medicament.getMedics(conn);
        
        medics.forEach( (medic) -> {
            medics_table_model.addRow(new Object[]{ medic.nom, medic.prix, medic.quantite, medic.description, medic.date_modification, medic.date_creation });
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton achat_chercher_buttonn;
    private javax.swing.JTextField achats_chercher_input;
    private javax.swing.JTable achats_chercher_table;
    private javax.swing.JTable achats_table;
    private javax.swing.JButton acheterBtn;
    private javax.swing.JButton acheter_client_btn;
    private javax.swing.JTextField acheter_client_id;
    private javax.swing.JTextField acheter_client_input;
    private javax.swing.JTable acheter_clients_table;
    private javax.swing.JButton acheter_medic_btn;
    private javax.swing.JTextField acheter_medic_id;
    private javax.swing.JTextField acheter_medic_input;
    private javax.swing.JTable acheter_medic_table;
    private javax.swing.JLabel acheter_message;
    private javax.swing.JTextField acheter_quantite;
    private javax.swing.JButton addClientButton;
    private javax.swing.JButton addMedicButton;
    private javax.swing.JTextField adresse_input;
    private javax.swing.JTextField adresse_input1;
    private javax.swing.JLabel adresse_label;
    private javax.swing.JLabel adresse_label1;
    private javax.swing.JTextField balance_input;
    private javax.swing.JLabel balance_label;
    private javax.swing.JTextField carte_cvc_input;
    private javax.swing.JTextField carte_cvc_input1;
    private javax.swing.JLabel carte_cvc_label;
    private javax.swing.JLabel carte_cvc_label1;
    private javax.swing.JTextField carte_date_input;
    private javax.swing.JTextField carte_date_input1;
    private javax.swing.JLabel carte_date_label;
    private javax.swing.JLabel carte_date_label1;
    private javax.swing.JTextField carte_num_input;
    private javax.swing.JTextField carte_num_input1;
    private javax.swing.JLabel carte_num_label;
    private javax.swing.JLabel carte_num_label1;
    private javax.swing.JRadioButton checker_carte;
    private javax.swing.JRadioButton checker_cash;
    private javax.swing.JRadioButton checker_solde;
    private javax.swing.JTextField chercher_client_input;
    private javax.swing.JLabel chercher_client_label;
    private javax.swing.JLabel chercher_client_label1;
    private javax.swing.JTable chercher_clients_table;
    private javax.swing.JTextField chercher_medic_input;
    private javax.swing.JTable chercher_medics_table;
    private javax.swing.JLabel cin_input;
    private javax.swing.JLabel cin_input1;
    private javax.swing.JLabel cin_input3;
    private javax.swing.JPanel cin_label;
    private javax.swing.JPanel cin_label1;
    private javax.swing.JTable clients_table;
    private javax.swing.JButton deleteClientButton;
    private javax.swing.JButton deleteMedicButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel medic_description;
    private javax.swing.JTextArea medic_description_input;
    private javax.swing.JLabel medic_nom;
    private javax.swing.JTextField medic_nom_input;
    private javax.swing.JLabel medic_prix;
    private javax.swing.JTextField medic_prix_input;
    private javax.swing.JLabel medic_quantite;
    private javax.swing.JTextField medic_quantite_input;
    private javax.swing.JTable medics_table;
    private javax.swing.JTextField modifier_client_id_input;
    private javax.swing.JLabel modifier_client_id_label;
    private javax.swing.JLabel modifier_client_id_label1;
    private javax.swing.JTextArea modifier_medic_description_input;
    private javax.swing.JTextField modifier_medic_id_input;
    private javax.swing.JTextField modifier_medic_nom_input;
    private javax.swing.JTextField modifier_medic_prix_input;
    private javax.swing.JTextField modifier_medic_quantite_input;
    private javax.swing.JTextField nom_input;
    private javax.swing.JTextField nom_input1;
    private javax.swing.JLabel nom_label;
    private javax.swing.JLabel nom_label1;
    private javax.swing.JLabel nom_label3;
    private javax.swing.JTextField phone_input;
    private javax.swing.JTextField phone_input1;
    private javax.swing.JLabel phone_label;
    private javax.swing.JLabel phone_label1;
    private javax.swing.JTextField prenom_input;
    private javax.swing.JTextField prenom_input1;
    private javax.swing.JLabel prenom_label;
    private javax.swing.JLabel prenom_label1;
    private javax.swing.JLabel prenom_label3;
    private javax.swing.JButton searchClientButton;
    private javax.swing.JButton searchMedicButton;
    private javax.swing.JButton updateClientButton;
    private javax.swing.JButton updateMedicButton;
    private javax.swing.JButton verserButton;
    private javax.swing.JTextField verser_input;
    private javax.swing.JLabel verser_label;
    // End of variables declaration//GEN-END:variables
}
