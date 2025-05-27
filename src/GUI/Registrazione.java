package GUI;
import Controller.Controller;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Registrazione extends JFrame{
    private JTextField username;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton button;
    private JPanel registrazione ;
    private JLabel usernameLabel;
    private JLabel passLabel1;
    private JLabel passLabel2;
    private JFrame frame;

    Controller controller;


    public Registrazione(){
        setContentPane(registrazione);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.controller = new Controller();
        frame = new JFrame();
        frame=this;
        pack();
        //collego con login:
        button.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String nome = username.getText();
                String pass1 = passwordField1.getText();
                controller.RegistraUtente(nome, pass1);
                    Login login = new Login(frame, controller);
                setVisible(false);
            }
        });
    }
}
