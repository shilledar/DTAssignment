/**
 * 
 */
package com.singtel.dtassignment.model;

/**
 * @author mshafi
 * Model Dog.
 * 
 */
public class Dog implements Animal {
	
	private String sound;
	private boolean canWalk;
	private boolean canSwim;
	private boolean canFly;

	/**
	 * Constructor.
	 */
	public Dog() {
		this("Woof woof", true, false, false);
	}

	/**
	 * Argument Constructor.
	 * @param sound
	 * @param canWalk
	 * @param canSwim
	 * @param canFly
	 */
	public Dog(String sound, boolean canWalk, boolean canSwim, boolean canFly) {
		super();
		this.sound = sound;
		this.canWalk = canWalk;
		this.canSwim = canSwim;
		this.canFly = canFly;
	}

	/* (non-Javadoc)
	 * @see com.singtel.dtassignment.model.Animal#walk()
	 */
	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		return this.canWalk;
	}

	/* (non-Javadoc)
	 * @see com.singtel.dtassignment.model.Animal#fly()
	 */
	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return this.canFly;
	}

	/* (non-Javadoc)
	 * @see com.singtel.dtassignment.model.Animal#swim()
	 */
	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return this.canSwim;
	}

	/* (non-Javadoc)
	 * @see com.singtel.dtassignment.model.Animal#sing()
	 */
	@Override
	public String sing() {
		// TODO Auto-generated method stub
		return this.sound;
	}

}
