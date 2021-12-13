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

    public static boolean brettvoll(Stein[][] brett){
        int zaehler = 0;
        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {
                if (brett[i][j] != null){
                    zaehler++;
                }
            }
        }
        if (zaehler == 42){
            return true;
        }
        return false;
    }

    public static boolean ueberpruefe(Stein[][] brett, Stein s1, Stein s2){
        for (int i = 0; i < brett.length; i++){
            for(int j = 0; j< brett[i].length; j++){
                if (brett[i][j] == s1){
                    //Spieler 1
                    //Nach unten überpruefen
                    try{
                        if (brett[i+1][j] == s1 && brett[i+2][j] == s1 && brett[i+3][j] == s1) {
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException ex){
                        ex.getMessage();
                    }
                    //Nachen oben ueberpruefen
                    try {
                        if (brett[i-1][j] == s1 && brett[i-2][j] == s1 && brett[i-3][j] == s1) {
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exe){
                        exe.getMessage();
                    }

                    //Nach rechts ueberpruefen
                    try {
                        if (brett[i][j+1] == s1 && brett[i][j+2] == s1 && brett[i][j+3] == s1){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException ex){
                        ex.getMessage();
                    }
                    //Nach links ueberpruefen
                    try {
                        if (brett[i][j-1] == s1 && brett[i][j-2] == s1 && brett[i][j-3] == s1){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){
                        exception.getMessage();
                    }
                    try {
                        //Nach rechts oben diagonal ueberpruefen
                        if (brett[i-1][j+1] == s1 && brett[i-2][j+2] == s1 && brett[i-3][j+3] == s1){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){

                    }
                    try {
                        //Nach rechts unten diagonal ueberpruefen
                        if (brett[i+1][j+1] == s1 && brett[i+2][j+2] == s1 && brett[i+3][j+3] == s1) {
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){
                        exception.getMessage();
                    }
                    try {
                        //Nach links oben diagonal ueberpruefen
                        if (brett[i-1][j-1] == s1 && brett[i-2][j-2] == s1 && brett[i-3][j-3] == s1){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){
                        exception.getMessage();
                    }
                    try {
                        //Nach links unten diagonal ueberpruefen
                        if (brett[i+1][j-1] == s1 && brett[i+2][j-2] == s1 && brett[i+3][j-3] == s1){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){
                        exception.getMessage();
                    }
                }
                //Spieler 2
                if (brett[i][j] == s2){
                    //Nach unten überpruefen
                    try{
                        if (brett[i+1][j] == s2 && brett[i+2][j] == s2 && brett[i+3][j] == s2) {
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException ex){
                        ex.getMessage();
                    }
                    //Nachen oben ueberpruefen
                    try {
                        if (brett[i-1][j] == s2 && brett[i-2][j] == s2 && brett[i-3][j] == s2) {
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exe){
                        exe.getMessage();
                    }

                    //Nach rechts ueberpruefen
                    try {
                        if (brett[i][j+1] == s2 && brett[i][j+2] == s2 && brett[i][j+3] == s2){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException ex){
                        ex.getMessage();
                    }
                    //Nach links ueberpruefen
                    try {
                        if (brett[i][j-1] == s2 && brett[i][j-2] == s2 && brett[i][j-3] == s2){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){
                        exception.getMessage();
                    }
                    try {
                        //Nach rechts oben diagonal ueberpruefen
                        if (brett[i-1][j+1] == s2 && brett[i-2][j+2] == s2 && brett[i-3][j+3] == s2){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){

                    }
                    try {
                        //Nach rechts unten diagonal ueberpruefen
                        if (brett[i+1][j+1] == s2 && brett[i+2][j+2] == s2 && brett[i+3][j+3] == s2) {
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){
                        exception.getMessage();
                    }
                    try {
                        //Nach links oben diagonal ueberpruefen
                        if (brett[i-1][j-1] == s2 && brett[i-2][j-2] == s2 && brett[i-3][j-3] == s2){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){
                        exception.getMessage();
                    }
                    try {
                        //Nach links unten diagonal ueberpruefen
                        if (brett[i+1][j-1] == s2 && brett[i+2][j-2] == s2 && brett[i+3][j-3] == s2){
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){
                        exception.getMessage();
                    }
                }
            }
        }
        return false;
    }
}
