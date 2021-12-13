import java.util.Scanner;

public class Spieler {

    private static final Scanner lesen = new Scanner(System.in);
    private String name;
    private boolean current;

    public Spieler(){

    }

    public Spieler(String name, boolean current){
        this.name = name;
        this.current = current;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getCurrent(){
        return this.current;
    }

    public void setCurrent(boolean current){
       this.current = current;
    }
}

