public class Prices {
    public static void main(String[] args) {
        double [][] values= new double [3][5];
        values [0][0]=12.99;
        values [0][1]=8.99;
        values [0][2]=9.99;
        values [0][3]=10.49;
        values [0][4]=11.99;
        values [1][0]=0.99;
        values [1][1]=1.99;
        values [1][2]=2.49;
        values [1][3]=1.49;
        values [1][4]=2.99;
        values [2][0]=8.99;
        values [2][1]=7.99;
        values [2][2]=9.49;
        values [2][3]=9.99;
        values [2][4]=10.49;
        System.out.println("Baking "+ values [0][0] + " "+ values [0][1]+" "+values [0][2]+" "+values [0][3]+" "+values [0][4]+"\nBeverage "+ values [1][0]+ " "+values [1][1]+" "+ values [1][2]+ " "+values [1][3]+" "+values [1][4]+"\nCereals "+values [2][0]+ " "+ values [2][1]+" "+values [2][2]+ " "+values [2][3]+" "+values [2][4]);
    }
}
