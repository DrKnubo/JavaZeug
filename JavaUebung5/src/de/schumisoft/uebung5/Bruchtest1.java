package de.schumisoft.uebung5;

public class Bruchtest1 {

    public static void main(String[] args) {
	Bruch b = new Bruch();
	b.zaehler = 3;
	b.nenner = 12;
	b.ausgeben();
	b.gekuerztausgeben();
	Bruch c = new Bruch();
	b.erweitern(4);
	b.ausgeben();
	c.zaehler = 5;
	c.nenner = 25;
	c.ausgeben();
	c.gekuerztausgeben();
	c.erweitern(4);
	c.ausgeben();
	b.multipliziere(c);
	b.ausgeben();
	System.out.println(b.dezimalwert());
	Bruch a = new Bruch();
	Bruch d = new Bruch(7, 21);
	d.ausgeben();
	
	// System.out.print("Bruch b = " + b.zaehler + "/" + b.nenner);
    }
}