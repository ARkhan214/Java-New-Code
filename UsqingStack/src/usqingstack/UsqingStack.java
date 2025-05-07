package usqingstack;

import java.util.Stack;

public class UsqingStack {

    public static void main(String[] args) {

        Stack<String> nameStack = new Stack<>();

        //Value Push Korlam.
        
        nameStack.push("Fariha Mariam");
        nameStack.push("Abdur Rahim Khan");
        nameStack.push("Robin");
        nameStack.push("Simul");
        nameStack.push("Apple");

        System.out.println(nameStack);
        System.out.println("=================");
        //peek
        System.out.println(nameStack.peek());
        
        System.out.println("==================");
        
        //pop
        nameStack.pop();
        System.out.println(nameStack);
        
        //search
        System.out.println("Robin's Name is in Index: "+nameStack.search("Robin"));
        

    }

}
