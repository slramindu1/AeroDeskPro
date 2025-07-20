package dev.aerodeskpro.gui;

import com.formdev.flatlaf.FlatIntelliJLaf;
import dev.aerodeskpro.connection.MySQL;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AddFlight extends javax.swing.JDialog {

    public AddFlight(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    private void init() {
        generateFlightID();
        loadAirplaneId();
        loadPilot();
        loadGate();
        loadCopilot();
        startPointTxt.setText("Kstunayaka International airport");
    }

    private void loadAirplaneId() {
        try {
            ResultSet rs = MySQL.execute("SELECT * FROM airplane ");
            DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel<>();

            while (rs.next()) {
                int id = rs.getInt("airplane_id");
                String model = rs.getString("airplane_model");
                String regNo = rs.getString("reg_no");
                String manufacturer = rs.getString("manufacturer");

               

                String displayText = id + " " +  model + " " + regNo + " "+ manufacturer;                 // Combine all details into one string}
                // Add to combo box model
                dcm.addElement(displayText);
            }

            airplaneCombo.setModel(dcm);

        } catch (SQLException e) {
            e.printStackTrace(); // Or proper logging
        }
    }

    
    
    private void loadPilot() {
        try {
            ResultSet rs = MySQL.execute("SELECT * FROM pilot");
            DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel<>();

            while (rs.next()) {
                String pilotId = rs.getString("pilot_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String name = firstName + " " + lastName;

                String displayText = pilotId + " - " + name;
                dcm.addElement(displayText);
            }

            pilotCombo.setModel(dcm);

        } catch (SQLException e) {
            e.printStackTrace(); // Or use proper logging
        }
    }

    private void loadCopilot() {
        try {
            ResultSet rs = MySQL.execute("SELECT * FROM copilot");
            DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel<>();

            while (rs.next()) {
                String pilotId = rs.getString("copilot_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String name = firstName + " " + lastName;

                String displayText = pilotId + " - " + name;
                dcm.addElement(displayText);
            }

            copilotCombo.setModel(dcm);

        } catch (SQLException e) {
            e.printStackTrace(); // Or use proper logging
        }
    }
    
        private void loadGate() {
        try {
            ResultSet rs = MySQL.execute("SELECT * FROM gate");
            DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel<>();

            while (rs.next()) {
                String id = String.valueOf(rs.getString("gate_id"));
                String gate = rs.getString("gate_number");
                String name = id + " " + gate;

                dcm.addElement(name);
            }

            gateCombo.setModel(dcm);

        } catch (SQLException e) {
            e.printStackTrace(); // Or use proper logging
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTimeChooserPanel2 = new dev.aerodeskpro.components.DateTimeChooserPanel();
        roundPanel1 = new dev.aerodeskpro.components.RoundPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        startTime = new dev.aerodeskpro.components.DateTimeChooserPanel();
        endTime = new dev.aerodeskpro.components.DateTimeChooserPanel();
        roundPanel2 = new dev.aerodeskpro.components.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        flightId = new dev.aerodeskpro.components.inputField();
        roundPanel3 = new dev.aerodeskpro.components.RoundPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        airplaneCombo = new javax.swing.JComboBox<>();
        seatCapacityText = new dev.aerodeskpro.components.inputField();
        roundPanel4 = new dev.aerodeskpro.components.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        startPointTxt = new dev.aerodeskpro.components.inputField();
        endPointTxt = new dev.aerodeskpro.components.inputField();
        roundPanel5 = new dev.aerodeskpro.components.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        roundPanel6 = new dev.aerodeskpro.components.RoundPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pilotCombo = new javax.swing.JComboBox<>();
        copilotCombo = new javax.swing.JComboBox<>();
        roundPanel7 = new dev.aerodeskpro.components.RoundPanel();
        jLabel8 = new javax.swing.JLabel();
        gateCombo = new javax.swing.JComboBox<>();
        primaryBtn1 = new dev.aerodeskpro.components.PrimaryBtn();
        roundPanel8 = new dev.aerodeskpro.components.RoundPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        distancetxt1 = new dev.aerodeskpro.components.inputField();
        activityTxt1 = new dev.aerodeskpro.components.inputField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(65, 65, 200));

        roundPanel1.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel4.setText("Start Time");
        roundPanel1.add(jLabel4);

        jLabel5.setText("End Time");
        roundPanel1.add(jLabel5);
        roundPanel1.add(startTime);
        roundPanel1.add(endTime);

        roundPanel2.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Flight ID");
        roundPanel2.add(jLabel6);

        flightId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        roundPanel2.add(flightId);

        roundPanel3.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel9.setText("Airplane ID");
        roundPanel3.add(jLabel9);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel13.setText("Seat Capacity");
        roundPanel3.add(jLabel13);

        airplaneCombo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        airplaneCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roundPanel3.add(airplaneCombo);

        seatCapacityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatCapacityTextActionPerformed(evt);
            }
        });
        roundPanel3.add(seatCapacityText);

        roundPanel4.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Start Point");
        roundPanel4.add(jLabel3);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("End Point");
        roundPanel4.add(jLabel10);
        roundPanel4.add(startPointTxt);
        roundPanel4.add(endPointTxt);

        roundPanel5.setBackground(new java.awt.Color(65, 65, 200));
        roundPanel5.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Flight Details");

        javax.swing.GroupLayout roundPanel5Layout = new javax.swing.GroupLayout(roundPanel5);
        roundPanel5.setLayout(roundPanel5Layout);
        roundPanel5Layout.setHorizontalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        roundPanel5Layout.setVerticalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        roundPanel6.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel7.setText("Pilot");
        roundPanel6.add(jLabel7);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel11.setText("Co-pilot");
        roundPanel6.add(jLabel11);

        pilotCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roundPanel6.add(pilotCombo);

        copilotCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roundPanel6.add(copilotCombo);

        roundPanel7.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel8.setText("Gate");
        roundPanel7.add(jLabel8);

        gateCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roundPanel7.add(gateCombo);

        primaryBtn1.setText("Add Flight");
        primaryBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primaryBtn1ActionPerformed(evt);
            }
        });

        roundPanel8.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel14.setText("Distance");
        roundPanel8.add(jLabel14);

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel15.setText("Activity Station");
        roundPanel8.add(jLabel15);
        roundPanel8.add(distancetxt1);
        roundPanel8.add(activityTxt1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(roundPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(roundPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roundPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(primaryBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(primaryBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void seatCapacityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatCapacityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatCapacityTextActionPerformed

    private void generateFlightID() {
        try {
            ResultSet rs = MySQL.execute("SELECT COUNT(*) AS total FROM flight");
            if (rs.next()) {
                int count = rs.getInt("total") + 1;
                String newId = String.format("FLT_%03d", count);
                flightId.setText(newId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to generate Officer ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void primaryBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primaryBtn1ActionPerformed
         try {
        String id = flightId.getText();
        String airplaneInfo = (String) airplaneCombo.getSelectedItem();
        String seatCapacity = seatCapacityText.getText();
        String startPoint = startPointTxt.getText();
        String endPoint = endPointTxt.getText();
        String startDateTime = startTime.getSqlDateTimeString();
        String endDateTime = endTime.getSqlDateTimeString();

        String pilotInfo = (String) pilotCombo.getSelectedItem();
        String copilotInfo = (String) copilotCombo.getSelectedItem();
        String distance = distancetxt1.getText();  // Fixed variable name
        String activity = activityTxt1.getText();  // Fixed variable name

        // Extract IDs from combo selections - more robust extraction
        String airplaneId = airplaneInfo.split(" ")[0];
        String pilotId = pilotInfo.split(" - ")[0];
        String copilotId = copilotInfo.split(" - ")[0];
        String gateId = (String) gateCombo.getSelectedItem();


        // Validate required fields
        if (id.isEmpty() || airplaneId.isEmpty() || seatCapacity.isEmpty() || 
            startPoint.isEmpty() || endPoint.isEmpty() || startDateTime.isEmpty() || 
            endDateTime.isEmpty() || pilotId.isEmpty() || copilotId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all required fields", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // INSERT query with corrected column names
        String query = String.format(
                "INSERT INTO flight (flight_id, airplane_id, seat_capasity, start_point, end_airport_id, " +
                "start_time, end_time, pilot_id, copilot_id, distance, action, status_status_id) " +
                "VALUES ('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', 1)",
                id, airplaneId, seatCapacity, startPoint, endPoint, 
                startDateTime, endDateTime, pilotId, copilotId, distance, activity
        );

        MySQL.execute(query);
        JOptionPane.showMessageDialog(this, "Flight added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        dispose(); // close dialog

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to add flight: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_primaryBtn1ActionPerformed

    public static void main(String args[]) {

        FlatIntelliJLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddFlight dialog = new AddFlight(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dev.aerodeskpro.components.inputField activityTxt1;
    private javax.swing.JComboBox<String> airplaneCombo;
    private javax.swing.JComboBox<String> copilotCombo;
    private dev.aerodeskpro.components.DateTimeChooserPanel dateTimeChooserPanel2;
    private dev.aerodeskpro.components.inputField distancetxt1;
    private dev.aerodeskpro.components.inputField endPointTxt;
    private dev.aerodeskpro.components.DateTimeChooserPanel endTime;
    private dev.aerodeskpro.components.inputField flightId;
    private javax.swing.JComboBox<String> gateCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> pilotCombo;
    private dev.aerodeskpro.components.PrimaryBtn primaryBtn1;
    private dev.aerodeskpro.components.RoundPanel roundPanel1;
    private dev.aerodeskpro.components.RoundPanel roundPanel2;
    private dev.aerodeskpro.components.RoundPanel roundPanel3;
    private dev.aerodeskpro.components.RoundPanel roundPanel4;
    private dev.aerodeskpro.components.RoundPanel roundPanel5;
    private dev.aerodeskpro.components.RoundPanel roundPanel6;
    private dev.aerodeskpro.components.RoundPanel roundPanel7;
    private dev.aerodeskpro.components.RoundPanel roundPanel8;
    private dev.aerodeskpro.components.inputField seatCapacityText;
    private dev.aerodeskpro.components.inputField startPointTxt;
    private dev.aerodeskpro.components.DateTimeChooserPanel startTime;
    // End of variables declaration//GEN-END:variables
}
