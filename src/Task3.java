import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumberMonth;

        while (true) {
            System.out.println("Введите номер месяца (от 1 до 12) ");
            inputNumberMonth = scanner.nextInt();
            if (inputNumberMonth > 12 || inputNumberMonth <0 ) {
                System.out.println(" Число должно быть в интревале от 1 до 12 ");
                continue;
            }
            if (inputNumberMonth == 1 || inputNumberMonth == 2 || inputNumberMonth == 12)
                System.out.println("Зима.");
            else if (inputNumberMonth == 3 || inputNumberMonth == 4 || inputNumberMonth == 5) {
                System.out.println("Весна.");
            } else if (inputNumberMonth == 6 || inputNumberMonth == 6 || inputNumberMonth == 8) {
                System.out.println("Лето.");
            }
            else System.out.println("Осень.");

        }

    }
}
