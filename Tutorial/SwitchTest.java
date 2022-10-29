public class SwitchTest {
    public static void main(String[] args) {
        int myAge = 25;
        switch (myAge) {
            case 5:
                System.out.println("私の年齢は5歳です！");
            case 15:
                System.out.println("私の年齢は15歳です！");
            case 25:
                System.out.println("私の年齢は25歳です！");
            case 35:
                System.out.println("私の年齢は35歳です！");
                break;
            case 45:
                System.out.println("私の年齢は45歳です！");
            default:
                System.out.println("私の年齢はその他です！");
        }
    }
}
