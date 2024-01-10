package fr.fms.entities;

import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) {
		/*
		Person manu = new Person("Macron", "Emmanuel", 43, "Elysee à Paris", new City("Amiens", "France"));
		Person poutine = new Person("Poutine", "Vladimie", 68);
		Person biden = new Person("Biden", "Joe");
		
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);
		*/
		//Exercice 2.0
		System.out.println("\nExercice 2.0\n");
		
		ArrayList<Person> quelquUn = new ArrayList<>();
		quelquUn.add(new Person("Macron", "Emmanuel", 43, "L'Élysée à Paris", new City("Amiens", "France")));
		quelquUn.add(new Person("Sarkozy", "Nicolas", 66, "Paris", new City("Paris", "France", 2000000)));
		quelquUn.add(new Person("Jonson", "Boris", 56, "Downing street à London", new City("New york", "USA")));
		quelquUn.add(new Person("Depardieu", "Gerard", 72, "Moscou", new City("Châteauroux", "France")));
		quelquUn.add(new Person("Kravitz", "Lenny", 56, "Hôtel particulier Paris", new City("New york", "USA")));
		quelquUn.add(new Person("Lawrence", "Jenifer", 30, "Louisville aux USA", new City("Indian Hills", "USA")));
		
		for (Person view : quelquUn) {
			if (view.getAdress().contains("Paris") || view.getBirthCountry().equals("France")) {
				System.out.println(view);
			}
		}
	}

}