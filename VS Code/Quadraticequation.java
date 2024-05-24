
import java.util.Scanner;
public class Quadraticequation{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  value of A: ");
        double a=sc.nextDouble();
        System.out.println("Enter the  value of B: ");
        double b =sc.nextDouble();
        System.out.println("Enter the  value of C: ");
        double c=sc.nextDouble();
        double  root1;
        double  root2;
        double i=b*b-4*a*c;
        if(i<0){
            System.out.println("Roots  are imaginary");
        }
        if(i==0){
            System.out.println("Roots  are equal");
        }
        root1=-b/(2*a);
        root2=-b/(2*a);
        if(i>0){
            System.out.println("Roots are unequal");
        }     
        root1=(-b+Math.sqrt(i))/(2*a);
        root2=(-b+Math.sqrt(i))/(2*a);
        System.out.println("The quadratic equation is: ");
        System.out.println("Root1 :  "+ root1);
        System.out.println("Root2 :  "+ root2);
    }
}







        

        





    
