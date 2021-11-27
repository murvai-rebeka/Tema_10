package AnimalRescue;

public class Food {
    private int price = 79;
    private int quantity = 10;
    private String availabilityInStock = "available";
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
    public void heating(){
        System.out.println("heating");
    }
}
