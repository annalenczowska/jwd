//import java.math.BigInteger;

import java.math.BigInteger;

public class Loops {
    public static void main(String[] args) {

        int n = 5;
        { //początek bloku
            int m = 10; //ta zmienna lokalna jest widoczna tylko w tym bloku
            m = n + m;
            System.out.println(m);
        } //koniec bloku


        // Instrukcja IF
        int x = 2;
        if (x > 2) {
            System.out.println("Jest większe od 2");
        } else if (x < 2) {
            System.out.println("Nie jest większe od 2");
        } else {
            System.out.println("Jest równe 2");
        }


        // Instrukcja warunkowa Switch działa na takich typach:
        //- byte i Byte
        //- short i Short
        //- int i Integer
        //- char i Character
        //- enum - enumeracja
        //- String

        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Wspaniale!");   // w instrukcji switch po każdym przypadku trzeba stosować instrukcję break
                break;
            case 'B':
                System.out.println("Dobrze!");
                ;
                break;
            case 'C':
                System.out.println("Mogło być lepiej!");
                break;
            default:
                System.out.println("Rozważ oszukiwanie");
        }

        // operator trójargumentowy
        int myScore = 98;
        int yourScore = 102;

        int ourBestScore = myScore > yourScore ? myScore : yourScore;
        System.out.println(ourBestScore);

        // wyświetl cyfry od zero do 99
        for (int i = 1; i < 100; i++) {
            System.out.println("i = " + i);
        }

        /* pętla nieskończona
        for (;;) {
        System.out.println("pętla nieskończona");
        */

        // szablon pętli - wpisujemy fori + tab

        //wyświetlamy wszystkie cyfry w jednej linii:
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d", i);



            /*silnia
            int number = 5;  //silnia: 1 * 2 * 3 * 4 * 5
            BigInteger factorial = BigInteger.ONE;
            for (int i = 1; i <= number; i++ ){
                factorial = factorial.multiply(BigInteger.valueOf(i));

            }
            System.out.printf("%d! = %s%n", number, factorial); */


            //wartość bitów w bajcie
            //128 64  32  16  8  4  2  1
            //0   0   0   0   0  0  0  0

            /*for (int j = 1, sum = 1; j <= 128; i = i * 2, sum += i) {
                System.out.printf("j = %d, sum = %d%n", i, sum);
            }*/

        /*int i = 0;      //pętla while
        while (i<100) {
            System.out.println(i);
            i++;                musimy inkrementować licznik, aby pętla nie była nieskończona
        }

        Pętla do while
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 100);*/


        }


    }
}







