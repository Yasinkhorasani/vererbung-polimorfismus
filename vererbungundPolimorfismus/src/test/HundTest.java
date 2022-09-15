package test;

import com.animal.Hund;
import com.animal.Tier;

public class HundTest {

	public static void main(String[] args) {

		Hund ersterHund = new Hund(50, 18, 11);

		ersterHund.setName("Pitok");
		System.out.println("\n Hier ist der Hund " + ersterHund.getName() // Atribute, geerbt von Tire-Klasse
				+ ". Er sagt ständig:");
		ersterHund.klang();// @Override-Methode
		System.out.println(" \n Beim Essen sagt er: ");
		ersterHund.isFressen(); // Atribute von (eigene)Hunde-Klasse

		System.out.println("\nDer ist in der Lage zu ");
		
		Tier vierBeiner = new Tier();
		ersterHund.charakter(vierBeiner);
		// vierBeiner.charakter(ersterHund);

		

	}

}
