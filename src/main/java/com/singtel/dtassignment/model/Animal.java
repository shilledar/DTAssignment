/**
 * 
 */
package com.singtel.dtassignment.model;

/**
 * @author mshafi
 * Base interface defining the contract. 
 */
public interface Animal {
	/**
	 * Method describing walk behaviour.
	 * @return Return true if can walk else false.
	 * 
	 */
	public boolean walk();
	
	/**
	 * Method describing fly behaviour.
	 * @return Return true if can fly else false.
	 */
	public boolean fly();
	
	/**
	 * Method describing swim behaviour.
	 * @return Return true if can swim else false.
	 */
	public boolean swim();
	
	/**
	 * Method describing singing sound.
	 * @return String singing sound.
	 */
	public String sing();
	

}
