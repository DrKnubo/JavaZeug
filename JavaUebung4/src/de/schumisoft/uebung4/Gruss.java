package de.schumisoft.uebung4;

//import javax.swing.JOptionPane;

public class Gruss {

	public static void main(String[] args) {

	    
	    int zahl = 30;
	    String zeichensatz ="";
	    
	    while (zahl < 128) {
		zeichensatz = zeichensatz + (char) zahl;
		zahl++;
	    }
	    
	    System.out.println(zeichensatz);
	    
	    /*
	    
	    double mwstsatz = 19.0;
	    var betrag = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie den Betrag ein: "));
	    
	    System.out.println("Betrag: " + betrag);
	    System.out.println("Schritt eins: " + (mwstsatz / 100));
	    System.out.println("Schritt zwei: " + (mwstsatz / 100 * betrag));
	    
	    
	    var mwst = mwstsatz / 100 * betrag;
	    System.out.println("Mehrwertsteuer: " + mwst + " €");
	    
	    System.out.println("Viel Erfolg beim");
	    System.out.println("Programmieren mit Java und Eclipse!!!");
	    
	    
	    
		// TODO Auto-generated method stub
*/
	}

}
