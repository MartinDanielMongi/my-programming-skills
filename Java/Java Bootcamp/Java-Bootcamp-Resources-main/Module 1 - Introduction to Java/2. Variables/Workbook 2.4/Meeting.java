public class Meeting {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.4 to access the link).

        double sales = 24309.65; 
        int salesInInt = (int)sales;
        double profit = 18562.18; 
        int profitInInt = (int)profit;
        double refunds = 688.78; 
        int refundsInInt =(int)refunds;
        double shipping = 1233.57; 
        int shippingInInt=(int)shipping;

        System.out.println("This month, we made $"+ salesInInt + " in sales");
        System.out.println("Factoring in costs, we made $" + profitInInt + " in profit");
        System.out.println("The refunds are at a low $"+ refundsInInt + ". This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + shippingInInt + " in shipping");


    }
}
