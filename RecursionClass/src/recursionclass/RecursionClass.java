
package recursionclass;


public class RecursionClass {

   
    public static void main(String[] args) {
      
//        System.out.println(factorial(5));
        System.out.println(sum1(30, 10));
        
    }
    //factorial
    public static long factorial(int number){
    
        if (number==0) {
            return 1;
        }
        else{
            return number*factorial(number -1);
            }         
        }
    
    //sum
    public static int sum(int k){
        if (k>0) {
            System.out.println(k);
            return k+sum(k-1);
            
        }else{
        return 0;
            }        
        }
    
     //sum1
    public static int sum1(int start, int end){
        if (start>end) {
            System.out.println(start);
            return start+sum(start-end);
            
        }else{
        return end;
            }        
        }
    
    public static int evenOrOdd(int n){
        if (n<=0) {
            System.out.println(" ");
        }
        if (n%2==0) {
            return n;
        }
        
         
    }
    public static int fibonaacci(number n){
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        else{return evenOrOdd(n)-evenOrOdd(n-1);}
         
    }
    
    
    
    
    
}
