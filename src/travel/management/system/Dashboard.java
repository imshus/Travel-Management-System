/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Home-PC
 */
public class Dashboard extends JFrame {
    
    Dashboard(){
       
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,2000,65);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,2000);
        add(p2);
        
        JButton addPersonalDetails=new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        p2.add(addPersonalDetails);
        
        JButton updatePersonalDetails=new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        p2.add(updatePersonalDetails);
        
        JButton viewPersonalDetails=new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setForeground(Color.white);
        viewPersonalDetails.setMargin(new Insets(0,0,0,50));
        p2.add(viewPersonalDetails);
        
        JButton deletePersonalDetails=new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setMargin(new Insets(0,0,0,35));
        p2.add(deletePersonalDetails);
        
        JButton checkpackages=new JButton("Check Package");
        checkpackages.setBounds(0,200,300,50);
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackages.setForeground(Color.white);
        checkpackages.setMargin(new Insets(0,0,0,110));
        p2.add(checkpackages);
        
        JButton bookpackages=new JButton("Book Package");
        bookpackages.setBounds(0,250,300,50);
        bookpackages.setBackground(new Color(0,0,102));
        bookpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackages.setForeground(Color.white);
        bookpackages.setMargin(new Insets(0,0,0,120));
        p2.add(bookpackages);
        
        JButton viewpackages=new JButton("View Package");
        viewpackages.setBounds(0,300,300,50);
        viewpackages.setBackground(new Color(0,0,102));
        viewpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackages.setForeground(Color.white);
        viewpackages.setMargin(new Insets(0,0,0,122));
        p2.add(viewpackages);
        
        JButton viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setForeground(Color.white);
        viewhotels.setMargin(new Insets(0,0,0,140));
        p2.add(viewhotels);
        
        JButton bookhotel=new JButton("Book Hotel");
        bookhotel.setBounds(0,400,300,50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setForeground(Color.white);
        bookhotel.setMargin(new Insets(0,0,0,150));
        p2.add(bookhotel);
        
        JButton viewbookhotel=new JButton("View Booked Hotel");
        viewbookhotel.setBounds(0,450,300,50);
        viewbookhotel.setBackground(new Color(0,0,102));
        viewbookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookhotel.setForeground(Color.white);
        viewbookhotel.setMargin(new Insets(0,0,0,80));
        p2.add(viewbookhotel);
        
        JButton destinations=new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setForeground(Color.white);
        destinations.setMargin(new Insets(0,0,0,137));
        p2.add(destinations);
        
        JButton payments=new JButton("Payments");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setForeground(Color.white);
        payments.setMargin(new Insets(0,0,0,165));
        p2.add(payments);
        
        JButton calculators=new JButton("Calculator");
        calculators.setBounds(0,600,300,50);
        calculators.setBackground(new Color(0,0,102));
        calculators.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculators.setForeground(Color.white);
        calculators.setMargin(new Insets(0,0,0,165));
        p2.add(calculators);
        
        JButton notepad=new JButton("Notepad");
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setForeground(Color.white);
        notepad.setMargin(new Insets(0,0,0,175));
        p2.add(notepad);
        
        JButton about=new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0,0,102));
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setForeground(Color.white);
        about.setMargin(new Insets(0,0,0,195));
        p2.add(about);
        
       ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i5=i4.getImage().getScaledInstance(2000, 1500, Image.SCALE_DEFAULT);
       ImageIcon i6=new ImageIcon(i5);
       JLabel image=new JLabel(i6);
       image.setBounds(0,0,2000,1500);
       add(image);
       
       JLabel text=new JLabel("Travel and Tourism Management System");
       text.setBounds(400,70,1200,70);
       text.setForeground(Color.WHITE);
       text.setFont(new Font("Raleway",Font.PLAIN,55));
       image.add(text);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new Dashboard();
    }
}
