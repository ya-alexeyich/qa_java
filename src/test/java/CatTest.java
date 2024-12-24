import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Cat cat;
    @Mock
    Feline feline;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        assertEquals("Кошка должна говорить Мяу","Мяу", cat.getSound());
    }
    //Реализовал проверку используя один assert. Сравнивал списки.
    //Использовал поясняющие сообщения для assert.
    @Test
    public void getFoodTest() throws Exception {;
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Кошка должна есть мясо",List.of("Животные", "Птицы", "Рыба"),cat.getFood());
    }
}
