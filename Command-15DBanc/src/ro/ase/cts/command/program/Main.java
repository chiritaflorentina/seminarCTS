package ro.ase.cts.command.program;

import ro.ase.cts.command.ComandaConstituire;
import ro.ase.cts.command.ComandaDepunere;
import ro.ase.cts.command.ComandaRetragere;
import ro.ase.cts.command.ContBancar;
import ro.ase.cts.command.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerComenzi managerComenzi=new ManagerComenzi();
		ContBancar contBancar=new ContBancar("Ro281383683", 0);
		managerComenzi.invoca(new ComandaConstituire(contBancar, 50000));
		managerComenzi.invoca(new ComandaDepunere(contBancar, 100));
		managerComenzi.executaComanda();
		managerComenzi.invoca(new ComandaRetragere(contBancar, 7000));
		managerComenzi.invoca(new ComandaRetragere(contBancar, 10000));
		managerComenzi.executaComenzi();
	}

}
