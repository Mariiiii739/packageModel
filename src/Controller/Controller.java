package Controller;

import GUI.Registrazione;
import Model.*;

import javax.swing.*;

public class Controller{
    public Utente utenteRegistrato;


    public Controller(){
    }

    public void RegistraUtente(String nome, String password){
        utenteRegistrato = new Utente(nome, password);
    }

    public boolean isUtenteRegistrato(String nome, String password){
        if(nome.equals(utenteRegistrato.getNome()) && password.equals(utenteRegistrato.getPassword())){
            return true;
        }
        return false;
    }

    public void salvaToDo(String nome, String descrizione, String url, Bacheca.TitoloB nomeBacheca){
        ToDo creato = new ToDo(nome, descrizione, url, utenteRegistrato);
        for(Bacheca b: utenteRegistrato.getBacheche()){
            if(b.getTitolo()==nomeBacheca) {
                b.aggiungiToDo(creato);
                System.out.println(creato.getTitolo());
                break;
            }
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Registrazione();
            }
        });
    }
}


