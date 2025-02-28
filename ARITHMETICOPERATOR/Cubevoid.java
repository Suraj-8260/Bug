import java.util.Scanner;
class Cubevoid
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float v,l,b,h;
        System.out.println("enter length and breadth,height of cubevoid");
        l=sc.nextFloat();
        b=sc.nextFloat();
        h=sc.nextFloat();
        v=l*b*h;
        System.out.println("volume="+v);
    }
}