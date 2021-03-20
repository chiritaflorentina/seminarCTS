package ro.ase.cts.singleton.lazy;

public class ReceptieHotel {

	private String numeReceptionier;
	private int etaj;
	private String numeHotel;
	private static ReceptieHotel instanta=null;
	
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


	public static synchronized ReceptieHotel getInstanta(String numeReceptionier, int etaj, String numeHotel) {
		if(instanta==null)
		{
			instanta=new ReceptieHotel(numeReceptionier, etaj, numeHotel);
		}
		return instanta;
	}

	
}
