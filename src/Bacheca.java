import java.util.Scanner;

public class Bacheca {
    public enum titoloB{
        UNIVERSITA,
        LAVORO,
        TEMPO_LIBERO
    }
    String descrizione;

    //metodo per descrivere la bacheca:
    public void creaDescrizioneB(){
        System.out.println("Descrivi la bacheca: ");
        Scanner sc = new Scanner(System.in);
        this.descrizione = sc.nextLine();
    }
}
//ha come attributi un'enumerazione (università, lavoro e tempo libero) e una descrizione. c'è bisogno di un'associazione da tre a molti verso i to do