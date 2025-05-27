


package GUI;


import Controller.Controller;
import Model.Bacheca;           //non ci dovrebbe stare, perchè la GUi non dovrebbe accedere direttanebte ai model

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoGui extends JFrame {
    private JPanel todoList;
    private JList list1;
    private JLabel nomeLista;
    private JButton aggiungiToDoButton;
    Controller controller;
    JFrame frameChiamante;
    JFrame frame;


    public ToDoGui(JFrame frameChiamante, Controller controller, Bacheca.TitoloB nomeBacheca) {
        setContentPane(todoList);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        pack();
        this.controller = controller;
        this.frameChiamante = frameChiamante;
        frame = new JFrame();
        frame = this;

        if(nomeBacheca == Bacheca.TitoloB.LAVORO)  nomeLista.setText("Lavoro");
        if(nomeBacheca == Bacheca.TitoloB.UNIVERSITA) nomeLista.setText("Università");
        if(nomeBacheca == Bacheca.TitoloB.TEMPO_LIBERO) nomeLista.setText("Tempo libero");

        aggiungiToDoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CreaToDo creaToDo = new CreaToDo(frameChiamante, controller, nomeBacheca);
                setVisible(false);
            }
        });
    }
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if(visible){
            
        }
    }
}
