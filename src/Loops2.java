public class Loops2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {

            if (i % 2 == 1) {   //liczba nieparzysta
                continue;               //pętla przerywa działanie i przechodzi do następnego kroku
            }
            System.out.println(i);
            System.out.println(" ");

        }

        //pętla nieskończona
        // for (;;) {
        //    System.out.println("Pętla nieskończona");
        //}
/*
        out: for (int i = 0; i < 10; i++) {         //out to nzwa etykiety zewnętrzej
            for (int j = 0; j < 50; j++) ;
            System.out.println(i + " " + j);
            break out;
        }

        }*/
    }
}
