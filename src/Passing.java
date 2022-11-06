import java.awt.*;

public class Passing {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Przed zmianą " + i);
        changeIt(i);
        System.out.println("Po zmianie " + i);

        Point p = new Point(1, 1);
        System.out.println("Przed zmianą " + p);
        changeIt(p);
        System.out.println("Po zmianie " + p);
    }

    static void changeIt(int i) {
        System.out.println("Zmieniam i");
        i++;
        System.out.println("Chwilowo zmienna lokalna ma wartość: " + i);
    }

    static void changeIt(Point p) {
        p = new Point(4, 4);
        p.x++;
        p.y++;

    }
}
