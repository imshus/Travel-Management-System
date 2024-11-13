/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author Home-PC
 */
public class ForgetPassword extends JFrame implements ActionListener {
    JTextField tfild,tfildname,tfildquestion,tfildans,tfildpass;
    JButton search,retrieve,back;
    ForgetPassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580,70,200,200);
        add(image);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);
        
        JLabel username=new JLabel("Username");
        username.setBounds(40,20,100,25);
        username.setFont(new Font("SAN SERIF",Font.BOLD,14));
        p1.add(username);
        
        tfild=new JTextField();
        tfild.setBounds(220,20,150,25);
        tfild.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfild);
        
        search =new JButton("Search");
        search.setBackground(Color.gray);
        search.setForeground(Color.white);
        search.setBounds(380,20,100,25);
        search.addActionListener(this);
        p1.add(search);
        
        JLabel name=new JLabel("Name");
        name.setBounds(40,60,100,25);
        name.setFont(new Font("SAN SERIF",Font.BOLD,14));
        p1.add(name);
        
        tfildname=new JTextField();
        tfildname.setBounds(220,60,150,25);
        tfildname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfildname);
        
        JLabel question=new JLabel("Security Questions");
        question.setBounds(40,100,150,25);
        question.setFont(new Font("SAN SERIF",Font.BOLD,14));
        p1.add(question);
        
        tfildquestion=new JTextField();
        tfildquestion.setBounds(220,100,150,25);
        tfildquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfildquestion);
        
        JLabel answer=new JLabel("Answer");
        answer.setBounds(40,140,150,25);
        answer.setFont(new Font("SAN SERIF",Font.BOLD,14));
        p1.add(answer);
        
        tfildans=new JTextField();
        tfildans.setBounds(220,140,150,25);
        tfildans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfildans);
        
        retrieve =new JButton("Retrieve");
        retrieve.setBackground(Color.gray);
        retrieve.setForeground(Color.white);
        retrieve.setBounds(380,140,100,25);
        retrieve.addActionListener(this);
        p1.add(retrieve);
        
        JLabel password=new JLabel("Password");
        password.setBounds(40,180,150,25);
        password.setFont(new Font("SAN SERIF",Font.BOLD,14));
        p1.add(password);
        
        tfildpass=new JTextField();
        tfildpass.setBounds(220,180,150,25);
        tfildpass.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfildpass);
        
        back =new JButton("Back");
        back.setBackground(Color.gray);
        back.setForeground(Color.white);
        back.setBounds(200,230,100,25);
        back.addActionListener(this);
        p1.add(back);
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
            try{
                String query="select * from account where username='"+tfild.getText()+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next()){
                    tfildname.setText(rs.getString("name"));
                    tfildquestion.setText(rs.getString("securityoptio1"));
                     
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()==retrieve){
            try{
                String query="select * from account where answer='"+tfildans.getText()+"' And username ='"+tfild.getText()+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next()){
                    tfildpass.setText(rs.getString("pass"));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            
        }else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){
        new ForgetPassword();
    }
}
