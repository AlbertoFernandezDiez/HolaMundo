package com.ipartek.formacion.holamundo.pojo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AlumnoTest {

	@Test
	public void constructorVacio() {

		Alumno a = new Alumno();

		assertEquals(Alumno.NOMBRE_ANONIMO, a.getNombre());
		assertEquals("", a.getApellidos());
		assertFalse(a.isBecado());
		assertEquals(0, a.getEdad());
		assertEquals(Alumno.SEXO_INDEFINIDO, a.getSexo());
		

	
	}

	@Test
	public void testAlumnoString() {
		Alumno a = new Alumno("agapito");

		assertTrue("agapito".equals(a.getNombre()));
		assertEquals("",a.getApellidos() );
		assertTrue("".equals(""));
		assertFalse(a.isBecado());
		assertTrue(a.getEdad() == 0);
		assertTrue(a.getSexo() == Alumno.SEXO_INDEFINIDO);

		
	}

	@Test
	public void testSetNombre() {
		Alumno a = new Alumno();
		a.setNombre("agapito");
		assertEquals("Agapito",a.getNombre());
	}

	@Ignore
	public void testIsMayorEdad() {
		fail("Not yet implemented");
		Alumno a = new Alumno();
		assertFalse(a.getEdad() >= 18);
		
		a.setEdad(25);
		
		assertTrue(a.getEdad() >= 18);

		
	}

}
