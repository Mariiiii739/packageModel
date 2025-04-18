
import java.util.List;
import java.util.Scanner;

public class Utente {
    private String nome;
    private String password;
    private List<Bacheca> bacheche;
    private List<ToDo> todo;

    /*questo è il costruttore, serve poi per poter usare le classi nel main?*/
    public Utente() {
        this.nome = nome;
        this.password = password;
        this.bacheche = bacheche; /*inizializza l'attributo bacheche*/      //oppure inizializzate a null? Serve una lista di bacheche vuota per l'utente
        this.todo = todo; /*inizializza l'attributo to do*/
    }


    /*metodi di utente:*/
    /*questi sono tutti metodi che restituiscono i valori degli oggetti e delle liste degli oggetti*/
    public String getNome() {
        return nome;
    }
    public String getPassword() {
        return password;
    }
    public List<Bacheca> getBacheche() {    /*necessarie perché servono per "chiamare" gli attributi di una classe privata in altre classi*/
        return bacheche;
    }

    public List<ToDo> getTodo() {
        return todo;
    }

    /*bisogna ora implementare i metodi per prendere le credenziali, confrontarle, creare to do, spostarli e modificarli e infine per condividere le bacheche*/
    public String credenziali() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        this.nome = sc.nextLine();
        System.out.print("Password: ");
        this.password = sc.nextLine();

        return nome;
    }

}

/*Un utente ha come attributi "username" e "password". Deve avere inoltre delle associazioni a bacheca e a to do.
Dovrà avere dei metodi per prendere le credenziali dell'utente, controllare se le credenziali sono già state usate da altri utenti,
creare to do, spostarli e modificarli (sia per l'aspetto che per la posizione)*/
