public class weather {

    public static void main(String[] args) {

        float fah = 86;
        System.out.println(fah + " stopni Fahrenheita to ... ");
        fah = fah - 32;
        fah = fah / 9;
        fah = fah * 5;

        System.out.println(fah + " stopni Celsjusza\n");   // /n to łamanie linii na końcu

        float cel = 33;
        System.out.println(cel + " stopni Celsjusza to ...");
        cel = cel * 9;
        cel = cel / 5;
        cel = cel +32;
        System.out.println(cel + " stopni Fahrenheita" );


        // int x, y, z;
        //x = 42;
        //y = x++; //y=42, x=43;
        //z = ++x;  //x=44. z=44

        //System.out.println(y);
        //System.out.println(z);

        int a = 0;
        int b;

        b = a++ + a++; // (0) + (1) b = 1; a=2;
        System.out.println("a = " +a);
        System.out.println("b = " + b);

        //int z = 0;
        // z = z++;

        //System.out.println("z = " + z);

        //int x = 7;
        //int y = 7;
        //int z = 7;
        //int x, y, z;
        //x = y = z = 7;
        //System.out.println(x);

        //x +=2; // x = x +2
        //System.out.println(x);

        //operatory relacji
        //negacja !
        //iloczyn logiczny &&
        //suma logiczna ||
        //równoważność ==
        //alternatywa rozłączna XOR !=

        //&& i || to operatory warunkowe w przeciwieństwie do & i |

        int x = 0;
        int y = 5;
        boolean test = (x < 0 && (y++ > 3));  //gdy x= 0 to (y++ > 5) nie zostanie wykonany bo nie ma sensu
        System.out.println(test);
        System.out.println(y);

        int age = 33;
        boolean test2 = !(age < 25);  //negujemy false czyli otrzymujemy true

        System.out.println(test2);






    }
}
