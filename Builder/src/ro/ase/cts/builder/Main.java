package ro.ase.cts.builder;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//ce dezavantaj are aceasta versiune?
		//nu putem creea mai multe obiecte cu acelasi builder deoarece facem shallow copy
		//pt fiecare obiect de tip rezervare cream un alt builder
		
		Rezervare rezervare=new Rezervare(123, false, false, true, true, "pop");
		//build se pune la final, dupa set
		//pt ca set returneaza ConcretBuider, iar Build returneaza obiectul concret
		Rezervare rezervare2= new RezervareBuilder().setCodRezervare(12).setAreBauturaInclusa(true).setAreMancareInclusa(false).setAreScaunErgonomic(false).setGenMuzica("rock").build();
		Rezervare rezervare3=new RezervareBuilder().setCodRezervare(13).setAreMancareInclusa(true).build();
		
	System.out.println(rezervare.toString());
	System.out.println(rezervare2.toString());
	System.out.println(rezervare3.toString());
	Rezervare r4=new RezervareBuilder(4).build();
	System.out.println(r4.toString());
	
	//cea de a doua versiunenu mai facem shallow copy
	//in metods build instantiem o noua instanta
	//apelul constructorlui se face in build
	

	}

}
