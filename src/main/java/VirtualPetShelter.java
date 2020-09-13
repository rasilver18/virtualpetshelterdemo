import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {


    private Map<String, VirtualPet> shelterPets = new HashMap<>();
    public void admitPet (VirtualPet newPet){
        shelterPets.put(newPet.getPetName(), newPet);
    }


    public VirtualPet findPet() {
        return new VirtualPet("Spot", "Dog", 5, 5, 5);
    }
}

