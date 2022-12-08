public class BinaryConverter {
    public static void main(String[] args) {

        String binary = "1101111";
        Long result = 0L;

        for (int i = 0; i < binary.length(); i++) {
            int reversIndex = binary.length() - 1 - i;
            char c = binary.charAt(reversIndex);
            int bit = Character.getNumericValue(c);

            result += bit * (long) Math.pow(2, i);

        }
        System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie.");
        System.out.println();
        System.out.println(binary);
        System.out.println(Long.toBinaryString(result));

    }
}

