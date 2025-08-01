import org.example.vois.model.Calculator1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorParameterizedTest1 {

    private Calculator1 calculator = new Calculator1();

    @ParameterizedTest
    @ValueSource(ints = {0, 1, -1, Integer.MAX_VALUE, Integer.MIN_VALUE})
    void testMultiplyByZero(int arg) {
        assertEquals(0, calculator.multiply(arg, 0));
    }

    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}") // Custom name with placeholders
    @CsvSource({
            "1, 2, 3",
            "5, -3, 2",
            "0, 0, 0",
            "-10, -5, -15"
    })
    void testAddWithCsvSource(int a, int b, int expectedSum) {
        assertEquals(expectedSum, calculator.add(a, b));
    }

    @ParameterizedTest
    @MethodSource("divideTestCases")
    void testDivideWithMethodSource(double a, double b, double expectedResult) {
        assertEquals(expectedResult, calculator.divide(a, b), 0.001); // Delta for double comparison
    }

    // Static method to provide arguments for the parameterized test
    static Stream<double[]> divideTestCases() {
        return Stream.of(
                new double[]{6.0, 3.0, 2.0},
                new double[]{1.0, 2.0, 0.5},
                new double[]{10.0, 4.0, 2.5}
        );
    }

    @ParameterizedTest
    @CsvSource({
            "10, 0, Cannot divide by zero!",
            "5, 0, Cannot divide by zero!"
    })
    void testDivideByZeroParameterized(double a, double b, String expectedMessage) {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(a, b)
        );
        assertEquals(expectedMessage, thrown.getMessage());
    }
}


