
package project122;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashBoard extends JFrame implements ActionListener{
    JButton a,c;
    String username;
    DashBoard (String username){
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(1200,600 ,Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5,0,70,70);
        p1.add(image);
        
        JLabel heading = new JLabel("dashBoard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color (0,0,102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        a= new JButton("Add Personal Details ");
        a.setBounds(0, 0, 300, 50);
        a.setBackground(new Color(0,0,102));
        a.setForeground(Color.WHITE);
        a.setFont(new Font("Tahoma",Font.PLAIN,20));
        a.setMargin(new Insets(0,0,0,60));
        a.addActionListener(this);
        p2.add(a);
        
        
        JButton  b= new JButton("Update Personal Details ");
        b.setBounds(0, 50, 300, 50);
        b.setBackground(new Color(0,0,102));
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Tahoma",Font.PLAIN,20));
        b.setMargin(new Insets(0,0,0,60));
        p2.add(b);
        
          c= new JButton("View Details ");
        c.setBounds(0, 100, 300, 50);
        c.setBackground(new Color(0,0,102));
        c.setForeground(Color.WHITE);
        c.setFont(new Font("Tahoma",Font.PLAIN,20));
        c.setMargin(new Insets(0,0,0,130));
          c.addActionListener(this);
        p2.add(c);
        
         JButton d= new JButton("Delete Personal Details ");
        d.setBounds(0, 150, 300, 50);
        d.setBackground(new Color(0,0,102));
        d.setForeground(Color.WHITE);
        d.setFont(new Font("Tahoma",Font.PLAIN,20));
        d.setMargin(new Insets(0,0,0,50));
        p2.add(d);
        
         JButton e= new JButton("Check Packages");
        e.setBounds(0, 200, 300, 50);
        e.setBackground(new Color(0,0,102));
        e.setForeground(Color.WHITE);
        e.setFont(new Font("Tahoma",Font.PLAIN,20));
        e.setMargin(new Insets(0,0,0,110));
        p2.add(e);
        
         JButton f= new JButton("Book Package ");
        f.setBounds(0, 250, 300, 50);
        f.setBackground(new Color(0,0,102));
        f.setForeground(Color.WHITE);
        f.setFont(new Font("Tahoma",Font.PLAIN,20));
        f.setMargin(new Insets(0,0,0,110));
        p2.add(f);
        
         JButton g= new JButton("View Package");
        g.setBounds(0, 300, 300, 50);
        g.setBackground(new Color(0,0,102));
        g.setForeground(Color.WHITE);
        g.setFont(new Font("Tahoma",Font.PLAIN,20));
        g.setMargin(new Insets(0,0,0,120));
        p2.add(g);
        
         JButton h= new JButton("View Hotels ");
        h.setBounds(0, 350, 300, 50);
        h.setBackground(new Color(0,0,102));
        h.setForeground(Color.WHITE);
        h.setFont(new Font("Tahoma",Font.PLAIN,20));
        h.setMargin(new Insets(0,0,0,130));
        p2.add(h);
        
         JButton i= new JButton("Book Hotels ");
        i.setBounds(0, 400, 300, 50);
        i.setBackground(new Color(0,0,102));
        i.setForeground(Color.WHITE);
        i.setFont(new Font("Tahoma",Font.PLAIN,20));
        i.setMargin(new Insets(0,0,0,140));
        p2.add(i);
        
         JButton j= new JButton("View Booked Hotels ");
        j.setBounds(0, 450, 300, 50);
        j.setBackground(new Color(0,0,102));
        j.setForeground(Color.WHITE);
        j.setFont(new Font("Tahoma",Font.PLAIN,20));
        j.setMargin(new Insets(0,0,0,70));
        p2.add(j);
        
         JButton k= new JButton("Destination");
        k.setBounds(0, 500, 300, 50);
        k.setBackground(new Color(0,0,102));
        k.setForeground(Color.WHITE);
        k.setFont(new Font("Tahoma",Font.PLAIN,20));
        k.setMargin(new Insets(0,0,0,125));
        p2.add(k);
        
         JButton l= new JButton("Payments ");
        l.setBounds(0, 550, 300, 50);
        l.setBackground(new Color(0,0,102));
        l.setForeground(Color.WHITE);
        l.setFont(new Font("Tahoma",Font.PLAIN,20));
        l.setMargin(new Insets(0,0,0,155));
        p2.add(l);
        
         JButton m= new JButton("Calculator ");
        m.setBounds(0, 600, 300, 50);
        m.setBackground(new Color(0,0,102));
        m.setForeground(Color.WHITE);
        m.setFont(new Font("Tahoma",Font.PLAIN,20));
        m.setMargin(new Insets(0,0,0,145));
        p2.add(m);
        
         JButton n= new JButton("Notepad ");
        n.setBounds(0, 650, 300, 50);
        n.setBackground(new Color(0,0,102));
        n.setForeground(Color.WHITE);
        n.setFont(new Font("Tahoma",Font.PLAIN,20));
        n.setMargin(new Insets(0,0,0,155));
        p2.add(n);
        
        
         JButton o= new JButton("About ");
        o.setBounds(0, 700, 300, 50);
        o.setBackground(new Color(0,0,102));
        o.setForeground(Color.WHITE);
        o.setFont(new Font("Tahoma",Font.PLAIN,20));
        o.setMargin(new Insets(0,0,0,175));
        p2.add(o);
        
         ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650,1000 ,Image.SCALE_DEFAULT );
        ImageIcon i6 = new ImageIcon(i5);
        JLabel icon = new JLabel(i6);
        icon.setBounds(0,0,1650,1000);
       add(icon);
        
         JLabel text= new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway",Font.PLAIN,55));
        icon.add(text);
       
        setVisible(true);
        
    }
   
    public void actionPerformed(ActionEvent ae){
        System.out.println(ae.getSource());
        if(ae.getSource()==a){
            new AddCustomer(username);
        }
        else if(ae.getSource()==c){
            new ViewCustomer(username);
        }
    }

 public static void main(String[] args) {
        new DashBoard("");
    }
}
