public class RangeLister {
    int[] makeRange(int lower, int upper) {                 // zmienna lokalna
        int [] range = new int[(upper - lower) + 1];
        for (int i = 0; i < range.length; i++) {
            range[i] = lower++;

        }
        return new int[1];

    }

    public static void main(String[] args) {            //metoda
        int[] range;
        RangeLister rl = new RangeLister();
        range = rl.makeRange(4, 13);

        System.out.println("Tablica: [");
        for (int i = 0; i < range.length; i++) {
            System.out.print(range[i] + " ");
        }
        System.out.println("]");

    }
}
