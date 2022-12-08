public class BinaryConverter2 {
    public static void main(String[] args) {

        String binary = "11011"; //1 * 2^0 + ...
        Long result = 0L;

        //1  1  0  1     liczba binarnie
        //0  1  2  3     indeksy liczby - indeks (i)
        //3  2  1  0     potrzebujemy użyć indeksu odwrotnego, od długości odejmujemy 1 - indeks odwrócony, reversIndex

        for (int i = 0; i < binary.length(); i++) {
            int reversIndex = binary.length() - 1 - 1;
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);

            //1 * 2^0 + o * 2^1 + 1*2^2 + 1 *2^3 = 1 + 0 + 4 + 8 = 13
            result += bit * (long)Math.pow(2, i);

        }
        System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie.");
        System.out.println();
        System.out.println(binary);
        // System.out.println(Integer.toBinaryString(result));


    }
}
