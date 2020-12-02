import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void findNextDay() {
        int day = 28;
        int month = 2;
        int year = 2020;

        String result = NextDayCalculator.nextDay(day, month, year);
        String expect = "29/2/2020";

        assertEquals(expect, result);
    }

    @org.junit.jupiter.api.Test
    void findNextDay2() {
        int day = 30;
        int month = 9;
        int year = 2020;

        String result = NextDayCalculator.nextDay(day, month, year);
        String expect = "1/10/2020";

        assertEquals(expect, result);
    }
}