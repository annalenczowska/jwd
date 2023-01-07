package Lab11;

public class C extends B{
    public C() {
        System.out.println("Konstruktor C");
    }
    public C(boolean isSilent) {
        super(isSilent);
        if (!isSilent) {
            System.out.println("Konstruktor C(" + isSilent + ")");
        }

    }
}
