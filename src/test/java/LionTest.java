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

    @Mock
    AnimalBehavior animalBehavior;
    Lion lion;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самка", animalBehavior);
    }

    @Test
    public void getKittensTest()  {
        when(animalBehavior.getKittens()).thenReturn(3);
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void doesHaveManeTest() {
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getFoodTest() throws Exception {
        when(animalBehavior.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = lion.getFood();

        assertEquals(3, food.size());
        assertTrue(food.contains("Животные"));
        assertTrue(food.contains("Птицы"));
        assertTrue(food.contains("Рыба"));
    }

    @Test
    public void lionIsCreateExceptionTest() throws Exception {
        Exception exception = assertThrows(
                Exception.class,
                () -> new Lion("Трансгендер", animalBehavior)
        );

        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}
