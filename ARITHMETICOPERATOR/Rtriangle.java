import java.util.Scanner;
class Rtriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,h;
        System.out.println("enter base and height of triangle");
        b=sc.nextFloat();
        h=sc.nextFloat();
        a=b*h/2;
        System.out.println("area="+a);
    }
}