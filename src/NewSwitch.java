public class NewSwitch {
    public static void main(String[] args) {
        String str = "dwa";
        int number;

        /*switch (str) {
            case "jeden":
            case "jedynka":
                number = 1;
                break;
            case "dwa":
            case "dwójka":
                number = 2;
                break;
            case "trzy":
            case "trójka":
                number = 3;
                break;
            default:
                number = 0;*/

        number = switch (str) {            //jest to wersja wyrażeniowa
            case "jeden", "jedynka" -> 1;
            case "dwa", "dwójka" -> 2;
            case "trzy", "trójka" -> 3;
            default -> 0;
        };
        System.out.println(number);
    }
}
