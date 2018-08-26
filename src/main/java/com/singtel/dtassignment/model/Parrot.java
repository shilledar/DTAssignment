/**
 * 
 */
package com.singtel.dtassignment.model;

/**
 * @author mshafi
 * Model Parrot.
 */
public class Parrot extends Bird {

	/**
	 * Method returning the sound based on the animal it stays.
	 * @param animal the animal it stays with.
	 * @return the sound of the animal it stays with.
	 */
	public String sing(Animal animal) {
		return animal.sing();
	}

}
