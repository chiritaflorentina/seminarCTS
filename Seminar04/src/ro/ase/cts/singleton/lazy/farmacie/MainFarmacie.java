package ro.ase.cts.singleton.lazy.farmacie;

public class MainFarmacie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Farmacie farmacie1=Farmacie.getInstanta("Catena", 8, 1000);
		Farmacie farmacie2=Farmacie.getInstanta("Dona", 10, 1200);
		System.out.println(farmacie1.toString());
		System.out.println(farmacie2.toString());
		farmacie1.setNumeFarmacie("Farmacie");
		farmacie2.setPret(3000);
		System.out.println(farmacie1.toString());
		System.out.println(farmacie2.toString());
	}

}
