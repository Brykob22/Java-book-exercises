package com.java.method;

public class Main {

	public static void main(String... a) {

		Method method = new Method();
		Printer printer = new Printer();

		User user = method.createUser();
		Computer computer = method.createComputer();
		Car car = method.createCar();
		Home home = method.createHome();
		Animals animails = method.createAnimals();
		MusicalInstrument instrument = method.createMusicalInstrument();

		printer.printUser(user);
		printer.printComputer(computer);
		printer.printCar(car);
		printer.printHome(home);
		printer.printAnimals(animails);
		printer.printMusicalInstrument(instrument);
	}
	
}
