package ro.ase.cts.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
private HashMap<String, Client> map;

public FlyweightFactory() {
	super();
	this.map =new HashMap<String, Client>();
}


public Client getClient(String nrTelefon) {
	Client client;
	client=map.get(nrTelefon);
	if(map.get(nrTelefon)==null)
	{
		 client=new Client("Ion", nrTelefon, "email");
		map.put(nrTelefon, client);
	}
	return client;
}
}
