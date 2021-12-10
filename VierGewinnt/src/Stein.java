import javax.swing.*;

public class Stein {
    private String farbe;
    private char form ;


    public  Stein(){

    }
    public Stein (String farbe, char form) {
        this.farbe = farbe;
        this.form = '○';
    }


    //Override
    public String toString() {
            return  this.farbe + this.form;
    }
    //Getter Setter
    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public char getForm() {
        return  form;
    }

    public void setForm(char form) {
        this.form = form;
    }
}
