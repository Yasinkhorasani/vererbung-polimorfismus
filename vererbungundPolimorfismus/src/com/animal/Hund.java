package com.animal;

///********IS-A-BEZIEHUNG**********
// Ein Hund HAT alles, was ein Tier hat
// Ein Hund KANN alles, was ein Tier kann

/**
 * Hund(Subkalasse) erbt von Tiere(Superklasse)=> alle Atribuete & Klassen
 * 
 * @author Yasin
 */
public class Hund extends Tier {

//*******************ATRIBUTE**************************

	/**
	 * ob Hund frisst?
	 */
	protected boolean fressen;

	protected int maxAlter;

	protected int geburtstJahr;

	protected int lebenserwartung;

//*******************KONSTRUCTOR***********************

	public Hund(int maxAlter, int geburtstJahr, int lebenserwartung) {
		
		lebenserwartung = maxAlter - geburtstJahr;
		this.maxAlter = maxAlter;
		this.geburtstJahr = geburtstJahr;
		this.lebenserwartung = lebenserwartung;
	}

// *******************Methoden*************************

	/**
	 * Die Methode Klang wurde aus der Tier-Klasse überschreiben => @Override
	 */
	@Override
	public void klang() {
		System.out.println(" Wuff  Wuff Wuff");
	}

	/**
	 * 
	 * @param x ist Parent-klasse (Tiere) und dadurch wird die Methode "rennen"
	 *          getätigt
	 */
	public void charakter(Tier x) {
		x.rennen();
	}

	// ******************SETER/GETTER********************

	public boolean isFressen() {
		System.out.println(" Ich fresse zu viel");
		return fressen;
	}

	public int getLebenserwartung() {
		return lebenserwartung;
	}

	public void setLebenserwartung(int lebenserwartung) {
		this.lebenserwartung = lebenserwartung;
	}

	public int getGeburtstJahr() {
		return geburtstJahr;
	}

	public void setGeburtstJahr(int geburtstJahr) {
		this.geburtstJahr = geburtstJahr;
	}

	public int getMaxAlter() {
		return maxAlter;
	}

	public void setMaxAlter(int maxAlter) {
		this.maxAlter = maxAlter;
	}

}
