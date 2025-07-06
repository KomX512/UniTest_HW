import org.junit.jupiter.api.*;

import java.sql.ResultSet;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    private Address addressTest;

    @BeforeAll
    static void startTest() {
        System.out.println("Начало тестирования...");
    }

    @BeforeEach
    void addressInit() {
        addressTest = new Address("Россия", "Казань");
    }

    @Test
    void getCity() {
        String expected = "Казань";
        String result = addressTest.getCity();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getCountry() {
        String expected = "Россия";
        String result = addressTest.getCountry();

        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    void endTest() {
        System.out.println("Тестирование завершено!");
    }
}