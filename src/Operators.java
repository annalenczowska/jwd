public class Operators {
    public static void main(String[] args) {
        int x = 5;
        x = x + 2;
        int y = 4;

        System.out.println(x / y); //uwaga - wynik całkowity bo operandy całkowite
        System.out.println(x / (double)y); //wystarczy, że jeden z argumentów będzie liczbą zmiennoprzecinkową
        System.out.println(3 / 2);
        System.out.println(3 / 2.);

        System.out.println(5 % 2);  // modulo - reszta z dzielenia
    }
}
