package GUI;

import javax.swing.*;

public class BachecaTempoLibero extends JFrame {
    private JPanel tempoLibero;
    private JLabel label;
    public BachecaTempoLibero() {
        setContentPane(tempoLibero);
        setLocationRelativeTo(null);
        //JFrame frame = new JFrame("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        //setVisible(true);
        pack();
    }
}
