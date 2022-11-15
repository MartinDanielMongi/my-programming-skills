import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What nunuber you want to count to?");
        int number = scan.nextInt();
        for (int i=0; i<number; i++){
            System.out.println((i+1));
        }

        scan.close();
    }
}
