/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.admissionforpatan;

import javax.swing.ImageIcon;

/**
 *
 * @author Programming-learning
 */
public class Chooser_home extends javax.swing.JFrame {

    /**
     * Creates new form Chooser_home
     *
     */
    public Chooser_home() {

        initComponents();
       ImageIcon imgg = new ImageIcon("src\\main\\icons\\download.png");
       setIconImage(imgg.getImage());
        ImageIcon img = new ImageIcon("src\\main\\icons\\YAZOO FREEWARE ICONS PHOTOSHOP.png");
        jLabel9.setIcon(img);
        ImageIcon img1 = new ImageIcon("src\\main\\icons\\smooth_metal_png administrative-tools.png");
        jLabel10.setIcon(img1);
        ImageIcon img2 = new ImageIcon("src\\main\\icons\\BRIGHTS SEARCH.png");
        jLabel11.setIcon(img2);
        ImageIcon img3 = new ImageIcon("src\\main\\icons\\CHATBUBBLES EXCLAMATION.png");
        jLabel15.setIcon(img3);
        ImageIcon img4 = new ImageIcon("src\\main\\icons\\file.png");
        jLabel12.setIcon(img4);
        ImageIcon img5 = new ImageIcon("src\\main\\icons\\Login Manager.png");
        jLabel13.setIcon(img5);
        ImageIcon img6 = new ImageIcon("src\\main\\icons\\backbt.png");
        bckbtn.setIcon(img6);
        ImageIcon img7 = new ImageIcon("src\\main\\icons\\frontbt.png");
        frbt.setIcon(img7);

    }

