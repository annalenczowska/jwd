public class Loops2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {

            if (i % 2 == 1) {   //liczba nieparzysta
                continue;
            }
            System.out.println(i);
            System.out.println(" ");

        }
/*
        out: for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 50; j++) ;
            System.out.println(i + " " + j);
            break out;
        }

        }*/
    }
}
