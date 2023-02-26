// Vokaltest

import javax.swing.JOptionPane;

public class VokaltestSwitchOhneBreak {
    public static void main(String[] args) {
	var istVokal = false;
	var eingabe = JOptionPane.showInputDialog("Geben Sie einen Buchstaben ein: ");
	var c = eingabe.charAt(0);

switch (c){
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
JOptionPane.showMessageDialog(null, c + " ist ein Vokal!");
break;
default:
JOptionPane.showMessageDialog(null, c + " ist kein Vokal!");
}


}

}