public class Brett {
    //Deklaration / Initialisierung
    private Stein[][] feld ={   //stein
                        {null , null, null, null, null, null, null},
                        {null , null, null, null, null, null, null},
                        {null , null, null, null, null, null, null},
                        {null , null, null, null, null, null, null},
                        {null , null, null, null, null, null, null},
                        {null , null, null, null, null, null, null},
                        };


    //Konstruktor
    public  Brett(){

    }

    public Brett(Stein[][] feld){
        this.feld = feld;
    }


    //Getter Setter
    public Stein[][] getFeld(){
        return this.feld;
    }
    public void setStein(){
        this.feld = feld;
    }

}
