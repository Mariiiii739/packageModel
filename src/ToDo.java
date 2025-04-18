import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class ToDo {
/*attributi di to do:*/
  public enum scadenza{                             /*un altro modo per implementare scadenza puo essere fatto tramite il tipo 'date' e poi tramite un metodo di tipo Boolean verificare se è scaduto o no.*/
      SCADUTO,
      NONSCADUTO,
    }
    private String titolo;
    private String descrizione;
    //immagine, colore e posizione che non capisco di che tipo sono.

    /*associazioni:*/
    private List<Utente> collaboratori;
    private Utente autore;
    /*I to do hanno più associazioni con utente perché c'è la possibilità che una serie di to do sia gestita da più utenti. Inoltre la presenza di un attributo 'creatore' ci permette di tener traccia di chi è,
     appunto, il creatore del to do e chi sono gli altri utenti che vi possono partecipare.*/
    private List<Bacheca> bacheche;

    /*costruttore della classe:*/
    public ToDo(){
        this.descrizione = "";
        this.autore = new Utente();
        this.collaboratori = new ArrayList<Utente>();
        this.bacheche = new ArrayList<Bacheca>();
    }

    /*Ora bisogna implementare i vari 'get' per poter usare gli attributi di To Do nelle altre classi:*/
    public String getTitolo(){
        return titolo;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public List<Utente> getCollaborator(){
        return collaboratori;
    }
    public Utente getAutore(){
        return autore;
    }
    public List<Bacheca> getBacheche(){
        return bacheche;
    }

    /*metodo per descrivere to do:*/
    public void creaDescrizioneT(){
        System.out.println("Descrivi il to do: ");
        Scanner sc = new Scanner(System.in);
        this.descrizione = sc.nextLine();
    }
    public void creaTitolo(){
        System.out.println("scegli un titolo: ");
        Scanner sc = new Scanner(System.in);
        this.titolo=sc.nextLine();
    }
    public void spostaTodo(){}

    public void modificaTodo(){}
}
