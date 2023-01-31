public class DoWhileTest {
    public static void main(String[] args) {
        System.out.println("番号！");
        int number = 11;
        do {
            System.out.println(number + "！");
            number--;
        } while (number <= 10 && number >= 1);
    }
}
