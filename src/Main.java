import java.util.Arrays;

public class Main {


    //Задание №1 - реализовать метод с параметром год,
    //проверкой на високосность и выводом результата в консоль
    public static void year(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - Год високосный");
        } else {
            System.out.println(year + " - Год не високосный");
        }
    }

    //Задание №2 - Написать метод куда подаются два параметра: тип операционной системы и год выпуска
    //если устройство старше текущего года - предложить установить Лайт версию
    //Вывод в консоль предложение по версии для установки приложения и для какого устройства

    public static void updateOs(int clientOs, int clientDeviceYear) {
        if (clientOs == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите Lite версию приложения для Android по ссылке");
        }
        if (clientOs == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите Lite версию приложения для iOS по ссылке");
        }
    }

    //Задание №3 - написать метод, который на вход принимает дистанцию и возвращает срок доставки
    public static int deliveryDay(int deliveryDistance) {
        int delDay = 0;
        if (deliveryDistance <= 20) {
            delDay = delDay + 1;
            // System.out.println("Потребуется дней: " + " 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            //System.out.println("Потребуется дней: " + " 2");
            delDay = delDay + 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            delDay = delDay + 3;
            //System.out.println("Потребуется дней: " + " 3");
        }
        return delDay;

    }

    //Задание №4 и №6 - метод принимает отсортированную строку, проверяет наличие дублей,
    // выводит в консоль сообщение об этом
    public static void doubleInString(String sortString) {
        for (int i = 0; i < sortString.length() - 1; i++) {
            if (sortString.charAt(i) == sortString.charAt(i + 1)) {
                System.out.println("Дубль наден - " + sortString.charAt(i));
                break;
            } else if (sortString.charAt(i) != sortString.charAt(i + 1)) {

                System.out.println("Дублей нет!");
            }

        }
    }

    //Задание №5 - метод получает на вход массив и переставляет элементы в обратном порялке
    public static void reverceArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        //к заданию №1 - один параметр
        year(2000);

        //к заданию №2 - два параметра
        updateOs(0, 2014);

        //к заданию №3 - дистанция и возврат срока доставки
        int Day = deliveryDay(45);//Day - для возврата срока доставки из метода,
        //deliveryDay-вызов метода с параметром расстояние - deliveryDistance
        System.out.println("Количество дней доставки составит - " + Day);

        //к заданию №4 и №6
        doubleInString("assdfgg");//Отсортированная строка - параметр для метода

        //к Заданию №5
        char[] reverceFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};//параметр для метода
        reverceArray(reverceFullName);


    }


}






















