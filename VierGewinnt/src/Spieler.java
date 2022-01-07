import java.util.Scanner;
import java.awt.Color;

/**
 * Die Spieler Klasse ist die Superklasse
 */
public class Spieler {



    private static final Scanner lesen = new Scanner(System.in);

    //Attribute
    private String name;
    private boolean current;

    //Konstruktor
    public Spieler() {

    }

    public Spieler(String name, boolean current) {
        this.name = name;
        this.current = current;
    }
    //Getter und Setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getCurrent() {
        return this.current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }


    /**
     * In der Methode wird nachgeschaut werden die Steine gelegt und ob es möglich ist in einer Spalte ein Stein zulegen
     * @param s
     * @param brett
     * @return
     */
    public Stein[][] steinLegen(Stein s, Stein[][] brett){
        boolean wiederholen = false;
        while (wiederholen == false){
            System.out.print("\033[0m");
            System.out.println(this.getName() + " welche spalte möchtest du ein Stein legen?");
            int j = lesen.nextInt();
            if (j < 8 && j > 0){                        // damit die spalten nicht bei 0 anfangen
                int i = 5;
                while (i >= 0) {
                    if (brett[i][j-1] == null) {
                        brett[i][j-1] = s;
                        return brett;
                    } else {
                        i = i - 1;
                    }
                }
            }else {
                System.out.println("Falsche eingabe versuchen Sie es erneut");
            }
        }
        return brett;
    }
}