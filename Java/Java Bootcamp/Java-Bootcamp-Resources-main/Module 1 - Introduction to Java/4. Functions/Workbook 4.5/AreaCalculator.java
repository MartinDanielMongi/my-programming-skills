import java.util.Scanner;
import static java.lang.Math.*;

public class AreaCalculator {


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator lets you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");
        System.out.println("Please, select one of the options:");

        int option = scan.nextInt();
        switch(option){
            case 1:
            System.out.println("You selected Square. Please select the side of it");
            double sideOfSquare = scan.nextInt();
            double result1=areaSquare(sideOfSquare);
            System.out.println("The Area is:"+result1);break;
            case 2:
            System.out.println("You selected Rectangle. Please add lenght and width:");
            double lengthOfRec =scan.nextInt();
            double widthOfRec =scan.nextInt();
            double result2=areaRectangle(lengthOfRec, widthOfRec);
            System.out.println("The Area is:"+result2);break;
            case 3:
            System.out.println("You selected Triangle. Please add base and height:");
            double baseOfTriangle =scan.nextInt();
            double heightOfTriangle =scan.nextInt();
            double result3=areaTriangle(baseOfTriangle, heightOfTriangle);
            System.out.println("The Area is:"+result3);break;
            case 4:
            System.out.println("You selected Circle. Please add the radius:");
            double radiusOfCircle =scan.nextInt();
            double result4=areaCircle(radiusOfCircle);
            System.out.println("The Area is:"+result4);break;
            
            default: 
            System.out.println("That's not an option!");break;
        }
    }

    /**
     * Function name: areaSquare - returns the area of a square.
     * @param side (double)
     * @return the area (double)
     * 
     * Inside the function: 
     *  1. If the side is negative, prints "Error: impossible" and terminates the java program.
     *  2. Calculates the area of the square. A = side²
     */
    public static double areaSquare(double side) {
        if(side>0){
            double area= side *side;
            return area;
        }
        else{
            System.out.println("Error: impossible");
            return 0;
        }
    }


    //Task 2 - Write a function that calculates the area of a rectangle. 


    /**
     * Function name: areaRectangle – returns the area of a rectangle.
     * @param length (double).
     * @param width  (double).
     * @return the area (double)
     * 
     * Inside the function: 
     *  1. If the length OR width is negative, prints "Error: impossible" and terminates the program.
     *  2. Calculates the area of the rectangle. A = length * width
     */
    public static double areaRectangle(double length, double width) {
        if(length<0 || width<0){
            System.out.println("Error: impossible");
            return 0;
        }
        else{
            double area = length * width;
            return area;
        }
    } 

    //Task 3 - Write a function that calculates the area of a triangle. 

    /**
     * Function name: areaTriangle – it returns the area of a triangle.
     * @param base: (double).
     * @param height: (double).
     * @return the area (double)
     * 
     * Inside the function: 
     *  1. If the base OR height is negative, prints "Error: impossible" and terminates the program.
     *  2. Calculates the area of the triangle. A = (base * height)/2
     */ 
    public static double areaTriangle(double base, double height) {
        if(base<0 || height<0){
            System.out.println("Error:impossible");
            return 0;
        }
        else{
            double area= (base*height)/2;
            return area; 
        }
    }

    //Task 4 - Write a function that calculates the area of circle. 


    /**
     * Function name: areaCircle – it returns the area of a circle.
     * @param radius (double).
     * @return area (double)
     * 
     * Inside the function: 
     *  1. If the radius is negative, prints "Error: impossible" and terminates the program.
     *  2. Calculates the area of the circle. 
     */ 
    public static double areaCircle(double radius) {
        if(radius<0){
            System.out.println("Error:impossible");
            return 0;
        }
        else{
        double area= PI * pow(radius, 2);
        return area;
        }
    }



    //Task 6: Write a function that prints every area.


    /**
     * Function name: printAreas – it prints four areas
     * @param square – square area (double)
     * @param rectangle – rectangle area (double)
     * @param triangle – triangle area (double)
     * @param circle – circle area (double)
     * 
     * Inside the function:
     *  1. print: ("Square area: <square area>")
     *  2. print: ("Rectangle area: <rectangle area>")
     *  3. print: ("Triangle area: <triangle area>")
     *  4. print: ("Circle area: <circle area>")
     * 
     */


}
