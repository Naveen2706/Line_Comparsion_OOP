public class LineComparison{

	public static void main(String[] args){

		int x1 = 4;
		int x2 = 8;
		int y1 = 3;
		int y2 = 6;
		
		System.out.println("Length at 2 Points::" + "(" +x1+ "," +y1+ ")" + "and" + "(" +x2+ "," +y2+ ")");

		double Length_line = Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1))); 

		System.out.println("Length of a line::" + Length_line);
	
	}

}
