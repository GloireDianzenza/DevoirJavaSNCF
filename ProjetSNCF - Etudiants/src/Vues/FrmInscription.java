/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.Activite;
import Entity.Agent;
import Entity.Formation;
import Tools.ConnexionBDD;
import Tools.FonctionsMetier;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jbuffeteau
 */
public class FrmInscription extends javax.swing.JFrame {

    ConnexionBDD cnx;
    FonctionsMetier fm;
    DefaultTableModel dtmActivites;
    DefaultTableModel dtmFormations;
    DefaultTableModel dtmAgents;
    Vector v;
    ArrayList<Integer> agentsAInscrire;
    
    public FrmInscription() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblActivites = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFormations = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAgentsNonInscrits = new javax.swing.JTable();
        btnInscription = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("S'inscrire à une formation");

        tblActivites.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Nom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblActivites.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActivitesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblActivites);

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Liste des formations");

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Liste des activités");

        tblFormations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Nom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFormations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFormationsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFormations);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Liste des agents non inscrits");

        tblAgentsNonInscrits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Nom", "Prénom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAgentsNonInscrits.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane3.setViewportView(tblAgentsNonInscrits);

        btnInscription.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        btnInscription.setText("S'inscrire");
        btnInscription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInscriptionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(387, 387, 387)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                                .addComponent(jScrollPane2)))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInscription, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnInscription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cnx = new ConnexionBDD();
        fm = new FonctionsMetier();
        dtmActivites = (DefaultTableModel) tblActivites.getModel();
        dtmFormations = (DefaultTableModel) tblFormations.getModel();
        dtmAgents = (DefaultTableModel) tblAgentsNonInscrits.getModel();
        agentsAInscrire = new ArrayList<>();
        for(Activite ac:fm.GetAllActivites())
        {
            v = new Vector();
            v.add(ac.getNumero());
            v.add(ac.getLibelle());
            dtmActivites.addRow(v);
        }
        tblActivites.setModel(dtmActivites);
        
    }//GEN-LAST:event_formWindowOpened

    private void tblActivitesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActivitesMouseClicked
        while(tblFormations.getRowCount() != 0)
            {
                dtmFormations.removeRow(0);
            }
        if(tblActivites.getSelectedRowCount() == 1)
        {
            for(Formation form:fm.GetAllFormationsByIdActivite(Integer.parseInt(tblActivites.getValueAt(tblActivites.getSelectedRow(), 0).toString())))
            {
                v = new Vector();
                v.add(form.getCode());
                v.add(form.getIntitule());
                dtmFormations.addRow(v);
            }
            tblFormations.setModel(dtmFormations);
        }
      
    }//GEN-LAST:event_tblActivitesMouseClicked

    private void btnInscriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInscriptionMouseClicked
          if(tblActivites.getSelectedRowCount() != 1)
          {
              JOptionPane.showMessageDialog(this, "Veuillez choisir une activité");
          }
          
          else if(tblFormations.getSelectedRowCount() != 1)
          {
              JOptionPane.showMessageDialog(this, "Veuillez choisir une formation");
          }
          
          else if(tblAgentsNonInscrits.getSelectedRowCount() <= 0)
          {
              JOptionPane.showMessageDialog(this, "Veuillez choisir un ou plusieurs agents");
          }
          else
          {
              for(int a:tblAgentsNonInscrits.getSelectedRows())
              {
                  String numeroFormation = tblFormations.getValueAt(tblFormations.getSelectedRow(), 0).toString();
                  String codeAgent = tblAgentsNonInscrits.getValueAt(a, 0).toString();
                  fm.InsererInscription(numeroFormation, codeAgent);
              }
              JOptionPane.showMessageDialog(this, "L'agent a été inscrit avec succès");
              while(tblAgentsNonInscrits.getRowCount() != 0)
                {
                dtmAgents.removeRow(0);
                }
            if(tblFormations.getSelectedRowCount() == 1)
            {
            for(Agent a:fm.GetAllAgentsNonInscritsFormation(String.valueOf(tblFormations.getValueAt(tblFormations.getSelectedRow(), 0))))
            {
                v = new Vector();
                v.add(a.getCode());
                v.add(a.getNom());
                v.add(a.getPrenom());
                dtmAgents.addRow(v);
            }
            tblAgentsNonInscrits.setModel(dtmAgents);
            }
        }

    }//GEN-LAST:event_btnInscriptionMouseClicked

    private void tblFormationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFormationsMouseClicked
        while(tblAgentsNonInscrits.getRowCount() != 0)
        {
            dtmAgents.removeRow(0);
        }
        if(tblFormations.getSelectedRowCount() == 1)
        {
            for(Agent a:fm.GetAllAgentsNonInscritsFormation(String.valueOf(tblFormations.getValueAt(tblFormations.getSelectedRow(), 0))))
            {
                v = new Vector();
                v.add(a.getCode());
                v.add(a.getNom());
                v.add(a.getPrenom());
                dtmAgents.addRow(v);
            }
            tblAgentsNonInscrits.setModel(dtmAgents);
        }
        
    }//GEN-LAST:event_tblFormationsMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblActivites;
    private javax.swing.JTable tblAgentsNonInscrits;
    private javax.swing.JTable tblFormations;
    // End of variables declaration//GEN-END:variables
}