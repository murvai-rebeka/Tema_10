import AnimalRescue.*;

public class Tema_14 {
    public static void main(String args[]) {
        Animal animal = new Animal();
        animal.eat();
        Cat cat = new Cat();
        cat.eat();
        Dog dog = new Dog();
        dog.eat();

        Food food = new Food();
        food.heating();
        AnimalFood animalFood = new AnimalFood();
        animalFood.heating();


        Person person = new Person();
        person.talk();
        Adopter adopter = new Adopter();
        adopter.talk();
        Veterinary veterinary = new Veterinary();
        veterinary.talk();

    }
}
