package AnimalRescue;

public class AnimalFood {
    private String dogFood = "RoyalCanin";
    private int price = 79;
    private int quantity = 10;
    private String availabilityInStock = "available";

    public String getDogFood() {
        return dogFood;
    }

    public void setDogFood(String dogFood) {
        this.dogFood = dogFood;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAvailabilityInStock() {
        return availabilityInStock;
    }

    public void setAvailabilityInStock(String availabilityInStock) {
        this.availabilityInStock = availabilityInStock;
    }


}
