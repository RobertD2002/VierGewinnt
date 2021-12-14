import java.util.Scanner;

public class Spieler {

    private static final Scanner lesen = new Scanner(System.in);
    private String name;
    private boolean current;

    public Spieler() {

    }

    public Spieler(String name, boolean current) {
        this.name = name;
        this.current = current;
    }

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

    public Stein[][] steinLegen(Stein s, Stein[][] brett){
        boolean wiederholen = false;
        while (wiederholen == false){
            System.out.println(this.getName() + " welche spalte mÃ¶chtest du ein Stein legen?");
            int j = lesen.nextInt();
            if (j < 8 && j > 0){
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