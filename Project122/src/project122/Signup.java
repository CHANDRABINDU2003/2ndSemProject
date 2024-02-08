
package project122;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener{
    JButton create, back;
    JTextField name1,name3,pass2,ans1;
    Choice sec;
    
    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1= new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);
        
        
        JLabel name = new JLabel("Username");
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        name.setBounds(50, 20, 125, 25);
        p1.add(name);
        
        
         name1 = new JTextField();
        name1.setBounds(190, 20, 180, 25);
        name1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(name1);
        
        
         JLabel name2 = new JLabel("name");
        name2.setFont(new Font("Tahoma",Font.BOLD,14));
        name2.setBounds(50, 60, 125, 25);
        p1.add(name2);
        
        
         name3 = new JTextField();
        name3.setBounds(190, 60, 180, 25);
        name3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(name3);
        
        
         JLabel pass1 = new JLabel("password");
        pass1.setFont(new Font("Tahoma",Font.BOLD,14));
        pass1.setBounds(50, 100, 125, 25);
        p1.add(pass1);
        
        
         pass2 = new JTextField();
        pass2.setBounds(190, 100, 180, 25);
        pass2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(pass2);
        
        
        JLabel seq =new JLabel("Security Question");
        seq.setBounds(50, 140, 125, 25);
        p1.add(seq);
        
         sec = new Choice();
        sec.add("Fav character from the boys");
        sec.add("Fav Marvel SuperHero");
        sec.add("Your lucky number");
        sec.add("Your childhood SuperHero");
        sec.setBounds(190, 140, 180, 25);
        p1.add(sec);
        
        
        JLabel ans = new JLabel();
        ans.setFont(new Font("Tahoma",Font.BOLD,14));
        ans.setBounds(50, 180, 125, 25);
        p1.add(ans);
        
         ans1 = new JTextField();
        ans1.setBounds(190, 180, 180, 25);
        ans1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(ans1);
        
         create = new JButton("Create");
        create.setForeground(new Color(133,193,233));
        create.setBackground(Color.WHITE);
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this);
        p1.add(create);
        
        
          back = new JButton("Back");
        back.setForeground(new Color(133,193,233));
        back.setBackground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(250,250,100,30);
        back.addActionListener(this);
        p1.add(back);
        
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2=i1.getImage().getScaledInstance(200,200 ,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(530,50,250,250);
       add(image);
        
        
        
     setVisible(true);   
        
        
        
        
    }
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==create){
            String Username= name1.getText();
            String name= name3.getText();
            String password=pass2.getText();
            String question= sec.getSelectedItem();
            String answer=ans1.getText();
            
            String query = "insert into account values ('"+Username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
            try{
                Conn c= new Conn();
            c.s.executeUpdate(query);
           JOptionPane.showMessageDialog(null, "Account Created Successfully");
           setVisible(false);
           new Login();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==back){
            setVisible(false);
            new Login();
        }
        
    }
    public static void main(String[] args) {
        new Signup();
    }
    
}
