/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserController;

import StatePattern.Notice;
import java.awt.Color;
import main.databaseSQL;
/**
 *
 * @author USER
 */
public class MainPageController extends databaseSQL {
    Notice nt = new Notice();
    /**
     * Creates new form MainPageController
     */
    public MainPageController() {
        initComponents();
        if(nt.getState() == 1) {
            Noticebtn.setBackground(new Color(153,0,0));
            Noticebtn.setForeground(Color.white);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Board = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Searchword = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Noticebtn = new javax.swing.JButton();
        gocalcular = new javax.swing.JButton();
        Premium = new javax.swing.JButton();
        Setting = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Board.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Board.setText("게시판");
        Board.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoardActionPerformed(evt);
            }
        });

        jLabel1.setText("💬");

        jLabel2.setFont(new java.awt.Font("휴먼편지체", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Everytime");

        jLabel3.setText("🔔");

        Searchword.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        Searchword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchwordActionPerformed(evt);
            }
        });

        Search.setBackground(new java.awt.Color(153, 0, 0));
        Search.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("검색");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Noticebtn.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Noticebtn.setText("알림");
        Noticebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoticebtnActionPerformed(evt);
            }
        });

        gocalcular.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        gocalcular.setText("학점 계산기");
        gocalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gocalcularActionPerformed(evt);
            }
        });

        Premium.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Premium.setText("프리미엄");
        Premium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PremiumActionPerformed(evt);
            }
        });

        Setting.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        Setting.setText("설정");
        Setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingActionPerformed(evt);
            }
        });

        jLabel4.setText("📅");

        jLabel7.setText("💳");

        jLabel5.setText("⚙");

        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("⏰");

        jLabel9.setText("✉");

        jButton1.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 15)); // NOI18N
        jButton1.setText("쪽지함");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(Searchword, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Board, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gocalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Premium, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(Noticebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Setting, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 12, Short.MAX_VALUE)))))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Searchword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search)
                    .addComponent(jLabel10))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Board)
                    .addComponent(jLabel1)
                    .addComponent(Noticebtn)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jButton1))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Premium)
                    .addComponent(jLabel7)
                    .addComponent(Setting)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(gocalcular))
                .addGap(71, 71, 71)
                .addComponent(jLabel6)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchwordActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        SearchController SC = new SearchController();
        SC.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void BoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoardActionPerformed
        BoardController BD = new BoardController();
        BD.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BoardActionPerformed

    private void NoticebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoticebtnActionPerformed
        dispose();
        nt.normal_alarm(nt);
        // TODO add your handling code here:
    }//GEN-LAST:event_NoticebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        MessageController MS = new MessageController();
        MS.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gocalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gocalcularActionPerformed
        ScoreCalculController SCC = new ScoreCalculController();
        SCC.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_gocalcularActionPerformed

    private void PremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PremiumActionPerformed
        PremiumController PR = new PremiumController();
        PR.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_PremiumActionPerformed

    private void SettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingActionPerformed
        dispose();
        SettingController ST = new SettingController();
        ST.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_SettingActionPerformed

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
            java.util.logging.Logger.getLogger(MainPageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPageController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Board;
    private javax.swing.JButton Noticebtn;
    private javax.swing.JButton Premium;
    private javax.swing.JButton Search;
    private javax.swing.JTextField Searchword;
    private javax.swing.JButton Setting;
    private javax.swing.JButton gocalcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
