# DTAssignment
DTAssignment

Model Design:

Define base interface Animal which defines the contract for the implementation classes
Bird implements the base interface Animal
Chicken and Duck extends the features of Bird
Rooster uses association of Bird instead of inheritance
Parrot implementation: sings the same with the animal it stays and maintainable with other animals too.
Model swimming animals and animals that change behaviour over time.

Junit Test Case (AnimalTest.java) Test Results:

-- testAnimalCatSound: Test what cat says, and asserts to "Meow"
-- testParrotSoundwithAnimals: Test what parrot says with different animals like Cat,Dog and Rooster 
-- testAnimalCount : Test animal count who can fly,walk,swim and sing.
Fly Count: 3
Walk Count: 6
Swim Count: 5
Sing Count: 5

Rest API Service :

Rest API to query animal sound by passing the param animalName.

URL : http://localhost:8080/DTAssignment/rest/<AnimalName>
example : http://localhost:8080/DTAssignment/rest/Cat
OutPut : Cat says : Meow