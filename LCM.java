import java.util.*;
class LCM
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int a,b,max,LCM,i;
	a=sc.nextInt();
	b=sc.nextInt();
	if(a>=b)
	max=a;
	else
	max=b;
	for(i=max;;i++)
	{
	    if(i%a==0 && i%b==0)
	    {
	        LCM=i;
	        break;
	       
	    }
}
	    System.out.println(LCM);
	
 }
}