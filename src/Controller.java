import GUI.Home;
import GUI.Login;
import GUI.Registrazione;

import javax.swing.*;

public class Controller{
    public Controller(){

    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Registrazione();
                new Login();
                new Home();
            }
        });
    }
}


