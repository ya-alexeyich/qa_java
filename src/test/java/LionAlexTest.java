import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    AnimalBehavior animalBehavior;
    LionAlex alex;


    @Before
    public void setUp() throws Exception {
        alex = new LionAlex(animalBehavior);
    }

    @Test
    public void getKittensTest() {
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void getFriendsTest() {
        List<String> list = alex.getFriends();
        assertEquals(3,list.size());
        assertTrue(list.contains("Марти"));
        assertTrue(list.contains("Глория"));
        assertTrue(list.contains("Мелман"));
    }

    @Test
    public void getPlaceOfLivingTest() {
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void doesHaveManeTest() {
        assertTrue(alex.doesHaveMane());
    }

    @Test
    public void getFoodTest() throws Exception {
        when(animalBehavior.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = alex.getFood();

        assertEquals(3, food.size());
        assertTrue(food.contains("Животные"));
        assertTrue(food.contains("Птицы"));
        assertTrue(food.contains("Рыба"));
    }
}
