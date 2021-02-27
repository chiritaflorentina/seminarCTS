package ro.ase.cts;

import clase.Animal;
import clase.Girafa;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zoo zoo=new Zoo();
		Animal z1=new Zebra("Zebra1");
		Animal z2=new Zebra("Zebra2");
		Animal g1=new Girafa("Girafa1");
		Animal g2=new Girafa("Girafa2", 150);
		zoo.adaugareAnimal(z1);
		zoo.adaugareAnimal(z2);
		zoo.adaugareAnimal(g1);
		zoo.adaugareAnimal(g2);
		zoo.hranesteAnimal();
		//diferenta dintre clasa abstracta si interfata-> o clasa abstracta trebuie implementate toate metodele abstracte, 
		//in interfata: metodele nu sunt definite, clasa care o implementeaza trebuie sa le defineasca
		// diferenta: in clasa abstracta putem da si o implementare a functiilor, pe cand in interfata nu
		// o intefata are DOAR METODE ABSTRACTE, nu metode implemnetate, NU CONTINE ATRIBUTE
		zoo.mers();
	}

}
