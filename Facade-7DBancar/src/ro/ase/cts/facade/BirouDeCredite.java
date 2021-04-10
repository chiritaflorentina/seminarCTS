package ro.ase.cts.facade;

public class BirouDeCredite {
	public boolean areCredite(Persoana persoana) {
		return(Integer.parseInt(""+persoana.getCnp().charAt(10))%2==0);
	}
}
