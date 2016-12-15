/*
    [Osu!unZip]
    Copyright (C) 2016  NewKey

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

*/

package unziposufiles;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class unzip extends javax.swing.JFrame {
    UnZipOsuFiles UnZipOsuFiles = new UnZipOsuFiles();
    
    public unzip() {
        initComponents();
        goWebsite();
    }
    
        


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        v_wrong = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_area = new javax.swing.JTextArea();
        T_CompressedFolder = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ProcessBar = new javax.swing.JProgressBar();
        T_FolderToExtract = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        T_ProcessedFolder = new javax.swing.JTextField();
        b_UnZip = new javax.swing.JButton();
        C_DeleteAfter = new javax.swing.JCheckBox();
        b_Stop = new javax.swing.JButton();
        C_Replace = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        l_maximus = new javax.swing.JLabel();
        l_count = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        L_replace = new javax.swing.JLabel();
        L_delete = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        L_moved = new javax.swing.JLabel();
        L_wrong = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        b_wrong = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        L_madeBy = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        t_area.setColumns(20);
        t_area.setRows(5);
        jScrollPane1.setViewportView(t_area);

        javax.swing.GroupLayout v_wrongLayout = new javax.swing.GroupLayout(v_wrong.getContentPane());
        v_wrong.getContentPane().setLayout(v_wrongLayout);
        v_wrongLayout.setHorizontalGroup(
            v_wrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, v_wrongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );
        v_wrongLayout.setVerticalGroup(
            v_wrongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, v_wrongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        T_CompressedFolder.setEditable(false);
        T_CompressedFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_CompressedFolderActionPerformed(evt);
            }
        });

        jLabel1.setText("Specify the folder where are the Files to uncompress. (Compressed file folder)");

        jLabel2.setText("Specify the extracted files folder below. (Folder to extract)");

        T_FolderToExtract.setEditable(false);

        jLabel3.setText("Specify where to move processed archives below. (Processed folder)");

        T_ProcessedFolder.setEditable(false);

        b_UnZip.setText(">");
        b_UnZip.setBorderPainted(false);
        b_UnZip.setFocusPainted(false);
        b_UnZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_UnZipActionPerformed(evt);
            }
        });

        C_DeleteAfter.setText("Delete compressed file after unzip.");
        C_DeleteAfter.setFocusPainted(false);
        C_DeleteAfter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                C_DeleteAfterStateChanged(evt);
            }
        });
        C_DeleteAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_DeleteAfterActionPerformed(evt);
            }
        });

        b_Stop.setText("Stop and Reset");
        b_Stop.setBorderPainted(false);
        b_Stop.setFocusPainted(false);
        b_Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_StopActionPerformed(evt);
            }
        });

        C_Replace.setText("Replace files and folder if Exist");
        C_Replace.setFocusPainted(false);
        C_Replace.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                C_ReplaceStateChanged(evt);
            }
        });
        C_Replace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_ReplaceActionPerformed(evt);
            }
        });

        jButton1.setText("Open");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Open");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Open");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("<html>Deleted beatmaps after succefuly extraction: </html>");

        l_maximus.setText("0");

        l_count.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        l_count.setText("0");
        l_count.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("/");

        jLabel4.setText("Succesfuly extracted / Total beatmaps");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(l_count, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_maximus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_count)
                    .addComponent(l_maximus)
                    .addComponent(jLabel6))
                .addGap(0, 0, 0))
        );

        L_replace.setText("0");

        L_delete.setText("0");

        jLabel5.setText("Replaced Files:");

        jLabel7.setText("Moved files:");

        L_moved.setText("0");

        L_wrong.setText("0");

        jLabel9.setText("Wrong files:");

        b_wrong.setText("show");
        b_wrong.setAlignmentY(0.0F);
        b_wrong.setEnabled(false);
        b_wrong.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b_wrong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_wrongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b_wrong, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(L_wrong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(L_moved, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(L_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(L_replace, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(L_moved)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(L_replace))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_delete))))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(L_wrong)
                    .addComponent(b_wrong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("- Stadistics -");

        L_madeBy.setText("Made by player: NewKey");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C_DeleteAfter)
                                .addGap(18, 18, 18)
                                .addComponent(C_Replace))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(T_ProcessedFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(T_CompressedFolder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(b_UnZip, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(b_Stop))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(T_FolderToExtract, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ProcessBar, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_madeBy)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_CompressedFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_FolderToExtract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_ProcessedFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_DeleteAfter)
                    .addComponent(C_Replace))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_Stop)
                    .addComponent(b_UnZip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProcessBar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_madeBy))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T_CompressedFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_CompressedFolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_CompressedFolderActionPerformed

    private void b_UnZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_UnZipActionPerformed
        UnZipOsuFiles.preRun();
    }//GEN-LAST:event_b_UnZipActionPerformed

    private void b_StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_StopActionPerformed
        UnZipOsuFiles.Stop();
    }//GEN-LAST:event_b_StopActionPerformed

    private void C_DeleteAfterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_C_DeleteAfterStateChanged
        
    }//GEN-LAST:event_C_DeleteAfterStateChanged

    private void C_DeleteAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_DeleteAfterActionPerformed
        if(C_DeleteAfter.isSelected()){
            T_ProcessedFolder.setEnabled(false);
        }else{
            T_ProcessedFolder.setEnabled(true);
        }
    }//GEN-LAST:event_C_DeleteAfterActionPerformed

    private void C_ReplaceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_C_ReplaceStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_C_ReplaceStateChanged

    private void C_ReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_ReplaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_ReplaceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser file=new JFileChooser();
        file = new JFileChooser( "." );
        file.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );
        file.showOpenDialog(this);
        T_CompressedFolder.setText(file.getSelectedFile().toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser file=new JFileChooser();
        file = new JFileChooser( "." );
        file.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );
        file.showOpenDialog(this);
        T_FolderToExtract.setText(file.getSelectedFile().toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser file=new JFileChooser();
        file = new JFileChooser( "." );
        file.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );
        file.showOpenDialog(this);
        T_ProcessedFolder.setText(file.getSelectedFile().toString());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void b_wrongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_wrongActionPerformed
        v_wrong.pack();
        v_wrong.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        v_wrong.setLocationRelativeTo(null);
        v_wrong.setVisible(true);
        List file = new ArrayList(UnZipOsuFiles.WRONGfiles);
        for (int i = 0; i < file.size(); i++) {
            t_area.setText(t_area.getText()+file.get(i)+"\n");
        }
        
    }//GEN-LAST:event_b_wrongActionPerformed
    

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(unzip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(unzip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(unzip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(unzip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch (ClassNotFoundException e) {
		e.printStackTrace();
	    } catch (InstantiationException e) {
		e.printStackTrace();
	    } catch (IllegalAccessException e) {
		e.printStackTrace();
	    } catch (UnsupportedLookAndFeelException e) {
		e.printStackTrace();
	    }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    unzip unzip = new unzip();
                    unzip.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
                    unzip.setTitle("Osu!unZip");
                    unzip.pack();
                    unzip.setLocationRelativeTo(null);
                    unzip.setVisible(true);
            }
        });
    }
    
     public static void goWebsite() {
	String text="NewKey";
        L_madeBy.setText("<html>Made by player: <a href=\"\">"+text+"</a></html>");
        L_madeBy.setCursor(new Cursor(Cursor.HAND_CURSOR));
        L_madeBy.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                    try {
                            Desktop.getDesktop().browse(new URI("https://osu.ppy.sh/u/637668"));
                    } catch (URISyntaxException | IOException ex) {}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox C_DeleteAfter;
    public static javax.swing.JCheckBox C_Replace;
    public static javax.swing.JLabel L_delete;
    public static javax.swing.JLabel L_madeBy;
    public static javax.swing.JLabel L_moved;
    public static javax.swing.JLabel L_replace;
    public static javax.swing.JLabel L_wrong;
    public static javax.swing.JProgressBar ProcessBar;
    public static javax.swing.JTextField T_CompressedFolder;
    public static javax.swing.JTextField T_FolderToExtract;
    public static javax.swing.JTextField T_ProcessedFolder;
    public static javax.swing.JButton b_Stop;
    public static javax.swing.JButton b_UnZip;
    public static javax.swing.JButton b_wrong;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel l_count;
    public static javax.swing.JLabel l_maximus;
    public static javax.swing.JTextArea t_area;
    public static javax.swing.JFrame v_wrong;
    // End of variables declaration//GEN-END:variables
}

