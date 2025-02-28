import java.util.Scanner;
class Cylinder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double v,r,h;
        double pi=3.141;
        System.out.println("enter radius and height of cylinder");
        r=sc.nextDouble();
        h=sc.nextDouble();
        v=pi*r*r*h;
        System.out.println("volume="+v);
    }
}