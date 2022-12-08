public class FrequentNumber {
    public static void main(String[] args) {

        int[] arr = {1, 12, 33, 4, 33, 65, 33, 76, 33, 97};
        int[] counters = new int[100];  //ilość elementow ktore moga znajdowac sie w naszym zbiorze

        for (int i = 0; i < arr.length ; i++) {
            counters[arr[i]]++;
        }
        int mostFrequent = 0;

        for (int i = 0; i < counters.length ; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;

        }
        }
        System.out.print("Najczęściej występującą cyfrą jest cyfra " + mostFrequent);
        System.out.println(" , wystąpiła " + counters[mostFrequent] + " razy.");

    }

}
