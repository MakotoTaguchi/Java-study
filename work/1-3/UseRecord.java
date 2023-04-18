class Record {
    private String studentNo;
    private String studentName;
    private int math, english, japanese, science;

    public Record(String studentNo, String studentName, int math, int english, int japanese, int science) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.math = math;
        this.english = english;
        this.japanese = japanese;
        this.science = science;
    }

    public void dispStudent() {
        System.out.println("学籍番号は" + studentNo);
        System.out.println("氏　　名は" + studentName);
        System.out.println("数　　学は" + math + "点");
        System.out.println("英　　語は" + english + "点");
        System.out.println("国　　語は" + japanese + "点");
        System.out.println("理　　科は" + science + "点");
    }
}

public class UseRecord {
    public static void main(String[] args) {
        Record record = new Record("E01", "Betty", 85, 80, 75, 90);
        record.dispStudent();
        System.out.print("----------------");
        System.out.println();
        record.dispStudent();

    }
}
