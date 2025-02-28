import java.util.Scanner;
class Circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,p,r;
        double pi=3.141;
        System.out.println("enter radius of circle");
        r=sc.nextDouble();
        a=pi*r*r;
        p=2*pi*r;
        System.out.println("area="+a);
        System.out.println("perimeter="+p);
    }
}