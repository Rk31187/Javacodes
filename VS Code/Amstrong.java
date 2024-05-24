public class Amstrong{
    public static void main(String[]args){
        int num=153;
        temp=num;
        int r,sum=0;
        while(num>0){
            r=num%10;
            num=num/10;
            sum=sum+r*r*r;
        }
        if(temp==sum){
            System.out.println("It is a Amstrong Number");
        }
        else{
            System.out.println("It is not a Amstrong Number");

        }
    }
}