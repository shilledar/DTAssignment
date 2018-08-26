/**
 * 
 */
package com.singtel.dtassignment.model;

/**
 * @author mshafi
 * Model Fish.
 */
public class Fish implements Animal {
	
	private String size;
	private String colour;
	private boolean makeJokes;
	private boolean eatsOtherFish;
	private String sound;
	private boolean canWalk;
	private boolean canSwim;
	private boolean canFly;

	/**
	 * Constructor.
	 */
	public Fish() {
		this("Large", "Grey", true , true);
	}

	/**
	 * Argument Constructor.
	 * @param size
	 * @param colour
	 * @param makeJokes
	 * @param eatsOtherFish
	 */
	public Fish(String size, String colour, boolean makeJokes, boolean eatsOtherFish) {
		super();
		this.size = size;
		this.colour = colour;
		this.makeJokes = makeJokes;
		this.eatsOtherFish = eatsOtherFish;
		this.sound = null;
		this.canWalk = false;
		this.canSwim = true;
		this.canFly = false;
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

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * @return the makeJokes
	 */
	public boolean isMakeJokes() {
		return makeJokes;
	}

	/**
	 * @param makeJokes the makeJokes to set
	 */
	public void setMakeJokes(boolean makeJokes) {
		this.makeJokes = makeJokes;
	}

	/**
	 * @return the eatsOtherFish
	 */
	public boolean isEatsOtherFish() {
		return eatsOtherFish;
	}

	/**
	 * @param eatsOtherFish the eatsOtherFish to set
	 */
	public void setEatsOtherFish(boolean eatsOtherFish) {
		this.eatsOtherFish = eatsOtherFish;
	}
	
}
