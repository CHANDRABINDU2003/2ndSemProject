package project122;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener {
    JLabel lblusername, lblname;
    JComboBox<String> comboid;
    JTextField tfnumber, tfaddress, tfcountry, tfemail, tfphone;
    JRadioButton rmale, rfemale;
    JButton add, back;

    AddCustomer(String username) {
        setBounds(450, 200, 850, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel labelusername = new JLabel("Username");
        labelusername.setBounds(30, 50, 150, 25);
        add(labelusername);

        lblusername = new JLabel();
        lblusername.setBounds(220, 50, 150, 25);
        add(lblusername);

        JLabel labelid = new JLabel("Id");
        labelid.setBounds(30, 90, 150, 25);
        add(labelid);

        comboid = new JComboBox<>(new String[]{"passport", "NID", "BCNumber"});
        comboid.setBounds(220, 90, 150, 25);
        add(comboid);

        JLabel labelnumber = new JLabel("Number");
        labelnumber.setBounds(30, 130, 150, 25);
        add(labelnumber);

        tfnumber = new JTextField();
        tfnumber.setBounds(220, 130, 150, 25);
        add(tfnumber);

        JLabel labelname = new JLabel("Name");
        labelname.setBounds(30, 170, 150, 25);
        add(labelname);

        lblname = new JLabel();
        lblname.setBounds(220, 170, 150, 25);
        add(lblname);

        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 210, 150, 25);
        add(lblgender);

        rmale = new JRadioButton("Male");
        rmale.setBounds(220, 210, 70, 25);
        rmale.setBackground(Color.WHITE);
        add(rmale);

        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300, 210, 70, 25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);

        JLabel labelcountry = new JLabel("Country");
        labelcountry.setBounds(30, 250, 150, 25);
        add(labelcountry);

        tfcountry = new JTextField();
        tfcountry.setBounds(220, 250, 150, 25);
        add(tfcountry);

        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(30, 290, 150, 25);
        add(labeladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(220, 290, 150, 25);
        add(tfaddress);

        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(30, 330, 150, 25);
        add(labelphone);

        tfphone = new JTextField();
        tfphone.setBounds(220, 330, 150, 25);
        add(tfphone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(30, 370, 150, 25);
        add(labelemail);

        tfemail = new JTextField();
        tfemail.setBounds(220, 370, 150, 25);
        add(tfemail);

        add = new JButton("Add");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(70, 430, 100, 25);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220, 430, 100, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 450, 420);
        add(image);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username='" + username + "'");
            while (rs.next()) {
                lblusername.setText(rs.getString("username"));
                lblname.setText(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String username = lblusername.getText();
            String id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = lblname.getText();
            String gender = rmale.isSelected() ? "Male" : "Female";
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            try {
                Conn c = new Conn();
                String query = "insert into customer values('" + username + "','" + id + "','" + number + "','" +
                        name + "','" + gender + "','" + country + "','" + address + "','" + phone + "','" + email + "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddCustomer("");
    }
}
