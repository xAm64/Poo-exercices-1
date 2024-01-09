package fr.fms.entities;

public class CallCity {
	public static void main(String[] args) {
		City toulouse = new City("Toulouse", 450000);
		City bayonne = new City("Bayonne", 180000);
		City rabat = new City("Rabat", "Maroc", 577000);
		toulouse.setHabitants(285326);
		toulouse.setHabitants(450231);
		rabat.setCountry("Moroc");
		toulouse.setCountry("France");
		
		toulouse.view();
		bayonne.view();
	}
}
