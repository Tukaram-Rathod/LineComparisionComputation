package linecompare;
import java.util.Scanner;
public class LineCompare {
	
	static void calculateLength() {
		Scanner sc = new Scanner(System.in);
	//Variables for first line
		int x1 , y1 , x2 , y2 ;
	//double LenthOfLine1, LenthOfLine2,compResult;
	// Points for line 1
		System.out.println("Enter X1 Point");
		x1 = sc.nextInt();
		System.out.println("Enter Y1 Point");
		y1 = sc.nextInt();
		System.out.println("Enter X2 Point");
		x2 = sc.nextInt();
		System.out.println("Enter Y2 Point");
		y2 = sc.nextInt();
	//Computation for line 1
		Integer LenthOfLine1 = (int)Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
	// Variables for seconds line
		int x3 , y3, x4 , y4 ;
	// Points for line 2
		System.out.println("Enter X3 Point");
		x3 = sc.nextInt();
		System.out.println("Enter Y3 Point");
		y3 = sc.nextInt();
		System.out.println("Enter X4 Point");
		x4 = sc.nextInt();
		System.out.println("Enter Y4 Point");
		y4 = sc.nextInt();
	//Computation for line 2
		Integer LenthOfLine2 = (int)Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
	//represents lines co -ordinates
		System.out.println("Lenth Of Line 1 is : "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>" + LenthOfLine1);
		System.out.println("Lenth Of Line 2 is : "+"("+x3+","+y3+"),"+"("+x4+","+y4+")===>" + LenthOfLine2);
		int compResult = (int) LenthOfLine1.compareTo(LenthOfLine2);
	// line check
		if(compResult==0) 
			System.out.println("Line 1 and Line 2 are equals");
		else if(compResult < 0)
			System.out.println("Line 1 is less than Line 2");	
		else if(compResult > 0)
			System.out.println("Line 1 gretter than Line 2");
	}
	public static void main(String[] args) {
		System.out.println("Welcome To The Line Compare Computation Problem");
		calculateLength();		
	}
}
