package ro.ase.cts.singleton.lazy.farmacie;

import ro.ase.cts.singleton.lazy.ReceptieHotel;

public class Farmacie {
	private String numeFarmacie;
	private int nrStrada;
	private double pret;
	private static Farmacie instanta = null;

	private Farmacie(String numeFarmacie, int nrStrada, double pret) {
		super();
		this.numeFarmacie = numeFarmacie;
		this.nrStrada = nrStrada;
		this.pret = pret;
	}

	public void setNumeFarmacie(String numeFarmacie) {
		this.numeFarmacie = numeFarmacie;
	}

	public void setNrStrada(int nrStrada) {
		this.nrStrada = nrStrada;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "Farmacie [numeFarmacie=" + numeFarmacie + ", nrStrada=" + nrStrada + ", pret=" + pret + "]";
	}

	public static synchronized Farmacie getInstanta(String numeFarmacie, int nrStrada, float pret) {
		if (instanta == null) {
			instanta = new Farmacie(numeFarmacie, nrStrada, pret);
		}
		return instanta;
	}

}
