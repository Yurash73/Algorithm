import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt;

        while(true) {
            System.out.println("Введите целое число: ");
            inputInt = scanner.nextInt();

            if (inputInt >= 50 && inputInt <= 100 ) {
                System.out.println("Число " + inputInt + " входит в интервал от 50 до 100");
            }
            else  {
                System.out.println("Число " + inputInt + " не входит в интервал от 50 до 100");
            }
        }
    }
}

