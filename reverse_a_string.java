import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int n;
        s=sc.nextLine();
        n=s.length();
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}