
import java.util.StringTokenizer;

public class TokenTester {
    public static void main(String[] args) {
        // Object obj = new Object ();  //deklaracja i inicjalizacja  - tak się tworzy obiekt
        // String name = new String ("Michael Jordan");  //inicjalizujemy wartością Michael Jordan
        // Point pt = new Point (0, 0);

        StringTokenizer str1, str2;     //z pakietu Java util

        String quote1 = "GOOG 530,80 -9,98"; //spacja sugeruje, że to są oddzielne części
        str1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + str1.nextToken());
        System.out.println("Token 2: " + str1.nextToken());
        System.out.println("Token 3: " + str1.nextToken());

        System.out.println();

        String quote2 = "RTH@75,00@0,22";
        str2 = new StringTokenizer(quote2, "@");  // definicja znaku rozdzielającego @, delimiter - rozdzielacz
        System.out.println("Token 1: " + str2.nextToken());
        System.out.println("Token 2: " + str2.nextToken());
        System.out.println("Token 3: " + str2.nextToken());




    }
}
