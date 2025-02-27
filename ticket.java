class railway
{
    private String name;
    private String coach;
    private long mobno;
    private int amt;
    private int totalamt;
public void accept(String n,String c,long mb,int a)
{
    name=n;
    coach=c;
    mobno=mb;
    amt=a;
}
public void update()
{
    if(coach.equalsIgnoreCase("First_AC"))
    {
        totalamt=amt+700;
    }
    else if (coach.equalsIgnoreCase("Second_AC"))
    {
        totalamt=amt+500;
    }    
    else if(coach.equalsIgnoreCase("Third_AC"))
    {
        totalamt=amt+250;
    }
    else if(coach.equalsIgnoreCase("Sleeper"))
    {
        totalamt=amt;
    }
}
public void display()
{
    System.out.println("Name :"+name+"\nCoach :"+coach+"\nTotal amount :"+totalamt+"\nMoblie number :"+mobno);
}
}
public class ticket
{
    public static void main(String[] args)
    {
        railway r=new railway();
        r.accept("Sarthak", "Second_ac", +91_730222,2000);
        r.update();
        r.display();
    }
}