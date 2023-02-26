package de.schumisoft.uebung5;

public class Bruch {
    int zaehler;
    int nenner;
    
    Bruch(){
	zaehler = 0;
	nenner = 1;
    }
    
    Bruch (int o, int p){
	this.zaehler = o;
	this.nenner = p;
    }

    void ausgeben() {
	//int zaehler = 0;
	System.out.println(this.zaehler + "/" + nenner + "\n");  //this. verhindert das zaehler mit 0 überschrieben wird
    }

    void kuerzen() {
	var m = Math.abs(zaehler);
	var n = Math.abs(nenner);
	var r = m % n;

	while (r > 0) {
	    m = n;
	    n = r;
	    r = m % n;
	}

	zaehler /= n;
	nenner /= n;
    }
    
    void gekuerztausgeben() {
	System.out.print("\nNach dem kürzen: ");
	kuerzen();
	ausgeben();	
    }
    
    void erweitern(int a) {
	zaehler *= a;
	nenner *= a;
    }
    
    void multipliziere(Bruch m) {
	zaehler *= m.zaehler;
	nenner *= m.nenner;
    }
    
    double dezimalwert() {
	return (double) zaehler/nenner;
    }
    
    int signum() {
	if (this.dezimalwert() == 0.0) {
	    return 0;
	}
	if (this.dezimalwert() > 0.0) {
	    return 1;
	}
	//return -1;
	return -1;
    }
    
}