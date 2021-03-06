import java.util.Scanner;

public class Protokoll {
    private static final Scanner lesen = new Scanner(System.in);

    /**
     * Hier wird ein Spieler angelegt
     * @return
     */
    public static Spieler spieleranlegen(){
        Spieler p = null;
        String name;
        System.out.println("Spieler Namen eingeben:");
        name = lesen.next();
        return p = new Spieler(name, false);
    }

    /**
     * Mit der Methode spielBrettErzeugen wird ein Brett erzeugt
     * @return
     */
    public static Stein[][] spielBrettErzeugen(){
        Modus modus = new Modus();
        return modus.getFeld();
    }


    /**
     * Ausgeben des Brettes mit 2 for schleifen
     * @param brett
     */
    public static void brettAusgeben(Stein[][] brett) {
        for(int i = 0; i < brett.length; i++) {
            for(int j = 0; j < brett[i].length; j++) {
                if(brett[i][j] == null){
                    System.out.print("\t");
                }
                else{
                    System.out.print(brett[i][j]+"\t");

                }
            }
            System.out.println();
        }
    }

    /**
     * In der Methode wird überprüft ob 4 gleiche Steine Diagonal, Vertikal oder Horizontal sind.
     * Zu erst wird überprüft ob ein Stein sich im Index befindet.
     * Wenn ja dann gehen wir alle Varianten durch ob im anderen Index sich auch die gleichen Steine befinden.
     * @param brett
     * @param s
     * @return
     */
    public static boolean ueberpruefe(Stein[][] brett, Stein s){
        for (int i = 0; i < brett.length; i++){
            for(int j = 0; j< brett[i].length; j++){
                if (brett[i][j] == s){
                    //Spieler 1
                    //Nach unten überpruefen
                    try{
                        if (brett[i+1][j] == s && brett[i+2][j] == s && brett[i+3][j] == s) {
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException ex){

                    }
                    //Nachen oben ueberpruefen
                    try {
                        if (brett[i-1][j] == s && brett[i-2][j] == s && brett[i-3][j] == s) {
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException test){

                    }

                    //Nach rechts ueberpruefen
                    try {
                        if (brett[i][j+1] == s && brett[i][j+2] == s && brett[i][j+3] == s){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException ex){

                    }
                    //Nach links ueberpruefen
                    try {
                        if (brett[i][j-1] == s && brett[i][j-2] == s && brett[i][j-3] == s){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){

                    }
                    try {
                        //Nach rechts oben diagonal ueberpruefen
                        if (brett[i-1][j+1] == s && brett[i-2][j+2] == s && brett[i-3][j+3] == s){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){

                    }
                    try {
                        //Nach rechts unten diagonal ueberpruefen
                        if (brett[i+1][j+1] == s && brett[i+2][j+2] == s && brett[i+3][j+3] == s) {
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){

                    }
                    try {
                        //Nach links oben diagonal ueberpruefen
                        if (brett[i-1][j-1] == s && brett[i-2][j-2] == s && brett[i-3][j-3] == s){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){

                    }
                    try {
                        //Nach links unten diagonal ueberpruefen
                        if (brett[i+1][j-1] == s && brett[i+2][j-2] == s && brett[i+3][j-3] == s){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){

                    }
                }
            }
        }
        return false;
    }
}