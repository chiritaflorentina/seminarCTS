package ro.ase.cts.FactoryMethod.factory;

public class Atacant extends Jucator {

	public Atacant(String numeJucator) {
		super(numeJucator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Atacant " + getNumeJucator() ;
	}

}
