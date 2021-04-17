package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements IOperatorRezervari{

	private OperatorRezervare operatorRezervare;
	private int nrMinimPersoane;
	
	

	public ProxyOperatorRezervari(OperatorRezervare operatorRezervare, int nrMinimPersoane) {
		super();
		this.operatorRezervare = operatorRezervare;
		this.nrMinimPersoane = nrMinimPersoane;
	}



	@Override
	public void realizeazaRezervare(String client, int nrPersoane) {
		// TODO Auto-generated method stub
		if(nrPersoane>=nrMinimPersoane)
			operatorRezervare.realizeazaRezervare(client, nrPersoane);
		else
			System.out.println("Rezervarea nu este necesara!");
	}
	

}
