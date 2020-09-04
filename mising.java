import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        Set<Integer>al=new TreeSet<Integer>();
        int small=10000000;
        while(sc.hasNext())
        {
            int t=sc.nextInt();
            al.add(t);
            if(t<small)
            {
                small=t;   
            }
        }
        
        for(Integer num:al)
        {
            if(small!=num)
            {
                System.out.print(small);
                return;
            }
            small++;
        }
    }
}