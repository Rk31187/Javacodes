import java.util.Scanner;
public class main ram{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the first number: ");
        n1=sc.nextInt();
        System.out.println("Enter the second number:  ");
        n2=sc.nextInt();
        int tn1=n1,tn2=n2;
        while(n1%n2!=0){
            int r=n1%n2;
            n1=n2;
            n2=r;
        }
        int lcm=(tn1*tn2)/n2;
        System.out.println("GCD:" + n2);
       System.out.println("LCM:" + lcm);

    }
}