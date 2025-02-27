 class moviemagic
{
     int year;
     String title;
    private float rating;
    public void accept(int y,String t,float rate)
    {
        year=y;
        title=t;
        rating=rate;
    }
    public void display()
    {
        if(rating>=0.0 && rating <=2.0)
        {
            System.out.println("flop");
        }
        else if(rating>=2.1 && rating<=3.4)
        {
            System.out.println("Semi hit");
        }
        else if(rating>=3.5 && rating <=4.5)
        {
            System.out.println("Hit");
        }
        else if(rating >=4.6 && rating<=5.0)
        {
            System.out.println("Super hit");
        }
    }
}
class movie
{
    public static void main(String[] args) {
        moviemagic m=new moviemagic();
        java.util.Scanner scn=new java.util.Scanner(System.in);
        float review;
        String name=scn.nextLine();
        int year=scn.nextInt();
        review=scn.nextFloat();
        m.accept(year,name,review);
        scn.close();
        m.display();
    }
}