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
    LionAlex alex;
    @Mock
    AnimalBehavior animalBehavior;

    @Before
    public void setUp() throws Exception {
        alex = new LionAlex(animalBehavior);
    }

    @Test
    public void getKittensTest() {
        assertEquals("У Алекса не должно быть детей",0, alex.getKittens());
    }

    @Test
    public void getFriendsTest() {
        assertEquals("У Алекса три друга Марти Глория Мелман",List.of("Марти", "Глория", "Мелман"),alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingTest() {
        assertEquals("Алекс живет в Нью-Йоркском зоопарке","Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void doesHaveManeTest() {
        assertTrue("У Алекса  должна быть грива",alex.doesHaveMane());
    }
    //Реализовал проверку используя один assert. Сравнивал списки.
    //Использовал поясняющие сообщения для assert.
    @Test
    public void getFoodTest() throws Exception {
        when(animalBehavior.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Алекс ест мясо",List.of("Животные", "Птицы", "Рыба"),alex.getFood());
    }
}
