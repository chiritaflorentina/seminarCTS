package ro.ase.cts.proxy;

public class OperatorRezervare implements IOperatorRezervari {

	@Override
	public void realizeazaRezervare(String client, int nrPersoane) {
		System.out.println("A fost realizata rezervarea pe numele "+client+" pentru un nr de persoane de "+nrPersoane);
		
	}

}
