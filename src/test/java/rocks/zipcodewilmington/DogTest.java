package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void testBirthDate() {
        // Given
        String givenName = "Buster";
        Date givenBirthDate = new Date();
        Integer givenId = 8;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Date retrievedDate = dog.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedDate);
    }

    @Test
    public void testSpeak() {
        // Given
        String givenName = "Buster";
        Date givenBirthDate = new Date();
        Integer givenId = 8;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedSpeak = dog.speak();

        Assert.assertEquals("bark!", retrievedSpeak);
    }

    @Test
    public void testEatFood() {
        // Given
        String givenName = "Buster";
        Date givenBirthDate = new Date();
        Integer givenId = 8;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        dog.eat(new Food());
        int expected = 1;
        int actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetId() {
        // Given
        String givenName = "Buster";
        Date givenBirthDate = new Date();
        Integer givenId = 8;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        int retrievedId = dog.getId();
        int actual = 8;
        Assert.assertEquals(actual, retrievedId);
    }
    @Test
    public void testInstanceAnimal() {
        // Given
        String givenName = "Buster";
        Date givenBirthDate = new Date();
        Integer givenId = 8;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void testInstanceMammal() {
        // Given
        String givenName = "Buster";
        Date givenBirthDate = new Date();
        Integer givenId = 8;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(dog instanceof Mammal);
    }
}
