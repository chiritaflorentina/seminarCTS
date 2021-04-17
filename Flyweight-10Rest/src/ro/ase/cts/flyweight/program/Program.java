package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.Client;
import ro.ase.cts.flyweight.FlyweightFactory;
import ro.ase.cts.flyweight.Rezervare;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rezervare r1=new Rezervare(1,2,"12:00");
		Rezervare r2=new Rezervare(3,2,"14:00");
		Rezervare r3=new Rezervare(2,2,"17:00");
	FlyweightFactory flyweightFactory=new FlyweightFactory();
	Client c1= flyweightFactory.getClient("0722310889");
	c1.printeazaRezervare(r1);
	flyweightFactory.getClient("07224453253").printeazaRezervare(r2);
	flyweightFactory.getClient("0722310889").printeazaRezervare(r3);

	}

}
