import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
           Scanner scnr =new Scanner(System.in);
           System.out.println("Enter num1");
           int num1 = scnr.nextInt();
           System.out.println("Enter num2");
           int num2 = scnr.nextInt();
           int total = num1 + num2;
           System.out.println("Total = "+ total);

           scnr.close(); 

 
    }
    
}

