package test;

import com.animal.Katze;
import com.animal.Tier;

public class Katzetest {

	public static void main(String[] args) {

		Katze ersteKatze = new Katze();
		ersteKatze.setName("Kitti");// geerbt von Tiere-klasse
		ersteKatze.setFarbe("Grau");// Atribute von (eigene)Katze-Klasse

		Tier neuTier = new Katze();
		// katze zweiteKatze = new Tiere();

		System.out.println("\n Hier ist Katze " + ersteKatze.getName() + ". Sie ist " + ersteKatze.getFarbe()
				+ ". Er sagt ständig:");
		ersteKatze.klang();// @Override-Methode

	}

}
