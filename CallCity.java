package fr.fms.entities;

import org.omg.CORBA.PolicyTypeHelper;

public class CallCity {
	public static void main(String[] args) {
		City toulouse = new City("Toulouse", 450000);
		City bayonne = new City("Bayonne", 180000);
		
		toulouse.view();
		bayonne.view();
	}
}
