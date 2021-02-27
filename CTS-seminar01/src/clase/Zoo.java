package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo  {
 private Zookeeper z;
 private List<Animal> animals;
public Zoo(Zookeeper z, List<Animal> animals) {
	super();
	this.z = z;
	this.animals = animals;
}
public Zoo() {
	super();
	this.z=new Zookeeper("Ion");
	//List e abstract, trebuie ArrayList la initializare
	this.animals=new ArrayList<Animal>();	

}

//metoda care permite adaugarea unuui animal in colectia noastra
public void adaugareAnimal(Animal a)
{
	this.animals.add(a);
}

public void hranesteAnimal() {
	for(Animal a : this.animals)
	{
		this.z.feed(a);
		
	}
	}

public void mers() {
	for(Animal a : this.animals)
	{
		a.merge();
		
	}	
}

}
