import java.util.Arrays;
import java.util.Scanner;

public class Spiel {
    private static  final Scanner lesen = new Scanner(System.in);
    public static void main(String[] args){
       /*
        Spieler p1 = spieleranlegen();
        Spieler p2 = spieleranlegen();
        p1.setCurrent(true);*/
        Stein s1 = steinAnlegenSpieler1();
        Stein s2 = steinAnlegenSpieler2();
        Stein[][] brett = spielBrettErzeugen();
        brett[1][2] = s1;
        brett[3][5] = s1;
        brett[4][5] = s1;
        brett[4][2] = s2;

        brettAusgeben(brett);

    }

    public static void brettAusgeben(Stein[][] brett) {
        for(int i = 0; i < brett.length; i++) {
            for(int j = 0; j < brett[i].length; j++) {
                System.out.print(brett[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static Stein steinAnlegenSpieler1(){
        Stein stein = new Stein("\u001B[34m",'○');
        return stein;
    }
    public static Stein steinAnlegenSpieler2(){
        Stein stein = new Stein("\u001B[31m",'○');
        return stein;
    }

    public static Spieler spieleranlegen(){
        Spieler p = null;
        String name;
        System.out.println("Spieler Namen eingeben:");
        name = lesen.next();
        return p = new Spieler(name, false);
    }
    public static Stein[][] spielBrettErzeugen(){
        Modus modus = new Modus();
        Stein[][] Brett = modus.feld;
        return Brett;
    }

}

