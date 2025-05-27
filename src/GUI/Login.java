package GUI;

import Controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton confirmButton;
    private JPanel login;
    private JFrame frameChiamante;
    Controller controller;

    public Login(JFrame frameChiamante, Controller controller) {
        setContentPane(login);
        setLocationRelativeTo(null);
        JFrame frame = new JFrame("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();

        this.controller = controller;

        System.out.println(controller.utenteRegistrato.getNome());
        System.out.println(controller.utenteRegistrato.getPassword());

        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome= textField1.getText();
                String password= passwordField1.getText();
                if(controller.isUtenteRegistrato(nome,password)){
                    Home home = new Home(frame, controller);
                    setVisible(true);
                   setVisible(false);
                }
            }
        });

    }

}
