import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class disable extends JFrame implements ActionListener {
    JTextField numberfield,emailfield;

    disable(){
        setLayout(null);

        JLabel settext=new JLabel("Disable Reminder");
        settext.setBounds(250,30,400,30);
        settext.setFont(new Font("arial",Font.BOLD,25));
        add(settext);

        JLabel fstlable=new JLabel("Your Phone number :");
        fstlable.setBounds(50,100,450,20);
        fstlable.setFont(new Font("arial",Font.BOLD,20));
        add(fstlable);


        numberfield=new JTextField();
        numberfield.setBounds(350,100,250,25);
        numberfield.setBackground(Color.DARK_GRAY);
        numberfield.setForeground(Color.white);
        add(numberfield);

        JLabel seclable=new JLabel("Your Email :");
        seclable.setBounds(50,150,450,20);
        seclable.setFont(new Font("arial",Font.BOLD,20));
        add(seclable);

        emailfield=new JTextField();
        emailfield.setBounds(350,150,250,25);
        emailfield.setBackground(Color.DARK_GRAY);
        emailfield.setForeground(Color.white);
        add(emailfield);

        JButton  Set_it=new JButton("back");
        Set_it.setBounds(350,200,100,30);
        Set_it.setFont(new Font("arial",Font.BOLD,15));
        Set_it.setBackground(Color.pink);
        Set_it.addActionListener(this);
        add(Set_it);

        JButton  Disable=new JButton("Disable");
        Disable.setBounds(470,200,100,30);
        Disable.setFont(new Font("arial",Font.BOLD,15));
        Disable.setBackground(Color.pink);
        Disable.addActionListener(this);
        add(Disable);


        setVisible(true);
        setSize(800,550);
        setLocation(500,200);
    }

    public void actionPerformed(ActionEvent d){

    }

    public static void main(String[] args) {
        new disable();
    }
}
