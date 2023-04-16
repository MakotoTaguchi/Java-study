import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ensyu19 {
    public static void main(String[] args) {
        String str = null;
        int firstNum = 0;
        int secondNum = 0;
        boolean judge = true;
        boolean which = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (judge) {
            try {
                System.out.print("1つめの数値を入力してください>");
                str = br.readLine();
                firstNum = Integer.parseInt(str);
                System.out.print("二つめの数値を入力してください>");
                str = br.readLine();
                secondNum = Integer.parseInt(str);
                System.out.println("加算結果は" + (firstNum + secondNum));
                System.out.println("減算結果は" + (firstNum - secondNum));
                System.out.println("乗算結果は" + (firstNum * secondNum));
                System.out.println("除算結果は" + (firstNum / secondNum));
                System.out.println("剰余算結果は" + (firstNum % secondNum));
                System.out.println();

                which = true;

                while (which) {
                    System.out.print("続行しますか(Y/N)>");
                    str = br.readLine();

                    if (str.equalsIgnoreCase("Y")) {
                        which = false;
                    } else if (str.equalsIgnoreCase("N")) {
                        System.out.println("終了");
                        return;
                    }
                }
            } catch (IOException e) {
                System.out.println("error!");
                return;
            } catch (NumberFormatException e) {
                System.out.println("数字を入力してください");
            }
        }
    }
}
