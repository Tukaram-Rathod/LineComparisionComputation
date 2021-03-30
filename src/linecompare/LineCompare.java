package linecompare;
import java.util.Scanner;
public class LineCompare {

	public static void main(String[] args) {
		System.out.println("***Welcome To The Line Compare Computation Problem***");
		
		Scanner sc = new Scanner(System.in);
		//Variables
		int x1 , y1 , x2 , y2 ;
		double LenthOfLine;
		
		System.out.println("Enter X1 Point");
		x1 = sc.nextInt();
		System.out.println("Enter Y1 Point");
		y1 = sc.nextInt();
		System.out.println("Enter X2 Point");
		x2 = sc.nextInt();
		System.out.println("Enter Y2 Point");
		y2 = sc.nextInt();
	
		//Computation
		//LenthOfLine = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		LenthOfLine = Math.sqrt((x2-x1)^2 + (y2-y1)^2);

		System.out.println(" Lenth Of Line is : "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>" + LenthOfLine);
	
		
	}

}
