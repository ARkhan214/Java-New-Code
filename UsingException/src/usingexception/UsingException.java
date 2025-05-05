package usingexception;

public class UsingException {

    public static void main(String[] args) {

        try {
            int divition = 10 / 0;
            System.out.println("Result is: " + divition);

        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Exicution Finished");

        }
        

    }

}
