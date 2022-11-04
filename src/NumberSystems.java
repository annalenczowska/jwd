public class NumberSystems {
    public static void main(String[] args) {

        //system dziesiętny (0,1,2,3,4,5,6,7,8,9)
        //154 -> (1 * 10^2) + (5 * 10^1) + (4 * 10^0) = 100 + 50 + 4;

        //system dwójkowy  (binarny) (0, 1 )
        //101 -> (1 * 2^2) + (0 * 2^1) +  (1 * 2^0) = 4 + 0 + 1 =5

        //system ósemkowy (oktalny) (0,1,2,3,4,5,6,7)
        //47 -> (4 * 8^1) + (7 * 8^0) = 32 + 7 = 39

        //system szesnastkowy (hexadecymalny) (0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f) np a =10
        // 3af -> (3 * 16^2) + (a * 16^1) + (f * 16^0) = (3 * 256) + (160 (bo a ma wartość 10)) + (15) = 943

        //System.out.println(Integer.toBinaryString(5));
        //System.out.println(Integer.toOctalString(39));
        //System.out.println(Integer.toHexString(943));

        //8421
        //1011 = 8 + 0 + 2 + 1 = 11

        //int a = 11;
        //System.out.println(Integer.toBinaryString(a));


        //Operatory bitowe

        //& - iloczyn bitowy
        // | - suma bitowa
        // ^ - XOR
        // >> - przesunięcie w prawo
        // << - przesunięcie w lewo

        //int a = 1; // 0 0 0 1
        //int b = 5; // 0 1 0 1


        // mnożymy    0 0 0 1

        //System.out.println(a & b);

        //System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ','0'));
        //System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ','0'));
        //System.out.println("---------------------");
        //System.out.println(String.format("%32s", Integer.toBinaryString(a & b)).replace(' ','0'));

        //suma bitowa
        //System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ','0'));
        //System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ','0'));
        //System.out.println("---------------------");
        //System.out.println(String.format("%32s", Integer.toBinaryString(a | b)).replace(' ','0'));
        // wynik 5

        //XOR - ^
        // 1 1 -> 0  bity są identyczne
        // 1 0 -> 1  biy są różne
        // 0 1 -> 1
        // 0 0 -> 0
        //System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(' ','0'));
        //System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(' ','0'));
        //System.out.println("---------------------");
        //System.out.println(String.format("%32s", Integer.toBinaryString(a ^ b)).replace(' ','0'));

        // >>
        // 0101 -> 0001  przesuwamy 1 o dwa miejsca w prawo

        //<<
        //0101 -> 010100

        //Liczby ujemne
        //System.out.println(String.format("%32s", Integer.toBinaryString(1)).replace(' ','0'));
        //System.out.println(String.format("%32s", Integer.toBinaryString(-1)).replace(' ','0'));

        //Kolejność wykonywania działań - jak w matematyce



    }
}
