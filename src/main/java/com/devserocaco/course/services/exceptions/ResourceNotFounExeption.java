package com.devserocaco.course.services.exceptions;

public class ResourceNotFounExeption extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFounExeption(Object id) {
		super("Resource not found. Id: " + id);
	}

}
