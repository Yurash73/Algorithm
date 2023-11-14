import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputInt;

        while(true) {
            System.out.println("Введите целое число: ");
            inputInt = scanner.nextInt();

            if (inputInt < 5 ) {
                System.out.println("Число меньше 5");
            }
            else  if (inputInt > 5) {
                System.out.println("Число больше 5");
            }
            else System.out.println("Число равно 5");
        }
    }
}
