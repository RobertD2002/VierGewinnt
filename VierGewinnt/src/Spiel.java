/**
 * Gruppe: A1
 * Name: Robert Darminow 2210084, Sophie Knoll, Osman Cem Sarim, Wenona Gieren
 * Funktion: 4Gewinnt
 * Klasse: In der Spiel Klasse befindet sich die main Methode von hier aus wird das Spiel gestartet
 */

import java.util.Arrays;
import java.util.Scanner;

public class Spiel {
    private static final  Scanner lesen = new Scanner(System.in);
    public static void main(String[] args){
        boolean gewinner = false;

        int modus = Spielmodus();

        if (modus == 1){
            Spieler p1 = Protokoll.spieleranlegen();
            EinfacheKI ki = new EinfacheKI("Max", false);
            p1.setCurrent(true);
            spielAblaufKI(p1,ki);
        }
        else {
            if (modus == 2){
                Spieler p1 = Protokoll.spieleranlegen();
                Spieler p2 = Protokoll.spieleranlegen();
                p1.setCurrent(true);
                spielAblaufSPIELER(p1,p2);
            }
            else {
                if (modus == 3){
                    Spieler p1 = Protokoll.spieleranlegen();
                    SchwereKI schwereki = new SchwereKI("Max", false);
                    p1.setCurrent(true);
                    spielAblaufSchwereKI(p1,schwereki);
                }
            }
        }
    }

    /**
     * Hier wird der Spielmodus ausgewählt
     *@return
     */
    public static int Spielmodus(){
        System.out.println("KI = 1 oder Spieler = 2 oder SchwereKI == 3");
        int eingabe = lesen.nextInt();
        return eingabe;
    }

    /**
     * Hier haben wir den Spielablauf für unseren Spieler vs Spieler
     * Zuerst wird geprüft ob Spieler 1 dran.
     * Danach wird das Brett ausgegeben. Daraufhin wird dann ein Stein gelegt und überprüft ob Spieler 1 gewonnen hat.
     * Wenn er gewonnen hat wird das ausgegeben und das Spiel wird beendet.
     * Wenn er nicht gewonnen hat ist Spieler 2 dran.
     * Dann läuft die gleiche Prozedure nochmal
     * @param p1
     * @param p2
     */
    public static void spielAblaufSPIELER(Spieler p1, Spieler p2){
        Stein s1 = new Stein("\u001B[34m",'○');
        Stein s2 = new Stein("\u001B[31m",'○');
        Stein[][] brett = Protokoll.spielBrettErzeugen();
        boolean gewinner= false;
        while (!gewinner){
            if (p1.getCurrent() == true){
                Protokoll.brettAusgeben(brett);
                brett = p1.steinLegen(s1, brett);
                gewinner = Protokoll.ueberpruefe(brett,s1);
                if (gewinner == true){
                    Protokoll.brettAusgeben(brett);
                    System.out.print("\033[0m");
                    System.out.println(p1.getName() + " hat gewonnen");
                }else {
                    p1.setCurrent(false);
                }
            }else {
                Protokoll.brettAusgeben(brett);
                brett = p2.steinLegen(s2, brett);
                gewinner = Protokoll.ueberpruefe(brett,s2);
                if (gewinner == true){
                    Protokoll.brettAusgeben(brett);
                    System.out.print("\033[0m");
                    System.out.println(p2.getName() + " hat gewonnen");
                }else {
                    p1.setCurrent(true);
                }
            }
        }
    }

    /**
     * Gleicher ablauf wie @spielAblaufSpieler
     * nur das KI Random ein Stein legt.
     *
     * @param p1
     * @param p2
     */
    public static void spielAblaufKI(Spieler p1, EinfacheKI p2){
        Stein s1 = new Stein("\u001B[34m",'○');
        Stein s2 = new Stein("\u001B[31m",'○');
        Stein[][] brett = Protokoll.spielBrettErzeugen();
        boolean gewinner= false;
        while (!gewinner){
            if (p1.getCurrent() == true){
                Protokoll.brettAusgeben(brett);
                brett = p1.steinLegen(s1, brett);
                gewinner = Protokoll.ueberpruefe(brett,s1);
                if (gewinner == true){
                    Protokoll.brettAusgeben(brett);
                    System.out.print("\033[0m");
                    System.out.println(p1.getName() + " hat gewonnen");
                }else {
                    p1.setCurrent(false);
                }
            }else {
                Protokoll.brettAusgeben(brett);
                brett = p2.steinLegen(s2, brett);
                gewinner = Protokoll.ueberpruefe(brett,s2);
                if (gewinner == true){
                    Protokoll.brettAusgeben(brett);
                    System.out.print("\033[0m");
                    System.out.println(p2.getName() + "hat gewonnen");
                }else {
                    p1.setCurrent(true);
                }
            }
        }
    }

    public static void spielAblaufSchwereKI(Spieler p1, SchwereKI p2){
        Stein s1 = new Stein("\u001B[34m",'○');
        Stein s2 = new Stein("\u001B[31m",'○');
        Stein[][] brett = Protokoll.spielBrettErzeugen();
        boolean gewinner= false;
        while (!gewinner){
            if (p1.getCurrent() == true){
                Protokoll.brettAusgeben(brett);
                brett = p1.steinLegen(s1, brett);
                gewinner = Protokoll.ueberpruefe(brett,s1);
                if (gewinner == true){
                    Protokoll.brettAusgeben(brett);
                    System.out.print("\033[0m");
                    System.out.println(p1.getName() + " hat gewonnen");
                }else {
                    p1.setCurrent(false);
                }
            }else {
                Protokoll.brettAusgeben(brett);
                if (false== p2.Gegenerfastgewinntlegen(brett,s1,s2)){
                    brett = p2.steinLegen(s2, brett);
                    gewinner = Protokoll.ueberpruefe(brett,s2);
                }
                if (gewinner == true){
                    Protokoll.brettAusgeben(brett);
                    System.out.print("\033[0m");
                    System.out.println(p2.getName() + "hat gewonnen");
                }else {
                    p1.setCurrent(true);
                }
            }
        }
    }
}

