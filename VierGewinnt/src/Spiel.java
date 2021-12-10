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
        brett[0][0] = s1;
        brett[1][0] = s1;
        brett[2][0] = s1;
        brett[3][0] = s1;
        brett[4][0] = s1;
        brett[5][0] = s1;
        Protokoll.brettAusgeben(brett);
        brett = p2.steinLegen(s2, brett);
        Protokoll.brettAusgeben(brett);
    }
}

