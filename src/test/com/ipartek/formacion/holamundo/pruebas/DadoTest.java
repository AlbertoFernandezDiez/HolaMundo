package com.ipartek.formacion.holamundo.pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

public class DadoTest {

	@Test
	public void testGenerarNumero() {

		int numAle = -1;
		for(int i = 0; i < 1000; i++){
			
			if (numAle == Dado.NUMERO_ALUMNOS){
				fail("Debe ser un numero menor");
			}
			
			numAle = Dado.generarNumero();
			assertTrue(numAle >= 0 && numAle < Dado.NUMERO_ALUMNOS);
		}
	}

}
