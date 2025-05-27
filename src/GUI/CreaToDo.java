package GUI;

import Controller.Controller;
import Model.Bacheca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreaToDo extends JFrame{
    private JPanel creaToDo;
    private JTextField descrizioneDelToDo;
    private JTextField nomeDelToDo;
    private JLabel nome;
    private JLabel descrizione;
    private JLabel url;
    private JTextField urlToDo;
    private JButton crea;

    Controller controller;
    JFrame frameChiamante;
    JFrame frame;
    Bacheca.TitoloB nomeBacheca;

    public CreaToDo(JFrame frameChiamente, Controller controller, Bacheca.TitoloB nomeBacheca) {
        setContentPane(creaToDo);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        pack();

        this.controller = controller;
        this.frameChiamante = frameChiamante;
        frame = new JFrame();
        frame = this;
        this.nomeBacheca = nomeBacheca;

        String nome = nomeDelToDo.getText();
        String descrizione = descrizioneDelToDo.getText();
        String url = urlToDo.getText();

        crea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.salvaToDo(nome, descrizione, url, nomeBacheca);
                frameChiamante.setVisible(true);
            }
        });
    }
}
