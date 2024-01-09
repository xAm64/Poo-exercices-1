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
	/*
	public static void main(String[] args) {
		City toulouse = new City("Toulouse", 450000);
	}
	*/
}
