/**
 * 
 */
package com.singtel.dtassignment.model;

/**
 * @author mshafi
 * Model Shark.
 */
public class Shark extends Fish {

	/**
	 * Constructor.
	 */
	public Shark(){
		this("Large", "Grey", false, true);
	}
	
	/**
	 * Argument Constructor.
	 * @param size
	 * @param colour
	 * @param makeJokes
	 * @param eatsOtherFish
	 */
	public Shark(String size, String colour, boolean makeJokes, boolean eatsOtherFish) {
		super(size, colour, makeJokes, eatsOtherFish);
	}

}
