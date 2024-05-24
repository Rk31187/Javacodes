import java.util.Scanner;
public class Palindrone{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the number: ");
        int input=sc.nextInt();
        int output=input;
        StringBuffer ac=new StringBuffer(String.valueOf(input));
        StringBuffer rev=ac.reverse();
        if(String.valueOf(output).equals(rev.toString())){
            System.out.println(input + "It is  palindrone" );
        }
        else{
            System.out.println(input + "It is not a palindrone");


        }
            
        }
    }
