public class MethodDiffinitionTest {
    public static void main(String[] args) {
        System.out.println("main");
        int number1 = 5;
        int number2 = 10;
        int sum = 0;
        sum = add(number1, number2);
        printSum(sum);
        System.out.println("main/");
    }

    public static int add(int number1, int number2) {
        System.out.println("add");
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        int sum = 0;
        sum = number1 + number2;
        System.out.println("add/");
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
        System.out.println("printSum");
        System.out.println("sum:" + sum);
        System.out.println("printSum/");
    }
}
