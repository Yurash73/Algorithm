import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        while (true) {
            System.out.println("Введите сторону А треугольника: ");
            if ((a = scanner.nextInt()) <= 0) {
                System.out.println("Число должно быть больше 0");
                continue;
            }
            System.out.println("Введите сторону B треугольника: ");
            if ((b = scanner.nextInt()) <= 0) {
                System.out.println("Число должно быть больше 0");
                continue;
            }
            System.out.println("Введите сторону C треугольника: ");
            if ((c = scanner.nextInt()) <= 0) {
                System.out.println("Число должно быть больше 0");
                continue;
            }

            if (((a + b) > c) && ((b + c) > a) && ((a + c) > b)) {
                System.out.println("Треугольник существует");
            }
            else System.out.println("Треугольник не существует");

        }
    }
}
