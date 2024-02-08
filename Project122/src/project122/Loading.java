
package project122;

import javax.swing.*;
import java.awt.*;
public class Loading extends JFrame implements Runnable{
   Thread t;
   JProgressBar bar;
   String username;
    
   Loading (String username){
       this.username = username;
       t= new Thread(this);
      
       setBounds(500,200,650,400);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       
       JLabel text = new JLabel ("Travel and Tour Application");
       
       text.setForeground(Color.BLUE);
       text.setFont(new Font ("Raleway",Font.BOLD,35));
       add(text);
       
       bar = new JProgressBar();
       bar.setBounds(150, 100, 300, 35);
       bar.setStringPainted(true);
       add(bar);
       
       JLabel loading = new JLabel ("Loading,please wait...");
       loading.setBounds(230, 130, 180, 30);
       loading.setForeground(Color.red);
       loading.setFont(new Font ("Raleway",Font.BOLD,16));
       add(loading);
       
       JLabel lblusername = new JLabel ("welcome "+username);
       lblusername.setBounds(20, 310, 150, 30);
      lblusername.setForeground(Color.red);
       lblusername.setFont(new Font ("Raleway",Font.BOLD,16));
       add(lblusername);
       t.start();
       setVisible(true);        
       
   }
   public void run(){
   
   try{
       for(int i =1; i<=101;i++){
           int max= bar.getMaximum();
           int value = bar.getValue();
           if(value <max){
               bar.setValue(bar.getValue()+1);
           }
           else {
               setVisible(false);
               
                   
                   }
           Thread.sleep(50);
           
       }
       new DashBoard(username);
   }
   catch (Exception e){
       e.printStackTrace();
   }
   }
    
    public static void main(String[] args) {
        new Loading("");
    }
 
}
