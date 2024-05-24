import java.util.Scanner;
public class primenumber{
    public static void main(String[]args){
        int min,max;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Minimum Number: ");
        min=in.nextInt();
        System.out.println("Enter the Maximum Number: ");
        max=in.nextInt();
        for(int n=min;n<=max;n++){
            int flag=0;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
            if( flag==0){
            System.out.print(n+ " ");
            }

        }
        
    }
}