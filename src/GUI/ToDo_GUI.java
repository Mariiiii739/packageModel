package GUI;
import javax.swing.*;
public class ToDo_GUI extends JFrame {

    private JLabel label;
    private JList list;
    private JTextArea descriptionTextArea;
    private JPanel toDo;
    private JButton button;

    public ToDo_GUI() {
        //getTitle(label);
        setContentPane(toDo);
        setLocationRelativeTo(null);
        JFrame frame = new JFrame("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        //setVisible(true);
        pack();

    }
}
