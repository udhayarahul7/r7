import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Start range: ");
        int start=sc.nextInt();
        System.out.println("End range: ");
        int end=sc.nextInt();
        
        while(start<=end)
        {
            String s=String.valueOf(start);
            for(int i=0;i<s.length();i++)
            {
                String s1=String.valueOf(s.charAt(i));
                if(s1.equals("1"))
                {
                    count++;
                }
            }
            start++;
        }
        System.out.print(count);
        
        }
    }