package AnimalRescue;

public class Dog extends Animal{
    public void bark(){
        System.out.println("WauWau");
    }
    @Override
    public void eat(){
        System.out.println("The dog eats");
    }
}
