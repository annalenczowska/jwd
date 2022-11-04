public class Operators {
    public static void main(String[] args) {
        int x = 5;
        x = x + 2;
        int y = 4;

        System.out.println(x);
        System.out.println(x + y);
        System.out.println(x / y); //uwaga - wynik dzielenia jest całkowity bo operandy całkowite - 7/4 to 1 plus jakaś reszta
        System.out.println(x / (double)y); //wystarczy, że jeden z argumentów będzie liczbą zmiennoprzecinkową - rzutujemy zmienną y do double
        System.out.println(3 / 2);
        System.out.println(3 / 2.); // kropka po 2 oznacza, że jest to literał typu double

        System.out.println(5 % 2);  // modulo - reszta z dzielenia
        System.out.println(7 % 4);

        int a = 5;
        int b = -a;
        System.out.println(a);
        System.out.println(b);

        // Operatory inkrementacji

        System.out.println("Operator inkrementacji");
        int f, g, h;
        f = 42;
        g = f++;   // f=42, potem inkrementacja i f = 43
        h = ++f;    // pre inkrementacja - f = 43, operator podnosi wartość o 1 więc f = 44, zatem h = 44

        System.out.println(g);
        System.out.println(h);

        int j = 0;
        int k;

        k = j++ + j++; // k = (0) + (1) (bo najpierw liczba, potem inkrementacja), j = 2 bo najpierw j+1 a potem j+1+1
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        int u = 0;
        u = u++;

        System.out.println("u = " + u);

        /*int x = 7;
        int y = 7;
        int z = 7;

        int x, y, z;
        x = y = z = 7;*/

        /*int x;
        x = x + 2;
        x += 2;*/

        // Operatory relacji
        // negacja !
        // iloczyn logiczny &&
        // suma logiczna ||
        // równoważność ==
        // alternatywa rozłączna XOR !=

        // && i || to operatory WARUNKOWE w przeciwieństwie do & i |
        int xx = 0;
        int yy = 5;
        boolean test = (xx < 0) && (yy++ > 3); // xx nie jest mniejsze od 0, więc false, && (i) yy jest większe od 3 więc true -> daje to false
                    // dodatkowo yy nadal wynosi 5, bo jeżeli pierwszy fragment operacji daje false, to drugi nie jest nawet sprawdzany
                    // jeżeli zapiszemy to jako boolean test = (xx < 0) & (yy++ > 3), sprawdzone zostaną obydwa człony
        System.out.println(test);

        // Operator negacji

        int age = 33;
        boolean test2 = !(age <25); // dostajemy false, a negacja false to true
        System.out.println(test2);






    }
}
