
package hakerrankcodepractice;

import java.util.Scanner;


public class HakerRankCodePractice {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
    int n = scanner.nextInt();
        if(2 % n != 0){
            
           System.out.println("Weird"); 
        }
        
        else if(n%2==0 && n>=2 && n<=5){
           System.out.println("Weird"); 
        }
         else if(n%2==0 && n>=6 && n<=20){
           System.out.println("Weird"); 
        }
        else if(2%n==0 && n>20){
           System.out.println("Not Weird"); 
        }          
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // scanner.close();
    }
        
        
        
    } 

