import java.util.Scanner;
class Cube
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float v,a;
        System.out.println("enter side of cube");
        a=sc.nextFloat();
        v=a*a*a;
        System.out.println("volume="+v);
    }
}