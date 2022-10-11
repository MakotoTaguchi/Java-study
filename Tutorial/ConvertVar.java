public class ConvertVar {
    public static void main(String[] args) {
        int number1 = 100;
        long number2 = 200;
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
        number2 = number1;
        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);
    }
}
