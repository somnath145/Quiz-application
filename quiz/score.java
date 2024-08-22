import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class score extends JFrame implements ActionListener{
    JButton cancel,play_again;
    score(int total_score){
        setBounds(300, 80, 960, 720);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon s = new ImageIcon("D:\\Java\\quize\\icons\\score.png");
        JLabel sco = new JLabel(s);
        sco.setBounds(200, 0, 467, 350);
        add(sco);

        JLabel number = new JLabel();
        number.setText("Total Score : " + "" + total_score);
        number.setBounds(200, 400, 400, 60);
        number.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        add(number);

        play_again = new JButton("Play Again");
        play_again.setBounds(500,500,150,60);
        play_again.setBackground(Color.GREEN);
        play_again.setFont(new Font("Tahoma", Font.BOLD, 15));
        play_again.setForeground(Color.BLACK);
        play_again.addActionListener(this);
        add(play_again);

        cancel = new JButton("Cancel");
        cancel.setBounds(200,500,150,60);
        cancel.setBackground(Color.RED);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        cancel.addActionListener(this);
        add(cancel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==cancel){
            setVisible(false);
        }
        if(e.getSource()==play_again){
            setVisible(false);
            new login();
        }
    }
    public static void main(String[] args) {
        new score(0);
    }
}
