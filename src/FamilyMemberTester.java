public class FamilyMemberTester {
    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();
        dad.name = "Karol";
        dad.age = 34;
        System.out.println("Nazwisko rodu to: " + dad.surname);
        System.out.println("Nazwisko rodu to: " + FamilyMember.surname);

        FamilyMember moth = new FamilyMember();
        moth.name = "Dorota";
        moth.age = 30;

        System.out.println("Nazwisko rodu to: " + moth.surname);

    }
}

//zmienna surname jest dla całej klasy obiektu - jeśli zmienimy ją np poprzez dad.surname to dla matki też
// się zmieni - bo matka jest obiektem klasy