public class Boy extends Human{
    String c = "cake";

    void eat() {
        System.out.println("Boy is " + s + " " + c + ".");
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();
    }
}
