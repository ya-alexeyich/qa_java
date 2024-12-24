import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean expectedHasMane;

    public LionParameterizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }
    //В параметризованных тестах для аннотации Parameterized.Parameters использовал аргумент name
    @Parameterized.Parameters(name = "Наличие гривы: {0} {1}")
    public static Object[] getDataHasMane() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void lionIsCreateTest() throws Exception {
        AnimalBehavior mockAnimalBehavior = mock(AnimalBehavior.class);
        Lion lion = new Lion(sex, mockAnimalBehavior);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}
