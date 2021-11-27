package AnimalRescue;

public class Cat extends Animal {
    public void meow() {
        System.out.println("Meow");

    }

    public void purrs() {
        System.out.println("Grrrrrrr");
    }

    public void huntingMouse() {
        System.out.println("huntingMouse");
    }

    @Override
    public void eat(){
        System.out.println("The cat eats");
    }

}
