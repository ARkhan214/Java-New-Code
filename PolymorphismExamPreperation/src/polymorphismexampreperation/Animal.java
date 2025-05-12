package polymorphismexampreperation;

public class Animal {

    public String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Every Animal Diffrent Sound");

    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }

}
