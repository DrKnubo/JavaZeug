package de.schumisoft.uebung5;

import javax.swing.JOptionPane;

public class Rechtecktest {

    public static void main(String[] args) {

	System.out.println(Rechteck.anzahl + " Anzahl ");

	var eingabe = JOptionPane.showInputDialog("Geben Sie die Länge an: ");
	var laenge = Double.parseDouble(eingabe);

	var zweingabe = JOptionPane.showInputDialog("Geben Sie die Breite an: ");
	var breite = Double.parseDouble(zweingabe);

	eingabe = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
	var einheit = eingabe;

	Rechteck a1 = new Rechteck(laenge, breite);

	var langeSeite = a1.getLangeSeite();
	var kurzeSeite = a1.getKurzeSeite();
	var diago = a1.getDiagonale();
	var gesammtFlaeche = a1.getFlaeche();
	var gesammtUmfang = a1.getUmfang();

	System.out.println("Die lange Seite ist " + langeSeite + einheit + " lang.");
	System.out.println("Die kurze Seite ist " + kurzeSeite + einheit + " lang.");
	System.out.println("Die Diagonale ist " + diago + einheit + " lang.");
	System.out.println("Die Fläche ist " + gesammtFlaeche + einheit + "\u00b2 gross.");
	System.out.println("Der Umfang ist " + gesammtUmfang + einheit + " lang.");
    }

}
