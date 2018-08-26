/**
 * 
 */
package com.singtel.dtassignment.model;

/**
 * @author mshafi
 * Model Clownfish.
 */
public class Clownfish extends Fish {

	/**
	 * Constructor.
	 */
	public Clownfish() {
		// TODO Auto-generated constructor stub
		this("small", "orange", true, false);
	}
	
	/**
	 * Argument Constructor.
	 * @param size
	 * @param colour
	 * @param makeJokes
	 * @param eatsOtherFish
	 */
	public Clownfish(String size, String colour, boolean makeJokes, boolean eatsOtherFish) {
		super(size, colour, makeJokes, eatsOtherFish);
	}

}
