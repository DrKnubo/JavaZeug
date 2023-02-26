package de.schumisoft.uebung5;

public class Rechteck {
    double laenge;
    double breite;
    static int anzahl = 0;
    static final double PI = Math.PI;
    

    Rechteck() {
	this(0, 0);
    }
    
    Rechteck(double a){
	this(a, 0);
    }

    Rechteck(double a, double b) {
	this.laenge = a;
	this.breite = b;
	anzahl++;
	
    }

    void setLaenge(double l) {
	this.laenge = l;
    }

    void setBreite(double b) {
	this.breite = b;
    }

    void setSeiten(double l, double b) {
	this.laenge = l;
	this.breite = b;
    }

    double getLaenge() {
	return this.laenge;
    }

    double getKurzeSeite() {
	if (this.laenge < this.breite) {
	    return this.laenge;
	} else {
	    return this.breite;
	}
    }
    
    double getLangeSeite() {
	if (this.laenge > this.breite) {
	    return this.laenge;
	} else {
	    return this.breite;
	}
    }
    
    double getDiagonale() {
	double diagonale;
	diagonale = Math.sqrt((laenge * laenge) + (breite * breite));
	return diagonale;
    }
    
    double getFlaeche() {
	return (this.laenge * this.breite);
    }
    
    double getUmfang() {
	return (laenge * 2) + (breite * 2);
    }
    

}
