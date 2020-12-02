import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void translate() {
        int number = 7;
        String result = FizzBuzzTranslate.translate(number);
        String expect = number + "";

        assertEquals(expect,result);
    }

    @org.junit.jupiter.api.Test
    void translate2() {
        int number = 60;
        String result = FizzBuzzTranslate.readNumber(number);
        String expect = "Sau muoi";

        assertEquals(expect,result);
    }
}