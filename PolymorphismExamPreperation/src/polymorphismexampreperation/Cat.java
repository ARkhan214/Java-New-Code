package polymorphismexampreperation;

public class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat Meow");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
