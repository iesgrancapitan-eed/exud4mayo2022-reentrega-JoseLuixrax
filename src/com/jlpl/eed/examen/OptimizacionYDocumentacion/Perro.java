package com.jlpl.eed.examen.OptimizacionYDocumentacion;
/**
 * Clase Perro: Simula el comportamiento de un Perro.
 * 
 * @author Jose Luis Pérez Lara
 *
 *
 */
public class Perro extends Mascota {
	/**
	 * Atributo estatico de clase: GUAUUUUUUUUUU : Guarda el ladrido de un perro.
	 */
	private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
	/**
	 * Atributo de clase age: Guarda información sobre la edad del perro.
	 */
	private int age;
	/**
	 * Crea un objeto Perro a traves de su nombre y edad.
	 * @param name						Nombre del Perro
	 * @param age						Edad del Perro
	 * @throws EdadErroneaException		Lanzada si la edad del Perro es erronea.
	 */
	public Perro(String name, int age) throws EdadErroneaException {
		super();
		setAge(age);
		this.name = name;
	}
	/**
	 * Modifica la edad del Objeto Perro.
	 * @param age					Nueva edad del perro.
	 * @throws EdadErroneaException	Lanzada si la edad del Perro es erronea.
	 */
	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}
	/**
	 * Devuelve la edad del Perro.
	 * @return age 	Edad del Perro.
	 */
	public int getAge() {
		return this.age;
	}
	/**
	 * Devuelve el ladrido del perro.
	 * @return GUAUUUUUUUUUU 	Ladrido del perro.
	 */
	public String ladrar() {
		return GUAUUUUUUUUUU;
	}

}
