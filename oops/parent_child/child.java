package oops.parent_child;

public class child extends parent {
    String age;

    child(String age){
        super("Dinesh");
        this.age = age;
        System.out.println("This is a child with name : " + name + " and age is " + age);
    }

    public static void main(String[] args) {
        child c1 = new child("27");
    }
}
