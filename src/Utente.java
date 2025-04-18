import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
;

public class Utente {
    private String nome;
    private String password;
    private List<Bacheca> bacheche;
    private List<ToDo> todo;
    private ArrayList<String> utentiRegistrati;    //deve contenere tutti i dati dei vari utenti che si registrano, cosi da poter confrontare i nomi utenti

    /*questo è il costruttore, serve poi per poter usare le classi nel main?*/
    public Utente() {
        this.nome = nome;
        this.password = password;
        this.utentiRegistrati = new ArrayList();
        this.bacheche = new ArrayList(); /*inizializza l'attributo bacheche*/
        this.todo = new ArrayList(); /*inizializza l'attributo to do*/
    }


    /*metodi di utente:*/
    //questi sono tutti metodi che restituiscono i valori degli oggetti e delle liste degli oggetti
    public String getNome() {
        return nome;
    }
    public String getPassword() {
        return password;
    }
    public List<Bacheca> getBacheche() {
        return bacheche;
    }

    public List<ToDo> getTodo() {
        return todo;
    }

    //bisogna ora implementare i metodi per prendere le credenziali, confrontarle, creare to do, spostarli e modificarli e infine per condividere le bacheche
    public String credenziali() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        this.nome = sc.nextLine();
        System.out.print("Password: ");
        this.password = sc.nextLine();
        utentiRegistrati.add(nome);

      //controllo se il nome e' stato gia' preso
        /*if(utentiRegistrati.contains(nome)) {
            System.out.println("Nome non valido");
        }*/
        return nome;
    }

}

//un utente ha come attributi "username" e "password". Deve avere inoltre delle associazioni a bacheca e a to do
//dovrà avere dei metodi per prendere le credenziali dell'utente, controllare se le credenziali sono già state usate da altri utenti
//creare to do, spostarli e modificarli (sia per l'aspetto che per la posizione)
