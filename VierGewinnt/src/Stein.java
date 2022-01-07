import javax.swing.*;
import java.awt.Color;

public class Stein {

    //Attribute
    private String farbe;
    private char form ;


    //Konstruktoren
    public  Stein(){

    }
    public Stein (String farbe, char form) {
        this.farbe = farbe;
        this.form = form;
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
