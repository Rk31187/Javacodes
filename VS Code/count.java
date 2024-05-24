public class count{
    public static void  main(String[]args){
        int num=123456789;
        int count=0;
        while(num>0){
            num=num/100;
            count++;
        }
        System.out.println("The number is :" + count );
    }
}