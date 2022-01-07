import java.util.Random;

public class EinfacheKI extends Spieler {

    //Konstruktor
    EinfacheKI(){

    }

    EinfacheKI(String s,boolean b){
        super(s,b);
    }

    public Stein[][] steinLegen(Stein s, Stein[][] brett){
        boolean wiederholen = false;
        while (wiederholen == false){
            int j = (int)(Math.random()*(7-1)) + 1;
            if (j < 8 && j > 0){                        // damit die spalten nicht bei 0 anfangen
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
