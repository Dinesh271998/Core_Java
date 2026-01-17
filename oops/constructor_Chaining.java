package oops;

public class constructor_Chaining {
    String name;
    String age;

    public constructor_Chaining(){
        this("unknown");
        System.out.println("Default constructor");
    }

    public constructor_Chaining(String name){
        this("Dinesh", "0");
        System.out.println("single Parameter constructor");
    }
    public constructor_Chaining(String name, String age){
        this.name = name;
        this.age = age;
        System.out.println("Patameterized constructr");
    }

    public static void main(String[] args) {
        constructor_Chaining obj = new constructor_Chaining();
    }
}
