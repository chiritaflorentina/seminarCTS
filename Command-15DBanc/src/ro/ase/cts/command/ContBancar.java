package ro.ase.cts.command;

public class ContBancar {
private String iban;
private float sold;

public ContBancar(String iban, float sold) {
	super();
	this.iban = iban;
	this.sold = sold;
}

public void constituire(float sumaInitiala) {
	this.sold=sumaInitiala;
	System.out.println("Suma initiala este de: "+this.sold);
	
}

public void retragere(float suma)
{
	if(this.sold>=suma)
	{
		this.sold=sold-suma;
		System.out.println("Soldul ramas este "+sold);
		
	}else
		System.out.println("Fonduri insuficiente");
}
	public void depunere(float suma) {
		this.sold+=suma;
		System.out.println("Soldul dupa depunere  este: "+this.sold);
	}


}
