public class DataTypes {
    public static void main(String[] args) {
        //liczby całkowite
        //byte - 1 bajt   00000000
        //short - 2 bajty   00000000 00000000
        //int - 4 bajty    00000000 00000000 00000000 00000000
        //long - 8 bajtów   00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

        //domyślnie liczby całkowite traktowane są jako int
        System.out.println(2423);
        System.out.println(2423468832L); //trzeba dopisać L aby było jasne, że ta liczba to long

        byte b = - 120;  //może być od -128 do 128
        short s = 31678;
        int i = 1_123_456_789;  //znaki podkreślenia kompilator wytnie
        long l = i * b;
        long itemsNumber = 235748392018L;
        //char c = 43;        //kod ASCII

        //System.out.println(c);

        //liczby zmienno przecinkowe
        //float - 4
        //double - 8

        //domyślnie liczby zmiennoprzecinkowe traktowane są jako double
        double a = 34.35;
        float f = 15.12f;
        double d = 235667433.36677433;  // w danych bankowych, finansowych nie korzystać z typu double bo może powodować zaokrąglenia


        //Typ znakowy

        System.out.println('a');
        System.out.println('\'');
        System.out.println('\t');
        char c = 64;
        System.out.println((int)c);

        //Typ logiczny
        System.out.println(true);
        System.out.println(false);

        boolean choosen = true;
        boolean q = false;
        System.out.println(q);

        //Ciągi znaków
        String name = "Ala";
        System.out.println(name);
        System.out.println("Cześć, jestem " + name);

        System.out.println("tekst" + 1 + 2);
        System.out.println("tekst" + (1 + 2));

        System.out.println("" + 1 + 2 + "tekst");


    }
}
