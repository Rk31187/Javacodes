import java.util.Scanner;
public class square{
    public static  void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int i=sc.nextInt();
        System.out.println("Square of the number is "+(i*i));
        sc.close();

        
    }
}