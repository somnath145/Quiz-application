
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class login extends JFrame implements ActionListener{
    
   JLabel l;
   JLabel image;
   JLabel name;
   JLabel l1;
   JLabel l2;
   TextField tf;
   JButton cancel_1;
   JButton next1;
   JButton next2;
   JButton cancel_2;

    public login(){
        getContentPane().setBackground(Color.WHITE);
        this.setLayout(null);

        ImageIcon i1 = new ImageIcon("D:\\Java\\quize\\icons\\login.jpeg");
        image = new JLabel(i1);
        image.setBounds(5, 0, 500, 500);
        add(image);
        

        l = new JLabel("Simple Quize");
        l.setBounds(550, 130, 300, 60);
        l.setFont((new Font("Viner Hand ITC", Font.BOLD, 40)));
        l.setForeground(Color.blue);
        add(l);

        name = new JLabel("Enter Name : ");
        name.setBounds(550, 200, 300, 50);
        name.setFont(new Font("Consolas", Font.BOLD, 30));
        add(name);

        tf = new TextField();
        tf.setBounds(550, 250, 300, 40);
        tf.setFont(new Font("Algerian", Font.ROMAN_BASELINE, 20));
        tf.setBackground(Color.LIGHT_GRAY);
        add(tf);

        next1 = new JButton("NEXT");
        next1.setBounds(700, 350, 100, 50);
        next1.setForeground(Color.BLACK);
        next1.setBackground(Color.GREEN);
        next1.addActionListener(this);
        add(next1);
        cancel_1 = new JButton("CANCEL");
        cancel_1.setBounds(570, 350, 100, 50);
        cancel_1.setBackground(Color.RED);
        cancel_1.setForeground(Color.WHITE);
        cancel_1.addActionListener(this);
        add(cancel_1);


        setVisible(true);
        setTitle("Quize Application");
        setBounds(300, 80, 900, 550);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==cancel_1){
            setVisible(false);
        }
        if(e.getSource()==next1){
            setVisible(false);
            String n = tf.getText();
            new Rules(n);
        }
    }

    public static void main(String[] args) {
        new login();
    }

}



