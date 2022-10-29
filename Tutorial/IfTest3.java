public class IfTest3 {
    public static void main(String[] args) {
        int myAge = 35;
        char myBloodType = 'A';
        if (myAge == 35 && myBloodType == 'B') {
            System.out.println("私の年齢は35歳で血液型はB型です!");
        } else if (myAge == 35 && myBloodType == 'A') {
            System.out.println("私の年齢は35歳で血液型はA型です!");
        } else if (myAge == 40 && myBloodType == 'A') {
            System.out.println("私の年齢は40歳で血液型はA型です!");
        }

        else {
            System.out.println("私の年齢は35歳ではないです!");
        }
        System.out.println("私の出身地は...");
    }
}
