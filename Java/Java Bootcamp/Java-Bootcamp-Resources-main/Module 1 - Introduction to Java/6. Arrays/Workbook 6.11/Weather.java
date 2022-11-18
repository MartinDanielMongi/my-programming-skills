import java.util.Arrays;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit=celciusToFahrenheit(celsius);
        scan.nextLine();
        printTemperatures(celsius, "Celsius");
        System.out.println("\n");
        printTemperatures(fahrenheit, "Fahrenheit");
        
    }
    public static double[] celciusToFahrenheit(double[] celsius){
        double[] fahrenheit= Arrays.copyOf(celsius, celsius.length);
        for(int i=0; i<fahrenheit.length; i++){
            fahrenheit[i]=((fahrenheit[i]/5 * 9) + 32);
        }
        return fahrenheit;
    }
    /*
     * Function name: celciusToFahrenheit
     * @param celsius (double[])
     * @return fahrenheit (double[])
     * 
     * Inside the function:
     * 1
     * 2
     * 3
     * 4
     * 
     */
    public static void printTemperatures(double[] temp, String tempType){
         System.out.print(tempType + ":");   
         for (int i=0; i< temp.length; i++){
            System.out.print(temp[i]+" ");
         }
    }

}
