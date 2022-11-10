public class Weather {
    public static void main(String[] args) {
        double noon = 77; // temperature at noon in fahrenheit.
        double evening = 61; // temperature during the evening in fahrenheit
        double midnight = 55; // temperature at midnight in fahrenheit

        printTemperatures(noon);
        printTemperatures(evening);
        printTemperatures(midnight);

    }

    public static double fahrenheitToCelsius(double temperature) {
        double C = (temperature - 32) * 5 / 9;
        return C;
    }

    public static void printTemperatures(double F) {
        System.out.println("F:" + F);
        System.out.println("C:" + fahrenheitToCelsius(F));
    }

}