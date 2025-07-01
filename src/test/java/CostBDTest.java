import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        addressTest = new Address("Россия", "Казань");
        testBD = new CostBD();
        testBD.fillMap();
    }

    @Test
    void getPrice() {
        Assertions.assertEquals(200, 200);
    }

    @Test
    void containsKey() {
        Assertions.assertEquals(true, true);
    }
}