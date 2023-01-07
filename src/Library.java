public class Library {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Pan Samochodzik i zlota rekawica", "Zbigniew Nienacki", "Siedmioróg", 2018),
                new Book("Pan Samochodzik i zlota rekawica", "Zbigniew Nienacki", "Siedmioróg", 2018),
                new Book("Pan Samochodzik i Templariusze", "Zbigniew Nienacki", "Siedmioróg", 2017),
        };

        Book book1 = books[0];
        Book book2 = books[1];

        System.out.println("Książka 1: " + book1);
        System.out.println("Książka 2: " + book2);

        if (book1.equals(book2)) {
            System.out.println("To dwie identyczne ksiązki");
        }
        else {
            System.out.println("To dwie różne książki!");
        }


    }
}

