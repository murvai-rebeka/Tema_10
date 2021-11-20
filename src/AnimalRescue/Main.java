package AnimalRescue;

public class Main {
    public static void main(String args[]) {
        Animal animal = new Animal();
        animal.setBread("ghh");
        animal.setAge((byte) 2);
        animal.setWeight(9.0F);
        animal.setHeightInCm(50);
        animal.setName("Goldy");
        animal.setColor("Brown");
        animal.setHealthStatus((byte) 8);
        animal.setHungerLevel((byte) 6);
        animal.setSpiritLevel((byte) 9);
        animal.setFavFood("Royalcanin");
        animal.setFavActivities("running");


        System.out.println("Animal name is: " + animal.getName() + ", age: " + animal.getAge()
                + ", weight: " + animal.getWeight() + ", breed: " + animal.getBreed() + ", height: " + animal.getHeightInCm()
                + ", color: " + animal.getColor() + ", healt: " + animal.getHealthStatus() + ", hunger: "
                + animal.getHungerLevel() + ", spirit: " + animal.getSpiritLevel() + ", favFood: " + animal.getFavFood()
                + ", activities: " + animal.getFavActivities());

        Adopter adopter = new Adopter();
        adopter.setName("Rebeka");
        adopter.setMoney(50);
        System.out.println("Adopter name is: " + adopter.getName() + ", has money: " + adopter.getMoney() + " ron");

        AnimalFood animalFood = new AnimalFood();
        animalFood.setDogFood("RoyalCanin");
        animalFood.setPrice(50);
        animalFood.setQuantity(10);
        animalFood.setAvailabilityInStock("available");

        System.out.println("The dog food name is: " + animalFood.getDogFood() + ", The price is: "
                + animalFood.getPrice() + ", quantity is: " + animalFood.getQuantity() + ", Stock: "
                + animalFood.getAvailabilityInStock());

        RecreationActivity activity = new RecreationActivity();
        activity.setActivity("Sleeping");


        System.out.println("Favourite activity is: " + activity.getActivity());


        Veterinary veterinary = new Veterinary();
        veterinary.setName("Paul");
        veterinary.setSpecialization("Vet Doctor");

        System.out.println("The doctor name is: " + veterinary.getName() + ", Specialization: "
                + veterinary.getSpecialization());
        Cat cat = new Cat();
        cat.setName("Macy");
        cat.meow();
        cat.huntingMouse();
        cat.purrs();

        Dog dog = new Dog();
        dog.setName("Jackie");
        dog.bark();

        Person person = new Person();
        person.setName("Rebeka");


    }
}