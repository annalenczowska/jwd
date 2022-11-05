public class ConvTester {
    public static void main(String[] args) {

        int firstPrice = 234;
        int secondPrice = 178;

        System.out.println(Math.max(firstPrice, secondPrice));  //możemy też użyć short, Integer i też zadziała

        // byte a = 7;
        // short b;
        // int c;

        // c = a;   // konwersja niejawna
        // b = (short) c; //konwersja jawna czyli rzutowanie

        int a = 5;
        double b = 13.5;
        double c = ((int)b) / a;



    }
}
