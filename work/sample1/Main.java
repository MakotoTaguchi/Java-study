public class Main {
    public static void main(String[] args) {
        // Personクラスのインスタンス作成
        Person person1 = new Person();
        person1.name = "山田太郎";
        person1.age = 20;
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "佐藤花子";
        person2.age = 25;
        person2.sayHello();
    }
}
