package polymorphismexampreperation;

public class PolymorphismExamPreperation {

    public static void main(String[] args) {

        Animal a= new Animal();
        a.setName("Dog");
        System.out.println(a);
        Dog d = new Dog();
          
        d.setName("Puppy");
        d.sound();
        System.out.println(d);
        
    }

}
