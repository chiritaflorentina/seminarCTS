package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.DecoratorAbstract;
import ro.ase.cts.decorator.DecoratorCntactLessTelefon;
import ro.ase.cts.decorator.DecoratorConcret;

public class Program {
public static void main(String[] args)
{
	Card card=new Card("Ion", 3000);
	card.realizeazaPlataNormala(100);
	card.realizeazaPlataOnline(150);
	DecoratorConcret cardNou=new DecoratorConcret(card);
	cardNou.platesteContactLess(200);
	cardNou.realizeazaPlataNormala(23);
	cardNou.realizeazaPlataOnline(12);
	DecoratorCntactLessTelefon cntactLessTelefon=new DecoratorCntactLessTelefon(card);
	cntactLessTelefon.platesteContactLess(100);
}
}
