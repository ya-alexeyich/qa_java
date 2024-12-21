import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean expectedHasMane;
    private final Feline feline;

    public LionParameterizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
        this.feline = new Feline();
    }

    @Parameterized.Parameters
    public static Object[] getDataHasMane() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void lionIsCreateTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}
