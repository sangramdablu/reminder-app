import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {

    JButton loginbtn,set,signupbtn,disalebtn,deletebtn,enablebtn,viewbtn;

    login(){
        setLayout(null);

        JLabel text=new JLabel("Welcome To The Reminder Application");
        text.setBounds(170,50,500,25);
        text.setFont(new Font("arial",Font.BOLD,25));
        text.setForeground(Color.BLACK);
        add(text);

        JLabel date=new JLabel("Today is 14th oct 2023");
        date.setBounds(50,120,500,25);
        date.setFont(new Font("arial",Font.BOLD,25));
        add(date);

        set=new JButton("Set Reminder");
        set.setBounds(50,200,200,50);
        set.setFont(new Font("arial",Font.BOLD,15));
        set.setBackground(Color.pink);
        set.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new setreminder();
            }
        });
        add(set);

        loginbtn=new JButton("Modify Reminder");
        loginbtn.setBounds(300,200,200,50);
        loginbtn.setFont(new Font("arial",Font.BOLD,15));
        loginbtn.setBackground(Color.pink);
        loginbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new modify();
            }
        });
        add(loginbtn);

        disalebtn=new JButton("Disable Reminder");
        disalebtn.setBounds(550,200,200,50);
        disalebtn.setFont(new Font("arial",Font.BOLD,15));
        disalebtn.setBackground(Color.pink);
        disalebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new disable();
            }
        });
        add(disalebtn);

        deletebtn=new JButton("Delete Reminder");
        deletebtn.setBounds(50,300,200,50);
        deletebtn.setFont(new Font("arial",Font.BOLD,15));
        deletebtn.setBackground(Color.pink);
        deletebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new delete();
            }
        });
        add(deletebtn);

        enablebtn=new JButton("Enable Reminder");
        enablebtn.setBounds(300,300,200,50);
        enablebtn.setFont(new Font("arial",Font.BOLD,15));
        enablebtn.setBackground(Color.pink);
        add(enablebtn);

        viewbtn=new JButton("View Reminder");
        viewbtn.setBounds(550,300,200,50);
        viewbtn.setFont(new Font("arial",Font.BOLD,15));
        viewbtn.setBackground(Color.pink);
        viewbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new viewreminder();
            }
        });
        add(viewbtn);

        JLabel notmem=new JLabel("Not a Member sign up here");
        notmem.setBounds(50,450,350,15);
        add(notmem);

        signupbtn=new JButton("Sign up");
        signupbtn.setBounds(220,445,100,30);
        signupbtn.setFont(new Font("arial",Font.BOLD,15));
        signupbtn.setBackground(Color.pink);
        signupbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new signup();
            }
        });
        add(signupbtn);



        setVisible(true);
        setSize(800,550);
        setLocation(500,200);
        setBackground(Color.pink);
    }

    public void actionPerformed(ActionEvent ae){

    }

    public static void main(String[] args) {
        new login();
    }
}
