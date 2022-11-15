import static java.lang.Math.*;

public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        
       int[] randomsNumbers={0,0,0,0,0,0,0,0,0,0};
       System.out.println("Here are the scores: ");
       for (int i=0; i<10;i++){
        randomsNumbers[i]=randomNumber();
        System.out.print(randomsNumbers[i]+" ");
            if(randomsNumbers[i]>highScore){
                highScore= randomsNumbers[i];
            }
       }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }    
    public static int randomNumber(){
        int num= (int)(random()*50000);
        return num; 
    }
}
