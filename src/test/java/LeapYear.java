import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYear {

    @ParameterizedTest
    @ValueSource(ints = {1980, 2000, 2024})
    public void dividible_with_4_but_not_100(int year) {
        assertEquals(true, Main.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2004, 2064})
    public void dividible_with_400(int year) {
        assertEquals(true, Main.isLeapYear(year));


    }
    @ParameterizedTest
    @ValueSource(ints = {1582, 1778, 2022, 2150})
    public void not_divible_with_4(int year) {
        assertEquals(false, Main.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints  = {1700, 1800, 1900, 2100})
    public void dividible_with_100_but_not_400(int year) {
        assertEquals(false, Main.isLeapYear(year));

    }


}
