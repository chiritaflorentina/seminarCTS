package ro.ase.cts.facade;

public class Politie {
//facem pe baza paritatii unei cifre din cnp
	public static boolean esteUrmarit(Persoana persoana) {
		return(Integer.parseInt(""+persoana.getCnp().charAt(12)%2)==0);
	}
}
