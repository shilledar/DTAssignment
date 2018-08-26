/**
 * 
 */
package com.singtel.dtassignment.model;

/**
 * @author mshafi
 * Model Frog.
 *
 */
public class Frog extends Fish {

	/**
	 * Constructor.
	 */
	public Frog() {
		// TODO Auto-generated constructor stub
		this("Small", "Green", false, false);
	}
	
	/**
	 * Argument Constructor.
	 * @param size
	 * @param colour
	 * @param makeJokes
	 * @param eatsOtherFish
	 */
	public Frog(String size, String colour, boolean makeJokes, boolean eatsOtherFish) {
		super(size, colour, makeJokes, eatsOtherFish);
	}

}
