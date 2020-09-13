public class VirtualPet {
    private String petName;
    private String petDescription;
    private int hunger;
    private int thirst;
    private int boredom;

public VirtualPet (String petName, String petDescription, int hunger, int thirst, int boredom){
    this.petName = petName;
    this.petDescription = petDescription;
    this.hunger = hunger;
    this.thirst = thirst;
    this.boredom = boredom;

}

    public String getPetName() {
        return petName;
    }



    public String getPetDescription() {
        return petDescription;
    }


    public int getHunger() {
        return hunger;
    }
public void feed(){
    hunger --;
}

    public int getThirst() {
        return thirst;
    }

public void water(){
    thirst --;
}

    public int getBoredom() {
        return boredom;
    }

public void play(){
    boredom --;
}
public void tick(){
    hunger ++;
    thirst ++;
    boredom ++;
}






}
