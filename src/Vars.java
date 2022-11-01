import java.text.DecimalFormat;
import java.util.Locale;

public class Vars {

    static final int DAYS_IN_WEEK = 7;

    public static void main(String[] args) {

        int number = 11;

        System.out.println("Nasza liczba to " + number + ".");
        System.out.println("Liczba " + number + " jest o " + (number  - 8) + " większa od liczby 8.");
        System.out.println("Jeżeli pomnożymy naszą liczbę przez 5 to otrzymamy wartość " + (5 * number) + ".");


        int x = 9;
        System.out.println(x);


        String manProtocol;
        int localAreaCode = 34567;

        int a = 6;

        MarsRobot robot;

        String[] streets = {"Floriańska", "Batorego", "Wiślna"};

        final double PI = 3.14;
        final int A;

        A = 4;

        final String NAME = "Jakaś nazwa";


        double z = 12e5;  //12 * 10 ^ 5
        double y = 3E-3; //3 *10 ^ -3

        System.out.println(z);
        System.out.println(y);

        double aa = 2.432E-17;
        System.out.println(aa);
        System.out.printf(new Locale("us", "us"), "%.20f", aa);
        // pokaże nam liczbę z 20 miejscami po przecinku

        System.out.println("---------------");

        int jackpot = 3_500_000; // podkreślenia są ignorowane, poprawia to czytelność zapisu


        //int val = 0b101; binarnie//
        //int val =  0101; ósemkowo//
        //int val = 0xFF; szestnastkowo//
        //System.out.println(val);//

        boolean choosen = true;
        char key = 'a';
        String password = "hasło";

        // String message = "raz\t\t dwa\t\t trzy" - tabulatory - tworzą odstępy


        String message = "Naucz się szydełkować \u2122"; //znak zastrzeżony//

        System.out.println(message);



    }


}
