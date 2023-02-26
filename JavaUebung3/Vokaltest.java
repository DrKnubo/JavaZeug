// Vokaltest

import javax.swing.JOptionPane;

public class Vokaltest {
    public static void main(String[] args) {
	var istVokal = false;
	var eingabe = JOptionPane.showInputDialog("Geben Sie einen Buchstaben ein: ");
	var c = eingabe.charAt(0);
	if (c == 'a' | c == 'A'){
	    istVokal = true;
		}else{
if (c == 'e'| c == 'E'){
	    istVokal = true;
		}else{
if (c == 'i'| c == 'I'){
	    istVokal = true;
		}else{
if (c == 'o'| c == 'O'){
	    istVokal = true;
		}else{
if (c == 'u'| c == 'U'){
	    istVokal = true;
		}else{
istVokal = false;
}
}
}
}
}
if (istVokal) {JOptionPane.showMessageDialog(null, c + " ist ein Vokal!");} else {JOptionPane.showMessageDialog(null, c + " ist kein Vokal!");}


}

}