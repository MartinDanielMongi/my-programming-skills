public class Pyramid {
    public static void main(String[] args) {
        char letter = 'a';
        
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            System.out.print("\n");
            for (int j = 0; j <= 10; j++) {
                if (i > j) {
                    System.out.print("   ");
                } else {
                
                    System.out.print(" " + letter + " ");
                    j=10;
                }
            }
            letter++;

        }
    }
}
