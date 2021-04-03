package ro.ase.cts.builder;

public class RezervareBuilderV2 implements AbstractBuilder {

	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaAmbientala;
	private String genMuzica;
	
	
	public RezervareBuilderV2() {
		this.codRezervare=0;
		this.areBauturaInclusa=false;
		this.areMancareInclusa=false;
		this.areScaunErgonomic=true;
		this.areMuzicaAmbientala=true;
		this.genMuzica="pop";
	}
	public RezervareBuilderV2 setCod(int cod) {
		this.codRezervare=cod;
		return this;
	}

	public RezervareBuilderV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa=areMancareInclusa;
		return this;
	}
	public RezervareBuilderV2 setAreBauturaInclusa(boolean areBauturaInclusa) {

		this.areBauturaInclusa=areBauturaInclusa;
		return this;
	}
	public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic=areScaunErgonomic;
		return this;
	}
	public RezervareBuilderV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala=areMuzicaAmbientala;
		return this;
	}
	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica=genMuzica;
		return this;
	}

	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(codRezervare, areMancareInclusa, areBauturaInclusa, areScaunErgonomic, areMuzicaAmbientala, genMuzica);
		
	}

}
