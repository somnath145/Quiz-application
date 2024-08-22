
import javax.swing.*;

import java.awt.*;

public class imageinjframe {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Image in Jframe Example");
        frame.setSize(900, 550);

        JPanel panel = new JPanel();

        ImageIcon imageicon = new ImageIcon("D:\\Java\\quize\\icons\\login.jpeg");

        JLabel imageLabel = new JLabel(imageicon);

        panel.add(imageLabel);

        frame.add(panel);

        // frame.pack();

        frame.setVisible(true);
    }
}
