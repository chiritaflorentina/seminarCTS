package ro.ase.cts.adapter;

public class AdapterObiecteBilet implements BiletOnline{

	private Bilet bilet;
	public AdapterObiecteBilet(Bilet bilet)
	{
		this.bilet=bilet;
	}
	@Override
	public void vindeBiletOnline() {
		// TODO Auto-generated method stub
		bilet.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		// TODO Auto-generated method stub
		bilet.rezerva();
	}

}
