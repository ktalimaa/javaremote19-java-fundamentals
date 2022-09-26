package examples.objects;

public class ObjectExample {
    public String name;    //specifier must always be public to use it
    public int a;


    // Non-parameterized constructor or Normal constructor
    public ObjectExample() {
        System.out.println("Constructing Object Example");
        name = "Kristel Talimaa";
        a = 6;
    }

    public static void main(String[] args) {
        ObjectExample2 objectExample2 = new ObjectExample2();
    }

    // Parameterized Constructor - if you have any parameters inside ()
    public ObjectExample(int age, String name) {
        System.out.println(age);
        System.out.println(name);
    }


}
