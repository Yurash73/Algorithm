import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;

        while (true) {
            System.out.println("Введите целое число: ");
            inputNumber = scanner.nextInt();
            if (inputNumber > 0) {
                System.out.println(inputNumber * 2);
            } else if (inputNumber < 0 ) {
                System.out.println(inputNumber + 1);
            }
            else System.out.println(inputNumber);
        }


    }
}
