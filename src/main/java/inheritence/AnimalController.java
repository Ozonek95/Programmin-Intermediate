package inheritence;

public class AnimalController {

    private GoldFishInterface goldFishInterface;

    private HumanInterface humanInterface;

    public String goldFish() {

        return goldFishInterface.giveMeToString();
    }

    public String human() {
        return humanInterface.giveMeToString();
    }

    public void setHumanInterface(HumanInterface humanInterface) {
        this.humanInterface = humanInterface;
    }

    public void setGoldFishInterface(GoldFishInterface goldFish) {
        this.goldFishInterface = goldFish;
    }
}
