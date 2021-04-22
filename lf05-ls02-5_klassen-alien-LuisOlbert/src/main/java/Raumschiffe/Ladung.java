package Raumschiffe;

public class Ladung {


    //Attribute
    private String bezeichnung;
    private int menge;



    //Konstruktor ohne Parameter
    public Ladung(){

    }


    //Konstruktor mit Parametern
    public Ladung(int menge, String bezeichnung){
        this.menge = menge;
        this.bezeichnung = bezeichnung;
    }


    //Getter und Setter
    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnungNeu) {
        bezeichnung = bezeichnungNeu;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int mengeNeu) {
        menge = mengeNeu;
    }
    //Getter und Setter Ende



}
