/**
 * 
 */
package com.singtel.dtassignment.model;

/**
 * @author mshafi
 * Model Rooster.
 */
public class Rooster implements Animal {

	/**
	 * Rooster uses Bird association instead of inheritance.
	 */
	private Bird bird = new Bird("Cock-a-doodle-doo", true, false, true);

	/* (non-Javadoc)
	 * @see com.singtel.dtassignment.model.Animal#walk()
	 */
	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		return bird.walk();
	}

	/* (non-Javadoc)
	 * @see com.singtel.dtassignment.model.Animal#fly()
	 */
	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return bird.fly();
	}

	/* (non-Javadoc)
	 * @see com.singtel.dtassignment.model.Animal#swim()
	 */
	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return bird.swim();
	}

	/* (non-Javadoc)
	 * @see com.singtel.dtassignment.model.Animal#sing()
	 */
	@Override
	public String sing() {
		// TODO Auto-generated method stub
		return bird.sing();
	}

}
