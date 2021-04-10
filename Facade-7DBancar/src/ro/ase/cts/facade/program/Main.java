package ro.ase.cts.facade.program;

import ro.ase.cts.facade.BirouDeCredite;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;
import ro.ase.cts.facade.VerificatorPersoana;

public class Main {
public static void main(String[] args) {
	Persoana persoana=new Persoana("Ion", "199047654392");
	//inainte de facade
	if(persoana.getVarsta()>=18)
	{
		if(Politie.esteUrmarit(persoana)) {
			BirouDeCredite birouDeCredite=new BirouDeCredite();
			if(birouDeCredite.areCredite(persoana))
				System.out.println("S-a creat contul");
		}
	}
		
	//cu Facade
	Persoana pers2=new Persoana("Maria", "1990654326769");
if(VerificatorPersoana.verificaPersoana(persoana))
	System.out.println("S-a creat contul");
else
	System.out.println("Nu s-a creat contul");
}
}
