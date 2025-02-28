import java.util.Scanner;
class Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,p,l,b;
        System.out.println("enter length and breadth of triangle");
        l=sc.nextFloat();
        b=sc.nextFloat();
        a=l*b;
        p=2*l+b;
        System.out.println("area="+a);
        System.out.println("perimeter="+p);
    }
}