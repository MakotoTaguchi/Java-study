public class MethodDiffinitionTest {
    public static void main(String[] args) {
        System.out.println("main");
        int intSum = 0;
        double doubleSum = 0;
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);
        intSum = add(number1, number2, number3, 40);
        printSum(intSum);
        doubleSum = add(5.0, 10.0);
        printSum(doubleSum);
        System.out.println("main/");
    }

    public static int add(int... numbers) {
        System.out.println("add(int[])");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers" + i + ":" + numbers[i]);
            sum += numbers[i];
        }
        System.out.println("add(int)/");
        return sum;
    }

    public static double add(double number1, double number2) {
        System.out.println("add(double)");
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        double sum = 0;
        sum = number1 + number2;
        System.out.println("add(double)/");
        return sum;
    }

    public static void add2() {
        System.out.println("add2");
        int number1 = 50;
        int number2 = 100;
        int sum = 0;
        sum = number1 + number2;
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        System.out.println("sum:" + sum);
        System.out.println("add2/");
    }

    public static void printSum(int sum) {
        System.out.println("printSum(int)");
        System.out.println("sum:" + sum);
        System.out.println("printSum(int)/");
    }

    public static void printSum(double sum) {
        System.out.println("printSum(double)");
        System.out.println("sum:" + sum);
        System.out.println("printSum(double)/");
    }
}
