import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CostBDTest {

    CostBD testBD;
    Address addressTest;

    @BeforeAll
    static void startTest() {
        System.out.println("Начало тестирования...");
    }

    @BeforeEach
    void addressInit() {

        testBD = new CostBD();
        testBD.fillMap();
    }

    public static Stream <Arguments> getPriceTestParametrized () {
        return Stream.of(
                Arguments.of(new Address("Россия", "Казань") , 100),
                Arguments.of(new Address("Россия", "Челябинск") , 150),
                Arguments.of(new Address("Китай", "Пекин") , 539),
                Arguments.of(new Address("Монголия", "Чойбалсан") , 302)
        );
    }
    @ParameterizedTest
    @MethodSource
    void getPriceTestParametrized(Address adressParam, int expected) {

        int result = testBD.getPrice(adressParam);
        Assertions.assertEquals(expected, result);

    }

    @Test
    void containsKeyTest() {

        addressTest = new Address("Россия", "Казань");
        boolean expected = true;
        boolean result = testBD.containsKey(addressTest);

        Assertions.assertEquals(expected, result);
    }
}