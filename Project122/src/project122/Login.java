package project122;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton log, sign, pass;
    JTextField pass2,name2;

    Login() {
        setSize(900, 400);
        setLocation(350, 200);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 120, 200, 200);
        p1.add(image);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 300);
        add(p2);

        JLabel name1 = new JLabel("username");
        name1.setBounds(60, 20, 100, 25);
        name1.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p2.add(name1);

        name2 = new JTextField();
        name2.setBounds(60, 45, 300, 30);
        name2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(name2);

        JLabel pass1 = new JLabel("password");
        pass1.setBounds(60, 110, 100, 25);
        pass1.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        p2.add(pass1);

      pass2 = new JTextField();
        pass2.setBounds(60, 150, 300, 30);
        pass2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(pass2);

        log = new JButton("Login");
        log.setBounds(60, 200, 130, 30);
        log.setBackground(new Color(133, 193, 233));
        log.setForeground(Color.WHITE);
        log.setBorder(new LineBorder(new Color(133, 193, 233)));
        log.addActionListener(this);
        p2.add(log);

        sign = new JButton("SignUp");
        sign.setBounds(230, 200, 130, 30);
        sign.setBackground(new Color(133, 193, 233));
        sign.setForeground(Color.WHITE);
        sign.setBorder(new LineBorder(new Color(133, 193, 233)));
        sign.addActionListener(this);
        p2.add(sign);

        pass = new JButton("Forget Password");
        pass.setBounds(130, 250, 130, 30);
        pass.setBackground(new Color(133, 193, 233));
        pass.setForeground(Color.WHITE);
        pass.setBorder(new LineBorder(new Color(133, 193, 233)));
        pass.addActionListener(this);
        p2.add(pass);

        JLabel text = new JLabel("Trouble in login...");
        text.setBounds(300, 250, 150, 20);
        text.setForeground(Color.RED);
        p2.add(text);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == log) {
            
           try{String username= name2.getText();
           String password = pass2.getText();
           String query ="select * from account where username = '"+username+"' AND password ='"+password+"'";
           Conn c = new Conn();
           ResultSet rs= c.s.executeQuery(query);
           if(rs.next()){
               setVisible(false);
               new Loading(username);
              
           }else {
               JOptionPane.showMessageDialog(null, "Incorrect username & password");
           }
           }
           catch(Exception e){
               e.printStackTrace();
           }
        } else if (ae.getSource() == sign) {
            setVisible(false);
            new Signup();
        } else {
            setVisible(false);
            new ForgetPass();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
