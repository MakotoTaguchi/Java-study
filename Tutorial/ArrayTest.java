public class ArrayTest {
    public static void main(String[] args) {
        String name = "鈴木太郎";
        String email = "suziki_taro@xxxx.com";
        String phone = "090-0000-9999";
        System.out.println(name);
        System.out.println(email);
        System.out.println(phone);

        String[] customer;
        customer = new String[3];
        customer[0] = name;
        customer[1] = email;
        customer[2] = phone;

        for (int i = 0; i < customer.length; i++) {
            System.out.println(customer[i]);
        }

        System.out.println();

        String[] customer2 = { "鈴木太郎", "suziki_taro@xxxx.com", "090-0000-9999" };

        for (String customer2Value : customer2) {
            System.out.println(customer2Value);
        }
    }
}
