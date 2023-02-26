

public class Kreisberechnung3 {
    public static void main(String[] args) {
        var einheit = args[1];
        var radius = Double.parseDouble(args[0]);
var umfang = 2.0 * 3.1415926 * radius;
var flaeche = 3.1415926 * radius * radius;
System.out.print("Umfang: ");
System.out.print(umfang);
System.out.println(" " + einheit);
System.out.print("Flaeche: ");
System.out.print(flaeche);
System.out.println(" " + einheit + '\u00b2');
}
}