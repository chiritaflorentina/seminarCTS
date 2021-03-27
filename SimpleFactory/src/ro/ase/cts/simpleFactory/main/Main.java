package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.simpleFactory.factory.Factory;
import ro.ase.cts.simpleFactory.factory.Jucator;
import ro.ase.cts.simpleFactory.factory.TipJucator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new Factory();
		Jucator portar=factory.getJucator(TipJucator.Portar, "Daniel");
		Jucator fundas=factory.getJucator(TipJucator.Fundas, "Ionel");
	System.out.println(portar.toString());
	System.out.println(fundas.toString());
	}

}
