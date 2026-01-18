package constructor;

public class CopyConstructor {
    String name;
    int age;

    //Paremeterized Constructor
    public CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Copy Constructor
    public CopyConstructor(CopyConstructor cc) {
        this.name = cc.name;
        this.age = cc.age;
    }
}
