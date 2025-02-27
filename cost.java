import java.util.*;
  class cost
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the cost ");
        double t=scan.nextDouble();
        double cost=0.0;
        scan.close();
        if(t<2000)
        {
            cost=(t)*5/100;
        }
        else if(t>2001 && t<5000)
        {
            cost=(t)*25/100;
        }
        else if(t>5001 && t<10000)
        {
            
            cost=(t)*35/100;
        }
        else if(t>10000)
        {
            cost=(t)*50/100;
        }
        System.out.println("The total cost is "+cost);
    }
}