import java.util.Scanner;

public class Topperproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int regno=sc.nextInt();
        int rem,even=0,odd=0;
        while(regno>0)
        {
            rem=regno%10;
            if(rem%2==0)
            {
                even+=rem;
            }
            else
            {
                odd+=rem;
            }
            regno/=10;
        }
        if(even==odd)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
