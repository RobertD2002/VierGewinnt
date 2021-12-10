import java.util.Arrays;
import java.util.Scanner;
//test
public class Spiel {
    private static  final Scanner lesen = new Scanner(System.in);
    public static void main(String[] args){
        Spieler p1 = Protokoll.spieleranlegen();
        Spieler p2 = Protokoll.spieleranlegen();
        p1.setCurrent(true);
        Stein s1 = new Stein("\u001B[34m",'○');
        Stein s2 = new Stein("\u001B[31m",'○');
        Stein[][] brett = Protokoll.spielBrettErzeugen();
        brett[1][2] = s1;
        brett[1][3] = s1;
        brett[1][4] = s1;
        brett[1][5] = s1;
        brett[3][5] = s1;
        brett[4][5] = s1;
        brett[4][2] = s2;
        Protokoll.brettAusgeben(brett);
    }
}

