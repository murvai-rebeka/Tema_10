package AnimalRescue;

public class Adopter extends Person{

    private int money;

    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money = money;
    }

    @Override
    public void talk(){
        System.out.println("The adopter talks");
    }
}

