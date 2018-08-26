/**
 * 
 */
package com.singtel.dtassignment.model;

/**
 * @author mshafi
 * Model Duck.
 */
public class Duck extends Bird { 
	
	/**
	 * Constructor.
	 */
	public Duck() {
		this("Quack, Quack", true, true, false); 
	}

	/**
	 * Argument constructor.
	 * @param sound
	 * @param canWalk
	 * @param canSwim
	 * @param canFly
	 */
	public Duck(String sound, boolean canWalk, boolean canSwim, boolean canFly) {
		super(sound, canWalk, canSwim, canFly);
	}

}
