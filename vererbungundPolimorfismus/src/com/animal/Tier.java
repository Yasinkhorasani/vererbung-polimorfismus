package com.animal;

/**
 * Vorlage für Eltern-object
 * 
 * Objectbeschreibung => Blick aus dem Fenster .
 * 
 * ABSTRAKTION: *****Eigenschaften(HABEN)********* NAME/FARBE/ALTER
 * *****Methoden(KÖNNEN)************ Sie können beissen und rennen
 * 
 * @author Yasin
 *
 */
public class Tier {

	// *************************ATRIBUTE***********************************
	/**
	 * Entspricht tiername
	 */
	protected String name;

	/**
	 * Entspricht alter der Tiere
	 */
	protected int alter;

	// ************************METHODEN*************************************

	public String beissenvermögen() {
		String derBeissen = "beisst";
		return derBeissen;
	}

	public void rennen() {
		System.out.println(" rennen");
	}

	/**
	 * Die Methode Klang wird Überschreiben
	 */
	public void klang() {
		System.out.println(" der Tier hat einen Klang");
	}

//***********************GETTER UND SETTER********************************
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

}
