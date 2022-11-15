import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax= new double[4];

       for (int i=0; i<price.length;i++){
            afterTax[i]=price[i]*1.13;
       }
       String prices= Arrays.toString(price);
       String afterTaxs= Arrays.toString(afterTax);
        System.out.println("The original prices are:"+ prices);
        System.out.println("The prices after tax are:"+ afterTaxs);

    }
}
