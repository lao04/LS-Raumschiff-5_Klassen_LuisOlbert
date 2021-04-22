package Raumschiffe;

/**
 * @author Luis Olbert
 */
public class TestStarTrek {

	public static void main(String[] args) {

		//Erstellen drei Raumschiffe
		Raumschiff k = new Raumschiff(1,100,100,100,100,2,"IKS Hegh'ta");
	    Raumschiff r = new Raumschiff(2,100,50,100,100,2,"IRW Khazara");
	    Raumschiff v = new Raumschiff(0,80,80,50,100,5,"Ni'Var");


	    //Erstellen Ladung
		Ladung ladungK1 = new Ladung(200, "Ferengi Schneckensaft");
		Ladung ladungK2 = new Ladung(200,"Bat'leth Klingonen Schwert");
		Ladung ladungR1 = new Ladung(5,"Borg-Schrott");
		Ladung ladungR2 = new Ladung(2,"Rote Materie");
		Ladung ladungR3 = new Ladung(50,"Plasma-Waffe");
		Ladung ladungV1 = new Ladung(35,"Forschungssonde");
		Ladung ladungV2 = new Ladung(3,"Photonentorpedo");


		//Ladung hinzufügen
		k.addLadung(ladungK1);
		k.addLadung(ladungK2);

		r.addLadung(ladungR1);
		r.addLadung(ladungR2);
		r.addLadung(ladungR3);

		v.addLadung(ladungV1);
		v.addLadung(ladungV2);


		//Interaktionen
		k.photonentorpedoSchiessen(r);
		r.phaserkanoneSchiessen(k);

		v.nachrichtAnAlle("Gewalt ist nicht logisch.");

		k.zustandRaumschiff();
		k.ladungsverzeichnisAusgeben();

		v.reperaturDurchfuehren(false,false,false,5);
		v.photonentorpedosLaden(3);

		k.photonentorpedoSchiessen(r);
		k.photonentorpedoSchiessen(r);

		k.zustandRaumschiff();
		k.ladungsverzeichnisAusgeben();

		r.zustandRaumschiff();
		r.ladungsverzeichnisAusgeben();

		v.zustandRaumschiff();
		v.ladungsverzeichnisAusgeben();

		k.eintraegeLogbuchZurueckgeben();
	}

}
