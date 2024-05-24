
import java.util.Scanner;
public class rectangle{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int length=0;
		int breadth=0;
		int area=0;
		int perimeter=0;
		System.out.println("enter length of  the rectangle");
         length=scanner.nextInt();
		 System.out.println("enter  breadth of  the rectangle");
         breadth=scanner.nextInt();
		 area=length*breadth;
		 perimeter=2*(length+breadth);
		 System.out.println("The area of a rectangle is : " + area);
		 System.out.println("The perimeter of a rectangle is : " + perimeter);


		 
	}
}