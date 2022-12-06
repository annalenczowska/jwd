import java.util.StringTokenizer;

public class BirthDate {
    public static void main(String[] args) {

        String birthday = "29/04/2016";
        StringTokenizer birth = new StringTokenizer(birthday, "/");
        System.out.println("Urodziny: " + birthday);
        System.out.println("Dzień: " + birth.nextToken());
        System.out.println("Miesiąc: " + birth.nextToken());
        System.out.println("Rok: " + birth.nextToken());

        System.out.println();

        String day = birthday.substring(0,2);
        String month = birthday.substring(3,5);
        String year = birthday.substring(6,10);

        System.out.println("Urodziny: " + birthday);
        System.out.println("Dzień: " + day);
        System.out.println("Miesiąc: " + month);
        System.out.println("Rok: " + year);

    }
}
