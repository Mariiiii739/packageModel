package GUI;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame{
    private JTable table1;
    private JLabel SpaziLavoro;
    private JList listaBacheche;
    private JPanel home;

    public Home() {
        setContentPane(home);
        setLocationRelativeTo(null);
        JFrame frame = new JFrame("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        //setVisible(true);
        pack();

        //li apre tutti e tre contemporaneamente
        listaBacheche.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                BachecaLavoro job = new BachecaLavoro();
                job.setVisible(true);
            }
        });
        listaBacheche.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                BachecaUni uni = new BachecaUni();
                uni.setVisible(true);
            }
        });
        listaBacheche.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                BachecaTempoLibero tempo = new BachecaTempoLibero();
                tempo.setVisible(true);
            }
        });

    }
}
