package constructor;

public class Run {
    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor("Dinesh", 27);
        CopyConstructor obj2 = obj1; // Reference Copy

        System.out.println("object 2 name: " + obj2.name);

        obj2.name = "Tomar";
        System.out.println("object 1 name: " + obj1.name);
    }
}
