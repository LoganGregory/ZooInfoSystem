package zooInfoSystem;

import java.util.Random;

public class Employees {
	Random rand = new Random();
	
//	String employeeName;
//	int numHrsWorked;
	
	public void animalFoodInventory() {
		System.out.println("Is there enough food for the animals?");
		int rng = rand.nextInt(2); // coin flip.
		
		switch (rng) {
		case 0:
			System.out.println("There's no more animal food, go buy some more.");
			System.out.println("Buying animal food...");
			System.out.println("Animal food restocked.");
			break;
		case 1:
			System.out.println("The animal food is well stocked, no issues.");
			break;
		default:
			System.out.println("You broke the coin!");
			break;
		}
	}
	
//	public void buyAnimalFood() {
//		System.out.println("Buying animal food...");
//		System.out.println("Animal food purchased.");
//	}
	
	public void feedAnimals() {
		System.out.println("Feeding the animals...");
		System.out.println("The animals have been fed.");
	}
	
//	public void countTickets() {
//		System.out.println("Tickets counted.");
//	}
	
//	public void contactVet() {
//		System.out.println("The on-staff vet is now treating the animal.");
//	}
	
	
	
	public void checkAnimalHealth() {
		int rng = rand.nextInt(6 + 1); // 6 sided die (d6)
		
		switch (rng) {
			case 1:
				System.out.println("The lion has a thorn in his paw!");
				System.out.println("go get the on-staff vet!");
				System.out.println("The on-staff vet is now treating the animal.");
				System.out.println("Success! the animal is back to normal.");
				break;
			case 2:
				System.out.println("One of the animals got sick!");
				System.out.println("go get the on-staff vet!");
				System.out.println("The on-staff vet is now treating the animal.");
				System.out.println("Success! the animal is back to normal.");
				break;
			case 3:
				System.out.println("The animals are healthy.");
				break;
			case 4:
				System.out.println("The animals are healthy.");
				break;
			case 5:
				System.out.println("The animals are healthy.");
				break;
			case 6: // Would it be too silly to make this one say "JACKPOT!"?
				System.out.println("The animals are healthy.");
				break;
			default:
				System.out.println("Well I hope you're happy, you just broke the die!");
				break;
		}
	}
	
}
