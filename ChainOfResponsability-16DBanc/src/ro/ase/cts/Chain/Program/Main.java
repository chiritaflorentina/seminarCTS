package ro.ase.cts.Chain.Program;

import ro.ase.cts.Chain.Cont;
import ro.ase.cts.Chain.ContCurent;
import ro.ase.cts.Chain.ContDeCredit;
import ro.ase.cts.Chain.ContEconomii;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cont contCurent = new ContCurent(1000, "RO394794");
		Cont contEconomii = new ContEconomii(2000, "RO58486");
		Cont contdeCredit = new ContDeCredit(3000, "RO9347397");
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contdeCredit);
		contCurent.plateste(400);
		contCurent.plateste(800);
		contCurent.plateste(1000);
		contCurent.plateste(2000);
		contCurent.plateste(3000);
	}

}
