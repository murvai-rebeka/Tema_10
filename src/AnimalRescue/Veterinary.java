package AnimalRescue;

public class Veterinary extends Person{

    private String specialization = "Vet Doctor";


    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }

    @Override
    public void talk(){
        System.out.println("The veterinary talks");
    }
}
