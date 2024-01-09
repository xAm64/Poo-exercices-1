package fr.fms.entities;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

import javax.print.attribute.standard.Chromaticity;

public class City {
	private String name;
	private int habitants;
	final int MIN_HABITANTS = 0;
	
	public City(String name, int population) {
		this.name = name;
		this.habitants = population;
	}
	public City(String name) {
		this.name = name;
	}
	
	public void view() {
		System.out.println(
				"Nom: "+ this.name+" "+"Nombre d'habitants "+this.habitants+".");
	}
	
	public void setHabitants(int nombre) {
		if (nombre > habitants) {
			this.habitants = nombre;
			System.out.println("La population de : "+this.name+" est désormait de: "+this.habitants+" habitants.");
		} else {
			System.out.println("La ville de: "+this.name+" continue de s'agrandir, sa population ne peut pas baisser");
		}
	}
	/*
	public static void main(String[] args) {
		City toulouse = new City("Toulouse", 450000);
	}
	*/
}
