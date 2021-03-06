package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class ReadAplicanti {
	protected String fileName;
	
 public ReadAplicanti(String fileName) {
		super();
		this.fileName = fileName;
	}

public abstract List<Aplicant> readAplicant() throws FileNotFoundException;

}
