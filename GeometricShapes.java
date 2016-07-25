
 /* 
 * Try this 4-1

 * 
 * Convert the help system, from Try This 3-3 into 
 * a help class.
 */

import java.util.Scanner;
public class GeometricShapes {

	public static void main(String args[]) {
		int userInput;
		Scanner reader = new Scanner(System.in);
		System.out.println("Please choose your shape: 1) Pentagon 2) Rectangle "
				+ "3)Triangle 4)Hexagon 5)Octagon 6) Circumference");
		userInput = reader.nextInt();

		
	switch (userInput) {
		case 1: {
			double a, b, c; 
			double pentArea;
			double n;
	
	Scanner reader2 = new Scanner (System.in);
	
	a = 2 * Math.sqrt(5);
	b = 5 + a;
	c = 5 * b;
	
	System.out.println("What is the length of the sides ? ");
	n = reader2.nextDouble();
	pentArea = (1.0/4.0) * Math.sqrt(c) * Math.pow(n, 2);
	System.out.println("The area of the Pentagon is " + pentArea);
	System.out.println();

	}
	break;
	
	case 2: {
Scanner scanner = new Scanner(System.in);
		
		int length = 0;
		int width = 0; 
		int area = 0;
		int perimeter;
		
		System.out.println("Enter the length of Rectangle");
		length = scanner.nextInt();
		System.out.println("Enter the width of Rectangle");;
		width = scanner.nextInt();
		area = length * width;
		perimeter = 2 * (length + width);
		
		System.out.println("The Area of Rectangle is : " + area);
		System.out.println("The Perimeter of Rectangle is: " + perimeter );
		
	}
		break;
		
		
		case 3: {
			//base and height
			int base = 0;
			int height = 0;
			
			int area = 0;
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the length of the base of Triangle");
			
			base = scanner.nextInt();
			
			System.out.println("Enter the length of the height of Triangle");
			height = scanner.nextInt();
			
			//area = (base * height) /2
			
			area = (base * height) / 2;
			
			System.out.println("The Area of Triangle is : " + area);
			
		}
		
		case 4:{
			double a, b; 
			double hexagonArea;
			double n;
			
			Scanner reader4 = new Scanner(System.in);
			
			a = 3 * Math.sqrt(3);
			b = a / 2;
			
			System.out.println("What is the length of the side : ");
			n = reader4.nextDouble();
			hexagonArea = 3*Math.sqrt(3) / 2 * Math.pow(n, 2);
			System.out.println("The area of a Hexagon is : " + hexagonArea);
			System.out.println();
		}
		break;
		
		case 5:{
			double a, b;
			double octogonArea;
			double n;
			
			Scanner reader5 = new Scanner(System.in);
			
			a = Math.sqrt(2) + 1;
			b = 2 * a;
			
			System.out.println("What is the length of the side : " );
			n = reader5.nextDouble();
			octogonArea = ((1 + Math.sqrt(2)) * 2 * Math.pow(n, 2));
			System.out.println("The area of Octogon is : " + octogonArea);
			System.out.println();
			
		}
	break;
	
		case 6:{
		
			double radius;
			
			Scanner reader6 = new Scanner(System.in);
			radius = 1;
			double n = 0;
			double area = Math.PI * (radius * radius);
			
			System.out.println("What is the radius of the circle:");
			n = reader6.nextDouble();
			System.out.println("The area of circle is: " + area);
			double circumference = Math.PI * 2 * n;
			System.out.println("The circumference of the circle is : " + circumference);
			
			
		}
	
	
	
	
	
	
	}
	}
}





