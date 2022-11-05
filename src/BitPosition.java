public class BitPosition {
    public static void main(String[] args) {
         int j = 5;
         int n = 2;  //pozycja bitu, którą sprawdzamy
         int mask = 1 << n - 1;

        boolean result = (j & mask) > 0;

        System.out.println("Dla liczby " + j + " na " + n + " pozycji znajduje się bit: " + result);

        System.out.println(String.format("%32s",Integer.toBinaryString(j)).replace(' ', '0'));
        System.out.println(String.format("%32s",Integer.toBinaryString(mask)).replace(' ', '0'));
        System.out.println("------------------");
        System.out.println(String.format("%32s",Integer.toBinaryString(j&mask)).replace(' ', '0'));

    }
}
