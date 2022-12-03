import java.util.Locale;

public class TextFormat {
    public static void main(String[] args) {


        int accountBalance = 15005;
        System.out.printf("Saldo: %,d zł%n", accountBalance);  //funkcja printf - możemy podać szablon
        // schemat opisu tego szablonu: %[flags].[width][.precision]conversion-character
        //s - stringi - formatuj stringi
        //d - decimal integers
        //f - liczby zmiennoprzecinkowe
        //t - date/time
        //n - separacja linii
        //bB - Booleans - wartości logiczne

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf(new Locale("us"),"%.11f%n", pi ); //%n - znak nowej linii

    }
}
