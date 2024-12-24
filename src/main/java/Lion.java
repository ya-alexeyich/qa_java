import java.util.List;

public class Lion {

    boolean hasMane;
    AnimalBehavior animalBehavior;

    public Lion(String sex, AnimalBehavior animalBehavior) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.animalBehavior = animalBehavior;
    }

    public int getKittens() {
        return animalBehavior.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return animalBehavior.getFood("Хищник");
    }
}
