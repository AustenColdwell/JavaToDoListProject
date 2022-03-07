package com.qa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No list item found with that id.")
public class ItemNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8853423601635115361L;
	
	public ItemNotFoundException(String str) {
		super(str);
	}

}
