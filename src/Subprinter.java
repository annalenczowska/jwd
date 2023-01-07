public class Subprinter extends Printer {
    int z = 3;

    void printMe(int i) {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        System.out.println("Jestem egzemplarzem klasy " + this.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        Subprinter subprinter = new Subprinter();
        subprinter.printMe();
    }
}
