package Model;

import javax.swing.*;
import java.util.Scanner;
import java.util.List;

public class Bacheca extends JFrame {
    public enum TitoloB{
        UNIVERSITA,
        LAVORO,
        TEMPO_LIBERO
    }
    private TitoloB titolo;
    private String descrizione;
    private Utente utente;      //fa un'associazione uno a uno tra bacheca e utente.
    private List<ToDo> todos;   //fa un'associazione uno a molti con i vari to do.

    /*Bisogna implementare il costruttore:*/
    public Bacheca(Utente utente, String descrizione, TitoloB titolo) {
        this.utente = new Utente();
        this.utente = utente;
        this.descrizione = descrizione;
        this.titolo = titolo;
    }
    public Bacheca(){
        //costruttore vuoto
    }

    /*Ora bisogna implementare i vari 'get' per poter usare gli attributi di Model.Bacheca nelle altre classi:*/
    public String getDescrizione() { return descrizione; }
    public Utente getUtente(){ return utente; }
    public List<ToDo> getTodos(){ return todos; }
    /*setter:*/
    public void setDescrizione(String descrizione){
        if(descrizione == null){
            return;
        }
        if(descrizione.length()<=5){
            System.out.println("Descrizione non valida");
        }
        this.descrizione = descrizione;
    }
    public void setUtente(Utente utente){ this.utente = utente; }

    public TitoloB getTitolo() { return titolo; }

    /*metodo per descrivere la bacheca:*/
    public void creaDescrizioneB(){
        System.out.println("Descrivi la bacheca: ");
        Scanner sc = new Scanner(System.in);
        this.descrizione = sc.nextLine();
    }
}

/*Bisogna fare un' associazione uno a uno con utente e un'altra associazione uno a molti con i to do
Ha come attributi un'enumerazione (università, lavoro e tempo libero) e una descrizione. C'è bisogno di un'associazione da tre a molti verso i to do*/