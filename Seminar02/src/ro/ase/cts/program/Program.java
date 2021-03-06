package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;


import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.ReadAplicanti;
import ro.ase.cts.clase.readers.ReaderAngajat;

public class Program {
	public static List<Aplicant> citesteAplicanti( ReadAplicanti readerAplicanti) throws FileNotFoundException{
		List<Aplicant> listaAplicanti=readerAplicanti.readAplicant();
		return listaAplicanti;
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti( new ReaderAngajat("angajati.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
