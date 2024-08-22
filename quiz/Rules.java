
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Rules extends JFrame implements ActionListener{
    
    String name;
    JLabel l1;
    JLabel l2;
    TextField tf;
    JButton next2;
    JButton cancel_2;

    public Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
     

    //  String name = tf.getText();

     l1 = new JLabel("Welcome " + name + " in Simple Quize");
     l1.setBounds(100, 25, 900, 60);
     l1.setFont((new Font("MV Boli", Font.BOLD, 35)));
     l1.setForeground(Color.blue);
     add(l1);

     l2 = new JLabel();
     l2.setLayout(null);
     l2.setBounds(30, 20, 900, 400);
     l2.setFont((new Font("MV Boli", Font.BOLD, 26)));
     l2.setText(
         "<html>"+ 
             "Rules :: "+ "<br>"+
             "1. Read The Question Cairfully ." + "<br>" +
             "2. Answer each question within 15 sec." + "<br>" +
             "3. You can use 50-50 for three times." + "<br>" +
             "4. You can not skip any question." + "<br>" +
             "5. One question contain 10 marks." + "<br>" +
         "<html>"

     );
     add(l2);

     next2 = new JButton("PLAY");
     next2.setBounds(450, 390, 150, 50);
     next2.setBackground(Color.GREEN);
     next2.addActionListener(this);
     add(next2);

     cancel_2 = new JButton("CANCEL");
     cancel_2.setBounds(250, 390, 150, 50);
     cancel_2.setBackground(Color.RED);
     cancel_2.setForeground(Color.WHITE);
     cancel_2.addActionListener(this);
     add(cancel_2);

     setVisible(true);
     setBounds(300, 80, 900, 550);
     
    }

    public void actionPerformed(ActionEvent e){
            
        if(e.getSource()==cancel_2){
            setVisible(false);
            new login();
        }
        if(e.getSource()==next2){
            setVisible(false);
            new play();
        }
        
    }

        public static void main(String[] args) {
            new Rules("Somnath Bhunia");
        }
 }

