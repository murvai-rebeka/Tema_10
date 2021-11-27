package AnimalRescue;

public abstract class Animal {

    private String breed;
    private byte age;
    private float weight;
    private int heightInCm;
    private String name;
    private String color;
    private byte healthStatus;
    private byte hungerLevel;
    private byte spiritLevel;
    private String favFood;
    private String favActivities;

    public String getBreed() {
        return breed;
    }

    public void setBread(String breed) {
        this.breed = breed;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(byte healthStatus) {
        this.healthStatus = healthStatus;
    }

    public byte getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(byte hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public byte getSpiritLevel() {
        return spiritLevel;
    }

    public void setSpiritLevel(byte spiritLevel) {
        this.spiritLevel = spiritLevel;

    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String getFavActivities() {
        return favActivities;
    }

    public void setFavActivities(String favActivities) {
        this.favActivities = favActivities;
    }

    public abstract void eat();


}
