import java.util.StringTokenizer;

public class BirthDate {
    public static void main(String[] args) {


        String birthday = "29/04/2016";
        StringTokenizer birth = new StringTokenizer(birthday, "/");
        System.out.println("Dzień: " + birth.nextToken());
        System.out.println("Miesiąc: " + birth.nextToken());
        System.out.println("Rok: " + birth.nextToken());

    }
}
