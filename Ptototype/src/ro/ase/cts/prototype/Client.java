package ro.ase.cts.prototype;

public class Client implements Copiaza {

	private String nume;
	private int varsta;
	
	public Client(String nume, int varsta) {
		super();
		//se fac validari pentru nume si varsta
		this.nume = nume;
		this.varsta = varsta;
	}
	//pentru a nu putea face un client fara validari il facem PRIVAT
private Client() {
	
}
	@Override
	public Copiaza copiaza() {
		Client client=new Client();
		//nu mai fac validari pt ca le fac la constructor
		client.nume=this.nume;
		client.varsta=this.varsta;
		return client;
		
	}
	@Override
	public String toString() {
		return "Client [nume=" + nume + ", varsta=" + varsta + "]";
	}
	

}
