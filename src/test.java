import java.util.*;
public class test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int ans=1;
        while(n!=1)
        {
            ans=ans*n;
            n--;
        }
        System.out.println("Factorial of number "+n+" is "+ans);
    }
}
