import java.util.List;

public class Feline extends Animal implements Predator, AnimalBehavior {


    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    @Override
    public List<String> getFood(String animalKind) throws Exception {
        return super.getFood(animalKind);
    }

}
