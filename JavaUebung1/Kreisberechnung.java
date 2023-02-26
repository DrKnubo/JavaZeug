/*
Kreisberechnung: Fuer einen Kreis mit Radius 5cm
werden der Umfang und die Flaeche berechnet 
*/

public class Kreisberechnung {
    public static void main(String[] args) {
        var radius = 5.0;
        var umfang = 2.0 * 3.1415926 * radius;
        var inhalt = 3.1415926 * radius * radius;

        System.out.print("Umfang: ");
        System.out.println(umfang);
        System.out.print("Flaeche: ");
        System.out.println(inhalt);
    }
}