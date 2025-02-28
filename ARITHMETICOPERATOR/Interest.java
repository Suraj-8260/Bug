import java.util.Scanner;
class Interest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float si,p,r,t;
        System.out.println("enter principle amount,rate and time");
        p=sc.nextFloat();
        r=sc.nextFloat();
        t=sc.nextFloat();
        si=p*r*t/100;
        System.out.println("simpleinterest="+si);
    }
}