package dev.aerodeskpro.gui;

import dev.aerodeskpro.connection.MySQL;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class FlightManagement extends javax.swing.JFrame {

    public FlightManagement() {
        initComponents();
        init();
        
    }
    
     

    private void init() {
        loadFlightDataDetails();
        JTableHeader header = flightTable.getTableHeader();
        header.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 14));
        header.setBackground(new Color(0, 102, 204));
        header.setForeground(new Color(0, 102, 204));
        header.setPreferredSize(new Dimension(0, 40));

        //passengerTable.setSelectionBackground(new Color(102,126,234, 80));
        //passengerTable.setSelectionForeground(new Color(102,126,234));
    }

    public void loadFlightDataDetails() {

        try {

            ResultSet rs = MySQL.execute("SELECT * FROM `flight` ");

            DefaultTableModel dtm = (DefaultTableModel) flightTable.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector<String> data = new Vector<>();

                data.add(rs.getString("flight_id"));
                data.add(rs.getString("airplane_id"));
                data.add(rs.getString("start_point"));
                data.add(rs.getString("end_airport_id"));
                data.add(rs.getString("start_time"));
                data.add(rs.getString("end_time"));
                data.add(rs.getString("distance"));
                data.add(rs.getString("pilot_id"));
                data.add(rs.getString("gate_id"));
                data.add(rs.getString("flight_status_id"));

                dtm.addRow(data);

            }

        } catch (SQLException e) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        flightTable = new javax.swing.JTable();
        addBtnFlight = new javax.swing.JPanel();
        primaryBtn1 = new lk.tchk.component.PrimaryBtn();
        seconderyBtn1 = new lk.tchk.component.SeconderyBtn();
        SearchField = new lk.tchk.component.inputField();
        addBtnFlight1 = new javax.swing.JPanel();
        roundPanel1 = new lk.tchk.component.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        AddBtn = new lk.tchk.component.PrimaryBtn();
        seconderyBtn2 = new lk.tchk.component.SeconderyBtn();
        SearchField1 = new lk.tchk.component.inputField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flight Management");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        scrollPane.setBackground(new java.awt.Color(51, 153, 255));

        flightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "Airplane ID", "Start Point", "End Point", "Start Time", "End Time", "Seat Capacity", "Booked Seats", "Pilot", "Gate", "Flight Status", "Action", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        flightTable.setColumnSelectionAllowed(true);
        scrollPane.setViewportView(flightTable);
        flightTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        addBtnFlight.setBackground(new java.awt.Color(255, 255, 255));

        primaryBtn1.setText("Edit");

        seconderyBtn1.setText("Edit");
        seconderyBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seconderyBtn1ActionPerformed(evt);
            }
        });

        addBtnFlight1.setBackground(new java.awt.Color(255, 255, 255));

        roundPanel1.setBackground(new java.awt.Color(65, 65, 200));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Flight Assign Management");

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        AddBtn.setText("Add ");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        seconderyBtn2.setText("Edit");
        seconderyBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seconderyBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addBtnFlight1Layout = new javax.swing.GroupLayout(addBtnFlight1);
        addBtnFlight1.setLayout(addBtnFlight1Layout);
        addBtnFlight1Layout.setHorizontalGroup(
            addBtnFlight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBtnFlight1Layout.createSequentialGroup()
                .addGroup(addBtnFlight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBtnFlight1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addBtnFlight1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seconderyBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(addBtnFlight1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(SearchField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(297, 297, 297))
        );
        addBtnFlight1Layout.setVerticalGroup(
            addBtnFlight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBtnFlight1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addBtnFlight1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seconderyBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addBtnFlightLayout = new javax.swing.GroupLayout(addBtnFlight);
        addBtnFlight.setLayout(addBtnFlightLayout);
        addBtnFlightLayout.setHorizontalGroup(
            addBtnFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBtnFlightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(primaryBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seconderyBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(SearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addGap(282, 282, 282))
            .addGroup(addBtnFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addBtnFlightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(addBtnFlight1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        addBtnFlightLayout.setVerticalGroup(
            addBtnFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBtnFlightLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(addBtnFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primaryBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seconderyBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBtnFlightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(addBtnFlightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addBtnFlightLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(addBtnFlight1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addBtnFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(addBtnFlight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnFlightActionPerformed

    }//GEN-LAST:event_addBtnFlightActionPerformed

    private void editBtnFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnFlightActionPerformed
        
    }//GEN-LAST:event_editBtnFlightActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
//        AddFlight addFlight = new AddFlight(this, rootPaneCheckingEnabled);
//        addFlight.setLocationRelativeTo(this);
//        addFlight.setVisible(true);
    }//GEN-LAST:event_AddBtnActionPerformed

    private void seconderyBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seconderyBtn1ActionPerformed
        //        UpdateFlight updateFlight = new UpdateFlight(this, rootPaneCheckingEnabled);
        //        updateFlight.setLocationRelativeTo(this);
        //        updateFlight.setVisible(true);
    }//GEN-LAST:event_seconderyBtn1ActionPerformed

    private void seconderyBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seconderyBtn2ActionPerformed
        //        UpdateFlight updateFlight = new UpdateFlight(this, rootPaneCheckingEnabled);
        //        updateFlight.setLocationRelativeTo(this);
        //        updateFlight.setVisible(true);
    }//GEN-LAST:event_seconderyBtn2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlightManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lk.tchk.component.PrimaryBtn AddBtn;
    private lk.tchk.component.inputField SearchField;
    private lk.tchk.component.inputField SearchField1;
    private javax.swing.JPanel addBtnFlight;
    private javax.swing.JPanel addBtnFlight1;
    private javax.swing.JTable flightTable;
    private javax.swing.JLabel jLabel1;
    private lk.tchk.component.PrimaryBtn primaryBtn1;
    private lk.tchk.component.RoundPanel roundPanel1;
    private javax.swing.JScrollPane scrollPane;
    private lk.tchk.component.SeconderyBtn seconderyBtn1;
    private lk.tchk.component.SeconderyBtn seconderyBtn2;
    // End of variables declaration//GEN-END:variables
}
