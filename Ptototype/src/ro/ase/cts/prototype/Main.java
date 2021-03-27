package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client =new Client("Marcel ", 23);
		Client client2=(Client) client.copiaza();
		System.out.println(client);
		System.out.println(client2);
		Bilet bilet1=new Bilet(23, "Echipa1", "22");
		Bilet bilet2=(Bilet) bilet1.copiaza();
		System.out.println(bilet1.toString());
		System.out.println(bilet2.toString());
		bilet1.setCod(12);
		bilet2.setCod(13);
		System.out.println(bilet1.toString());
		System.out.println(bilet2.toString());
	}

}
