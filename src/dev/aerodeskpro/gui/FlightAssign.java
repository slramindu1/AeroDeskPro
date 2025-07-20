package dev.aerodeskpro.gui;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import dev.aerodeskpro.connection.MySQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

public class FlightAssign extends javax.swing.JFrame {

    public FlightAssign() {
        initComponents();
        loadFlightId();
        loadPassengerAssignments();

    }

    private void loadFlightId() {
        try {
            ResultSet rs = MySQL.execute("SELECT * FROM `flight` WHERE `status_status_id` = '1'");
            DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel<>();

            while (rs.next()) {
                String flightId = rs.getString("flight_id");
                String startPoint = rs.getString("start_point");
                int endAirportID = rs.getInt("end_airport_id");

                // Fetch the end airport name
                ResultSet ars = MySQL.execute("SELECT `airport_name` FROM `airport` WHERE `airport_id` = '" + endAirportID + "'");
                String endAirport = "";
                if (ars.next()) {
                    endAirport = ars.getString("airport_name");
                }

                // Combine all details into one string
                String displayText = flightId + " - " + startPoint + " ➜ " + endAirport;

                // Add to combo box model
                dcm.addElement(displayText);
            }

            flightIdComboBox.setModel(dcm);

        } catch (SQLException e) {
            
            e.printStackTrace(); // Or proper logging
        }
    }

  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new dev.aerodeskpro.components.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        primaryBtn1 = new dev.aerodeskpro.components.PrimaryBtn();
        SearchField = new dev.aerodeskpro.components.inputField();
        roundPanel3 = new dev.aerodeskpro.components.RoundPanel();
        roundPanel2 = new dev.aerodeskpro.components.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passportInput = new dev.aerodeskpro.components.inputField();
        flightIdComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        roundPanel1.setBackground(new java.awt.Color(65, 65, 200));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Flight Assign Management");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        primaryBtn1.setText("Assign Passenget this Flight");
        primaryBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primaryBtn1ActionPerformed(evt);
            }
        });

        SearchField.setToolTipText("");
        SearchField.setOpaque(true);
        SearchField.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        SearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFieldActionPerformed(evt);
            }
        });
        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchFieldKeyReleased(evt);
            }
        });

        roundPanel2.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Passport Number");
        roundPanel2.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Flight ID");
        roundPanel2.add(jLabel3);
        roundPanel2.add(passportInput);

        flightIdComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roundPanel2.add(flightIdComboBox);

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(primaryBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addGap(275, 275, 275))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(primaryBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFieldActionPerformed
    }//GEN-LAST:event_SearchFieldActionPerformed

    private void SearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyReleased
        String keyword = SearchField.getText().trim();
        if (keyword.isEmpty()) {
            passportInput.setText(""); // Clear if empty
            return;
        }

        try {
            // SQL query for partial matching (case-insensitive if DB collation allows)
            String query = "SELECT `passport_number` FROM `passenger` WHERE `passport_number` LIKE '%" + keyword + "%'";

            ResultSet rs = MySQL.execute(query);

            if (rs.next()) {
                String foundPassport = rs.getString("passport_number");
                passportInput.setText(foundPassport);
            } else {
                passportInput.setText("");
                JOptionPane.showMessageDialog(this, "Passenger not found", "Not Found", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException e) {
            passportInput.setText("");
            JOptionPane.showMessageDialog(this, "Error searching passenger", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        if (keyword.isEmpty()) {
            passportInput.setText(""); // Clear if empty
            return;
        }

        try {
            // SQL query for partial matching (case-insensitive if DB collation allows)
            String query = "SELECT `passport_number` FROM `passenger` WHERE `passport_number` LIKE '%" + keyword + "%'";

            ResultSet rs = MySQL.execute(query);

            if (rs.next()) {
                String foundPassport = rs.getString("passport_number");
                passportInput.setText(foundPassport);
            } else {
                passportInput.setText("Not found");
            }

        } catch (SQLException e) {
            passportInput.setText("Error");
            e.printStackTrace();
        }


    }//GEN-LAST:event_SearchFieldKeyReleased

    private void primaryBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primaryBtn1ActionPerformed
     
      try {
    String passport = passportInput.getText().trim();
    Object selectedItem = flightIdComboBox.getSelectedItem();

    // Check if passport field is empty
    if (passport.isBlank()) {
        JOptionPane.showMessageDialog(this, "Passport Number is Empty..", "Empty Value", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Check if any item is selected
    if (selectedItem == null) {
        JOptionPane.showMessageDialog(this, "No flight selected.", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Convert selected item to string and extract flight ID
    String flightStr = selectedItem.toString();
    String flightIdStr = flightStr.split(" ")[0]; // gets "1" from "1 - CMB to DXB"
    int flight = Integer.parseInt(flightIdStr); // safely parse to int

    // Execute the insert
    MySQL.execute("INSERT INTO `flight_has_passenger` (`passport_number`, `flight_id`) VALUES "
            + "('" + passport + "', '" + flight + "')");

    JOptionPane.showMessageDialog(this, "Passenger Flight Booked successfully...", "Success", JOptionPane.INFORMATION_MESSAGE);
    
    loadPassengerAssignments();

} catch (SQLException | NumberFormatException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}


     
        
     
        

    }//GEN-LAST:event_primaryBtn1ActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup(); // or FlatDarkLaf.setup()

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightAssign().setVisible(true);
            }
        });
    }

    private void loadPassengerAssignments() {
        try {
            // Query to get passenger assignments with details
            String query = "SELECT fhp.passport_number, p.first_name, p.last_name, "
                    + "f.flight_id, f.start_point, a.airport_name AS end_point "
                    + "FROM flight_has_passenger fhp "
                    + "JOIN passenger p ON fhp.passport_number = p.passport_number "
                    + "JOIN flight f ON fhp.flight_id = f.flight_id "
                    + "JOIN airport a ON f.end_airport_id = a.airport_id "
                    + "ORDER BY f.flight_id";

            ResultSet rs = MySQL.execute(query);

            // Create table model
            javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                    new Object[][]{},
                    new String[]{"Passport", "First Name", "Last Name", "Flight ID", "From", "To"}
            ) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false; // Make table non-editable
                }
            };

            // Populate model with data
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("passport_number"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("flight_id"),
                    rs.getString("start_point"),
                    rs.getString("end_point")
                });
            }

            // Set model to table
            jTable1.setModel(model);

            // Auto-resize columns
            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setPreferredWidth(150);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading passenger assignments", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dev.aerodeskpro.components.inputField SearchField;
    private javax.swing.JComboBox<String> flightIdComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private dev.aerodeskpro.components.inputField passportInput;
    private dev.aerodeskpro.components.PrimaryBtn primaryBtn1;
    private dev.aerodeskpro.components.RoundPanel roundPanel1;
    private dev.aerodeskpro.components.RoundPanel roundPanel2;
    private dev.aerodeskpro.components.RoundPanel roundPanel3;
    // End of variables declaration//GEN-END:variables
}
