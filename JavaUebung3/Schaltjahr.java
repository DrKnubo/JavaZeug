package haupt;

//Schaltjahr berechnen

import javax.swing.JOptionPane;

public class Schaltjahr { 
	public static void main(String[] args) {
		int jahr = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie ein Jahr ein: "));
		
		
		if (jahr%4 == 0 && jahr%100 != 0){
			JOptionPane.showMessageDialog(null, jahr + " ist ein Schaltjahr");
			}
		else if (jahr%4 == 0 && jahr%100 == 0 && jahr%400 == 0){
			JOptionPane.showMessageDialog(null, jahr + " ist ein Schaltjahr");
			}
		else {
			JOptionPane.showMessageDialog(null, jahr + " ist kein Schaltjahr");
			
			}
		}
	}
	