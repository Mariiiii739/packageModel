package Model;

import GUI.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //inizializzo le variabili da usare nel main
       /* Utente u = new Utente();
        Bacheca b = new Bacheca();
        ToDo t = new ToDo();


        u.credenziali();
        System.out.println("Ciao! " +u.getNome());
        System.out.println("la password e': " +u.getPassword());
       //chiamo i metodi

        b.creaDescrizioneB();
        t.creaDescrizioneT();
        t.creaTitolo();*/

        Login l = new Login();
        Home h = new Home();
        BachecaTempoLibero bt = new BachecaTempoLibero();
        BachecaLavoro bl = new BachecaLavoro();
        BachecaUni bu = new BachecaUni();
        ToDo_GUI todo = new ToDo_GUI();
    }
}