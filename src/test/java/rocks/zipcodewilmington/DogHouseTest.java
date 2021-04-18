package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`


    @Test
    public void testAdd() {
        String name = "Buster";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);
        Assert.assertEquals(new Integer(1), DogHouse.getNumberOfDogs());
    }

    @Test
    public void testRemove() {
        String name = "Buster";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);
        DogHouse.remove(animal);
        Assert.assertNull(DogHouse.getDogById(24));
    }

    @Test
    public void testRemoveInt() {
        String name = "Buster";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);
        DogHouse.remove(24);
        Assert.assertNull(DogHouse.getDogById(24));
    }
    @Test
    public void testGetDogById() {
        Dog cat1 = new Dog("Buster", new Date(), 24);
        DogHouse.add(cat1);
        Dog expected = cat1;
        Dog actual = DogHouse.getDogById(24);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Buster";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
