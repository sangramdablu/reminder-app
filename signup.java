import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup extends JFrame implements ActionListener {

    JTextField fstfield,secfield,thirdfield,fourfield;
    signup(){
        setLayout(null);

        JLabel maintext=new JLabel("Sign Up Here");
        maintext.setFont(new Font("arial",Font.BOLD,30));
        maintext.setBounds(200,20,250,30);
        add(maintext);

        JLabel signup1=new JLabel("Your Name :");
        signup1.setBounds(50,100,150,35);
        signup1.setFont(new Font("arial",Font.BOLD,25));
        add(signup1);

        fstfield=new JTextField();
        fstfield.setBounds(240,105,250,25);
        fstfield.setBackground(Color.DARK_GRAY);
        fstfield.setForeground(Color.white);
        add(fstfield);

        JLabel signup2=new JLabel("Phone Number :");
        signup2.setBounds(50,150,200,35);
        signup2.setFont(new Font("arial",Font.BOLD,20));
        add(signup2);

        secfield=new JTextField();
        secfield.setBounds(240,155,250,25);
        secfield.setBackground(Color.DARK_GRAY);
        secfield.setForeground(Color.white);
        add(secfield);

        JLabel signup3=new JLabel("Your EMail :");
        signup3.setBounds(50,200,150,35);
        signup3.setFont(new Font("arial",Font.BOLD,25));
        add(signup3);

        thirdfield=new JTextField();
        thirdfield.setBounds(240,205,250,25);
        thirdfield.setBackground(Color.DARK_GRAY);
        thirdfield.setForeground(Color.white);
        add(thirdfield);

        JLabel signup4=new JLabel("Password :");
        signup4.setBounds(50,250,150,35);
        signup4.setFont(new Font("arial",Font.BOLD,25));
        add(signup4);

        fourfield=new JTextField();
        fourfield.setBounds(240,255,250,25);
        fourfield.setBackground(Color.DARK_GRAY);
        fourfield.setForeground(Color.white);
        add(fourfield);

        JButton  SignupHere=new JButton("Sign Up");
        SignupHere.setBounds(240,300,100,30);
        SignupHere.setFont(new Font("arial",Font.BOLD,15));
        SignupHere.setBackground(Color.pink);
        SignupHere.addActionListener(this);
        add(SignupHere);


        setVisible(true);
        setSize(800,550);
        setLocation(500,200);
    }


    public void actionPerformed(ActionEvent e){

        try {
            String Name = fstfield.getText();
            String Phone_numbeer = secfield.getText();
            String Email_id = thirdfield.getText();
            String user_password = fourfield.getText();

            if (fstfield.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "All fields Are Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('" + Name + "','" + Phone_numbeer + "','" + Email_id + "','" + user_password + "')";
                c.s.executeUpdate(query);
            }
        }catch (Exception r){
            System.out.println(r);
        }
        JOptionPane.showMessageDialog(null,"Sign up Successfully");
        setVisible(false);
    }


    public static void main(String[] args) {
        new signup();
    }
}
