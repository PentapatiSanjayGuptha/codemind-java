import java.util.Scanner;
class Main
{
 public static int countdivisors(int m,int n,int o) 
{
 int count=0;
 for(int i=m;i<=n;i++)
 {
 if(i%o==0) count++; } return count; 
} 
public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int l,r,k,result; 
l=sc.nextInt();
 r=sc.nextInt(); 
k=sc.nextInt(); 
result=countdivisors(l,r,k); 
System.out.println(result);
}
}