package ro.ase.cts.composite;

public interface Sediu {
public void descriere();
public void adaugaSediu(Sediu sediu) throws Exception;
public void stergeSediu(Sediu sediu) throws Exception;
//primeste ca parametru pozitia sediului
public Sediu getSediu(int poz) throws Exception;
}
