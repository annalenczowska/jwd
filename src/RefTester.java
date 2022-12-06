import java.awt.*;

public class RefTester {
    public static void main(String[] args) {

        // String str1 = "jakiś tekst";
        // System.out.println(str1.getClass().getSimpleName());  //określenie klasy

        // Object obj = new Object();
        //System.out.println("Teksas" instanceof String);    sprawdzamy czy napis "Teksas" jest instancją klasy string
        //System.out.println("Teksas" instanceof Object);

        Point pt1, pt2;     //wywołujemy klasę Point
        pt1 = new Point(100,100);
        pt2 = pt1;  //mamy tylko jeden obiekt, mamy dwie referencje do tego samego obiektu

        pt1.x = 200;    //zmieniamy wartość x na 200
        pt1.y = 200;

        System.out.println(pt1);
        System.out.println(pt2);




    }
}
