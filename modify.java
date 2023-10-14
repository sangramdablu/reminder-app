import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class modify extends  JFrame implements ActionListener {
    JTextField newdatefield,newsubfield,newdescfield,phonefield,newnextreminder;
    modify(){

        setLayout(null);

        JLabel settext=new JLabel("Modify Your Reminder");
        settext.setBounds(250,30,400,30);
        settext.setFont(new Font("arial",Font.BOLD,25));
        add(settext);

        JLabel fstlable=new JLabel("Select new Date :");
        fstlable.setBounds(50,100,450,20);
        fstlable.setFont(new Font("arial",Font.BOLD,20));
        add(fstlable);


        newdatefield=new JTextField();
        newdatefield.setBounds(350,100,250,25);
        newdatefield.setBackground(Color.DARK_GRAY);
        newdatefield.setForeground(Color.white);
        add(newdatefield);

        JLabel seclable=new JLabel("New Subject :");
        seclable.setBounds(50,150,450,20);
        seclable.setFont(new Font("arial",Font.BOLD,20));
        add(seclable);

        newsubfield=new JTextField();
        newsubfield.setBounds(350,150,250,25);
        newsubfield.setBackground(Color.DARK_GRAY);
        newsubfield.setForeground(Color.white);
        add(newsubfield);

        JLabel thirdlable=new JLabel("New Description :");
        thirdlable.setBounds(50,200,450,20);
        thirdlable.setFont(new Font("arial",Font.BOLD,20));
        add(thirdlable);

        newdescfield=new JTextField();
        newdescfield.setBounds(350,200,250,25);
        newdescfield.setBackground(Color.DARK_GRAY);
        newdescfield.setForeground(Color.white);
        add(newdescfield);

        JLabel fourlable=new JLabel("Phone number :");
        fourlable.setBounds(50,250,450,20);
        fourlable.setFont(new Font("arial",Font.BOLD,20));
        add(fourlable);

        phonefield=new JTextField();
        phonefield.setBounds(350,250,250,25);
        phonefield.setBackground(Color.DARK_GRAY);
        phonefield.setForeground(Color.white);
        add(phonefield);

        JLabel fivelable=new JLabel("Select Next Reminder :");
        fivelable.setBounds(50,300,450,20);
        fivelable.setFont(new Font("arial",Font.BOLD,20));
        add(fivelable);

        newnextreminder=new JTextField();
        newnextreminder.setBounds(350,300,250,25);
        newnextreminder.setBackground(Color.DARK_GRAY);
        newnextreminder.setForeground(Color.white);
        add(newnextreminder);

        JButton  Set_it=new JButton("back");
        Set_it.setBounds(350,350,100,30);
        Set_it.setFont(new Font("arial",Font.BOLD,15));
        Set_it.setBackground(Color.pink);
        Set_it.addActionListener(this);
        add(Set_it);

        JButton  confrim=new JButton("Confrim");
        confrim.setBounds(470,350,100,30);
        confrim.setFont(new Font("arial",Font.BOLD,15));
        confrim.setBackground(Color.pink);
        confrim.addActionListener(this);
        add(confrim);


        setVisible(true);
        setSize(800,550);
        setLocation(500,200);
    }

    public void actionPerformed(ActionEvent b) {
        try {
            String new_date = newdatefield.getText();
            String new_subject = newsubfield.getText();
            String new_desc = newdescfield.getText();
            String phone_number = phonefield.getText();

            Conn c = new Conn();
            String w = "Update table signup where Pnone_number = ('" + phone_number + "')";
            c.s.executeUpdate(w);

        }catch (Exception h){
            System.out.println(h);
        }
    }


    public static void main(String[] args) {
        new modify();
    }
}
