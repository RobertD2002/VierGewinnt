public class Stein {
    private String farbe;
    private char form = '○';



    public  Stein(){

    }
    public Stein (String farbe, char form) {
        this.farbe = farbe;
        this.form = form;
    }
    //Getter Setter
    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
