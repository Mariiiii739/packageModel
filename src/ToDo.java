import java.util.Scanner;

public class ToDo {
/*attributi di to do:*/
  public enum scadenza{
      SCADUTO,
      NONSCADUTO,
    }
    private String titolo;
    private String descrizione;
    //immagine, colore e posizione che non capisco di che tipo sono, penso che posizione si possa collegare con Bacheca per capire  in quale bacheca si trova il to do

    //metodo per descrivere to do:
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
