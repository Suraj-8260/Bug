import java.util.Scanner;
class Swap2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter values of variables a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping a="+a);
        System.out.println("b="+b);
    }
}