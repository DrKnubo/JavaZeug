// Zahlentest 

import javax.swing.JOptionPane;

public class Quadrat {
    public static void main(String[] args) {

	
	//var eingabe = JOptionPane.showInputDialog("Geben Sie einen Wert für a ein: ");
	var a = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie einen Wert für a ein: "));
	//var eingabe = JOptionPane.showInputDialog("Geben Sie einen Wert für b ein: ");
	var b = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie einen Wert für b ein: "));
	//var eingabe = JOptionPane.showInputDialog("Geben Sie einen Wert für c ein: ");
	var c = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie einen Wert für c ein: "));

	var d = b * b - 4 * a * c;

	if (d < 0.0){
	    JOptionPane.showMessageDialog(null, "Es gibt keine Lösung");
	}
	else if (d > 0.0){
		JOptionPane.showMessageDialog(null, "Es gibt zwei Lösungen");
	}
	else if (d == 0.0){
		JOptionPane.showMessageDialog(null, "Es gibt eine Lösung");
	}



}

}