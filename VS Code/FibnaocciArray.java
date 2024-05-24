import java.util.Scanner;
import java.util.Arrays;
public class  FibnaocciArray{
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     int[] num=new int[20];
     num[1]=1;
     for(int  i=2;i<num.length;i++){
        num[i]=num[i-1]+num[i-2];


     }
     System.out.println(Arrays.toString(num));
   }

}
