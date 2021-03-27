package ro.ase.cts.FactoryMethod.factory;

public class FactoryMijlocas implements Factory {

	@Override
	public Jucator creeazaJucator(String numeJucator) {
		// TODO Auto-generated method stub
		return new Mijlocas(numeJucator);
	}

}
