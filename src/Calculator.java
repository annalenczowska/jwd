// Napisz program Calculator posiadający metody o nazwie add sumujące 2 lub 3 liczby typu int lub double.
// 4 metody, 2 dla liczb typu int, dwie dla liczb typu double
public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 1));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }

}

// Calculator calc = new Calculator();
//int res1 = calc.add(1, 2);
//double res2 = calc.add(1.0, 2.4, 3.4);