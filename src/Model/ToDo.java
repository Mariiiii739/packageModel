package Model;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;
import java.util.List;


public class ToDo extends JFrame {
/*attributi di to do:*/
  public enum Scadenza{                             /*un altro modo per implementare scadenza puo essere fatto tramite il tipo 'date' e poi tramite un metodo di tipo Boolean verificare se è scaduto o no.*/
      SCADUTO,
      NONSCADUTO,
    }
    private String titolo;
    private String descrizione;
    private Scadenza scadenza;
    private String url;
    private Date data;
    //immagine, colore e posizione che non capisco di che tipo sono.

    /*associazioni:*/
    private List<Utente> collaboratori;
    private Utente autore;
    /*I to do hanno più associazioni con utente perché c'è la possibilità che una serie di to do sia gestita da più utenti. Inoltre la presenza di un attributo 'creatore' ci permette di tener traccia di chi è,
     appunto, il creatore del to do e chi sono gli altri utenti che vi possono partecipare.*/
    private Bacheca bacheca;

    /*costruttore della classe:*/
    public ToDo(){

    }
    public ToDo(String descrizione, String titolo, Scadenza scadenza, Date data){
    }

    /*Ora bisogna implementare i vari 'get' per poter usare gli attributi di To Do nelle altre classi:*/
    public String getTitolo(){ return titolo; }
    public String getDescrizione() { return descrizione; }
    public List<Utente> getCollaborator(){ return collaboratori; }
    public Utente getAutore(){ return autore; }
    public Bacheca getBacheca(){ return bacheca; }


    /*setter: */
    public void setTitolo(String titolo){
        if(titolo == ""){
            return;
        }
        if(titolo.length()<2){
            System.out.println("titolo troppo corto");
        }
        this.titolo = titolo;

    }
    public void setDescrizione(String descrizione){
        if(descrizione == ""){
            return;
        }
        if(descrizione.length()<8){
            System.out.println("descrizione troppo corta");
        }
    }
    public void setCollaborator(List<Utente> collaboratori){ this.collaboratori = collaboratori; }
    public void setAutore(Utente autore){ this.autore = autore; }
    public void setBacheca(Bacheca bacheca){ this.bacheca = bacheca; }
    public void setData(Date data){ this.data = data; }
    public void setScadenza(Scadenza scadenza){ this.scadenza = scadenza; }
    public void setUrl(String url){ this.url = url; }



    /*metodio:*/
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
