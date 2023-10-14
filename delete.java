import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class delete extends  JFrame implements ActionListener {
    JTextField deletefield;

    delete(){
        setLayout(null);

        JLabel fstlable=new JLabel("Your Phone number :");
        fstlable.setBounds(50,150,450,20);
        fstlable.setFont(new Font("arial",Font.BOLD,20));
        add(fstlable);


        deletefield=new JTextField();
        deletefield.setBounds(350,150,250,25);
        deletefield.setBackground(Color.DARK_GRAY);
        deletefield.setForeground(Color.white);
        add(deletefield);

        JButton  Set_it=new JButton("back");
        Set_it.setBounds(350,250,100,30);
        Set_it.setFont(new Font("arial",Font.BOLD,15));
        Set_it.setBackground(Color.pink);
        Set_it.addActionListener(this);
        add(Set_it);

        JButton  Disable=new JButton("Delete");
        Disable.setBounds(470,250,100,30);
        Disable.setFont(new Font("arial",Font.BOLD,15));
        Disable.setBackground(Color.pink);
        Disable.addActionListener(this);
        add(Disable);

        setVisible(true);
        setSize(800,550);
        setLocation(500,200);
    }
    public void actionPerformed(ActionEvent h){

    }

    public static void main(String[] args) {
        new delete();
    }
}
