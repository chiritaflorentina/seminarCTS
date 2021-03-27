package ro.ase.cts.FactoryMethod.factory;

public abstract class Jucator {
private String numeJucator;


public Jucator(String numeJucator) {
	super();
	this.numeJucator = numeJucator;
}

public String getNumeJucator() {
	return numeJucator;
}

@Override
public String toString() {
	return "Jucator [numeJucator=" + numeJucator + "]";
}

}
