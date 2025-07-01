import java.util.*;

public class Main {
    public static void main(String[] args) {
        CostBD costMap = new CostBD();
        Set<String> countryCount = new HashSet<>();
        Scanner scaner = new Scanner(System.in);
        int totalAmount = 0;
        costMap.fillMap();

        while (true) {
            System.out.println("----------------------------");
            System.out.println("Заполнение нового заказа.");
            System.out.print("Введите страну: ");
            String country = scaner.nextLine();

            if (checkEnd(country)) {
                break;
            }

            System.out.print("Введите город: ");
            String city = scaner.nextLine();
            if (checkEnd(city)) {
                break;
            }

            Address searchObject = new Address(country, city);
            if (!costMap.containsKey(searchObject)) {
                System.out.println("Доставки по этому адресу нет");
                continue;
            }
            int price = costMap.getPrice(searchObject);

            //Вввод веса перенес после провреки на сущещствование адреса. Смысла нет вводить вес, если считать все равно не будет
            System.out.print("Введите вес (кг) ");
            String weight = scaner.nextLine();
            if (checkEnd(weight)) {
                break;
            }

            int amount = price * Integer.parseInt(weight);
            System.out.printf("Стоимость доставки составит: %d руб.\n", amount);
            totalAmount += amount;
            System.out.printf("Общая стоимость всех доставок: %d руб.\n", totalAmount);
            countryCount.add(country);
        }

        System.out.printf("Общая стоимость всех доставок: %d руб.\n", totalAmount);
        System.out.printf("Количество уникальных стран: %d\n", countryCount.size());
        System.out.println("Программа завершена");
    }

    private static boolean checkEnd(String checkString) {
        return checkString.equals("end");
    }

}