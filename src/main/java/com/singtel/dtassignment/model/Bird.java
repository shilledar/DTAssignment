/**
 * 
 */
package com.singtel.dtassignment.model;

/**
 * @author mshafi
 * Model Bird.
 */
public class Bird implements Animal {
	
	private String sound;
	private boolean canWalk;
	private boolean canSwim;
	private boolean canFly;
	
	/**
	 * Constructor.
	 */
	public Bird() {
		this(null, true, false, true);
	}
	
	/**
	 * Argument constructor.
	 * @param sound describes the type of sound
	 * @param canWalk describes behaviour walk
	 * @param canSwim describes behaviour swim
	 * @param canFly describes behaviour fly
	 */
	public Bird(String sound, boolean canWalk, boolean canSwim, boolean canFly) {
		super();
		this.sound = sound;
		this.canWalk = canWalk;
		this.canSwim = canSwim;
		this.canFly = canFly;
	}

	@Override
	public boolean walk() {
		// TODO Auto-generated method stub
		return this.canWalk;
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return this.canFly;
	}

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return this.canSwim;
	}

	@Override
	public String sing() {
		// TODO Auto-generated method stub
		return this.sound;
	}

}
