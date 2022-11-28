public class Functions {
    public static void main(String[] args) {
        int random = random(15);  
        System.out.println("Number: " + random);
        System.out.println("Prime or Composite: " + isPrime(random));
    }

    public static int random(int range) {
        double random = Math.random() * range + 1;
        return (int) random;
    }
    public static String isPrime(int random) {
        String isPrime = "";
        for (int i = 1; i < random; i++) {
            if(i!=random-1){
            isPrime = (random % (i+1) == 0) ? "COMPOSITE" : "PRIME";
            }
            if(i==(random-1)){
                i=random;
            }else if(isPrime.equals("COMPOSITE")){
                i=random;
            }
            
        }
        return isPrime;
    }
}
