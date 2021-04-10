package ro.ase.cts.decorator;

public class DecoratorConcret extends DecoratorAbstract {

	public DecoratorConcret(Card card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactLess(int suma) {
		// TODO Auto-generated method stub
		if (super.getCard().getSold() > suma) {
			System.out.println("A facut plata prin contactless: " + suma);
			super.getCard().setSold(super.getCard().getSold() - suma);

		}else
			System.out.println("Fonduri insuficiente!");

	}

}
