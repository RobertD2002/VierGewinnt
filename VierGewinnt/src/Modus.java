/**
 * Die Klasse Modus implementiert von der Klasse Brett
 * In der Klasse Modus werden die Bretter erzeugt die ein Stein[][] Datentyp ist.
 */

public class Modus implements Brett {

    private Stein[][] feld ={
            {null , null, null, null, null, null, null,},
            {null , null, null, null, null, null, null},
            {null , null, null, null, null, null, null},
            {null , null, null, null, null, null, null},
            {null , null, null, null, null, null, null},
            {null , null, null, null, null, null, null},
    };

    //Konstruktor
    @Override
    public Stein[][] BrettErzeugen() {
        return feld;
    }

    //Getter und Setter
    public Stein[][] getFeld(){
        return this.feld;
    }
    public void setFeld() {
        this.feld = feld;
    }
}
