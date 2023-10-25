public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 1");
        int sum = 0;
        for (int payment : arr) {
            sum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sum + "рублей");

        System.out.println("Задача 2");
        arr = generateRandomArray();
        int min = 200000;
        int max = 10;
        for (int index = 0; index < arr.length; index++) {
            if (min > arr[index]) {
                min = arr[index];
            }
            if (max < arr[index]) {
                max = arr[index];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min +
                " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        System.out.println("Задача 3");
        arr = generateRandomArray();
        double middlePayment = 0;
        for (int a : arr) {
            middlePayment += a;
        }
        middlePayment /= arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + middlePayment + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }


    }
}