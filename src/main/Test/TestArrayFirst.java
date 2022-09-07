import com.example.lesson6.hwLesson6.Lesson6HW;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestArrayFirst {

    private Lesson6HW array;

    @BeforeEach
    public void init() {
        array = new Lesson6HW();
    }

    @Test
    public void emptyArray() {
        array.array1(new int[0]);
    }

    @Test
    public void withoutFour() {
        array.array1(new int[]{1, 2, 3});
    }

    @Test
    public void fourIsNotLast() {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        Assertions.assertArrayEquals(new int[]{5, 6, 7}, array.array1(data));
    }

    @Test
    public void test_task1_with_some_4() {
        int[] data = {1, 4, 3, 4, 5, 6, 4};
        Assertions.assertArrayEquals(new int[]{}, array.array1(data));
    }

}
