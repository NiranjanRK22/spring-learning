package com.rentalapp.exception;
/**
 * 
 * @author NiranjanRamakrishna
 *
 */
public class PropertyNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PropertyNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
    /**
     * 
     * @param message
     */
	public PropertyNotFoundException(String message) {
		super(message);
		
	}
    
	
}
