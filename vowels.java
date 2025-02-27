import java.util.*;
public class vowels 
{
    public static void main(String[] st)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        scan.close();
        switch (s) {
            case "a": 
                System.out.println("vowel");
                break;
            case "e":
                System.out.println("vowel");
                break;
            case "i":
                System.out.println("vowel");
                break;
            case "o":
                System.out.println("vowel");
                break;
            case "u":
                System.out.println("vowel");
                break;
            default:
            System.out.println("Consonents");
                break;
        }
    }
}
