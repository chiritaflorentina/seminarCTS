package ro.ase.cts.decorator;

public class Card implements CardAbstract {

	private String titular;
	private int sold;
	
	public Card(String titular, int sold) {
		super();
		this.titular = titular;
		this.sold = sold;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	@Override
	public void realizeazaPlataOnline(int suma) {
		// TODO Auto-generated method stub

		if(sold>suma) {
			sold=sold-suma;
			System.out.println("A platit online "+suma);
		}else
			System.out.println("Fonduri insuficiente!");
	}

	@Override
	public void realizeazaPlataNormala(int suma) {
		// TODO Auto-generated method stub
		if(sold>suma) {
			sold=sold-suma;
			System.out.println("A platit normal "+suma);
		}else
			System.out.println("Fonduri insuficiente!");
	}

}