    public Chooser_home(String us, String pas) {
        //initComponents();
        mainchooser(us, pas);
        //initComponents();
        //setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        p1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        p7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bckbtn = new javax.swing.JLabel();
        frbt = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();

        p3.setBackground(new java.awt.Color(51, 255, 204));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 200, 200, 200));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator20.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator20.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 10, 300));

        jSeparator21.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator21.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 10, 300));

        jSeparator25.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator25.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator25.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 10, 300));

        jSeparator24.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator24.setOpaque(true);
        jPanel1.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 170, 670, 10));

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p1MouseExited(evt);
            }
        });
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Status");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        p1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        p1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 140, 120));

        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 49, 213, 120));

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p2MousePressed(evt);
            }
        });
        p2.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Admission");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        p2.add(jLabel5);
        jLabel5.setBounds(0, 0, 105, 33);

        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        p2.add(jLabel10);
        jLabel10.setBounds(80, 0, 160, 140);

        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 49, 220, 120));

        p4.setBackground(new java.awt.Color(255, 255, 255));
        p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p4MouseExited(evt);
            }
        });
        p4.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Search");
        p4.add(jLabel2);
        jLabel2.setBounds(0, 0, 67, 33);
        p4.add(jLabel11);
        jLabel11.setBounds(68, 0, 120, 120);

        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 49, 190, 120));

        p6.setBackground(new java.awt.Color(255, 255, 255));
        p6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p6MouseExited(evt);
            }
        });
        p6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Notices");
        p6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        p6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 170, 120));

        jPanel1.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 176, 213, 150));

        p7.setBackground(new java.awt.Color(255, 255, 255));
        p7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p7MouseExited(evt);
            }
        });
        p7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Attendance");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        p7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        p7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 140, 130));

        jPanel1.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 176, 220, 150));

        p5.setBackground(new java.awt.Color(255, 255, 255));
        p5.setForeground(new java.awt.Color(0, 0, 204));
        p5.setMinimumSize(new java.awt.Dimension(200, 150));
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p5MouseExited(evt);
            }
        });
        p5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Profile");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        p5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        p5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 120));

        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 180, 150));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Welcome To Patan Multiple Campus App");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 434, 30));

        bckbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bckbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bckbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bckbtnMouseExited(evt);
            }
        });
        jPanel1.add(bckbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        frbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frbtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                frbtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                frbtMouseExited(evt);
            }
        });
        jPanel1.add(frbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 0, 40, 30));

        jSeparator22.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator22.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 660, 10));

        jSeparator23.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator23.setForeground(new java.awt.Color(0, 0, 255));
        jPanel1.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 660, 10));

        jSeparator26.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator26.setForeground(new java.awt.Color(0, 0, 255));
        jSeparator26.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 10, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseEntered
        // TODO add your handling code here:
        p3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
    }//GEN-LAST:event_p3MouseEntered

    private void p3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseExited
        // TODO add your handling code here:
        p3.setBorder(null);
    }//GEN-LAST:event_p3MouseExited

    private void p4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MouseEntered
        // TODO add your handling code here:
        p4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
    }//GEN-LAST:event_p4MouseEntered

    private void p4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MouseExited
        // TODO add your handling code here:
        p4.setBorder(null);
    }//GEN-LAST:event_p4MouseExited

    private void p5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseEntered
        // TODO add your handling code here:
        p5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
    }//GEN-LAST:event_p5MouseEntered

    private void p5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseExited
        // TODO add your handling code here:
        p5.setBorder(null);
    }//GEN-LAST:event_p5MouseExited

    private void p6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MouseEntered
        // TODO add your handling code here:
        p6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
    }//GEN-LAST:event_p6MouseEntered

    private void p6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MouseExited
        // TODO add your handling code here:
        p6.setBorder(null);
    }//GEN-LAST:event_p6MouseExited

    private void p7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MouseEntered
        // TODO add your handling code here:
        p7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
    }//GEN-LAST:event_p7MouseEntered

    private void p7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MouseExited
        // TODO add your handling code here:
        p7.setBorder(null);
    }//GEN-LAST:event_p7MouseExited

    private void p2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseExited
        // TODO add your handling code here:
        p2.setBorder(null);
    }//GEN-LAST:event_p2MouseExited

    private void p2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseEntered
        // TODO add your handling code here:
        p2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
    }//GEN-LAST:event_p2MouseEntered

    private void p1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseExited
        // TODO add your handling code here:
        p1.setBorder(null);
    }//GEN-LAST:event_p1MouseExited

    private void p1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseEntered
        // TODO add your handling code here:
        p1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 153), null, null));
    }//GEN-LAST:event_p1MouseEntered

    private void frbtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frbtMouseEntered
        // TODO add your handling code here:
        frbt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(204, 255, 204), null));

    }//GEN-LAST:event_frbtMouseEntered

    private void frbtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frbtMouseExited
        // TODO add your handling code here:
        frbt.setBorder(null);
    }//GEN-LAST:event_frbtMouseExited

    private void bckbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckbtnMouseEntered
        // TODO add your handling code here:
        bckbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(204, 255, 204), null));

    }//GEN-LAST:event_bckbtnMouseEntered

    private void bckbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckbtnMouseExited
        // TODO add your handling code here:
        bckbtn.setBorder(null);
    }//GEN-LAST:event_bckbtnMouseExited

    private void p2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MousePressed
        // p1.setVisible(false);
    }//GEN-LAST:event_p2MousePressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        new LastAction(1);
        // new statuss();
        Status st = new Status(us, ps);
        //  st.mainsta(us,ps);


    }//GEN-LAST:event_jLabel9MouseClicked

    private void p1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseClicked
        // TODO add your handling code here:
        new LastAction(1);
        Status st = new Status(us, ps);
        //st.mainsta(us,ps);

    }//GEN-LAST:event_p1MouseClicked

    private void p2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseClicked
        // TODO add your handling code here:
        new LastAction(2);
        Admission ad = new Admission();
        Admission.mainAdmmission();
    }//GEN-LAST:event_p2MouseClicked

    private void p7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MouseClicked
        // TODO add your handling code here:
        new LastAction(5);
        Attendance ma = new Attendance();
        Attendance.mainAttendance();

    }//GEN-LAST:event_p7MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        new LastAction(5);
        Attendance ma = new Attendance();
        Attendance.mainAttendance();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        new LastAction(5);
        Attendance ma = new Attendance();
        Attendance.mainAttendance();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new LastAction(1);
        Status st = new Status(us, ps);
        //st.mainsta(us,ps);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new LastAction(2);
        Admission ad = new Admission();
        Admission.mainAdmmission();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new LastAction(2);
        Admission ad = new Admission();
        Admission.mainAdmmission();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void bckbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bckbtnMouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        setVisible(false);
        login.main();
    }//GEN-LAST:event_bckbtnMouseClicked

    private void p5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseClicked
        // TODO add your handling code here:
        new LastAction(6);
        Profile pr = new Profile();
        Profile.mainpro();
    }//GEN-LAST:event_p5MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        new LastAction(6);
        Profile pr = new Profile();
        Profile.mainpro();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new LastAction(6);
        Profile pr = new Profile();
        Profile.mainpro();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void frbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frbtMouseClicked
        // TODO add your handling code here:
        new Redo();
    }//GEN-LAST:event_frbtMouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
        p1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 153), null, null));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        p1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 153), null, null));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
        p1.setBorder(null);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        p1.setBorder(null);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        p2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        p2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        p2.setBorder(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        p2.setBorder(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        p7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        p7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        p7.setBorder(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        p7.setBorder(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        p5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        p5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
        p5.setBorder(null);
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        p5.setBorder(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void p4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MouseClicked
        // TODO add your handling code here:
        Search.search("");
    }//GEN-LAST:event_p4MouseClicked

    /**
     * //@param args the command line arguments
     *
     * @param u
     * @param p
     */
    public final void mainchooser(String u, String p) {

        Voicespeaker voicespeaker = new Voicespeaker("welcome to Patan app", 1);
        us = u;
        ps = p;
        /* Set the Nimbus look and feel */
        //jLabel13.setIcon(new javax.swing.ImageIcon("\\src\\main\\icons\\Login Manager.png"));
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chooser_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Chooser_home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bckbtn;
    private javax.swing.JLabel frbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    // End of variables declaration//GEN-END:variables
public class LastAction {

        LastAction(int number) {
            framenumber = number;
        }
    }
    int framenumber = 0;

    class Redo {

        Redo() {
            switch (framenumber) {
                case 1:
                    Status st = new Status(us, ps);
                    break;
                case 2:
                    Admission ad = new Admission();
                    Admission.mainAdmmission();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    Attendance ma = new Attendance();
                    Attendance.mainAttendance();
                    break;
                case 6:
                    Profile pr = new Profile();
                    Profile.mainpro();
                    break;
                default:
                    break;
            }
        }
    }
    String us, ps;
    /**
     * This is a thread named Multi
     *I have implemented to run profile sector inside this thread
     */
    class Multi extends Thread {

        @Override
        public void run() {
            Profile.mainpro();
        }
    }

}
