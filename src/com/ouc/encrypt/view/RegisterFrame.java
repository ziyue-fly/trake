/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.encrypt.view;

import com.ouc.encrypt.util.FrameUtil;
import com.ouc.encrypt.util.LocationUtil;
import com.ouc.encrypt.util.SimpleClient;
import com.ouc.encrypt.util.StringUtil;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterFrame
     */
    public RegisterFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hintLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        registerJPanel1 = new com.ouc.encrypt.view.RegisterJPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtWeak = new javax.swing.JTextField();
        txtMid = new javax.swing.JTextField();
        txtStrong = new javax.swing.JTextField();
        hintLabel1 = new javax.swing.JLabel();
        hintLabel2 = new javax.swing.JLabel();
        txtUsname = new javax.swing.JTextField();
        txtPswd = new javax.swing.JPasswordField();
        txtPswd2 = new javax.swing.JPasswordField();
        statusLbl = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        txtlogin = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtstate = new javax.swing.JTextArea();

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("注册用户");

        jLabel1.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        jLabel1.setText("用户名：");

        jLabel2.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        jLabel2.setText("密码：");

        jLabel3.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        jLabel3.setText("密码强度：");

        jLabel4.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        jLabel4.setText("确认密码：");

        jLabel5.setFont(new java.awt.Font("幼圆", 0, 10)); // NOI18N
        jLabel5.setText("（两次密码需一致）");

        txtWeak.setEditable(false);
        txtWeak.setBackground(new java.awt.Color(192, 192, 192));

        txtMid.setEditable(false);
        txtMid.setBackground(new java.awt.Color(192, 192, 192));

        txtStrong.setEditable(false);
        txtStrong.setBackground(new java.awt.Color(192, 192, 192));

        txtPswd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPswd2MouseClicked(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        btnCancel.setText("取消");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        btnRegister.setText("注册");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtlogin.setBackground(new java.awt.Color(153, 153, 255));
        txtlogin.setFont(new java.awt.Font("宋体", 1, 12)); // NOI18N
        txtlogin.setForeground(new java.awt.Color(51, 0, 204));
        txtlogin.setText("注册完成，重新登录>>");
        txtlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtloginMouseClicked(evt);
            }
        });

        txtstate.setColumns(20);
        txtstate.setRows(5);
        jScrollPane1.setViewportView(txtstate);

        javax.swing.GroupLayout registerJPanel1Layout = new javax.swing.GroupLayout(registerJPanel1);
        registerJPanel1.setLayout(registerJPanel1Layout);
        registerJPanel1Layout.setHorizontalGroup(
            registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerJPanel1Layout.createSequentialGroup()
                .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerJPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancel)
                            .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(registerJPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(registerJPanel1Layout.createSequentialGroup()
                                        .addComponent(txtWeak, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMid, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtStrong, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPswd, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerJPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegister)
                                .addGap(16, 16, 16))))
                    .addGroup(registerJPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(txtPswd2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerJPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hintLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerJPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtlogin)
                .addGap(52, 52, 52))
            .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerJPanel1Layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(hintLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addGap(95, 95, 95)))
        );
        registerJPanel1Layout.setVerticalGroup(
            registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerJPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerJPanel1Layout.createSequentialGroup()
                        .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtUsname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hintLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtWeak, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMid, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStrong, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(statusLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPswd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnRegister))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtlogin)
                .addGap(23, 23, 23))
            .addGroup(registerJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerJPanel1Layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(hintLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(211, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtloginMouseClicked
        // TODO add your handling code here:
        LoginJFrame lg = new LoginJFrame();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtloginMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:

        //1.获取用户信息
        String usname = this.txtUsname.getText().trim();
        //2.比较两个密码是否相同
        char[] pswd1 = this.txtPswd.getPassword();
        String password1 = new String(pswd1);//将字符型数组转成字符串
        char[] pswd2 = this.txtPswd2.getPassword();
        String password2 = new String(pswd2);//将字符型数组转成字符串
        if (password1.length() < 6) {
            JOptionPane.showMessageDialog(this, "密钥长度请大于等于6！");
            return;
        }else if (!password1.equals(password2)) {
            JOptionPane.showMessageDialog(this, "两次密码不一致！");
            return;
        }

        //1.验证非空
        if (StringUtil.checkLength(usname) == false) {
            JOptionPane.showMessageDialog(this, "用户名不能为空！");
            return;
        }
        if (StringUtil.checkLength(password1) == false) {
            JOptionPane.showMessageDialog(this, "密码不能为空！");
            return;
        }

        //组合对象
        SimpleClient s = new SimpleClient(usname, password1);
        this.txtstate.setText("Connecting...");
        int i = s.signIn();
        this.txtstate.append("Suceess connected...");
        System.out.print(i);
        if (i == 0) {
            //System.out.println("注册成功！");
            JOptionPane.showMessageDialog(this, "注册成功！");
            clearInput();
        } else if (i == 1) {
            JOptionPane.showMessageDialog(this, "用户名已存在！");
            //清空面板信息
            clearInput();
            return;
        }else if (i == 3) {
            JOptionPane.showMessageDialog(this, "网络错误！");
            //清空面板信息
            clearInput();
        }else{
            JOptionPane.showMessageDialog(this, "失败！");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // 取消/退出
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtPswd2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPswd2MouseClicked
        checkPwdStatus();
    }//GEN-LAST:event_txtPswd2MouseClicked
public void showFrame(Class clazz){
         //1 new对象
       JInternalFrame frame = FrameUtil.buildFrame(clazz);
        //2 桌面容器先删除
        this.registerJPanel1.remove(frame);
        //3 桌面容器再添加
        this.registerJPanel1.add(frame);
        //4显示
        LocationUtil.setScreenCenter(frame);
        frame.setVisible(true);
        //5显示在最前
        frame.toFront();
        try {
            //6处于选中状态
            frame.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void clear() {
        this.txtWeak.setBackground(null);
        this.txtMid.setBackground(null);
        this.txtStrong.setBackground(null);
        this.statusLbl.setText("密钥长度请大于等于6");
    }
    
    public void checkPwdStatus() {
        clear();
        char[] pswd1 = this.txtPswd.getPassword();
        String password1 = new String(pswd1);//将字符型数组转成字符串
        if (password1.length() < 6) {
            this.statusLbl.setText("密钥长度请大于等于6");
        } else if (password1.length() <= 10) {
            this.txtWeak.setBackground(Color.red);
            this.txtMid.setBackground(Color.lightGray);
            this.txtStrong.setBackground(Color.lightGray);
            this.statusLbl.setText("低");
        } else if (password1.length() <= 14) {
            this.txtWeak.setBackground(Color.yellow);
            this.txtMid.setBackground(Color.yellow);
            this.txtStrong.setBackground(Color.lightGray);
            this.statusLbl.setText("中");
        } else {
            this.txtWeak.setBackground(Color.green);
            this.txtMid.setBackground(Color.green);
            this.txtStrong.setBackground(Color.green);
            this.statusLbl.setText("高");
        }
    }

    private void clearInput() {
        this.txtUsname.setText("");
        this.txtPswd.setText("");
        this.txtPswd2.setText("");
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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JLabel hintLabel1;
    private javax.swing.JLabel hintLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private com.ouc.encrypt.view.RegisterJPanel registerJPanel1;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JTextField txtMid;
    private javax.swing.JPasswordField txtPswd;
    private javax.swing.JPasswordField txtPswd2;
    private javax.swing.JTextField txtStrong;
    private javax.swing.JTextField txtUsname;
    private javax.swing.JTextField txtWeak;
    private javax.swing.JLabel txtlogin;
    private javax.swing.JTextArea txtstate;
    // End of variables declaration//GEN-END:variables
}
