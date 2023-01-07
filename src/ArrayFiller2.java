
public class ArrayFiller2 {
    public static void main(String[] args) {
        Integer n = Integer.parseInt(args[0]);
        int[] Array = new int[n];

        for (int i = 0; i < n; i++)
            Array[i] = i + 1;
        System.out.println("Array" + Array.length);

        for (int a: Array) {
            System.out.print(a);
        }

    }

}
