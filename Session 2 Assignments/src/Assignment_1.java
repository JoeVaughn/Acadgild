import java.util.Scanner;

public class Assignment_1 {

     public static void main(String args[])
     {
   	 
        Scanner s = new Scanner(System.in);
   		System.out.println("Enter your age");
   		int age = s.nextInt();
   		s.close();
    	 
        if(age < 18)
        {
        	System.out.println("You're eligible to vote!");
        }
        
        else
        {
        	System.out.println("You're not eligible to vote. Sorry");
        }
        
     }
}