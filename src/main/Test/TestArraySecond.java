import com.example.lesson6.hwLesson6.Lesson6HW;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestArraySecond {

    private Lesson6HW array;

    @BeforeEach
    public void prepare() {
        array = new Lesson6HW();
    }

    @Test
    public void empty() {
        Assertions.assertFalse(array.array2(new int[]{}));
    }

    @Test
    public void onlyOneFour() {
        Assertions.assertTrue(array.array2(new int[]{1, 4, 4, 1}));
    }

    @Test
    public void moreThenOneAndFour() {
        Assertions.assertFalse(array.array2(new int[]{1, 4, 3, 1}));
    }

    @Test
    public void withoutOneAndFour() {
        Assertions.assertFalse(array.array2(new int[]{2, 3}));
    }

    @Test
    public void onlyOne() {
        Assertions.assertFalse(array.array2(new int[]{1, 1, 1}));
    }

    @Test
    public void onlyFour() {
        Assertions.assertFalse(array.array2(new int[]{4, 4, 4}));
    }

}