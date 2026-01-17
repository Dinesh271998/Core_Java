package oops;

public class CopyConstructor {
    int id;
    String name;

    // Parameterized constructor
    CopyConstructor(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor
    @SuppressWarnings("unused")
    CopyConstructor(CopyConstructor c) {
        this.id = c.id;
        this.name = c.name;
    }

    @SuppressWarnings("unused")
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(1, "Alice");
        // CopyConstructor obj2 = new CopyConstructor(obj1); // Using copy constructor

        // obj1.display();
        // obj2.display();

        CopyConstructor obj2 = obj1; // Reference copy
        System.out.println(obj2.name);
        obj2.name = "Bob";
        System.out.println(obj1.name);
    }
}
