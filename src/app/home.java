package app;


import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu21 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu27 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu28 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nhanh.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(220, 0, 55));
        jLabel2.setText("Trang chủ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(173, 173, 173))
        );

        jMenu21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info rs 1.png"))); // NOI18N
        jMenu21.setText("Giới thiệu");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info rs 1.png"))); // NOI18N
        jMenu1.setText("Sửa giới thiệu");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu21.add(jMenu1);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/info rs 1.png"))); // NOI18N
        jMenu9.setText("Giới thiệu");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu21.add(jMenu9);

        jMenuBar1.add(jMenu21);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/posting rs1.png"))); // NOI18N
        jMenu2.setText("Tin tức");

        jMenu19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/posting rs1.png"))); // NOI18N
        jMenu19.setText("Thêm tin");
        jMenu19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu19MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu19);

        jMenu20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/posting rs1.png"))); // NOI18N
        jMenu20.setText("Sửa tin");
        jMenu20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu20MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu20);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/posting rs1.png"))); // NOI18N
        jMenu5.setText("Thông báo");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new1.png"))); // NOI18N
        jMenu3.setText("Thêm mới");

        jMenu16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new1.png"))); // NOI18N
        jMenu16.setText("Thêm thành viên");
        jMenu16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu16MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu16);

        jMenu17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product rs1.png"))); // NOI18N
        jMenu17.setText("Thêm sản phẩm");
        jMenu17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu17MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu17);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group up rs 1.png"))); // NOI18N
        jMenu7.setText("Thêm dự án");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu7);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update & delete1.png"))); // NOI18N
        jMenu6.setText("Cập nhật");

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new1.png"))); // NOI18N
        jMenu11.setText("Cập nhật thành viên");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenu6.add(jMenu11);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product rs1.png"))); // NOI18N
        jMenu14.setText("Cập nhật sản phẩm");
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenu6.add(jMenu14);

        jMenu27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group up rs 1.png"))); // NOI18N
        jMenu27.setText("Cập nhật dự án");
        jMenu27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu27MouseClicked(evt);
            }
        });
        jMenu6.add(jMenu27);

        jMenuBar1.add(jMenu6);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/list1.png"))); // NOI18N
        jMenu4.setText("Danh sách");

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new1.png"))); // NOI18N
        jMenu12.setText("Danh sách thành viên");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu12);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product rs1.png"))); // NOI18N
        jMenu13.setText("Danh sách sản phẩm");
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu13);

        jMenu28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group up rs 1.png"))); // NOI18N
        jMenu28.setText("Danh sách dự án");
        jMenu28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu28MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu28);

        jMenuBar1.add(jMenu4);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/payment1.png"))); // NOI18N
        jMenu8.setText("Tài chính");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        jMenu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout1.png"))); // NOI18N
        jMenu15.setText("Đăng xuất");
        jMenu15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu15MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu15);

        jMenu18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit 1.png"))); // NOI18N
        jMenu18.setText("Thoát");
        jMenu18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu18MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu18);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu18MouseClicked
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"Thoat?","Select", JOptionPane.YES_NO_OPTION );
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu18MouseClicked

    private void jMenu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu15MouseClicked
        // TODO add your handling code here:
        int a= JOptionPane.showConfirmDialog(null,"Dang xuat?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
           new firstPage().setVisible(true);
        }
    }//GEN-LAST:event_jMenu15MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
            new payment().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
        // TODO add your handling code here:
        new ListOfMembers().setVisible(true);
    }//GEN-LAST:event_jMenu12MouseClicked

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        // TODO add your handling code here:
        new Product().setVisible(true);
    }//GEN-LAST:event_jMenu13MouseClicked

    private void jMenu28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu28MouseClicked
        // TODO add your handling code here:
        new ListGroup().setVisible(true);
    }//GEN-LAST:event_jMenu28MouseClicked

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
        // TODO add your handling code here:
        new UpdateDeleteMember().setVisible(true);
    }//GEN-LAST:event_jMenu11MouseClicked

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
        // TODO add your handling code here:
        new UpdateProduct().setVisible(true);
    }//GEN-LAST:event_jMenu14MouseClicked

    private void jMenu27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu27MouseClicked
        // TODO add your handling code here:
        new UpdateGroup().setVisible(true);
    }//GEN-LAST:event_jMenu27MouseClicked

    private void jMenu16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu16MouseClicked
        // TODO add your handling code here:
        new newMember().setVisible(true);
    }//GEN-LAST:event_jMenu16MouseClicked

    private void jMenu17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu17MouseClicked
        // TODO add your handling code here:
        new NewProduct().setVisible(true);
    }//GEN-LAST:event_jMenu17MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        new GroupUp().setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu19MouseClicked
        // TODO add your handling code here:
        new newNEWS().setVisible(true);
    }//GEN-LAST:event_jMenu19MouseClicked

    private void jMenu20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu20MouseClicked
        // TODO add your handling code here:
        new UpdateNEWS().setVisible(true);
    }//GEN-LAST:event_jMenu20MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
         new NEWS().setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        new UpdateInfo().setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        // TODO add your handling code here:
        new info().setVisible(true);
    }//GEN-LAST:event_jMenu9MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
