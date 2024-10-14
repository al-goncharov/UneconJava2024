import ru.unecon.Task4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.List;

public class Task4Test {

    @Test
    public void validTenDigitNumberWithPrefix() {
        List<String> input = List.of("+7(921)924-3276", "8(911)111-22-33");
        List<String> expected = List.of("9219243276", "9111112233");
        assertEquals(expected, Task4.phoneNumbers(input));
    }

    @Test
    public void validTenDigitNumberWithoutPrefix() {
        List<String> input = List.of("(921)924-3276", "(911)1112233");
        List<String> expected = List.of("9219243276", "9111112233");
        assertEquals(expected, Task4.phoneNumbers(input));
    }

    @Test
    public void validSevenDigitNumber() {
        List<String> input = List.of("1234567", "123-4567", "765-43-21");
        List<String> expected = List.of("1234567", "1234567", "7654321");
        assertEquals(expected, Task4.phoneNumbers(input));
    }

    @Test
    public void invalidNumbers() {
        List<String> input = List.of("+7 921 924 32 76", "2222-222", "8911111-22-33", "12-345-67", "9279243276");
        List<String> expected = List.of();
        assertEquals(expected, Task4.phoneNumbers(input));
    }
}

