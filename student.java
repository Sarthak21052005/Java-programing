 class subject_marks 
{
    private String name;
    private int age;
    private int m1,m2,m3;
    private float subject_avg;
    public void accept(String n,int ag,int mark1,int mark2,int mark3)
    {
        name=n;
        age=ag;
        m1=mark1;
        m2=mark2;
        m3=mark3;
    }
    public void average()
    {
        subject_avg=(m1+m2+m3)/3;
    }
    public void display()
    {
        System.out.println("Name :"+name+"\nage :"+age+"\nmarks 1 marks 2 and mark 3 :"+m1+" "+m2+" "+m3+"\nSubject Average :"+subject_avg);
    } 
}
public class student
{
    public static void main(String[] args) {
        subject_marks s= new subject_marks();
        s.accept("Sarthak", 19, 89, 91, 92);
        s.average();
        s.display();
    }
}