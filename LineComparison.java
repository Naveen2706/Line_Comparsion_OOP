package com.bridgelabz.linecomparison;

import com.bridgelabz.utility.Utility;

public class LineComparison {
    static int X1;
    static int X2;
    static int X3;
    static int X4;
    static int Y1;
    static int Y2;
    static int Y3;
    static int Y4;
    static String strLength1;
    static String strLength2;

static void inputCoordinates(){
    Utility utility = new Utility();
    System.out.println("Enter the values of X1 , y1 , X2 , y2 , X3 , y3 , X4 , y4 :: ");
         X1 = utility.getIntValue();
         X2 = utility.getIntValue();
         X3 = utility.getIntValue();
         X4 = utility.getIntValue();
         Y1 = utility.getIntValue();
         Y2 = utility.getIntValue();
         Y3 = utility.getIntValue();
         Y4 = utility.getIntValue();
         System.out.println("the cordinates of line 1 are::" + "(" + X1 + "," + Y1 + ")" + "and" + "(" + X2 + "," + Y2 + ")");
         System.out.println("the cordinates of line 2 are::" + "(" + X3 + "," + Y3 + ")" + "and" + "(" + X4 + "," + Y4 + ")");
}

        void lenghtOfLine(){
        double Length_line1 = Math.sqrt(((X2 - X1) * (X2 - X1)) + ((Y2 - Y1) * (Y2 - Y1)));
        double Length_line2	= Math.sqrt(((X4 - X3) * (X4 - X3)) + ((Y4 - Y3) * (Y4 - Y3)));
        strLength1 = Double.toString(Length_line1);
        strLength2 = Double.toString(Length_line2);
            System.out.println("Length of a line1 ::" + strLength1);
            System.out.println("Length of a line2 ::" + strLength2);

        }

    public static void main(String[] args) {
        inputCoordinates();
        LineComparison lineCompObj = new LineComparison();
        lineCompObj.lenghtOfLine();
        System.out.println(strLength1.equals(strLength2));
        System.out.println(strLength1.compareTo(strLength2));
    }
}

