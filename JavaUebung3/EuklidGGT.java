import javax.swing.JOptionPane;


public class EuklidGGT {
    public static void main(String[] args) {
	
	int m = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));
	int n = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine weitere Zahl ein: "));
	
	var r = m%n;

	while (r > 0){
	m = n;
	n = r;
	r = m%n;
	}

	System.out.println("Ergebnis: " + n);
}
}