import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    Lion lion;
    @Mock
    AnimalBehavior animalBehavior;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самка", animalBehavior);
    }

    @Test
    public void getKittensTest()  {
        when(animalBehavior.getKittens()).thenReturn(3);
        assertEquals("У львицы может быть трое детей",3, lion.getKittens());
    }

    @Test
    public void doesHaveManeTest() {
        assertFalse("У львицы нет гривы",lion.doesHaveMane());
    }
    //Реализовал проверку используя один assert. Сравнивал списки.
    //Использовал поясняющие сообщения для assert.
    @Test
    public void getFoodTest() throws Exception {
        when(animalBehavior.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Львица хищник должна есть животных птиц и рыбу",List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

    @Test
    public void lionIsCreateExceptionTest() {
        Exception exception = assertThrows(
                Exception.class,
                () -> new Lion("Трансгендер", animalBehavior)
        );
        assertEquals( "Если указать неверный гендер не появилась ошибка", "Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}
