package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.OperatorRezervare;
import ro.ase.cts.proxy.ProxyOperatorRezervari;

public class Program {
public static void main(String[] args)
{
	OperatorRezervare operator=new OperatorRezervare();
	operator.realizeazaRezervare("Maria", 1);
	ProxyOperatorRezervari proxy=new ProxyOperatorRezervari(operator, 4);
	proxy.realizeazaRezervare("Ion", 1);
	proxy.realizeazaRezervare("Mihai", 4);
}
}
