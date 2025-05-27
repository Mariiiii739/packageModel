package GUI;

import Controller.Controller;
import Model.Bacheca;

import javax.swing.*;

public class BachecaGui extends JFrame {
    private JLabel prova;
    private JPanel bachecaGui;
    Controller controller;
    JFrame frameChiamante;
    JFrame frame;
    public BachecaGui(JFrame frameChiamante, Controller controller, Bacheca.TitoloB nomeBacheca) {
        setContentPane(bachecaGui);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        pack();

        this.controller = controller;
        this.frameChiamante = frameChiamante;




    }
}
