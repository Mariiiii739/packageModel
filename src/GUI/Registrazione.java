package GUI;

import javax.swing.*;
import java.awt.event.*;

public class Registrazione extends JFrame{
    private JTextField username;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton button;
    private JPanel registrazione ;
    private JLabel usernameLabel;
    private JLabel passLabel1;
    private JLabel passLabel2;


    public Registrazione(){
        setContentPane(registrazione);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        //collego con login:
        button.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Login login = new Login();
                login.setVisible(true);
                dispose();
            }
        });
    }
}
