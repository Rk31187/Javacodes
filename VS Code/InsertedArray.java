import java.util.Scanner;
public class InsertedArray{
    public static void main(String[]args){
        int []arr=new int[6];
        System.out.println("Enter the number of elements: ");
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<arr.length-1;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println("Enter the inserted numeber of elements : ");
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("Enter the location in Array : ");
        int location=sc.nextInt();
        System.out.println("Enter the value of an Array : ");
        int value=sc.nextInt();
        for(int i=arr.length-1;i>location;i--){
            arr[i]=arr[i-1];
            
        }
         arr[location]=value;
         for(int i:arr){
             System.out.println(i);
         }
        
    }
}