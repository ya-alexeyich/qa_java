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
        Feline FelineSpy = Mockito.spy(feline);
        Mockito.doReturn(List.of("Животные", "Птицы", "Рыба")).when(FelineSpy).getFood("Хищник");

        List<String> food = FelineSpy.eatMeat();

        assertNotNull(food);
        assertEquals(3, food.size());
        assertTrue(food.contains("Животные"));
        assertTrue(food.contains("Птицы"));
        assertTrue(food.contains("Рыба"));
    }

    @Test
    public void getFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        assertEquals(1, feline.getKittens());
    }


}
