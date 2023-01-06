public class BinaryConverter {
    public static void main(String[] args) {

        String binary = "1101";
        Long result = 0L;

        // 1    1   0   1   liczba binarnie
        // 0    1   2   3   indeks liczb (i)
        // 3    2   1   0   potrzebujemy odwrotnego indeksu,aby to otrzymać, potrzebujemy
        //                  długość liczby (tu 4) - 1 - i (indeks) = reverseIndex (wartość odwróconego indeksu)

        for (int i = 0; i < binary.length(); i++) {
            int reversIndex = binary.length() - 1 - i;
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);

            // 1 * 2^0 + 0 * 2^1 + 1 * 2^2 + 1 * 2^3
            result += bit * (long) Math.pow(2, i);  // Math.pow(2, 2) = 2 do potęgi drugiej

        }
        System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie.");
        System.out.println();
        System.out.println(binary);
        System.out.println(Long.toBinaryString(result));

    }
}

