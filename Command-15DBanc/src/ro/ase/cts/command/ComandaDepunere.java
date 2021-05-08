package ro.ase.cts.command;

public class ComandaDepunere implements IComanda{

	private ContBancar ContBancar;
	private float sumaDepunere;
	
	public ComandaDepunere(ro.ase.cts.command.ContBancar contBancar, float sumaInitiala) {
		super();
		ContBancar = contBancar;
		this.sumaDepunere = sumaInitiala;
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		ContBancar.depunere(sumaDepunere);
	}

}
