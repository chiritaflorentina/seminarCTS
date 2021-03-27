package ro.ase.cts.FactoryMethod.Program;

import ro.ase.cts.FactoryMethod.factory.Factory;
import ro.ase.cts.FactoryMethod.factory.FactoryFundas;
import ro.ase.cts.FactoryMethod.factory.FactoryMijlocas;
import ro.ase.cts.FactoryMethod.factory.FactoryPortar;
import ro.ase.cts.FactoryMethod.factory.Jucator;

public class Main {
	public static void afiseazaJucator(Factory factory, String numeJucator) {
		Jucator jucator=factory.creeazaJucator(numeJucator);
		System.out.println(jucator.toString());
	}
public static void main(String[] args) {
	afiseazaJucator(new FactoryPortar(), "Mihai");
	afiseazaJucator(new FactoryFundas(), "Ion");
	afiseazaJucator(new FactoryMijlocas(), "Marius");
	
}
}
