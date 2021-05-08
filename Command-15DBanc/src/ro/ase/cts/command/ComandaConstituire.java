package ro.ase.cts.command;

public class ComandaConstituire implements IComanda{
//era mai bn daca avea clasa abstracta in loc de interfata
	//puneam atributele acolo
	private ContBancar contBancar;
	private float sumaInitiala;
	
	public ComandaConstituire(ContBancar contBancar, float sumaInitiala) {
		super();
		this.contBancar = contBancar;
		this.sumaInitiala = sumaInitiala;
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		contBancar.constituire(sumaInitiala);
	}

}
