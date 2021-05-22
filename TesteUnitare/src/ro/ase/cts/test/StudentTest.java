package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.Student;

public class StudentTest {

	@Test
	public void testConsturctorCuParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}

	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();
		// verifica daca numele nu este null
		assertNotNull("Numele este null", student.getNume());
		assertNotNull("Lista de note nu este initializata!", student.getNote());
	}

	@Test
	public void testeAdaugaNota() {
		Student student = new Student();
		int nota = 7;
		student.adaugaNota(7);

		assertEquals(nota, student.getNota(0));

	}

	@Test
	public void testDimensiuneListaNote() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());

	}

	@Test
	public void testCalculeazaMedia() {
		Student student = new Student();
		int nota1 = 5;
		int nota2 = 10;
		student.adaugaNota(nota1);
		student.adaugaNota(nota2);
		float medie1 = student.calculeazaMedie();
		// trebuie sa fie float
		float medie2 = (nota1 + nota2) / 2.0f;
		assertEquals(medie2, medie1, 0.001);

	}

	@Test
	public void testAreRestante() {
		Student student = new Student();
		student.adaugaNota(1);
		student.adaugaNota(6);
		assertTrue(student.areRestante());
	}

	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(6);
		assertFalse(student.areRestante());
	}

	@Test
	public void testSetNume() {
		Student student = new Student();
		String nume = "Gigel";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaAruncaExceptie() {
		Student student = new Student();
		student.getNota(-1);

	}

	@Test
	public void testGetNotaAruncaExceptie2() {
		Student student = new Student();
		// 1
		try {
			// 2
			student.getNota(student.getNota(-1));
			// 3 nu este executata
			fail("Metoda nu arunca execptia!");
		} catch (IndexOutOfBoundsException exception) {
			// 4 este executata
		} catch (Exception exception) {
			// 5 nu este executata
			fail("Metoda nu arunca INdexOutOfBounds, ci alt tip de exceptie");
		}
		// 6 este executata

	}

	@Test(expected=IllegalArgumentException.class)
	public void testNoteNegative() {
		Student student=new Student();
	
		student.adaugaNota(-7);
	
	}
	@Test(expected=IllegalArgumentException.class)
	public void testNoteSuperioare() {
		Student student=new Student();
	
		student.adaugaNota(20);
	
	}	
	
}
