public class sevenTest {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        while (b < 1000) {
            if (b % 7 == 0) {
                a = a + b;
                System.out.println(" " + b);
                b++;
            } else {
                b++;
            }
        }
        System.out.println(a);
    }
}
