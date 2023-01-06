public class ClassTester {
    int i; //zmienna egzemplarza (pole klasy - definiowane zaraz na górze)
    static int j = 2; //zmienna klasowa (pole statyczne)

    public int change() {
        int k = 7;      //zmienna lokalna, zdefiniowana w ciele metody
        return i + (k * j);
    }
    public static void main(String[] dowolnaNazwa) {

        ClassTester ct = new ClassTester(); //zmienna lokalna
        ct.i = 4;
        ClassTester ct2 = new ClassTester();
        ct2.i = 9; //zmienna lokalna
        System.out.println(ct.i);

        System.out.println(j);

    }
}

//class A {}      w jednym pliku może istnieć kilka klas, ale tylko jedna może być publiczna

