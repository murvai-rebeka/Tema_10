package AnimalRescue;

public class Main {
    public static void main(String args[]) {
        Animal animal = new Animal();
        System.out.println("Animal name is: " + animal.name + ", age: " + animal.age
                + ", weight: " + animal.weight + ", breed: " + animal.breed + ", height: " + animal.heightInCm
                + ", color: " + animal.color + ", healt: " + animal.healthStatus + ", hunger: "
                + animal.hungerLevel + ", spirit: " + animal.spiritLevel + ", favFood: " + animal.favFood
                + ", activities: " + animal.favActivities);

        Adopter adopter = new Adopter();
        System.out.println("Adopter name is: " + adopter.name + ", has money: " + adopter.money + " ron");

        AnimalFood animalFood = new AnimalFood();
        System.out.println("The dog food name is: " + animalFood.dogFood + ", The price is: "
                + animalFood.price + ", quantity is: " + animalFood.quantity + ", Stock: "
                + animalFood.availabilityInStock);

        RecreationActivity activity = new RecreationActivity();
        System.out.println("Favourite activity is: " + activity.activitie);

        Veterinary veterinary = new Veterinary();
        System.out.println("The doctor name is: " + veterinary.nameOfDoctor + ", Specialization: "
                + veterinary.specialization);


    }
}