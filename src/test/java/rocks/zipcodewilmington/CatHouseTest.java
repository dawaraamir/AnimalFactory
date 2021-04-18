package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testAdd() {
        String name = "Rascal";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        CatHouse.add(animal);
        Assert.assertEquals(new Integer(1), CatHouse.getNumberOfCats());
    }

    @Test
    public void testRemove() {
        String name = "Rascal";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        CatHouse.add(animal);
        CatHouse.remove(animal);
        Assert.assertNull(CatHouse.getCatById(8));
    }

    @Test
    public void testRemoveInt() {
        String name = "Rascal";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(animal);
        CatHouse.remove(8);
        Assert.assertNull(CatHouse.getCatById(8));
    }
    @Test
    public void testGetCatById() {
        Cat cat1 = new Cat("Rascal", new Date(), 8);
        CatHouse.add(cat1);
        Cat expected = cat1;
        Cat actual = CatHouse.getCatById(8);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetNumberOfCats() {
        String name = "Rascal";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(animal);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
}
