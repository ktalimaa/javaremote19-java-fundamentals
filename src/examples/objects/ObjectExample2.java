package examples.objects;

public class ObjectExample2 {
    public ObjectExample2() {
        System.out.println("Hello ObjectExample2");
    }

    public static void main(String[] args) {
        ObjectExample objectExample = new ObjectExample();
        System.out.println(objectExample.name);
        System.out.println(objectExample.a);

    }
}
