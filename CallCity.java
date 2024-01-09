package fr.fms.entities;

import org.omg.CORBA.PolicyTypeHelper;

public class CallCity {
	public static void main(String[] args) {
		City toulouse = new City("Toulouse", 450000);
		City bayonne = new City("Bayonne", 180000);
		toulouse.setHabitants(285326);
		toulouse.setHabitants(450231);
		
		toulouse.view();
		bayonne.view();
	}
}
