import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b,mem;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        mem=2*t*s*b*512;
        System.out.println(mem);
    }
}