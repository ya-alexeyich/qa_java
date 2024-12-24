import java.util.List;

public interface AnimalBehavior {

    List<String> getFood(String animalKind) throws Exception;

    int getKittens();
}