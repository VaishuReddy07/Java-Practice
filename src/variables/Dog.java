package variables;

public class Dog {
    public String breed = "German Shepard";
    //variable
    public int height = 30;

    public static void main(String[] args) {
        System.out.println("Dog");
        //object
        Dog dog = new Dog();
        System.out.println(dog.breed);

    }
}
