package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {

	List<IComanda> comenzi;

	public ManagerComenzi() {
		super();
		this.comenzi=new ArrayList<IComanda>();
	}
	public void invoca(IComanda comanda)
	{
		comenzi.add(comanda);
	}
	
	public void executaComanda()
	{
		if(comenzi.size()>0) {
		comenzi.get(0).executa();
		comenzi.remove(0);
		}else
			System.out.println("Nu exista comenzi");
	}
	
	public void executaComenzi() {
		for(IComanda c: comenzi)
			c.executa();
		comenzi.clear();
	}
}
