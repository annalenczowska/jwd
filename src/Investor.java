public class Investor {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        System.out.println("");

        float kwota = 14_000;
        System.out.println("Inwestycja początkowa wynosi " + kwota + " zł");

        kwota = kwota + (kwota * 0.4F);
        System.out.println("Po pierwszym roku inwestycja warta jest " + kwota + " zł");

        kwota = kwota - 1500F;
        System.out.println("Po drugim roku inwestycja warta jest " + kwota + " zł");

        kwota = kwota + (kwota * 0.12F);
        System.out.println("Po trzecim roku inwestycja warta jest " + kwota + " zł");
    }
}
