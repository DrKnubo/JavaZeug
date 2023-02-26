package de.schumisoft.uebung5;

import javax.swing.JOptionPane;

public class Kreistest {

    public static void main(String[] args) {
	var eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
	var radius = Double.parseDouble(eingabe);
	eingabe = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
	var einheit = eingabe;

	Kreis rund = new Kreis();

	rund.setRadius(radius);
	double umfang = rund.getUmfang();
	double flaeche = rund.getFlaeche();
	System.out.print("Umfang: ");
	System.out.print(umfang);
	System.out.println(" " + einheit);
	System.out.print("Fläche: ");
	System.out.print(flaeche);
	System.out.println(" " + einheit + '\u00b2');

    }

}
