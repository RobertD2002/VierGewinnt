public class SchwereKI extends  EinfacheKI{

    public SchwereKI() {
    }

    public SchwereKI(String s, boolean b) {
        super(s, b);
    }

    /**
     * Mit der Methode wird überprüft ob der Gegner 3 Steine in der Reihe hat.
     * Und verhindert es, indem er an der richtigen Position ein Stein legt.
     * @param brett
     * @param s
     * @param ki
     * @return
     */
    public boolean Gegenerfastgewinntlegen(Stein[][] brett, Stein s, Stein ki){
        for (int i = 0; i < brett.length; i++){
            for(int j = 0; j< brett[i].length; j++){
                if (brett[i][j] == s){
                    //Spieler 1
                    //Nach unten überpruefen
                    try{
                        if (brett[i+1][j] == s && brett[i+2][j] == s ) {
                            this.steinLegenfastgewonnen(s,ki,brett,i-1,j);
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException ex){

                    }
                    //Nachen oben ueberpruefen
                    try {
                        if (brett[i-1][j] == s && brett[i-2][j] == s ) {
                            this.steinLegenfastgewonnen(s,ki,brett,i+1,j);
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException test){

                    }

                    //Nach rechts ueberpruefen
                    try {
                        if (brett[i][j+1] == s && brett[i][j+2] == s ){
                             this.steinLegenfastgewonnen(s,ki,brett,i,-1);
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException ex){

                    }
                    //Nach links ueberpruefen
                    try {
                        if (brett[i][j-1] == s && brett[i][j-2] == s){
                            this.steinLegenfastgewonnen(s,ki,brett,i,j+1);
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){

                    }
                    try {
                        //Nach rechts oben diagonal ueberpruefen
                        if (brett[i-1][j+1] == s && brett[i-2][j+2] == s ){
                            this.steinLegenfastgewonnen(s,ki,brett,i+1,j-1);
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){

                    }
                    try {
                        //Nach rechts unten diagonal ueberpruefen
                        if (brett[i+1][j+1] == s && brett[i+2][j+2] == s ) {
                            this.steinLegenfastgewonnen(s,ki,brett,i-1,j-1);
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){

                    }
                    try {
                        //Nach links oben diagonal ueberpruefen
                        if (brett[i-1][j-1] == s && brett[i-2][j-2] == s ){
                             this.steinLegenfastgewonnen(s,ki,brett,i+1,j+1);
                            return true;
                        }
                    }
                    catch (ArrayIndexOutOfBoundsException exception){

                    }
                    try {
                        //Nach links unten diagonal ueberpruefen
                        if (brett[i+1][j-1] == s && brett[i+2][j-2] == s ){
                            this.steinLegenfastgewonnen(s,ki,brett,i-1,j+1);
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

    /**
     * An der Position wird dann der Stein gelegt
     * @param s
     * @param ki
     * @param brett
     * @param x
     * @param y
     * @return
     */
    public Stein[][] steinLegenfastgewonnen(Stein s,Stein ki, Stein[][] brett,int x, int y) {
        if (brett[x][y] != s || brett[x][y]!=ki){
            brett[x][y] = ki;
        }
        return brett;
    }
}
