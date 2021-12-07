public class Modus implements Brett {

    Stein[][] feld ={   //stein
            {null , null, null, null, null, null, null},
            {null , null, null, null, null, null, null},
            {null , null, null, null, null, null, null},
            {null , null, null, null, null, null, null},
            {null , null, null, null, null, null, null},
            {null , null, null, null, null, null, null},
    };

    @Override
    public Stein[][] BrettErzeugen() {
        return feld;
    }

    public Stein[][] getFeld(){
        return this.feld;
    }
    public void setStein() {
        this.feld = feld;
    }
}
