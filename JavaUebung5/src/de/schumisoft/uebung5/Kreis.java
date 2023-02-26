package de.schumisoft.uebung5;

public class Kreis {
    double radius;

    Kreis() {
	this.radius = 0.0;
    }

    Kreis(double radius) {
	this.radius = radius;
    }

    double getRadius() {
	return radius;
    }

    void setRadius(double r) {
	this.radius = r;
    }

    double getUmfang() {
	return 2.0 * 3.1415926 * radius;
    }

    double getFlaeche() {
	return 3.1415926 * radius * radius;
    }

}