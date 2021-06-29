import java.util.Scanner;

  public class LineComparison{

     public static void main(String[] args){

			double x1,x2,y1,y2,x3,y3,x4,y4;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("x1::");
				x1	= sc.nextDouble();
			
			System.out.println("y1::");
				y1	= sc.nextDouble();
			
			System.out.println("x2::");
        		x2	= sc.nextDouble();
			
			System.out.println("y2::");
				y2	= sc.nextDouble();
			
			System.out.println("x3::");
        		x3	= sc.nextDouble();
			
			System.out.println("y3::");
        		y3	= sc.nextDouble();
			
			System.out.println("x4::");
        		x4	= sc.nextDouble();
			
			System.out.println("y4::");
       		y4 = sc.nextDouble();

		System.out.println("the cordinates of line 1 are::" + "(" + x1 + "," + y1 + ")" + "and" + "(" + x2 + "," + y2 + ")");
    			double Length_line=Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))); 

				System.out.println("Length of a line::" + Length_line);

				String str = Double.toString(Length_line);

		System.out.println("the cordinates of line 2 are::" + "(" + x3 + "," + y3 + ")" + "and" + "(" + x4 + "," + y4 + ")");
				double Length_line1	=	Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));

				System.out.println("Length of a line::" +	Length_line1);

				String str2 = Double.toString(Length_line1);

		System.out.println(str2.compareTo(str));

	}

}
