import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setreminder extends JFrame implements ActionListener {
    JTextField fstfield,secfield,thfield,forfield,fiffield;


    setreminder(){
        setLayout(null);

        JLabel settext=new JLabel("Set Your Reminder");
        settext.setBounds(250,30,400,30);
        settext.setFont(new Font("arial",Font.BOLD,25));
        add(settext);

        JLabel fstlable=new JLabel("Select a Date :");
        fstlable.setBounds(50,100,450,20);
        fstlable.setFont(new Font("arial",Font.BOLD,20));
        add(fstlable);


        fstfield=new JTextField();
        fstfield.setBounds(350,100,250,25);
        fstfield.setBackground(Color.DARK_GRAY);
        fstfield.setForeground(Color.white);
        add(fstfield);

        JLabel seclable=new JLabel("Subject :");
        seclable.setBounds(50,150,450,20);
        seclable.setFont(new Font("arial",Font.BOLD,20));
        add(seclable);

        secfield=new JTextField();
        secfield.setBounds(350,150,250,25);
        secfield.setBackground(Color.DARK_GRAY);
        secfield.setForeground(Color.white);
        add(secfield);

        JLabel thirdlable=new JLabel("Add Description :");
        thirdlable.setBounds(50,200,450,20);
        thirdlable.setFont(new Font("arial",Font.BOLD,20));
        add(thirdlable);

        thfield=new JTextField();
        thfield.setBounds(350,200,250,25);
        thfield.setBackground(Color.DARK_GRAY);
        thfield.setForeground(Color.white);
        add(thfield);

        JLabel fourlable=new JLabel("Phone number :");
        fourlable.setBounds(50,250,450,20);
        fourlable.setFont(new Font("arial",Font.BOLD,20));
        add(fourlable);

        forfield=new JTextField();
        forfield.setBounds(350,250,250,25);
        forfield.setBackground(Color.DARK_GRAY);
        forfield.setForeground(Color.white);
        add(forfield);

        JLabel fivelable=new JLabel("Select Next Reminder :");
        fivelable.setBounds(50,300,450,20);
        fivelable.setFont(new Font("arial",Font.BOLD,20));
        add(fivelable);

        fiffield=new JTextField();
        fiffield.setBounds(350,300,250,25);
        fiffield.setBackground(Color.DARK_GRAY);
        fiffield.setForeground(Color.white);
        add(fiffield);

        JButton  Set_it=new JButton("Set It");
        Set_it.setBounds(350,350,80,30);
        Set_it.setFont(new Font("arial",Font.BOLD,15));
        Set_it.setBackground(Color.pink);
        Set_it.addActionListener(this);
        add(Set_it);


        setVisible(true);
        setSize(800,550);
        setLocation(500,200);
    }

    public void actionPerformed(ActionEvent n){

        try {

            String Select_date = fstfield.getText();
            String Subject = secfield.getText();
            String Description = thfield.getText();
            String Phone_number = forfield.getText();
            String Next_reminder = fiffield.getText();

            if (fstfield.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill All Fields");
            } else {
                Conn c = new Conn();
                String q = "insert into setreminder values('" + Select_date + "','" + Subject + "','" + Description + "','" + Phone_number + "','" + Next_reminder + "')";
                c.s.executeUpdate(q);
            }
        }catch (Exception w){
            System.out.println(w);
        }
        JOptionPane.showMessageDialog(null,"Reminder set Successfully");
        setVisible(false);

    }


    public static void main(String[] args) {
        new setreminder();
    }
}
