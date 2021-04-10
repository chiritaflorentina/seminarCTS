package ro.ase.cts.decorator;

public class DecoratorCntactLessTelefon extends DecoratorAbstract {

	public DecoratorCntactLessTelefon(Card card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactLess(int suma) {
		// TODO Auto-generated method stub
		if(super.getCard().getSold()>suma)
		{
			System.out.println("Plata contactLess cu telefonul in suma de: "+suma);
			super.getCard().setSold(super.getCard().getSold()-suma);
		}
	}

}
