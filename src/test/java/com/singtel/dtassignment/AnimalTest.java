package com.singtel.dtassignment;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.dtassignment.model.Animal;
import com.singtel.dtassignment.model.Butterfly;
import com.singtel.dtassignment.model.Cat;
import com.singtel.dtassignment.model.Chicken;
import com.singtel.dtassignment.model.Clownfish;
import com.singtel.dtassignment.model.Dog;
import com.singtel.dtassignment.model.Duck;
import com.singtel.dtassignment.model.Fish;
import com.singtel.dtassignment.model.Frog;
import com.singtel.dtassignment.model.Parrot;
import com.singtel.dtassignment.model.Rooster;
import com.singtel.dtassignment.model.Shark;

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
	
	/**
	 * Method to test animal counts which can fly,walk,sing and swim.
	 */
	@Test
    public void testAnimalCount() {
		int flyCount = 0;
		int walkCount = 0;
		int swimCount = 0;
		int singCount = 0;
		Animal[] animals = new Animal[]{
				 new Duck(),
				 new Chicken(),
				 new Rooster(),
				 new Parrot(),
				 new Fish(),
				 new Shark(),
				 new Clownfish(),
				 new Frog(),
				 new Dog(),
				 new Butterfly(),
				 new Cat()
				};
		for(Animal animal: animals) {
			if(animal.fly()){
				flyCount++;
			}
			if(animal.walk()){
				walkCount++;
			}
			if(animal.swim()){
				swimCount++;
			}
			if(animal.sing() != null){
				singCount++;
			}
		}
		System.out.println("Fly Count: " + flyCount);
		System.out.println("Walk Count: " + walkCount);
		System.out.println("Swim Count: " + swimCount);
		System.out.println("Sing Count: " + singCount);
    }

}
