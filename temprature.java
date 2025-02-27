import java.util.*;
class temprature
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter 1 for convert fahrenheit to celsuis and 2 for celsuis to fahrenheit");
        int choice=scn.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the value");
                double f;
                f=scn.nextDouble();
                double C=(5.0/9.0)*(f-32.0);
                System.out.println(C);
                break;
            case 2:
                System.out.println("Enter the value");
                double c;
                c=scn.nextDouble();
                double F=(32)+(c*(9.0/5.0));
                System.out.println(F);
                break;
                default:
                    System.out.println("wrong choice");
                    break;
        }
        scn.close();
    }
}