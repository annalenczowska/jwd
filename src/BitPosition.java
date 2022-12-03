public class BitPosition {
    public static void main(String[] args) {
        System.out.println("Zadanie 3");
        System.out.println("");

         int j = 11;
         int n = 2;
         int mask = 1 << n - 1;

        boolean result = (j & mask) > 0;

        System.out.println("Dla liczby " + j + " na " + n + " pozycji znajduje się bit: " + result);
        System.out.println("");

        System.out.println(String.format("%32s",Integer.toBinaryString(j)).replace(' ', '0'));
        System.out.println(String.format("%32s",Integer.toBinaryString(mask)).replace(' ', '0'));
        System.out.println("------------------");
        System.out.println(String.format("%32s",Integer.toBinaryString(j & mask)).replace(' ', '0'));

    }
}
