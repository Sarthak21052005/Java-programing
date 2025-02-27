class Showroom
{
    private double cost;
    private double dis;
    private double amount;
     long mobno;
     String name;
    
    public Showroom()
    {
        name="name";
        mobno=00000000;
        dis=0.0;
        amount=0.0;
    }
    public void input(String n,long no,double c)
    {
        name=n;
        mobno=no;
        cost=c;
    }
    public void calculate()
    {
        if(cost<=10000)
        {
            dis=(5.0/100)*cost;
        }
        else if(cost>10000 && cost<=20000)
        {
            dis=(10.0/100)*cost;
        }
        else if(cost>20000 && cost<=35000)
        {
            dis=(15.0/100)*cost;
        }
        else if(cost>35000)
        {
            dis=(20.0/100)*cost;
        }
    }
    public void display()
    {
        amount=cost-dis;
        System.out.println("here is your total amount "+amount);
    }
}
 class custom
{
    public static void main (String[] st)
    {
        Showroom s=new Showroom();
        s.input("Sarthak",730222,34000);
        s.calculate();
        s.display();
    }
}
