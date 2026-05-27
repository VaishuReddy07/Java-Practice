package parametervariable;

public class Student {
    void add(int a, int b) {
        System.out.println( a + b );
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.add(10,20);
    }
}
