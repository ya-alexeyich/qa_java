import java.util.List;

public class LionAlex extends Lion {
    public static final  String GENDER_ALEX = "Самец";

    public LionAlex(AnimalBehavior animalBehavior) throws Exception {
        super(GENDER_ALEX, animalBehavior);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

}
