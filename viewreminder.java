import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewreminder extends JFrame implements ActionListener {
    JTextField viewfield;
    viewreminder(){
        setLayout(null);

        JLabel fstlable=new JLabel("Your Phone number :");
        fstlable.setBounds(50,150,450,20);
        fstlable.setFont(new Font("arial",Font.BOLD,20));
        add(fstlable);


        viewfield=new JTextField();
        viewfield.setBounds(350,150,250,25);
        viewfield.setBackground(Color.DARK_GRAY);
        viewfield.setForeground(Color.white);
        add(viewfield);

        JButton  Set_it=new JButton("back");
        Set_it.setBounds(350,250,100,30);
        Set_it.setFont(new Font("arial",Font.BOLD,15));
        Set_it.setBackground(Color.pink);
        Set_it.addActionListener(this);
        add(Set_it);

        JButton  Disable=new JButton("View");
        Disable.setBounds(470,250,100,30);
        Disable.setFont(new Font("arial",Font.BOLD,15));
        Disable.setBackground(Color.pink);
        Disable.addActionListener(this);
        add(Disable);

        setVisible(true);
        setSize(800,550);
        setLocation(500,200);
    }
    public void actionPerformed(ActionEvent k){

    }

    public static void main(String[] args) {

        new viewreminder();
    }
}
