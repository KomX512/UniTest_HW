import org.junit.jupiter.api.*;
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
        Assertions.assertEquals("Казань", "Казань");
    }

    @Test
    void getCountry() {
        Assertions.assertEquals("Россия", "Россия");
    }

    @AfterEach
    void endTest() {
        System.out.println("Тестирование завершено!");
    }
}