package com.bspdev.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException { //superclasse não obriga a tratar uma exceção

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id); //Chama a classe RuntimeException passando o texto especificado.
	}
}
