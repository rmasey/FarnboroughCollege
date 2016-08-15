import java.util.Scanner;

public class numbers 
{ 
    public static void main(String[] args) 
    { 

        Scanner input = new Scanner(System.in);   //create Scanner object to take input, object name is input

        System.out.println("Enter your age: " );
        int age = input.nextInt();             // take int input
        int ageAdd20 = age + 20;
        System.out.println("My new age is : " + ageAdd20);         
        
        int myNumber = 5;
        myNumber++; 
        System.out.println("My number + 1 is: " + myNumber);         
        
        int myNumberDividedBy3Remainder = myNumber % 3;
        System.out.println("Remainder of my number divided by 3 : " + myNumberDividedBy3Remainder);  
        

    } 
} 
