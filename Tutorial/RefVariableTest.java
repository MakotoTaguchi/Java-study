public class RefVariableTest {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        num2 += 1;
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);

        int[] numArray1 = { 1, 2 };
        int[] numArray2 = numArray1;
        numArray2[1] += 1;

        System.out.println("numArray1:" + numArray1[1]);
        System.out.println("numArray2:" + numArray2[1]);
    }
}
