package com.ipartek.formacion.holamundo.pojo;

/**
 * Clase instaciable de tipo POJO o BEAN para representar a un
 * <code>Alumno</code> de un curso
 * 
 * @author Curso
 *
 */
public class Alumno {

	public static final String NOMBRE_ANONIMO = "Anonimo";
	public static final String NOMBRE_SIN_DEFINIR = "Sin Definir";
	public static final char SEXO_HOMBRE = 'H';
	public static final char SEXO_MUJER = 'M';
	public static final char SEXO_INDEFINIDO = 'I';
	
	
	// Atributos
	private String nombre;
	private String apellidos;
	private Boolean becado;
	private int edad;
	private char sexo;// 'H': Hombre, 'M': Mujer, 'I': Indefinido

	/*
	 * Constructores
	 *********************************/
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
		this.apellidos = "";
		this.becado = false;
		this.edad = 0;
		this.sexo = SEXO_INDEFINIDO;
	}

	/**
	 * Un <code>Alumno</code> recien instanciado tendra los siguientes valores:
	 * <ol>
	 * <li><code>nombre:</code> NOMBRE_ANONIMO</li>
	 * <li><code>apellido:</code> ""</li>
	 * <li><code>becado:</code> false</li>
	 * <li><code>edad:</code> 0</li>
	 * <li><code>sexo:</code> 'I'</li>
	 */
	public Alumno() {
		super();
		this.nombre = NOMBRE_ANONIMO;
		this.apellidos = "";
		this.becado = false;
		this.edad = 0;
		this.sexo = SEXO_INDEFINIDO;
	}
	
	

	/*
	 * Metodos
	 *********************************/

	public String getNombre() {
		return nombre;
	}

	/**
	 * Guardamos el nombre con la primera Inicial en mayusculas<br>
	 * Si el nombre es null o cadena vacia guardar "Sin definir";
	 * @param nombre	<String> nombre de la persona a guardar;
	 */
	public void setNombre(String nombre) {
		String aux =  (nombre == null || nombre.matches("")) ? aux = NOMBRE_SIN_DEFINIR : capitalize(nombre);  ;
		this.nombre = aux;
	}

	/**
	 * Capitaliza el String dado
	 * @param El string a capitalizar
	 * @return	Si es vacio o null devuelve una cadena vacia
	 */
	private String capitalize(String string) {
		String resul = "";
		
		try{
		//char primeraLetra = string.length() > 0 ? string.charAt(0) : ' ' ;
		char[] aux = string.toCharArray();
		if (aux.length > 0){
			//aux[0] = Character.toUpperCase(primeraLetra);
			aux[0] = Character.toUpperCase(aux[0]);
		}
		resul = String.valueOf(aux);
		}catch(NullPointerException e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return resul;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Boolean isBecado() {
		return becado;
	}

	public void setBecado(Boolean becado) {
		this.becado = becado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/*
	 * Funciones
	 *********************************/

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", becado=" + becado + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
	}

	/*
	 * Funcion pubilca que retorna un booleano diciendo si el alumno es mayor de
	 * edad
	 * 
	 */

	/**
	 * Comprueba si es mayor de edad
	 * 
	 * @return true <code>this.edad</code> > 18 , false en caso contrario
	 */
	public boolean isMayorEdad() {
		boolean resul = false;
		
		resul = this.edad >= 18;
		
		return resul;
	}
}