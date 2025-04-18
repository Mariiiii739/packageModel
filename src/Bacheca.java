import java.util.Scanner;
import java.util.List;

public class Bacheca {
    public enum titoloB{
        UNIVERSITA,
        LAVORO,
        TEMPO_LIBERO
    }
    private String descrizione;
    private Utente utente;      //fa un'associazione uno a uno tra bacheca e utente.
    private List<ToDo> todos;   //fa un'associazione uno a molti con i vari to do.

    /*Bisogna implementare il costruttore:*/
    public Bacheca() {
        this.descrizione = "";
        this.utente = new Utente();
        //this.todos?
    }

    /*Ora bisogna implementare i vari 'get' per poter usare gli attributi di Bacheca nelle altre classi:*/
    public String getDescrizione() {
        return descrizione;
    }
    public Utente getUtente(){
        return utente;
    }
    public List<ToDo> getTodos(){
        return todos;
    }

    /*metodo per descrivere la bacheca:*/
    public void creaDescrizioneB(){
        System.out.println("Descrivi la bacheca: ");
        Scanner sc = new Scanner(System.in);
        this.descrizione = sc.nextLine();
    }
}

/*Bisogna fare un' associazione uno a uno con utente e un'altra associazione uno a molti con i to do
Ha come attributi un'enumerazione (università, lavoro e tempo libero) e una descrizione. C'è bisogno di un'associazione da tre a molti verso i to do*/