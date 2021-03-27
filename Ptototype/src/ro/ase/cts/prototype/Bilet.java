package ro.ase.cts.prototype;

public class Bilet implements Copiaza{
private int cod;
private String echipa;
private String ora;

	public Bilet(int cod, String echipa, String ora) {
	super();
	this.cod = cod;
	this.echipa = echipa;
	this.ora = ora;
}
	public Bilet() {};
	

	public void setCod(int cod) {
		this.cod = cod;
	}
	@Override
	public Copiaza copiaza() {
		Bilet bilet=new Bilet();
		bilet.cod=this.cod;
		bilet.echipa=this.echipa;
		bilet.ora=this.ora;
		return bilet;
	}
	@Override
	public String toString() {
		return "Bilet [cod=" + cod + ", echipa=" + echipa + ", ora=" + ora + "]";
	}
	

}
