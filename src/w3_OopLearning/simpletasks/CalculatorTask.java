package w3_OopLearning.simpletasks;

public class CalculatorTask {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 25;
        int b = 44;

        int sum = calc.getSum(a,b);
        System.out.println(sum);
        int multiply = calc.getMultiply(a,b);
        System.out.println(multiply);
    }
}
