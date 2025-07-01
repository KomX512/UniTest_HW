import java.util.HashMap;
import java.util.Map;

public class CostBD {
    Map<Address, Integer> costPerAddress;

    public void fillMap() {
        final int DEFAULT_PRICE = 100;
        String[] countries = {"Россия", "Китай", "Грузия", "Беларусь", "Монголия"};

        String[][] addresses = {
                {"Казань", "Москва", "Челябинск", "Новосибирск", "Псков", "Рязань"},
                {"Пекин", "Тяньцзинь", "Чунцин", "Шанхай"},
                {"Тбилиси", "Абаша", "Батуми", "Боржоми"},
                {"Минск", "Гомель", "Витебск", "Мозырь", "Орша"},
                {"Улан-Батор", "Чойбалсан", "Эрдэнэт"}};

        int[][] price = {
                {100, 50, 150, 250, 75, 75},
                {539, 642, 675, 701},
                {305, 310, 335, 362},
                {270, 275, 283, 294, 268},
                {299, 302, 309}};

        costPerAddress = new HashMap<>();

        for (int i = 0; i < addresses.length; i++) {
            String currentCountry = countries[i];
            for (int j = 0; j < addresses[i].length; j++) {
                String currentAdress = addresses[i][j];
                int currentPrice;
                try {
                    currentPrice = price[i][j];
                } catch (ArrayIndexOutOfBoundsException err) {
                    currentPrice = DEFAULT_PRICE;
                }

                Address newAddress = new Address(currentCountry, currentAdress);
                costPerAddress.put(newAddress, currentPrice);
            }
        }

    }

    public int getPrice(Address searchObject) {
        return costPerAddress.get(searchObject);
    }

    public boolean containsKey(Address searchObject) {
        return costPerAddress.containsKey(searchObject);
    }
}
