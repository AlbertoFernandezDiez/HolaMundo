package com.ipartek.formacion.holamundo.pruebas;

import java.util.Random;

/**
 * Clase java para simular un Dado y sacar un alumno de modo aleatorio
 * 
 * @author Curso
 *
 */
public class Dado {

	public static int number = 0;
	/**
	 * Variable para representar el numero de alumnos static: Solo se reserva
	 * memoria una vez final: No es modificable int: Tipo Integer (Numero
	 * entero)
	 */
	public static final int NUMERO_ALUMNOS = 15;
	public static final String[] NOMBRES_ALUMNNOS = { 
			"David Ibarzabal", 
			"Oscar ", 
			"Gorka",
			"Ariane",
			"Gontzal",
			"Aitor",
			"Santi",
			"Raul",
			"David Ortiz",
			"Sergio",
			"David Barbudo",
			"Edorta",
			"Asier",
			"Alberto",
			"Iñigo"
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mostrarAlumnos();

		mostrarAfortunado();
	}

	/**
	 * Muestra por pantalla el nombre del
	 * <strong>afortunado</strong> alumno que va a leer.
	 */
	public static void mostrarAfortunado() {
		System.out.println("El afortunado en leer es:");
		
		int alumnoAfortunado = generarNumero();
		 
		System.out.println(NOMBRES_ALUMNNOS[alumnoAfortunado]);
	}
	
	

	/**
	 * Obtenemos un afortunado o voluntario para leer de forma aleatoria
	 * @return Nombre del afortunado, en caso de fallo retorna "No hay un afortunado"
	 */
	public static String mostrarAfortunadoString() {
		String result = "No hay un afortunado";
		
		int alumnoAfortunado = generarNumero();
		 
		result = NOMBRES_ALUMNNOS[alumnoAfortunado];
		
		return result;
	}

	/**
	 * Obtenemos un afortunado o voluntario para leer de forma aleatoria segun el numero que pasamos por parametro
	 * @param numeroAleatorio	<code>int</code> numero aleatorio que debe estar dentro del rango 0 - (<code>NUMERO_ALUMNOS</code> - 1)
	 * @return	Nombre del afortunado, en caso de fallo retorna "No hay un afortunado"
	 */
	public static String mostrarAfortunadoString(int numeroAleatorio) {
		String result = "No hay un afortunado";
		 
		result = NOMBRES_ALUMNNOS[numeroAleatorio];
		
		return result;
	}

	
	/**
	 * Genera un numero aleatorio entre 0 y <code>NUMERO_ALUMNOS</code>
	 * @return	numero entero, si falla -1
	 */
	public static int generarNumero(){
		int number = -1;
		
		Random random = new Random();

		number = random.nextInt(NUMERO_ALUMNOS);
		
		return number;
	}
	
	
	/**
	 * Muestra por consola todos los alumnos de la variable <code>NOMBRES_ALUMNOS</code>.<br>
	 * ejemple:
	 * <ul>
	 * <li>	[0] David Ibarzabal</li>
	 * <li>	[1] Oscar</li>
	 * <li>	[x] ....</li>
	 * <li>	[14] Iñigo</li>
	 * </ul>
	 */
	 public static void mostrarAlumnos(){
		 for (int i = 0;i < NOMBRES_ALUMNNOS.length; i++) {
			System.out.println("["+ i +"]\t" + NOMBRES_ALUMNNOS[i]);
		}
	}

}
