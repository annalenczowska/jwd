public class ScopeTest {
    int test = 10;

    void printTest () {
        System.out.println("Test: " + test);
        int test = 20;
        System.out.println("Test: " + test);
    }

    public static void main(String[] args) {
        ScopeTest sc = new ScopeTest();
        sc.printTest();
    }
}
