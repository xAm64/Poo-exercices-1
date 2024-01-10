package fr.fms.entities;

public class Person {
	//variables
	private String nom;
	private String prenom;
	private int age;
	private String adresse;
	
	//constructeur
	public Person (String nom, String prenom, int age, String adress) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adress;
	}
	public Person (String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = "";
	}
	public Person (String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = 0;
		this.adresse = "";
	}
	
	//Écrire valeurs
	@Override
	public String toString() {
		String x = "nom: "+this.nom+", prénom: "+this.prenom+", ";
		if (this.age > 0) {
			x += this.age+" ans, ";
		}
		if (!this.adresse.equals("")) {
			x += this.adresse;
		}
		return x;
	}
}