// Zahlenraten 

import javax.swing.JOptionPane;

public class Zahlenraten {
    public static void main(String[] args) {
	
	var eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein: ");
	int zahl = Integer.parseInt(eingabe);


switch (zahl){
case 4:
case 5:
case 7:
case 8:
JOptionPane.showMessageDialog(null, "Knapp daneben!");
break;
case 6:
JOptionPane.showMessageDialog(null, "Treffer!");
break;
default:
JOptionPane.showMessageDialog(null, "Daneben!");
}


}

}