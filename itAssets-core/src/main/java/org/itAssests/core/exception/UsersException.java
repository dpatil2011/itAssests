package org.itAssests.core.exception;

import java.util.List;

import com.anabatic.generic.core.exception.GeneralException;

public class UsersException extends GeneralException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsersException() {
		super();
	}
	
	 public UsersException(List<com.anabatic.generic.core.exception.Error> errors, int httpStatus) {
	        super(errors, httpStatus);
	    }

	    public UsersException(String message, Throwable t) {
	        super(message, t);
	    }

	    public UsersException(com.anabatic.generic.core.exception.Error error) {
	        super(error);
	    }

}
