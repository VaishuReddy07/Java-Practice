package staticvariables;

public class Student {
    static int id =110;
    String name = "Vaishnavi";

    public static void main(String[] args) {
        System.out.println(id);
        Student student = new Student();
        System.out.println(student.name);
    }
}
