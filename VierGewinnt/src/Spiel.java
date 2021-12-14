import java.util.Arrays;
import java.util.Scanner;
//testasdasa
public class Spiel {
    private static  final Scanner lesen = new Scanner(System.in);
    public static void main(String[] args){
        boolean gewinner = false;
        boolean voll = false;

        Spieler p1 = Protokoll.spieleranlegen();
        Spieler p2 = Protokoll.spieleranlegen();
        p1.setCurrent(true);
        Stein s1 = new Stein("\u001B[34m",'○');
        Stein s2 = new Stein("\u001B[31m",'○');
        Stein[][] brett = Protokoll.spielBrettErzeugen();

        while (!gewinner){
            if (p1.getCurrent() == true){
                Protokoll.brettAusgeben(brett);
                brett = p1.steinLegen(s1, brett);
                voll = Protokoll.brettvoll(brett);
                gewinner = Protokoll.ueberpruefe(brett,s1,s2);
                if (gewinner == true){
                    Protokoll.brettAusgeben(brett);
                    System.out.println(p1.getName() + " hat gewonnen");
                }else {
                    p1.setCurrent(false);
                }
            }else {
                Protokoll.brettAusgeben(brett);
                brett = p2.steinLegen(s2, brett);
                voll = Protokoll.brettvoll(brett);
                gewinner = Protokoll.ueberpruefe(brett,s1,s2);
                if (gewinner == true){
                    Protokoll.brettAusgeben(brett);
                    System.out.println(p2.getName() + "hat gewonnen");
                }else {
                    p1.setCurrent(true);
                }
            }
        }
        if (voll){
            System.out.println("Unentschieden");
        }
    }
}

