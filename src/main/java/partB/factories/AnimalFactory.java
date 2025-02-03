package partB.factories;


import partB.animals.Cat;
import partB.storage.CatHouse;
import partB.storage.DogHouse;
import partB.animals.Dog;

import java.util.Date;

public class AnimalFactory {
    public static Dog createDog(String name, Date birthDate) {
        Integer newId = DogHouse.getNumberOfDogs();
        return new Dog(name, birthDate, newId);
    }

    public static Cat createCat(String name, Date birthDate) {
        Integer newId = CatHouse.getNumberOfCats();
        return new Cat(name, birthDate, newId);
    }

    public static void main(String[] args) {
        Date a = new Date();
        Cat cat = createCat("Willow", a);
        System.out.println(cat.getName());
        System.out.println(cat.getBirthDate());
        Dog dog = createDog("Willow", a);
        System.out.println(dog.getName());
        System.out.println(dog.getBirthDate());
    }
}
