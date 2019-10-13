/**
 * 
 */
package zooInfoSystem;

import java.util.Scanner;
import java.util.Random;

/**
 * @author LoganBrinkleyGregory
 *
 */
public class ZISmain {
	Random rand = new Random();
//	Employees joejoe = new Employees();
	
//	public void checkAnimalHealth() {
//		int rng = rand.nextInt(6);
//		
//		switch (rng) {
//			case 1:
//				System.out.println("The lion has a thorn in his paw!");
//				joejoe.contactVet();  // Employees.contactVet();
//			case 2:
//				System.out.println("One of the animals got sick!");
//				joejoe.contactVet();  // Employees.contactVet();
//			case 3:
//				System.out.println("The animals are healthy.");
//			case 4:
//				System.out.println("The animals are healthy.");
//			case 5:
//				System.out.println("The animals are healthy.");
//			case 6: // Would it be too silly to make this one say "JACKPOT!"?
//				System.out.println("The animals are healthy.");
//			default:
//				System.out.println("Well I hope you're happy, you just broke the die!");
//				break;
//		}
//	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employees joejoe = new Employees();
		
		System.out.println("Zookeeper Joe Joe begins his daily zookeeping routine.");
		joejoe.checkAnimalHealth();
		System.out.println("");
		
		joejoe.animalFoodInventory();
		System.out.println("Joe Joe feeds the animals breakfast.");
		joejoe.feedAnimals();
		joejoe.checkAnimalHealth();
		System.out.println("");
		
		System.out.println("Joe Joe feeds the animals lunch.");
		joejoe.feedAnimals();
		joejoe.checkAnimalHealth();
		System.out.println("");
		
		System.out.println("Joe Joe feeds the animals dinner.");
		joejoe.feedAnimals();
		joejoe.checkAnimalHealth();
		System.out.println("");
		
		System.out.println("Joe Joe closes the zoo for the night");
	}
	
}
