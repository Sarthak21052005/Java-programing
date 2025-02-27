class electronics
{
    public static void main(String[] args)
    {
        java.util.Scanner scn=new java.util.Scanner(System.in);
        String choice;
        double discount=0.0,amount,net=0.0;
        System.out.println("Enter the name and address");
        String name=scn.nextLine();
        String address=scn.nextLine();
        System.out.println("What do you want to but D for desktop or L for laptop");
        choice=scn.next();
        switch(choice)
        {
            case "D":
            System.out.println("you Choose Desktop!!");
            System.out.println("Enter the value ");
            amount=scn.nextDouble();
            if(amount>0.0 && amount <25000.0)
            {
                discount=(5.0/100)*amount;
                net=amount-discount;
            }
            else if(amount>25001 && amount <57000)
            {
                discount=(7.6/100)*amount;
                net=amount-discount;
            }
            else if(amount>57001 && amount<100000)
            {
                discount=(10.0/100)*amount;
                net=amount-discount;
            }
            else if(amount>100000)
            {
                discount=(15.0/100)*amount;
                net=amount-discount;
            }
            System.out.println("The name"+name+"\naddress "+address+"\nThe net amount "+net);
            break;
            case "L":
            System.out.println("you Choose Laptop!!");
            System.out.println("Enter the value ");
            amount=scn.nextDouble();
            if(amount>0.0 && amount <25000.0)
            {
                discount=(0.0/100)*amount;
                net=amount-discount;
            }
            else if(amount>25001 && amount <57000)
            {
                discount=(5.0/100)*amount;
                net=amount-discount;
            }
            else if(amount>57001 && amount<100000)
            {
                discount=(7.5/100)*amount;
                net=amount-discount;
            }
            else if(amount>100000)
            {
                discount=(10.0/100)*amount;
                net=amount-discount;
            }
            System.out.println("The name: "+name+"\naddress: "+address+"\nThe net amount "+net);
            break;
            default:
            System.out.println("try again");
            break;
        }
        scn.close();
    }
}