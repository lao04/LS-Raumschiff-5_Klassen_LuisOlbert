package Raumschiffe;

import java.util.ArrayList;


/**
 * Diese Klasse modelliert einen Raumschiff
 */
public class Raumschiff {


	//Attribute
	private int photonentorpedoAnzahl;
	private int energieversorgungInProzent;
	private int schildeInProzent;
	private int huelleInProzent;
	private int lebenserhaltungssystemeInProzent;
	private int androidenAnzahl;

	private String schiffsname;
	public ArrayList<Ladung> ladungsverzeichnis = new ArrayList<Ladung>();
	public ArrayList<String> broadcastKommunikator = new ArrayList<String>();



	//Konstruktor Raumschiff ohne Paramter
	public Raumschiff(){

	}

	/**
	 * Wenn Sie Anfänger sind, lassen Sie die Methode einfach so stehen. Sie wird für das Autograding benötigt.
	 * Wenn Sie Fortgeschrittener oder Experte sind, implementieren Sie die Methode entsprechend
	 * @return null
	 */


	/**
	 * Wenn Sie Anfänger oder Fortgeschrittener sind, lassen Sie die Methode einfach so stehen. Sie wird für das Autograding benötigt.
	 * Wenn Sie Experte sind, implementieren Sie die Methode entsprechend
	 * @param anzahlTorpedos, a
	 */
	public void photonentorpedosEinsetzen(int anzahlTorpedos){

	}

	//Konstruktor Raumschiff mit allen Paramtern
	public Raumschiff(int photonentorpedoAnzahl, int energieversorgungInProzent, int schildeInProzent, int huelleInProzent, int lebenserhaltungssystemeInProzent, int androidenAnzahl, String schiffsname){
		this.photonentorpedoAnzahl = photonentorpedoAnzahl;
		this.energieversorgungInProzent = energieversorgungInProzent;
		this.schildeInProzent = schildeInProzent;
		this.huelleInProzent = huelleInProzent;
		this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
		this.schiffsname = schiffsname;
	}





	//Getter und Setter
	public int getPhotonentorpedoAnzahl() {
		return photonentorpedoAnzahl;
	}

	public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahlNeu) {
		photonentorpedoAnzahl = photonentorpedoAnzahlNeu;
	}

	public int getEnergieversorgungInProzent() {
		return energieversorgungInProzent;
	}

	public void setEnergieversorgungInProzent(int energieversorgungInProzentNeu) {
		energieversorgungInProzent = energieversorgungInProzentNeu;
	}

	public int getSchildeInProzent() {
		return schildeInProzent;
	}

	public void setSchildeInProzent(int schildeInProzentNeu) {
		schildeInProzent = schildeInProzentNeu;
	}

	public int getHuelleInProzent() {
		return huelleInProzent;
	}

	public void setHuelleInProzent(int huelleInProzentNeu) {
		huelleInProzent = huelleInProzentNeu;
	}

	public int getLebenserhaltungssystemeInProzent() {
		return lebenserhaltungssystemeInProzent;
	}

	public void setLebenserhaltungssystemeInProzent(int lebenserhaltungssystemeInProzentNeu) {
		lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzentNeu;
	}

	public int getAndroidenAnzahl() {
		return androidenAnzahl;
	}

	public void setAndroidenAnzahl(int androidenAnzahlNeu) {
		androidenAnzahl = androidenAnzahlNeu;
	}

	public String getSchiffsname() {
		return schiffsname;
	}

	public void setSchiffsname(String schiffsnameNeu) {
		schiffsname = schiffsnameNeu;
	}
	//Getter und Setter Ende


	//Methoden
	public void addLadung(Ladung neueLadung) {
		ladungsverzeichnis.add(neueLadung);
	}


	public void photonentorpedoSchiessen(Raumschiff r){
		if (photonentorpedoAnzahl == 0)
			nachrichtAnAlle("...?");
		else
		{
			photonentorpedoAnzahl--;
			nachrichtAnAlle("Photonentorpedo abgeschossen!");
			treffer(r);
		}
	}



	public void phaserkanoneSchiessen(Raumschiff r){
		if (energieversorgungInProzent < 50)
			nachrichtAnAlle("...?");
		else
		{
			energieversorgungInProzent -=50;
			nachrichtAnAlle("Phaserkanone abgeschossen!");
			treffer(r);
		}
	}


	private void treffer(Raumschiff r){
		System.out.println(r.schiffsname + " wurde getroffen!");
	}

	public void nachrichtAnAlle(String message){
		System.out.println(this.schiffsname + ": " + message);
		broadcastKommunikator.add(message);
	}
	public void eintraegeLogbuchZurueckgeben(){
		System.out.println("Logbuch: " + broadcastKommunikator);
	}


	public void photonentorpedosLaden(int anzahlTorpedos){
		photonentorpedoAnzahl = anzahlTorpedos + photonentorpedoAnzahl;
		System.out.println("Torpedos geladen!");
	}


	public void reperaturDurchfuehren(boolean schutzschilde, boolean energieversorgung, boolean schiffshuelle, int anzahlDroiden){
		if (huelleInProzent == 100){
			schiffshuelle = true;
		}
		if (schildeInProzent == 100){
			schutzschilde = true;
		}
		if (energieversorgungInProzent == 100){
			energieversorgung = true;
		}
		if(schiffshuelle == true & schutzschilde == true & energieversorgung == true){
			System.out.println("Das Schiff wurde von " + anzahlDroiden + " Droiden vollständig repariert.");
		}
	}




	public void zustandRaumschiff(){
		System.out.println("Huelle: " + this.huelleInProzent);
		System.out.println("Schilde: " + this.schildeInProzent);
		System.out.println("Lebenserhaltung: " + this.lebenserhaltungssystemeInProzent);
		System.out.println("Energieversorgung: " + this.energieversorgungInProzent);

	}


	public void ladungsverzeichnisAusgeben(){
		System.out.println("Ladung: " + ladungsverzeichnis);
	}


	public void ladungsverzeichnisAufraeumen(){
		ladungsverzeichnis.clear();
	}


}

