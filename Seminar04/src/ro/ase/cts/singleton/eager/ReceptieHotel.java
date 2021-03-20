package ro.ase.cts.singleton.eager;

public class ReceptieHotel {

	private String numeReceptionier;
	private int etaj;
	private String numeHotel;
	private static final ReceptieHotel instanta=new ReceptieHotel("Ion", 4, "Muntenia");
	
	//CONSTRUCTORUL TREBUIE SA FIE PRIVAT PENTRU A PUTEA CREA O SINGURA INSTANTA
	private ReceptieHotel(String numeReceptionier, int etaj, String numeHotel) {
		super();
		this.numeReceptionier = numeReceptionier;
		this.etaj = etaj;
		this.numeHotel = numeHotel;
	}

	
	public void setNumeReceptionier(String numeReceptionier) {
		this.numeReceptionier = numeReceptionier;
	}

	

	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}

	

	public void setNumeHotel(String numeHotel) {
		this.numeHotel = numeHotel;
	}

	@Override
	public String toString() {
		return "ReceptieHotel [numeReceptionier=" + numeReceptionier + ", etaj=" + etaj + ", numeHotel=" + numeHotel
				+ "]";
	}


	public static ReceptieHotel getInstanta() {
		return instanta;
	}

	
	
	
}
