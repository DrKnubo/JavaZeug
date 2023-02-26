// Zahlentest 

import javax.swing.JOptionPane;

public class Zahlentest {
    public static void main(String[] args) {
	var istVokal = false;
	var eingabe = JOptionPane.showInputDialog("Geben Sie eine Zahl ein: ");
	double c = Double.parseDouble(eingabe);
	if (c < 0.0){
	    JOptionPane.showMessageDialog(null, "Zahl ist negativ!");
	    }else{
		JOptionPane.showMessageDialog(null, "Zahl ist nicht negativ!");
}



}

}