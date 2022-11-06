public class Arrays1 {
    public static void main(String[] args) {
        int[] arrr = {2, 4 ,5, 4, 6, 7, 6, 4, 9, 4};
        int[] counters = new int[10];        //nie symbolizuje ilości elementów, ale ilość elementów które liczymy a cyfr mamy zawsze 10

        for (int i = 0; i < arrr.length; i++) {  //lenght pokazuje nam dlugosc tablicy
            counters[arrr[i]]++;
        }

        for (int i : counters) {
            System.out.println(i + " - " + counters[i]);
        }

        int mostFrequent = 0;

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;
            }
        }

        System.out.println("Najczęściej występującą cyfrą jest cyfra " + mostFrequent);
        System.out.println("Wystąpiła " + counters[mostFrequent] + " razy.");



    }
}
