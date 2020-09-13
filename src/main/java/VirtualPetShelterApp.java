import java.util.ArrayList;

public class VirtualPetShelterApp {
    public static void main(String[] args) {


        VirtualPetShelter shelter = new VirtualPetShelter();
        shelter.admitPet(new VirtualPet("Spot", "Dog", 5, 5, 5));
        shelter.admitPet(new VirtualPet("Fluffy", "Cat", 5, 5, 5));
        shelter.admitPet(new VirtualPet("Blaze", "Dog", 5, 5, 5));
        shelter.admitPet(new VirtualPet("Itchy", "Cat", 5, 5, 5));
        shelter.admitPet(new VirtualPet("Clifford", "Dog", 5, 5, 5));


    }
}
