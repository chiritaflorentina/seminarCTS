package ro.ase.cts.builder;

public class RezervareBuilder implements AbstractBuilder {
	//Concretbuilder
		//implementeaza metoda build din interafta
	//Clasa concretBuilder are relatie de HAS A cu clasa Rezervare, 
	//deci are un atribut de tip Rezervare
	private Rezervare rezervare;
	
	
	
	public RezervareBuilder() {
		super();
		this.rezervare= new Rezervare(12345, true, true, false, false, "rock");
	}
	public RezervareBuilder(int cod) {
		super();
		this.rezervare= new Rezervare(cod, true, true, false, false, "rock");
	}


	

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return this.rezervare;
	}
	
	//setteri returneaza un obiect de tip builder
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		this.rezervare.setCodRezervare(codRezervare);
		return this;
	}
	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		this.rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}
	public RezervareBuilder setAreBauturaInclusa(boolean areBauturaInclusa) {

		this.rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}
	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}
	public RezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}
	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}

	
}
