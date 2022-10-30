import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String customer_id,customer_name;
        int units;
        float fee=1;
        customer_id=s.nextLine();
        customer_name=s.nextLine();
        units=s.nextInt();
        if(units<=199)
        {
            fee=units*1.2f;
        }
        else if(units>=200 && units<400)
        {
            fee=units*1.5f;
        }
        else if(units>=400 && units<600)
        {
            fee=units*1.8f;
        }
        else
        { 
            fee=units*2f;
        }
        if(fee>400)
        {
            
            fee=fee+fee*(0.15f);
        }
        else
        {
            fee=fee+100;
        }
        System.out.format("%.2f" ,fee);
    }
}