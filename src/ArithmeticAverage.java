import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть а");
        double a = scanner.nextDouble();
        System.out.println("Введіть b");
        double b = scanner.nextDouble();
        System.out.println("Введіть c");
        double c = scanner.nextDouble();
        double average = (a + b + c) / 3;
        System.out.println("Середнє арифметичне " + average);
//        для цілочисельних змінних підходить тип int.
//        але через те, що середнє арифметичне може бути дійсним числом, то і
//        для запису цілочисельних змінних можна використовувати тип double
    }
}
