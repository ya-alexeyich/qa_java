import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void eatMeatTest () throws Exception {
        Feline felineSpy = Mockito.spy(feline);
        Mockito.doReturn(List.of("Животные", "Птицы", "Рыба")).when(felineSpy).getFood("Хищник");
        List<String> food = felineSpy.eatMeat();

        assertEquals(3, food.size());
        assertTrue(food.contains("Животные"));
        assertTrue(food.contains("Птицы"));
        assertTrue(food.contains("Рыба"));
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getFoodTest () throws Exception {
        Feline felineSpy = Mockito.spy(feline);
        Mockito.doReturn(List.of("Животные", "Птицы", "Рыба")).when(felineSpy).getFood("Хищник");
        List<String> food = felineSpy.getFood("Хищник");

        assertEquals(3, food.size());
        assertTrue(food.contains("Животные"));
        assertTrue(food.contains("Птицы"));
        assertTrue(food.contains("Рыба"));
    }


}
