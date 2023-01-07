import java.awt.*;

public class ArraysTester {
    public static void main(String[] args) {

        String[] requests;
        Point[] points;
        float[] donations;

        int[] tmp = new int[99];      //tablica przechowująca 99 elementów
        tmp[0] = 1;                   //przypisujemy elementy do tablicy
        tmp[1] = 5;
        tmp[2] = 7;
        tmp[98] = 100;      //zaczynamy od 0 więc indeksy są od 0 do 98 - łącznie 99

        System.out.println(tmp[0]);
        System.out.println(tmp[10]);        //nic nie wpisaliśmy, wiec dostaniemy 0
        System.out.println(tmp.length);     //ilość elementów naszej tablicy

        int[] n = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(n[5]);

        //


        Point[] markups = {new Point(1, 5), new Point(0, 3), new Point(1, 1)};
        String[] titles = {"Pan", "Pani", "Państwo", "Panna", "Doktor"};

        Point p = new Point(100,100);
        //elementy tablicy zostają nadpisane wartością punktu p:
        markups[0] = p;
        markups[1] = markups [0];
        markups[2] = markups [1];

        System.out.println(markups[0]);
        System.out.println(markups[1]);
        System.out.println(markups[2]);

        p.x = 200;      //zmieniamy wartość x w punkcie p
        System.out.println();

        System.out.println(markups[0]);
        System.out.println(markups[1]);
        System.out.println(markups[2]);


        // tablice wielowymiarowe
        int[][][] multiDimArr = {{{1}}, {{1}, {3}}};        // tablica trzywymiarowa

        int[] arr = {1, 2, 3, 12, 17};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("i = " + i + " , arr[" + i + "] = " + arr[1]);
        }
        for (int a: arr) {
            System.out.println(a);
        }


        String[] dogs = {"Burek", "Pluto", "Łajka"};
        String[] people = {"Ania", "Wojtek", "Dorota"};

        String[][] names  = {dogs, people};

        System.out.println(names[0][0]);        //elementy o indeksie 0 i 0
        System.out.println(names[1][1]);        //elementy o indeksie 1 i 1
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println(names[i][j]);

            }

        }


    }
}
