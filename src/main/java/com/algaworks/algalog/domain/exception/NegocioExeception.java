package com.algaworks.algalog.domain.exception;

public class NegocioExeception extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public NegocioExeception(String message) {
		super(message);
	}

}
