public class EqualsTester {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "Ale to się rozrasta";
        str2 = str1;

        str2 = new String(str1);   //inny obiekt, choć ten sam napis
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));  //lepiej nie używać, bo mogą się pojawić problemy
        System.out.println("Ta sama wartość? " + (str1.equals(str2)));

        System.out.println("-------");


    }
}
