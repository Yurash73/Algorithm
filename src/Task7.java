import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double timeFromStart;
        double minutesForColor;

        while (true) {
            System.out.println("Введите количество минут от начала часа: ");
            timeFromStart = scanner.nextDouble();

            if (timeFromStart < 1 || timeFromStart > 59) {
                System.out.println("Введите числа в диапозоне от 1 до 59 ");
                continue;
            }
            if (timeFromStart > 5) minutesForColor = timeFromStart % 5;
            else minutesForColor = timeFromStart;

            if (minutesForColor <= 3)
                System.out.println("Зелёный сигнал светофора");
            else if (minutesForColor > 3 && timeFromStart <= 4) {
                System.out.println("Жёлтый сигнал светофора");
            }
            else System.out.println("Красный сигнал светофора");
        }
    }
}
