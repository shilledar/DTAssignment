/**
 * 
 */
package com.singtel.dtassignment.model;

/**
 * @author mshafi
 * Model Chicken.
 */
public class Chicken extends Bird {

	/**
	 * Constructor.
	 */
	public Chicken() {
		this("Cluck, cluck", true, false, false); 
	}

	/**
	 * Argument constructor.
	 * @param sound
	 * @param canWalk
	 * @param canSwim
	 * @param canFly
	 */
	public Chicken(String sound, boolean canWalk, boolean canSwim, boolean canFly) {
		super(sound, canWalk, canSwim, canFly);
	}

}
