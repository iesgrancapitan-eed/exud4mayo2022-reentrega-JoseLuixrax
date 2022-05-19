package com.jlpl.eed.examen.OptimizacionYDocumentacion;
/**
 * Excepcion que es lanzada si la edad del perro es errónea.
 * 
 * @author Jose Luis Pérez Lara
 *	
 */
public class EdadErroneaException extends Exception {
	/**
	 * Crea la Excepcion que se lanza que deriva de Exception.
	 * @param message	Mensaje que devuelve la Excepcion.
	 */
	public EdadErroneaException(String message) {
		super(message);
	}
}
