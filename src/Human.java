//Stwórz klasy Human oraz Boy ustawiając je w odpowiedniej relacji.
// Na przykładzie symbolicznej metody eat() zademonstruj działanie mechanizmu przesłaniania. // spóbowac zapisac to w jednym pliku
public class Human {

    String s = "eating";

    void eat() {
        System.out.println("Boy is " + s + ".");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
    }


}
