/*
public class DayCounter {
    public static void main(String[] args) {
        int yearIn = 2016;
        int monthIn = 1;

        if (args.length > 0) {      //zawartość tablicy
            monthIn = Integer.parseInt(args[0]);        //metoda parseInt służy do parsowania ciągu znaków
        }
        if (args.length > 1) {
            yearIn = Integer.parseInt(args[1]);
        }
        System.out.print(monthIn + "/" + yearIn);
        System.out.println(" ma " + countDays(monthIn, yearIn) + " dni.");  //wprowadzamy metodę countDays
    }
    // poza metodą main definujemy metodę statyczną countDays
    static int countDays(int month, int year) {
        int count = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    count = 29;
                } else {
                    count = 28;
                }
                // do sprawdzenia w domu
                // if ((year % 100 == 0) && (year % 400 != 0)){
                // count = 28;
        }
    }
        return count;
    }

*/
