import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {

    private final int kittensCount;
    private final int expectedKittensCount;

    public FelineParametrizedTest(int kittensCount, int expectedKittensCount) {
        this.kittensCount = kittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensByCountData() {
        return new Object[][] {
            {0, 0},
            {1, 1},
            {2, 2},
            {10, 10}
        };
    }

    @Test
    public void getKittensByCountTest() {
        Feline feline = new Feline();
        assertEquals(expectedKittensCount, feline.getKittens(kittensCount));
    }
}