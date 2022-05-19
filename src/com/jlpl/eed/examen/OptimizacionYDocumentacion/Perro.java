package com.jlpl.eed.examen.OptimizacionYDocumentacion;

public class Perro {
	private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
	private int age;
	private String name;

	public Perro(String name, int age) throws EdadErroneaException {
		setAge(age);
		this.name = name;
	}

	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String ladrar() {
		return GUAUUUUUUUUUU;
	}

	public String getName() {
		return name;
	}

}
