package GUI;

import Controller.Controller;
import Model.Bacheca;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame{
    private JTable table1;
    private JLabel SpaziLavoro;
    private JList listaBacheche;
    private JPanel home;
    Controller controller;
    JFrame frameChiamante;
    JFrame frame;

    public Home(JFrame frameChiamante, Controller controller) {
        setContentPane(home);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        pack();
        this.frameChiamante = frameChiamante;
        this.controller = controller;
        frame=new JFrame();
        frame=this;

        listaBacheche.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                String bachecaSelezionata = listaBacheche.getSelectedValue().toString();
                Bacheca.TitoloB titoloB;
                if(bachecaSelezionata.equals("Lavoro")) titoloB = Bacheca.TitoloB.LAVORO;
                else if(bachecaSelezionata.equals("Tempo Libero")) titoloB = Bacheca.TitoloB.TEMPO_LIBERO;
                else titoloB = Bacheca.TitoloB.UNIVERSITA;
               ToDoGui todo = new ToDoGui(frameChiamante, controller, titoloB);
                setVisible(false);
            }
        });
    }
}
