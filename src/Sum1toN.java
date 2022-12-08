import java.util.Scanner;

public class Sum1toN {
    public static void main(String[] args) {
        System.out.println("n = ");
        Scanner scanner = new Scanner(System.in);       //funkcja Scanner z pakietu Java Utile, wskazujemy miejsce pobierania danych
        int n = scanner.nextInt();
        int number = 1;
        int sum = 1;

        System.out.print("Suma 1");
        while (number < n) {
            number++;
            sum += number;
            System.out.println(" + " + number);
        }
        System.out.println(" = " + sum);
    }

}

