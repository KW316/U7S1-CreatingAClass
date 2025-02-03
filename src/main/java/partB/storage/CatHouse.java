package partB.storage;


import partB.animals.Animal;
import partB.animals.Cat;
import partB.animals.Mammal;

import java.util.Date;

public class CatHouse {
    private static AnimalWarehouse<Cat> catHouse = new AnimalWarehouse<>();

    public static void add(Cat cat) {
        catHouse.add(cat);
    }

    public static void remove(Integer id) {
        catHouse.removeAnimalById(id);
    }

    public static void remove(Cat cat) {
        catHouse.removeAnimal(cat);
    }

    public static Cat getCatById(Integer id) {
        return catHouse.getAnimalById(id);
    }

    public static Integer getNumberOfCats() {
        return catHouse.getNumberOfAnimals();
    }

    public static void clear() {
        catHouse.clear();
    }

    public static void main(String[] args) {
        CatHouse catHouse = new CatHouse();
        Date a = new Date();
        Cat cat1 = new Cat("Asf",a,3);
        catHouse.getNumberOfCats();
        Integer v = 3;
        catHouse.remove(catHouse.getCatById(3));
        catHouse.remove(3);
        catHouse.getCatById(3);
       catHouse.add(cat1);
    }
}
