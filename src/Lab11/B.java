package Lab11;

public class B extends A{
    public B() {
        System.out.println("Konstruktor B");
    }

    public B(boolean isSilent) {
        super(isSilent);
        if (!isSilent) {
            System.out.println("Konstruktor B(" + isSilent + ")");
        }

    }
}
