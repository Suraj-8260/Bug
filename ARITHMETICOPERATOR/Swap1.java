import java.util.Scanner;
class Swap1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter values of two variables a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("after swaping a="+a);
        System.out.println("b="+b);
    }
}