import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter x and y");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    
    System.out.println("Before Swapping");
    System.out.println("x = "+num1);
    System.out.println("y = "+num2);
    
    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;
    
    System.out.println("After Swapping wiyhout a third variable");
    System.out.println("x = "+num1);
    System.out.println("y = "+num2);
    }
}