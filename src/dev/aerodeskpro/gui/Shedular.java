package dev.aerodeskpro.gui;

import com.formdev.flatlaf.FlatDarkLaf;
import dev.aerodeskpro.connection.MySQL;
import dev.aerodeskpro.components.DateTimeDragComponent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Shedular extends javax.swing.JFrame {

    public Shedular() {
        initComponents();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        //    localDate();
        setTitle("Airport Admin Dashboard");
        table1DataLoading();
        table2DataLoading();

        //tableDataLoading();
        init();

    }

    private void init() {
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPane3.getVerticalScrollBar().setUnitIncrement(20);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        dateTimeDragComponent1 = new dev.aerodeskpro.components.DateTimeDragComponent();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(44, 44, 119));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 28)); // NOI18N
        jLabel1.setText("Flight Schedular");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jtable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtable1.setForeground(new java.awt.Color(153, 0, 0));
        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight ID", "Air Plane REG.No", "Start Point", "End Point", "Start Time", "End Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtable1);

        jTable2.setForeground(new java.awt.Color(0, 51, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight ID", "Air Plane REG.No", "Start Point", "End Point", "Start Time", "End Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Depatures");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Arrivals");

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dev/aerodeskpro/img/image.png"))); // NOI18N

        javax.swing.GroupLayout dateTimeDragComponent1Layout = new javax.swing.GroupLayout(dateTimeDragComponent1);
        dateTimeDragComponent1.setLayout(dateTimeDragComponent1Layout);
        dateTimeDragComponent1Layout.setHorizontalGroup(
            dateTimeDragComponent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
        );
        dateTimeDragComponent1Layout.setVerticalGroup(
            dateTimeDragComponent1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(268, 268, 268))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(dateTimeDragComponent1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(180, 180, 180)))
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 458, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(dateTimeDragComponent1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addGap(87, 87, 87)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1443, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(JFrame.MAXIMIZED_BOTH);

    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        FlatDarkLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shedular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private dev.aerodeskpro.components.DateTimeDragComponent dateTimeDragComponent1;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jtable1;
    // End of variables declaration//GEN-END:variables

    private void table1DataLoading() {
        try {
            ResultSet rs = MySQL.executeSearch("SELECT * FROM `flight` WHERE `action` = '1'");

            DefaultTableModel dtm = (DefaultTableModel) jtable1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector<String> data = new Vector<>();
                data.add(rs.getString("flight_id"));

                int airId = rs.getInt("airplane_id");
                ResultSet rs1 = MySQL.executeSearch("SELECT * FROM `airplane` WHERE `airplane_id` = " + airId);
                if (rs1.next()) {
                    data.add(rs1.getString("reg_no"));
                } else {
                    data.add("N/A"); // or leave empty
                }

                data.add(rs.getString("start_point"));

                int endPort = rs.getInt("end_airport_id");
                ResultSet rs2 = MySQL.executeSearch("SELECT * FROM `airport` WHERE `airport_id` = " + endPort);
                if (rs2.next()) {
                    data.add(rs2.getString("airport_name"));
                } else {
                    data.add("N/A");
                }

                data.add(rs.getString("start_time"));
                data.add(rs.getString("end_time"));

                int statusid = rs.getInt("flight_status_id");
                ResultSet rs3 = MySQL.executeSearch("SELECT * FROM `flight_status` WHERE `flight_status_id` = " + statusid);
                if (rs3.next()) {
                    data.add(rs3.getString("status"));
                } else {
                    data.add("N/A");
                }

                dtm.addRow(data);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Log the error to console (or use proper logging)
        } 
    
    }


    private void table2DataLoading() {
        try {
            ResultSet rs = MySQL.executeSearch("SELECT * FROM `flight` WHERE `action` = '2'");

            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {
                Vector<String> data = new Vector<>();
                data.add(rs.getString("flight_id"));

                int airId = rs.getInt("airplane_id");
                ResultSet rs1 = MySQL.executeSearch("SELECT * FROM `airplane` WHERE `airplane_id` = " + airId);
                if (rs1.next()) {
                    data.add(rs1.getString("reg_no"));
                } else {
                    data.add("N/A"); // or leave empty
                }

                data.add(rs.getString("start_point"));

                int endPort = rs.getInt("end_airport_id");
                ResultSet rs2 = MySQL.executeSearch("SELECT * FROM `airport` WHERE `airport_id` = " + endPort);
                if (rs2.next()) {
                    data.add(rs2.getString("airport_name"));
                } else {
                    data.add("N/A");
                }

                data.add(rs.getString("start_time"));
                data.add(rs.getString("end_time"));

                int statusid = rs.getInt("flight_status_id");
                ResultSet rs3 = MySQL.executeSearch("SELECT * FROM `flight_status` WHERE `flight_status_id` = " + statusid);
                if (rs3.next()) {
                    data.add(rs3.getString("status"));
                } else {
                    data.add("N/A");
                }

                dtm.addRow(data);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Log the error to console (or use proper logging)
        }

    }
}
