import java.util.Scanner;

public class Spiel{
    public static void main(String[] args){
        Scanner lesen = new Scanner(System.in);
        Spieler p1 = null;
        Spieler p2 = null;
        String name;

        System.out.println("Spieler1 namen eingeben:");
        name = lesen.next();
        p1 = new Spieler(name, false);

        System.out.println("Spieler2 namen eingeben:");
        name = lesen.next();
        p2 = new Spieler(name, false);
    }
}

