
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utente extends JFrame {
    private String nome;
    private String password;
    private List<Bacheca> bacheche;
    private List<ToDo> todo;

    public Utente(String name, String pass){
        this.nome = name;
        this.password = pass;
        this.bacheche = new ArrayList<Bacheca>();
        this.todo = new ArrayList<ToDo>();


    }
    public Utente(){

    }


    /*metodi di utente:*/
    /*questi sono tutti metodi che restituiscono i valori degli oggetti e delle liste degli oggetti*/
    public String getNome() { return nome; }
    public String getPassword() { return password; }
    public List<Bacheca> getBacheche() {    /*necessarie perché servono per "chiamare" gli attributi di una classe privata in altre classi*/
        return bacheche;
    }

    public List<ToDo> getTodo() { return todo; }

    public void setNome(String nome){
        if(nome == null){
            return;
        }
        if(nome.length()<=5){
            System.out.println("Nome non valido");
            return;
        }
        this.nome = nome;
    }
    public void setPassword(String password){
        if(password == null){
            return;
        }
        if(password.length()<=16){
            System.out.println("Password troppo corta");
        }
        this.password = password;
    }
    public void setBacheche(List<Bacheca> bacheche){ this.bacheche = bacheche; }

    public void setTodo(List<ToDo> todo) { this.todo = todo; }

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
