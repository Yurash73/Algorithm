import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year;

        while (true) {
            System.out.println("Введите год для определения высокосный или нет:");
            year = scanner.nextInt();
            if(year < 1) {
                System.out.println("Год должен быть больше 1");
                continue;
            }
            if ((year % 400) == 0 ) {
                System.out.println("Кол-во дней в " + year + " году - " + 366);
            } else if ((year % 100) == 0 ) {
                System.out.println("Кол-во дней в " + year + " году - " + 365);
            } else if ((year % 4) == 0) {
                System.out.println("Кол-во дней в " + year + " году - " + 366);
            }
            else System.out.println("Кол-во дней в " + year + " году - " + 365);

        }
    }
}
