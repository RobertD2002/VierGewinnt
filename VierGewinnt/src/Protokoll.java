import java.util.Scanner;

public class Protokoll {
        private static final Scanner lesen = new Scanner(System.in);
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
        public static void brettAusgeben(Stein[][] brett) {
            for(int i = 0; i < brett.length; i++) {
                for(int j = 0; j < brett[i].length; j++) {
                    System.out.print(brett[i][j]+"\t");
                }
                System.out.println();
            }
        }
}

