import java.sql.SQLOutput;

public class lab5 {
    public static void main(String[] args) {

        System.out.println("Zadanie 1");
        float kwota = 14_000;
        System.out.println("Inwestycja początkowa wynosi " + kwota + "zł");

        kwota = kwota + (kwota * 0.4F);
        System.out.println("Po pierwszym roku inwestycja warta jest " + kwota + "zł");

        kwota = kwota - 1500F;
        System.out.println("Po drugim roku inwestycja warta jest " + kwota + "zł");

        kwota = kwota * 0.12F;
        System.out.println("Po trzecim roku inwestycja warta jest " + kwota + "zł");


        System.out.println();
        System.out.println("Zadanie 2");

        int i = 35;

        boolean test3 = (i % 7) == 0 && (i % 5) == 0;
        System.out.println(test3);

        System.out.println("Czy liczba " + i + " dzieli się przez 5 i 7 jednocześnie? - " + test3);



    }
}
