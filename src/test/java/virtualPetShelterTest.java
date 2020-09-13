import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class virtualPetShelterTest {
   VirtualPet underTest= new VirtualPet("Spot", "Dog", 5, 5, 5);
   VirtualPetShelter underTestShelter= new VirtualPetShelter();

    @Test
    public void petShouldHaveName(){
        String petName= underTest.getPetName();
        assertEquals(petName, "Spot");
    }

    @Test
    public void petShouldHaveDescription(){
        String petDescription= underTest.getPetDescription();
        assertEquals(petDescription, "Dog");

    }

    @Test
    public void petShouldHaveHunger(){
        int hunger=underTest.getHunger();
        assertEquals(hunger, 5);
    }

    @Test
    public void petShouldHaveThirst(){
        int thirst=underTest.getThirst();
        assertEquals(thirst, 5);
    }

    @Test
    public void petShouldHaveBoredom(){
        int boredom=underTest.getBoredom();
        assertEquals(boredom, 5);
    }

    @Test
    public void admitShouldAddPet(){
        VirtualPet newPet = new VirtualPet("Spot", "Dog", 5, 5, 5);
        underTestShelter.admitPet(newPet);
        underTestShelter.findPet();
        assertThat(underTestShelter.findPet(), is(newPet));
    }

}
