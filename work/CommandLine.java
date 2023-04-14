public class CommandLine {
    public static void main(String[] args) {
        // 引数が1つ以上あるかどうかをチェックする
        if (args.length < 1) {
            System.out.println("Usage: java CommandLineArguments <string>");
            return;
        }

        // 最初の引数を大文字に変換して出力する
        String input = args[0];
        String output = input.toUpperCase();
        System.out.println(output);
    }
}
