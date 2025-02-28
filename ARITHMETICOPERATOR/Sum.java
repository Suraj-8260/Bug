import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,s;
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        s=a+b;
        System.out.println("sum="+s);
    }
}