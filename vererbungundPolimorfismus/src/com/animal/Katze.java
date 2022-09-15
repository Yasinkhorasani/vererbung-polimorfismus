package com.animal;

///********IS-A-BEZIEHUNG**********
//Ein Katze HAT alles, was ein Tier hat
// Ein Katze KANN alles, was ein Tier kann
/**
 * Katze(Subkalasse) erbt von Tiere(Superklasse)=> alle Atribuete & Klassen
 * 
 * @author Yasin
 */
public class Katze extends Tier {

//*******************ATRIBUTE**************************

	/**
	 * Entspricht farbe des tieres
	 */
	protected String farbe;

	// *******************Methoden*************************
	/**
	 * Die Methode Klang wurde aus der Tier-Klasse überschreiben => @Override
	 */
	@Override
	public void klang() {
		System.out.println(" mieauuuu mieauuuu");
	}

	/**
	 * Die Katze kann rennen
	 */@Override
	public void rennen() {
		System.out.println(" Sie rennt");
	}

	/**
	 * Die katze kann schnurren
	 */
	public void schnurren() {
		System.out.println("Sie schnurrt");
	}

//*******************************SETTER UND GETTER*************************************		
	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

}
