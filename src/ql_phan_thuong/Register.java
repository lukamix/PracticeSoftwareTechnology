package ql_phan_thuong;


import java.awt.Color;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PV
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        try {
            this.accountFile = new FileInputStream("src/ql_phan_thuong/account.txt");
            initComponents();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
            Scanner sc = new Scanner(this.accountFile);
            while (sc.hasNextLine()) 
            { 
                this.inputun[this.count] = sc.nextLine(); 
                this.inputpw[this.count] = sc.nextLine();
                this.inputemail[this.count] = sc.nextLine();
                this.count++;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        MatKhau = new javax.swing.JTextField();
        NhapLaiMatKhau = new javax.swing.JTextField();
        DongY = new javax.swing.JCheckBox();
        DangKyNgay = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Đăng Ký");

        UserName.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        UserName.setForeground(new java.awt.Color(153, 153, 153));
        UserName.setText("User Name");
        UserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameMouseClicked(evt);
            }
        });
        UserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserNameKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Tạo tài khoản của bạn. Miễn phí và nhanh chóng !");

        email.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("Email");
        email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailMouseClicked(evt);
            }
        });

        MatKhau.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        MatKhau.setForeground(new java.awt.Color(153, 153, 153));
        MatKhau.setText("Mật Khẩu");
        MatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatKhauMouseClicked(evt);
            }
        });

        NhapLaiMatKhau.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        NhapLaiMatKhau.setForeground(new java.awt.Color(153, 153, 153));
        NhapLaiMatKhau.setText("Nhập Lại Mật Khẩu");
        NhapLaiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhapLaiMatKhauMouseClicked(evt);
            }
        });

        DongY.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DongY.setForeground(new java.awt.Color(153, 153, 153));
        DongY.setText("Tôi đồng ý với yêu cầu và chính sách sử dụng");
        DongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DongYActionPerformed(evt);
            }
        });

        DangKyNgay.setBackground(new java.awt.Color(0, 204, 0));
        DangKyNgay.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DangKyNgay.setForeground(new java.awt.Color(255, 255, 255));
        DangKyNgay.setText("Đăng Ký Ngay");
        DangKyNgay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangKyNgayMouseClicked(evt);
            }
        });
        DangKyNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangKyNgayActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ql_phan_thuong/line.png"))); // NOI18N

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ql_phan_thuong/line.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DongY)
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DangKyNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email)
                    .addComponent(MatKhau)
                    .addComponent(NhapLaiMatKhau)
                    .addComponent(UserName, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(NhapLaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DongY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DangKyNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameKeyPressed

    private void UserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameMouseClicked
        b();
        c();
        d();
        if(!checkusernameclick){
        UserName.setText("");
        UserName.setFont(tnrmstraight);
        UserName.setForeground(Color.BLACK);
        checkusernameclick=true;
        }
    }//GEN-LAST:event_UserNameMouseClicked

    private void emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailMouseClicked
        a();
        c();
        d();
        if(!checkemailclick){
        email.setText("");
        email.setFont(tnrmstraight);
        email.setForeground(Color.BLACK);
        checkemailclick=true;
        }
    }//GEN-LAST:event_emailMouseClicked

    private void MatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatKhauMouseClicked
        a();
        b();
        d();
        if(!checkmatkhauclick){
        MatKhau.setText("");
        MatKhau.setFont(tnrmstraight);
        MatKhau.setForeground(Color.BLACK);
        checkmatkhauclick=true;
        }
    }//GEN-LAST:event_MatKhauMouseClicked

    private void NhapLaiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhapLaiMatKhauMouseClicked
        a();
        b();
        c();
        if(!checknhaplaimatkhauclick){
        NhapLaiMatKhau.setText("");
        NhapLaiMatKhau.setFont(tnrmstraight);
        NhapLaiMatKhau.setForeground(Color.BLACK);
        checknhaplaimatkhauclick=true;
        }
    }//GEN-LAST:event_NhapLaiMatKhauMouseClicked

    private void DongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DongYActionPerformed

    }//GEN-LAST:event_DongYActionPerformed

    private void DangKyNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangKyNgayActionPerformed
        String un = UserName.getText();
        String em = email.getText();
        String mk = MatKhau.getText();
        String nlmk = NhapLaiMatKhau.getText();
        if(em.equals("")||em.equals("Email")
        ||mk.equals("")||mk.equals("Mật Khẩu")
        ||un.equals("")||un.equals("User Name")
        ||nlmk.equals("")||nlmk.equals("Nhập Lại Mật Khẩu"))
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin trước khi đăng kí !");
        else if(!DongY.isSelected()) JOptionPane.showMessageDialog(rootPane, "Bạn chưa đồng ý với Yêu cầu và Chính sách của chúng tôi !");
        else if(!mk.equals(nlmk)) JOptionPane.showMessageDialog(rootPane,"Nhập lại mật khẩu chưa chính xác !");
        else if(!em.contains(".")&&!em.contains("@")) JOptionPane.showMessageDialog(rootPane,"Định dạng email chưa đúng ,vui lòng nhập lại");
        else{
            boolean checkused = false;
            for(int i=0;i<this.count;i++){
                if(this.inputun[i].equals(un)) {
                    JOptionPane.showMessageDialog(rootPane, "Tài khoản này đã được sử dụng !");
                    checkused=true;
                    break;
                }
                if(this.inputemail[i].equals(em)){
                    JOptionPane.showMessageDialog(rootPane, "Email này đã được sử dụng !");
                    checkused=true;
                    break;
                }
            }
            if(!checkused){
                try {
                    Files.write(Paths.get("src/account.txt"), ("\n"+un).getBytes(), StandardOpenOption.APPEND);
                    Files.write(Paths.get("src/account.txt"), ("\n"+mk).getBytes(), StandardOpenOption.APPEND);
                    Files.write(Paths.get("src/account.txt"), ("\n"+em).getBytes(), StandardOpenOption.APPEND);
                }catch (IOException e){           
                    }
                properties = new Properties();
                properties.put("mail.smtp.auth","true");
                properties.put("mail.smtp.starttls.enable","true");
                properties.put("mail.smtp.host","smtp.gmail.com");
                properties.put("mail.smtp.port","587");

                String myAccountEmail = "nguyenbaduc0205@gmail.com";
                String mypassword = "Khongbiet";

                Session session = Session.getInstance(properties, new Authenticator(){
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication(){
                        return new PasswordAuthentication(myAccountEmail,mypassword);
                    } 
                });

                Message message = prepareMessage(session,myAccountEmail,em,un,mk);
                try {
                    Transport.send(message);
                } catch (MessagingException ex) {
                    Logger.getLogger(ForGotPassWord.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(rootPane, "Đăng Kí Thành Công !");
            }
        }
    }//GEN-LAST:event_DangKyNgayActionPerformed

    private void DangKyNgayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangKyNgayMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DangKyNgayMouseClicked
    private Message prepareMessage(Session session,String myAccountEmail,String recepient,String Username,String password) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("Create New Account");
            String mail = "Bạn đã tạo tài khoản Quản Lý Phần Thưởng mới !\nTên Đăng Nhập là: "+Username+"\nMật Khẩu là: "+password
                    +"\nEmail này được tạo tự động bởi Phần Mềm Quản Lý Phần Thưởng"
                    +"\nBản Quyền Thuộc Về A+ NMCNPM .Inc"
                    +"\nCảm ơn bạn đã sử dụng phần mềm của chúng tôi"
                    +"\nĐể biết thêm thông tin chi tiết về sản phẩm ,Liên Hệ : Nguyễn Bá Đức Facebook:facebook.com/Luka.Meoww hoặc Email này !";
            message.setText(mail);
            return message;
        } catch (MessagingException ex) {
            Logger.getLogger(ForGotPassWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    private void b(){
        if(email.getText().equals("")){
            email.setText("Email");
            email.setFont(tnmrnghieng);
            email.setForeground(Color.GRAY);
            checkemailclick=false;
        }
    }
    private void c(){
        if(MatKhau.getText().equals("")){
            MatKhau.setText("Mật Khẩu");
            MatKhau.setFont(tnmrnghieng);
            MatKhau.setForeground(Color.GRAY);
            checkmatkhauclick=false;
        }
    }
    private void a(){
        if(UserName.getText().equals("")){
            UserName.setText("User Name");
            UserName.setFont(tnmrnghieng);
            UserName.setForeground(Color.GRAY);
            checkusernameclick=false;
        }
    }
    private void d(){
        if(NhapLaiMatKhau.getText().equals("")){
            NhapLaiMatKhau.setText("Nhập Lại Mật Khẩu");
            NhapLaiMatKhau.setFont(tnmrnghieng);
            NhapLaiMatKhau.setForeground(Color.GRAY);
            checknhaplaimatkhauclick=false;
        }
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    boolean checkusernameclick = false;
    boolean checkemailclick = false;
    boolean checkmatkhauclick = false;
    boolean checknhaplaimatkhauclick = false;
    Font tnrmstraight = new Font("Times New Roman", Font.BOLD, 24);
    Font tnmrnghieng = new Font("Times New Roman", Font.ITALIC,24);
    String inputun[] = new String[1000],inputpw[] = new String[1000],inputemail[]=new String[1000]; 
    Properties properties ;
    FileInputStream accountFile;
    
    int count = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DangKyNgay;
    private javax.swing.JCheckBox DongY;
    private javax.swing.JTextField MatKhau;
    private javax.swing.JTextField NhapLaiMatKhau;
    private javax.swing.JTextField UserName;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
