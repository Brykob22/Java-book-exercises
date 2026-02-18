package com.java.method;

public class Method {
	
	public User createUser() {
		
		User us = new User();
		
		us.age = 20;
		us.money = 2.25;
		us.name = "Rocio";
		
		return us;

	}
	
	public Computer createComputer() {
		
		Computer com = new Computer();
		
		com.brand = "Apple";
		com.operatingSystem = "MacOS";
		com.processor = "M4";
		com.memory = "512gb";
		com.ram = "16gb";
		
		return com;
		
	}
	
	public Car createCar() {
		
		Car car = new Car();
		
		car.engine = "5.0 v8";
		car.transmission = "6-speed automatic";
		car.traction = "4x4";
		car.bodywork = "SUV";
		car.brakes = "ABS";
		
		return car;
		
	}
	
	public Home createHome() {
		
		Home hom = new Home();
		
		hom.kitchen = 1;
		hom.hall = 1;
		hom.diningRoom = 1;
		hom.room = 3;
		hom.bathroom = 3;
		
		return hom;
		
	}
	
	public Animals createAnimals() {
		
	    Animals animal = new Animals();
	    
	    animal.name = "Honey Badger";
	    animal.scientificName = "Mellivora capensis";
	    animal.classification = "Mammal";
	    animal.habitat = "African savanna";
	    animal.diet = "Carnivore";
	    
	    return animal;
	    
	}
	
	public MusicalInstrument createMusicalInstrument() {
		
	    MusicalInstrument instrument = new MusicalInstrument();
	    
	    instrument.name = "Acoustic Guitar";
	    instrument.type = "String instrument";
	    instrument.family = "Chordophone";
	    instrument.strings = 6;
	    instrument.material = "Wood";
	    
	    return instrument;
	    
	}
	
}
