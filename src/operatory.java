public class operatory {

    public static void main(String[] args) {
        // Złożone operatory przypisania

        int x = 7;
        int y = 5;

        System.out.println(x += y);       //x=x+y
        System.out.println(x -= y);       //x=x-y
        System.out.println(x *= y);       //x=x*y
        System.out.println(x /= y);       //x=x/y

        //Operatory logiczne - działają na wartościach logicznych typu boolean
        //  && iloczyn logiczny AND
        boolean test = (x > 2) && (y < 12);
        System.out.println(test);

        //  || suma logiczna OR
        boolean test2 = (x > 2) || (y < 5);
        System.out.println(test);

        //  != alternatywa rozłączna XOR

        //  == równoważność

        //  ! negacja


        // Operatory bitowe - działają na pojedynczych bitach lub parach bitów

        // & iloczyn bitowy AND
        // | suma bitowa OR
        // ^ bitowa różnica symetryczna XOR
        // ~ negacja

        // Przesunięcie bitowe:
        // << w lewo
        // >> w prawo
        // >> w prawo bez znaku

        //Operator warunkowy ?
        // x>5 ? y=0: y=7    jeśli x jest większę od 5 to y równa się 0, jeśli nie jest to y=7


    }
}