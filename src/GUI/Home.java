package GUI;

import javax.swing.*;

public class Home extends JFrame{
    private JTable table1;
    private JTree tree1;
    private JLabel SpaziLavoro;
    private JList listaBachece;
    private JPanel home;

    public Home() {
        setContentPane(home);
        setLocationRelativeTo(null);
        JFrame frame = new JFrame("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        pack();
    }
}
