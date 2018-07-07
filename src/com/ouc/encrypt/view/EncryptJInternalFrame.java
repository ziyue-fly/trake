/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ouc.encrypt.view;

import com.ouc.encrypt.util.AESUtil;
import com.ouc.encrypt.util.FileUtil;
import com.ouc.encrypt.util.SimpleClient;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author lenovo
 */
public class EncryptJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form EncryptJInternalFrame
     */
    private FileUtil fUtil = new FileUtil();
    private AESUtil aUtil = new AESUtil();

    public static SimpleClient s;
    public EncryptJInternalFrame() {
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

        encryptJPanel1 = new com.ouc.encrypt.view.EncryptJPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttext = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtfilename = new javax.swing.JTextArea();
        txtdir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtfakename = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtfaketext = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        rangeBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        keydirtxt = new javax.swing.JTextField();

        setClosable(true);
        setTitle("加密");
        setName(""); // NOI18N

        txttext.setEditable(false);
        txttext.setColumns(20);
        txttext.setRows(5);
        jScrollPane1.setViewportView(txttext);

        jLabel1.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        jLabel1.setText("正文内容：");

        btnsearch.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        btnsearch.setText("选择本地文件");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        jLabel2.setText("文件标题：");

        txtfilename.setEditable(false);
        txtfilename.setColumns(20);
        txtfilename.setRows(5);
        jScrollPane2.setViewportView(txtfilename);

        jLabel3.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        jLabel3.setText("伪造文件标题：（可根据需要修改）");

        txtfakename.setColumns(20);
        txtfakename.setRows(5);
        jScrollPane3.setViewportView(txtfakename);

        jLabel4.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        jLabel4.setText("伪造文件正文：（可根据需要修改）");

        txtfaketext.setColumns(20);
        txtfaketext.setRows(5);
        jScrollPane4.setViewportView(txtfaketext);

        jButton1.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        jButton1.setText("确认加密");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rangeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel5.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        jLabel5.setText("选择加密密级：");

        jButton2.setFont(new java.awt.Font("幼圆", 0, 14)); // NOI18N
        jButton2.setText("选择密钥存储位置");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout encryptJPanel1Layout = new javax.swing.GroupLayout(encryptJPanel1);
        encryptJPanel1.setLayout(encryptJPanel1Layout);
        encryptJPanel1Layout.setHorizontalGroup(
            encryptJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encryptJPanel1Layout.createSequentialGroup()
                .addGroup(encryptJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(encryptJPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rangeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keydirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(encryptJPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(encryptJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(encryptJPanel1Layout.createSequentialGroup()
                                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(encryptJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4))))
                .addGap(55, 55, 55))
        );
        encryptJPanel1Layout.setVerticalGroup(
            encryptJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encryptJPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(encryptJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnsearch)
                    .addGroup(encryptJPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtdir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(encryptJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(encryptJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(encryptJPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(encryptJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(36, 36, 36)
                        .addGroup(encryptJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(encryptJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rangeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(keydirtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encryptJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encryptJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        JFileChooser openfile = new JFileChooser();//文件选择对话框
        FileFilter filter = new FileNameExtensionFilter("txt文件(.txt)", "txt");
        openfile.addChoosableFileFilter(filter);//添加过滤器
        openfile.setFileFilter(filter);
        int i = openfile.showOpenDialog(this);
        if (i == JFileChooser.APPROVE_OPTION) {
            //jFileChooser.show(true);  
            //输出绝对路径  
            System.out.println(openfile.getSelectedFile().getAbsolutePath());
            txtdir.setText(openfile.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_btnsearchActionPerformed

        File file = openfile.getSelectedFile();//得到文件对象
        String fileName = openfile.getSelectedFile().getName();//得到文件名
        txtfilename.setText(fileName);
        txtfakename.setText(fileName);
        BufferedReader bf;
        StringBuilder sb = new StringBuilder();
        try {
            bf = new BufferedReader(new FileReader(file));
            String content = "";
            while ((content = bf.readLine()) != null) {
                content = new String(content.getBytes("GBK"), "UTF-8");//将读取出来的GBK格式的代码转换成UTF-8  
                sb.append(content.trim());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EncryptJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EncryptJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        txttext.setText(sb.toString());
        txtfaketext.setText("道可道，非常道；名可名，非常名。\n"
                + "\n"
                + "无名，万物之始，有名，万物之母。\n"
                + "\n"
                + "故常无欲，以观其妙，常有欲，以观其徼。\n"
                + "\n"
                + "此两者，同出而异名，同谓之玄，玄之又玄，众妙之门。");

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String tkey = aUtil.generateKey();//加密真文件名 和 真文件内容
        String fkey = aUtil.generateKey();//加密假文件名 和 假文件内容
        //创建两个文件，分别存真密钥和假密钥
        //String keydir = "C:\\Users\\lenovo\\Desktop\\";//密钥默认存储在桌面
        String keydir = keydirtxt.getText();

        //读真文件名，对文件名进行加密
        String tname = txtfilename.getText();
        String tencryptname = aUtil.encrypt(tkey, tname);

        //fUtil.writeTxtFile(keydir, "tencryptname", tencryptname);

        //读假文件名，对假文件名加密
        String fname = txtfakename.getText();
        String fencryptname = aUtil.encrypt(fkey, fname);

        //fUtil.writeTxtFile(keydir, "fencryptname", fencryptname);

        //读取真文件内容，对文件进行加密
        String filedir = txtdir.getText();
        String tfile = fUtil.readTxtFile(filedir);
        String tencryptfile = aUtil.encrypt(tkey, tfile);
        fUtil.writeTxtFile(keydir, "tencryptfile", tencryptfile);

        //对假文件进行加密，假文件内容默认为道德经第一章
        String ffile = txtfaketext.getText();
        String fencryptfile = aUtil.encrypt(fkey, ffile);
        //fUtil.writeTxtFile(keydir, "fencryptfile", fencryptfile);

        //读取密级
        String style = this.rangeBox.getSelectedItem().toString();
        int style1 = Integer.parseInt(style);
        //生成加密文件
        String result = s.createFile(tencryptname, fencryptname,
                tencryptfile, fencryptfile, tkey, fkey, style1);
    
        if (tname.isEmpty()){
            JOptionPane.showMessageDialog(this, "请选择加密文件");
        }else if (keydir.isEmpty()){
            JOptionPane.showMessageDialog(this, "请选择存储路径");
        }else if (style.isEmpty()){
            JOptionPane.showMessageDialog(this, "请选择密级");
        }else{
            if(result.equals("1")){// 加密文件
                JOptionPane.showMessageDialog(this, "加密失败");
            }
            else if(result.equals("3")){
                JOptionPane.showMessageDialog(this, "网络异常");
            }
            else{
                JOptionPane.showMessageDialog(this, "加密成功，您的文件id号为"+result);
                //将真假密钥分别写入文件
                fUtil.creatTxtFile(keydir, result);
                fUtil.creatTxtFile(keydir, "f"+result);
                fUtil.writeTxtFile(keydir, result, tkey);
                fUtil.writeTxtFile(keydir, "f"+result, fkey);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.setFileSelectionMode(JFileChooser.SAVE_DIALOG | JFileChooser.DIRECTORIES_ONLY);
        jf.showDialog(null, null);
        File fi = jf.getSelectedFile();
        String f = fi.getAbsolutePath() + "\\";
        keydirtxt.setText(f);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private com.ouc.encrypt.view.EncryptJPanel encryptJPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField keydirtxt;
    private javax.swing.JComboBox rangeBox;
    private javax.swing.JTextField txtdir;
    private javax.swing.JTextArea txtfakename;
    private javax.swing.JTextArea txtfaketext;
    private javax.swing.JTextArea txtfilename;
    private javax.swing.JTextArea txttext;
    // End of variables declaration//GEN-END:variables
}