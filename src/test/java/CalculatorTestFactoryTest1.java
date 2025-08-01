import org.example.vois.model.Calculator1;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class CalculatorTestFactoryTest1 {

    private final Calculator1 calculator = new Calculator1();

    @TestFactory
    Collection<DynamicTest> additionTests() {
        return Arrays.asList(
                dynamicTest("1 + 1 = 2", () -> assertEquals(2, calculator.add(1, 1))),
                dynamicTest("5 + 3 = 8", () -> assertEquals(8, calculator.add(5, 3))),
                dynamicTest("0 + 0 = 0", () -> assertEquals(0, calculator.add(0, 0)))
        );
    }

    @TestFactory
    Stream<DynamicTest> dataDrivenAdditionTests() {
        List<int[]> testData = Arrays.asList(
                new int[]{10, 20, 30},
                new int[]{2, 2, 4},
                new int[]{-5, 5, 0}
        );

        return testData.stream()
                .map(data -> dynamicTest(
                        "Test " + data[0] + " + " + data[1] + " = " + data[2],
                        () -> assertEquals(data[2], calculator.add(data[0], data[1]))
                ));
    }

    @TestFactory
    Stream<DynamicNode> dynamicTestsWithContainers() {
        return Stream.of("Group A", "Group B")
                .map(groupName -> dynamicContainer(groupName, Stream.of(
                        dynamicTest(groupName + " - Test 1", () -> assertEquals(1, 1)),
                        dynamicTest(groupName + " - Test 2", () -> assertEquals(2, 2))
                )));
    }


}


