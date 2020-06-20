/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import entity.CourseStudent;
import entity.CourseStudentId;
import entity.Student;
import entity.User;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author AEVN
 */
public class TranscriptUI extends javax.swing.JFrame {

    /**
     * Creates new form TranscriptUI
     */
    static private User user;
    
    public TranscriptUI(User user) {
        initComponents();
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MSSV", "Họ tên", "Điểm GK", "Điểm CK", "Điểm khác", "Điểm tổng"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Bảng điểm");

        jButton1.setText("Import bảng điểm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xem bảng điểm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã môn học:");

        jButton3.setText("Danh sách đậu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Danh sách rớt");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Thống kê");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Sửa điểm");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setText("Trở về trang chính");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
        fc.setFileFilter(filter);
        fc.showOpenDialog(null);
        File f = fc.getSelectedFile();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line;
            String[] mon = null;
            while ((line = reader.readLine())  != null) {
                String[] value = line.split(",");
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                if (value.length == 1) {
                    mon = value[0].split("-");
                } else if (value.length > 1) {
                    if (!value[0].equals("STT")) {
                        CourseStudent cs = new CourseStudent();
                        CourseStudentId csi = new CourseStudentId();
                        
                        csi.setMaMon(mon[1]);
                        csi.setMssv(Integer.parseInt(value[1]));
                        
                        cs.setId(csi);
                        cs.setDiemGk(Float.parseFloat(value[3]));
                        cs.setDiemCk(Float.parseFloat(value[4]));
                        cs.setDiemKhac(Float.parseFloat(value[5]));
                        cs.setDiemTong(Float.parseFloat(value[6]));
                    
                        session.update(cs);
                    }
                }
                session.getTransaction().commit();
            }
        } catch (IOException e) {
            System.err.println(e);
        } catch (HibernateException he) {
            System.err.println(he);
        }
        showMessageDialog(null, "Đã import xong bảng điểm");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String query = "";
        String alert = "Chưa nhập vào mã môn học! Mời nhập vào để xem bảng điểm";
        if (!jTextField1.getText().equals("")) {
            query = "FROM CourseStudent cs WHERE cs.ics.maMon = '"
                            + jTextField1.getText() + "' ";
            alert = "Bảng điểm môn " + jTextField1.getText();
            executeHQLQuery(query);
        }
        showMessageDialog(null, alert);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String query = "";
        String alert = "Chưa nhập vào mã môn học! Mời nhập vào để xem bảng điểm";
        if (!jTextField1.getText().equals("")) {
            query = "FROM CourseStudent cs WHERE cs.ics.maMon = '"
                            + jTextField1.getText() + "' AND cs.diemTong >= 5";
            alert = "Danh sách đậu môn " + jTextField1.getText();
            executeHQLQuery(query);
        }
        showMessageDialog(null, alert);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String query = "";
        String alert = "Chưa nhập vào mã môn học! Mời nhập vào để xem bảng điểm";
        if (!jTextField1.getText().equals("")) {
            query = "FROM CourseStudent cs WHERE cs.ics.maMon = '"
                            + jTextField1.getText() + "' AND cs.diemTong < 5";
            alert = "Danh sách rớt môn " + jTextField1.getText();
            executeHQLQuery(query);
        }
        showMessageDialog(null, alert);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String query = "FROM CourseStudent cs WHERE cs.ics.maMon = '"
                    + jTextField1.getText() + "' ";
            List resultList = session.createQuery(query).list();
            int soLuongDau = 0, soLuongRot;
            float tyLeDau, tyLeRot;
            for(Object o : resultList) {
                CourseStudent cs = (CourseStudent)o;
                if (cs.getDiemTong() >= 5) {
                    soLuongDau++;
                }
            }
            soLuongRot = resultList.size() - soLuongDau;
            tyLeDau = soLuongDau*100/resultList.size();
            tyLeRot = soLuongRot*100/resultList.size();
            String alert = "Bảng điểm môn " + jTextField1.getText() 
                    + " có " + soLuongDau + " sinh viên đậu " 
                    + " chiếm " + tyLeDau + "%"
                    + " có " + soLuongRot + " sinh viên rớt "
                    + " chiếm " + tyLeRot + "%";
            showMessageDialog(null, alert);
        } catch (HibernateException he) {
            System.err.println(he);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MarkUpdateUI frame = new MarkUpdateUI();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        AdminUI frame = new AdminUI(user);
        frame.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed
    
    public void displayTranscriptList (List resultList) {
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("STT"); 
        tableHeaders.add("MSSV");
        tableHeaders.add("Họ Tên");
        tableHeaders.add("Điểm GK");
        tableHeaders.add("Điểm CK");
        tableHeaders.add("Điểm khác");
        tableHeaders.add("Điểm tổng");
        
        int STT = 0;

        for(Object o : resultList) {
            STT++;
            CourseStudent cs = (CourseStudent)o;
            
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(STT);
            oneRow.add(cs.getId().getMssv());
            oneRow.add(getHoTenSinhVien(cs.getId().getMssv()));
            oneRow.add(cs.getDiemGk());
            oneRow.add(cs.getDiemCk());
            oneRow.add(cs.getDiemKhac());
            oneRow.add(cs.getDiemTong());
            tableData.add(oneRow);
        }
        jTable1.setModel(new DefaultTableModel(tableData, tableHeaders));
    }

    private void executeHQLQuery(String query) {
        List transcriptList = new ArrayList();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            transcriptList = session.createQuery(query).list();
            displayTranscriptList(transcriptList);
            session.getTransaction().commit();
        } catch (HibernateException he) {
            System.err.println(he);
        }
    }
    
    private String getHoTenSinhVien (int mssv) {
        String hoTen = "";
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String query = "FROM Student s WHERE s.mssv = '" + mssv + "'";
            Student s = (Student)session.createQuery(query).uniqueResult();
            hoTen = s.getHoTen();
            session.getTransaction().commit();
        } catch (HibernateException he) {
            System.err.println(he);
        }
        return hoTen;
    }
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
            java.util.logging.Logger.getLogger(TranscriptUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TranscriptUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TranscriptUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TranscriptUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TranscriptUI(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
