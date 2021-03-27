package ro.ase.cts.simpleFactory.factory;

public  class Factory {
public Jucator getJucator(TipJucator tipJucator, String numeJucator) {
	switch(tipJucator)
	{
	case Portar:
	{
		return new Portar(numeJucator);
	}case Atacant:
	{
		return new Atacant(numeJucator);
	}case Fundas:
	{
		return new Fundas(numeJucator);
	}default:{
		throw new IllegalArgumentException();
	}
	}
}
}
