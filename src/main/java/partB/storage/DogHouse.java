package partB.storage;


import partB.animals.Cat;
import partB.animals.Dog;

import java.util.Date;

public class DogHouse {
    private static AnimalWarehouse<Dog> dogHouse = new AnimalWarehouse<>();

    public static void add(Dog dog) {
        dogHouse.add(dog);
    }

    public static void remove(Integer id) {
        dogHouse.removeAnimalById(id);
    }

    public static void remove(Dog dog) {
        dogHouse.removeAnimal(dog);
    }

    public static Dog getDogById(Integer id) {
        return dogHouse.getAnimalById(id);
    }

    public static Integer getNumberOfDogs() {
        return dogHouse.getNumberOfAnimals();
    }

    public static void clear() {
        dogHouse.clear();
    }
    public static void main(String[] args) {
        DogHouse dogHouse = new DogHouse();
        Date a = new Date();
        Dog dog1 = new Dog("Asf",a,3);
        dogHouse.getNumberOfDogs();
        Integer v = 3;
        dogHouse.remove(dogHouse.getDogById(3));
        dogHouse.remove(3);
        dogHouse.getDogById(3);
        dogHouse.add(dog1);
    }
}