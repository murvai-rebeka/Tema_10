package AnimalRescue;

public class AnimalFood extends Food{
    private String dogFood = "RoyalCanin";


    public String getDogFood() {
        return dogFood;
    }

    public void setDogFood(String dogFood) {
        this.dogFood = dogFood;
    }

    @Override
    public void heating(){
        System.out.println("Stop heating animal food ");
    }


}
