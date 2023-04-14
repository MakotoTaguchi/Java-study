import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ensyu18 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("数字を２つ入力して下さい");
            return;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        int input1 = Integer.parseInt(args[0]);
        int input2 = Integer.parseInt(args[1]);

        int num = 0;

        try {
            System.out.println("加減乗除・剰余のいずれを計算しますか？");
            System.out.println("1:加算2:減算3:乗算4:除算5:剰余算9:終了");
            System.out.print("番号を入力して下さい>");
            str = br.readLine();
            num = Integer.parseInt(str);
            switch (num) {
                case 1:
                    System.out.println("加算結果は" + (input1 + input2));
                    break;

                case 2:
                    System.out.println("減算結果は" + (input1 - input2));
                    break;

                case 3:
                    System.out.println("乗算結果は" + (input1 * input2));
                    break;

                case 4:
                    System.out.println("除算結果は" + (input1 / input2));
                    break;

                case 5:
                    System.out.println("剰余算結果は" + (input1 % input2));
                    break;

                case 9:
                    System.out.println("終了");
                    break;

                default:
                    System.out.println("1~5または9を入力してください");
                    break;
            }
        } catch (IOException e) {
            System.out.println("error!");
            return;
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください");
        }
    }
}
