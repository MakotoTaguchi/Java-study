import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferTest {
    public static void main(String[] args) {
        String str = null;
        int firstNum = 0;
        int secondNum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("最初の数値を入力して下さい>");
            str = br.readLine();
            firstNum = Integer.parseInt(str);
            System.out.println("二番目の数値を入力して下さい>");
            str = br.readLine();
            secondNum = Integer.parseInt(str);
            System.out.println("二つの数値の合計は" + (firstNum + secondNum));
        } catch (IOException e) {
            System.out.println("error!");
            return;
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください");
        }
    }
}
