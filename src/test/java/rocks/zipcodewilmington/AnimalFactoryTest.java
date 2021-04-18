package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        AnimalFactory factory = new AnimalFactory();
        Date date = new Date();
        Dog dog = factory.createDog("Buster", date);
        String expected = "Buster";
        String actual = dog.getName();
        Date expectedDate = date;
        Date actualDate = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedDate, actualDate);
    }
    @Test
    public void testCreateCat() {
        AnimalFactory factory = new AnimalFactory();
        Date date = new Date();
        Cat cat = factory.createCat("Rascal", date);
        String expected = "Rascal";
        String actual = cat.getName();
        Date expectedDate = date;
        Date actualDate = cat.getBirthDate();

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
