package partB.animals;

import partB.food.Food;

import java.util.Date;

public class Dog extends Mammal {
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public Dog(String name, Integer id) {
        super(name, id);
    }
    public String speak() {
        return "bark!";
    }
    public void setName(String name){
        super.setName(name);

    }
    public void setBirthDate(Date birthDate){
        super.setBirthDate(birthDate);
    }
    public void eat(Food food){
        super.eat(food);
    }
    public Integer getId(){
        return super.getId();
    }

    public void main(String[] args) {
        Animal myDog = new Dog("esdf ",1);
        if (myDog instanceof Animal) {
            System.out.println("myCat is an instance of Animal.");
        } else {
            System.out.println("myCat is NOT an instance of Animal.");
        }

        if (myDog instanceof Mammal) {
            System.out.println("myCat is an instance of Mammal.");
        } else {
            System.out.println("myCat is NOT an instance of Mammal.");
        }
    }

}
