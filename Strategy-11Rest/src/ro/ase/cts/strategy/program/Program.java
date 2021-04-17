package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.Client;
import ro.ase.cts.strategy.PlataBonuri;
import ro.ase.cts.strategy.PlataCard;
import ro.ase.cts.strategy.PlataCash;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client client=new Client("Gigel",new PlataCard());
		client.platesteNota(200);
		client.setModPlata(new PlataCash());
		client.platesteNota(20);
		client.setModPlata(new PlataBonuri());
		client.platesteNota(12);
		
	}

}
