package ro.ase.cts.FactoryMethod.factory;

public class FactoryPortar implements Factory {

	@Override
	public Jucator creeazaJucator(String numeJucator) {
		// TODO Auto-generated method stub
		return new Portar(numeJucator);
	}

}
