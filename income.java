import java.util.*;
  class income
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner((System.in));
        System.out.println("Enter the gender age and tax income");
        String gender=scn.nextLine();
        int age=scn.nextInt();
        int t=scn.nextInt();
        int income_tax=0;
        scn.close();
        if(age>65 || gender.equals("female"))
        {
            System.out.println("Wrong categories");
        }
        else
        {
            if(t>160000 && t <500000)
            {
                income_tax=(t-160000)*10/100;
            }
            else if(t<500000 && t>800000)
            {
                income_tax=(t-500000)+34000;
            }
            else if(t>800000)
            {
                income_tax=(t-800000)+94000;
            }
            System.out.println("The gender is "+gender+"income tax is equals to "+income_tax);
        }
    }
}