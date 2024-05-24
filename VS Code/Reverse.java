import java.util.Scanner;
public class Reverse{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num=sc.nextInt();
        int rev=0;
        while(num!=0){
            rev=rev*10 + num%10;
            num=num/10;
        }

        System.out.println("Reverse the number :"+ rev);

    }
}
// another method

//import java.util.Scanner;
public class Reverse{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int output=sc.nextInt();
        StringBuffer ac=new StringBuffer(String.valueOf(output));
        StringBuffer rev=ac.reverse();
        System.out.println("The Reverse number is :" + rev);
        
    }
}/