import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {
    Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }
    //Моки только для зависимостей, а не для тестируемого объекта.
    //Использовал поясняющие сообщения для assert.
    @Test
    public void eatMeatTest () throws Exception {
        assertEquals("Семейство кошачьих должно есть мясо",List.of("Животные", "Птицы", "Рыба"),feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошки должны принадлежать семейству кошачьих","Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        assertEquals("Семейство кошачьих должно иметь ребенка",1, feline.getKittens());
    }
}
