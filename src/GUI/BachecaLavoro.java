package GUI;

import javax.swing.*;

public class BachecaLavoro extends JFrame {
    private JLabel lavoro;
    private JPanel lavoroBac;
    public BachecaLavoro() {
        setContentPane(lavoroBac);
        setLocationRelativeTo(null);
        JFrame frame = new JFrame("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        pack();
    }
}
