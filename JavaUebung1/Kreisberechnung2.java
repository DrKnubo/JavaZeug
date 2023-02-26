/*
Kreisberechnung: Fuer einen Kreis werden der Umfang und die Flaeche berechnet 
Die daten werden als parameter uebergeben
*/

public class Kreisberechnung2 {
    public static void main(String[] args) {
        var radius = Double.parseDouble(args[0]);
        var umfang = 2.0 * 3.1415926 * radius;
        var inhalt = 3.1415926 * radius * radius;

        System.out.print("Umfang: ");
        System.out.println(umfang);
        System.out.print("Flaeche: ");
        System.out.println(inhalt);
    }
}