import java.util.Scanner;
public class LargestNumber{
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of Arrays: ");
     int size=sc.nextInt();
     int [] number=new int[size];
     System.out.println("Enter the Number of Elements in a Array : ");
     for(int i=0;i<number.length;i++){
         number[i]=sc.nextInt();

     }
     int large=number[0];
     for(int  i=0;i<number.length;i++){
        if(large<number[i]){
            large= number[i];
        }
     }
     System.out.println(" The largest number is : " + large);
    }
}