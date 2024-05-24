
import java.util.Scanner;
public class TemperatureConverter{
    public  static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 1 to convert celsius to fahrenheit");
      System.out.println("Enter 2 to convert fahrenheit to celsius");
      int i=sc.nextInt();
        
      double Temperature=0.0;
      double  Converter=0.0;
      if(i==1){
        System.out.println("Enter the value of celsius");
        Temperature=sc.nextInt();
        Converter=9/5*Temperature +32;
        System.out.println("Temperature in fahrenheit ="+ Converter);
      }
      else if(i==2){
        System.out.println("Enter the value of fahrenheit");
        Temperature=sc.nextInt();
        Converter=5/9*Temperature -32;
        System.out.println("Temperature in celsius ="+ Converter);

      }
      else{
        System.out.println("please try again later");
      }

    }  
}