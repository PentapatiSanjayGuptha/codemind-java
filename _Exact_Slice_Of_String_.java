import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=sc.nextInt();
        int b=sc.nextInt();
        String c=s.substring(a,b+1);
        System.out.print(c);
    }
}