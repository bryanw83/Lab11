package Lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<Car> carList = new ArrayList<>();
		
		System.out.println("Welcome to 'Honest Benedict's' car search system!");
		System.out.println();
		
		System.out.println("How many cars are you looking for?: ");
		int numCars = scnr.nextInt();
		
		for (int i = 0; i < numCars; i++) {
			Car nextCar = new Car();
			System.out.println("Car #: " + (i+1));
			System.out.println();
			String make = Car.getString(scnr, "What is the make of the car?: ");
			nextCar.setMake(make);
			System.out.println();
			String model = Car.getString(scnr, "What is the model of the car?: ");
			nextCar.setModel(model);
			System.out.println();
			int year = Car.getInt(scnr, "What is the year of the car?: ", 1900 , 2018);
			nextCar.setYear(year);
			System.out.println();
			double price = Car.getDouble(scnr, "What is the price of the car?: ");
			nextCar.setPrice(price);
			System.out.println();
			carList.add(nextCar);
		}
		
		System.out.println("Ok, so the cars you entered were: ");
		 for (int i = 0; i < numCars; i++) {
			 System.out.println(carList.get(i));
		 }
		 System.out.println();
		 System.out.println("Sorry! We don't have any of those in stock. But we 'promise' \n our inventory is the largest around. \n Thanks for visiting 'Honest Benedict's' and come again!");

	}

}
