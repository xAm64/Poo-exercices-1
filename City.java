package fr.fms.entities;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

import javax.print.attribute.standard.Chromaticity;

public class City {
	private String name;
	private String country;
	private int habitants;
	private static int numberInstances = 0;
	final int MIN_HABITANTS = 0;
	{
		numberInstances ++;
	}
	//constructeurs
	public City(String name, String country, int population) {
		this.name = name;
		this.country = country;
		this.habitants = population;
	}
	public City(String name, String country) {
		this.name = name;
		this.country = country;
		this.habitants = MIN_HABITANTS;
	}
	public City(String name, int population) {
		this.name = name;
		this.country = "unknow";
		this.habitants = population;
	}
	public City(String name) {
		this.name = name;
	}
	
	//afficher ville
	public void view() {
		System.out.println(
				"Nom: "+ this.name+" "+"Nombre d'habitants "+this.habitants+".");
	}
	@Override
	public String toString() {
		return "Ville de :"+this.name+" en "+this.country+" ayant "+this.habitants+" habitants";
	}
	//getters
	public int countCity() {
		return numberInstances;
	}
	public String getCity() {
		return this.name;
	}
	public String getCountry() {
		return this.country;
	}
	
	//setters
	public void setHabitants(int nombre) {
		if (nombre > habitants) {
			this.habitants = nombre;
			System.out.println("La population de : "+this.name+" est désormait de: "+this.habitants+" habitants.");
		} else {
			System.out.println("La ville de: "+this.name+" continue de s'agrandir, sa population ne peut pas baisser");
		}
	}
	public void setCountry(String country) {
		if (this.country.equals("unknow")) {
			this.country = country;
			System.out.println("La ville: "+this.name+". Est désormait en "+this.country+".");
		} else {
			System.out.println("La ville: "+this.name+". Est déjà dans un pays: "+this.country+".");
		}
	}
	public void addHabitants(int nombre) {
		if (nombre >0) {
			this.habitants += nombre;
			System.out.println("La ville: "+this.name+". a vu sa population augmenter de: "+nombre+" sa population est désormait de: "+this.habitants+".");
		} else {
			System.out.println("La valeur doit être positive");
		}
	}
	/*
	public static void main(String[] args) {
		City toulouse = new City("Toulouse", 450000);
	}
	*/
}
