package GUI;

import javax.swing.*;

public class Login extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton confirmButton;
    private JPanel login;

    public Login() {
        setContentPane(login);
        setLocationRelativeTo(null);
        JFrame frame = new JFrame("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

}
