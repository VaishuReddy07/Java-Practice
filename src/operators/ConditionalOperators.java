package operators;

public class ConditionalOperators {
    public static void main(String[] args) {
        int i = 32;
        int j = 45;
        System.out.println(i < j && i!=j);
        System.out.println(i < j && i==j);
        System.out.println(i < j || i==j);

        // &&
        //true - true -> true
        //true - false -> false
        //false - true -> false
        //false - false -> false

        //||
        //true - true -> true
        //true -  false -> true
        //false - true -> true
        //false - false -> false
    }
}
