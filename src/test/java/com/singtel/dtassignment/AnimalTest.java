package com.singtel.dtassignment;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.dtassignment.model.Animal;
import com.singtel.dtassignment.model.Cat;
import com.singtel.dtassignment.model.Dog;
import com.singtel.dtassignment.model.Parrot;
import com.singtel.dtassignment.model.Rooster;

/**
 * @author mshafi
 * Test class to test Animals.
 */
public class AnimalTest {

	/**
	 * Method to test Cat animal sound. 
	 */
	@Test
    public void testAnimalCatSound() {
        Animal animal = new Cat();
        assertEquals(animal.sing(), "Meow");
    }
	
	/**
	 * Method to test sounds when parrot stays with cat,dog and rooster.
	 */
	@Test
    public void testParrotSoundwithAnimals() {
        Parrot parrotWithCat = new Parrot();
        Parrot parrotWithDog = new Parrot();
        Parrot parrotWithRooster = new Parrot();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Rooster rooster = new Rooster();
        assertEquals(parrotWithCat.sing(cat), "Meow");
        assertEquals(parrotWithDog.sing(dog), "Woof woof");
        assertEquals(parrotWithRooster.sing(rooster), "Cock-a-doodle-doo");
    }

}
