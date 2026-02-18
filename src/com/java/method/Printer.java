package com.java.method;

public class Printer {

	public void printUser(User user) {

		System.out.println(user);
		System.out.println("=== USER ===\n");
		System.out.println("Name:\t" + user.name);
		System.out.println("Age:\t" + user.age);
		System.out.println("Money:\t" + user.money + "\n\n");

	}

	public void printComputer(Computer computer) {

		System.out.println(computer);
		System.out.println("=== COMPUTER ===\n");
		System.out.println("Brand:\t\t\t" + computer.brand);
		System.out.println("Operating System:\t" + computer.operatingSystem);
		System.out.println("Processor:\t\t" + computer.processor);
		System.out.println("Memory:\t\t\t" + computer.memory);
		System.out.println("Ram:\t\t\t" + computer.ram + "\n\n");

	}

	public void printCar(Car car) {

		System.out.println(car);
		System.out.println("=== CAR ===\n");
		System.out.println("Engine:\t\t" + car.engine);
		System.out.println("Transmission:\t" + car.transmission);
		System.out.println("Traction:\t" + car.traction);
		System.out.println("Bodywork:\t" + car.bodywork);
		System.out.println("Brakes:\t\t" + car.brakes + "\n\n");

	}

	public void printHome(Home home) {

		System.out.println(home);
		System.out.println("=== HOME ===\n");
		System.out.println("Kitchen:\t" + home.kitchen);
		System.out.println("Hall:\t\t" + home.hall);
		System.out.println("DiningRoom:\t" + home.diningRoom);
		System.out.println("Room:\t\t" + home.room);
		System.out.println("Bathroom:\t" + home.bathroom + "\n\n");

	}
	
	public void printAnimals(Animals animal) {
		
		System.out.println(animal);
	    System.out.println("=== ANIMAL ===\n");
	    System.out.println("Name:\t\t\t" + animal.name);
	    System.out.println("Scientific Name:\t" + animal.scientificName);
	    System.out.println("Classification:\t\t" + animal.classification);
	    System.out.println("Habitat:\t\t" + animal.habitat);
	    System.out.println("Diet:\t\t\t" + animal.diet + "\n\n");
	    
	}
	
	public void printMusicalInstrument(MusicalInstrument instrument) {
		
		System.out.println(instrument);
	    System.out.println("=== MUSICAL INSTRUMENT ===\n");
	    System.out.println("Name:\t\t" + instrument.name);
	    System.out.println("Type:\t\t" + instrument.type);
	    System.out.println("Family:\t\t" + instrument.family);
	    System.out.println("Strings:\t" + instrument.strings);
	    System.out.println("Material:\t" + instrument.material + "\n\n");
	    
	}

}