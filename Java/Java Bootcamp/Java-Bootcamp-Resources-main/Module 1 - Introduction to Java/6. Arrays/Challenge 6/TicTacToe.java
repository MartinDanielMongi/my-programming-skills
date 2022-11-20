import java.util.Scanner;

public class TicTacToe {

  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
        
    System.out.println("\nLet's play tic tac toe");
    //Task 1: Create an array with three rows of '_' characters.
    char[][] tictactoe= {{'_','_','_'},
                          {'_','_','_'},
                          {'_','_','_'}};
    printBoard(tictactoe);
            //Task 2: Call the function printBoard();
    int[]spot= new int[2];
    int win=0;
    System.out.println();
  
    for (int i = 0; i < 9; i++) {
      printBoard(tictactoe);
      System.out.println("\n");
      if(i%2==0){
        System.out.println("Turn: X");
        spot=askUser(tictactoe);
        tictactoe[spot[0]][spot[1]]='X';
        win=checkWin(tictactoe);
        if (win==3){
          System.out.println("X winss!!!");
          System.exit(0);
        }
      }else {
        System.out.println("Turn: O");
        spot=askUser(tictactoe);
        tictactoe[spot[0]][spot[1]]='O';
        win=checkWin(tictactoe);
        if (win==(-3)){
          System.out.println("O winss!!!");
          System.exit(0);
        }
      }
      
    }
          scan.close();
        }




public static void printBoard(char[][] array){
  for (int i = 0; i < array.length; i++) {
    System.out.println("\n");
    System.out.print("      ");
    for (int j = 0; j < array[0].length; j++) {
      System.out.print(array[i][j]+" ");
    }
  }
}
    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      • separate each row by two lines. 
     *      • each row precedes a tab of space
     *      • each character in the grid has one space from the other character
     */        








     public static int[] askUser(char[][] board){
      System.out.print("Please, select a row and a column number: ");
      int[] spot=new int[2];
      while(true){
        spot[0]=scan.nextInt();
        spot[1]=scan.nextInt();
        if(board[spot[0]][spot[1]]=='_'){
          return spot;
        }
        System.out.println("Spot taken, select another one!");
      }
     }
   /** Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */





     public static int checkWin(char[][] tictactoe){
      int point=0;

          //Rows
        for (int i = 0; i < tictactoe.length; i++) {
          point =0;
          for (int j = 0; j < tictactoe[0].length; j++) {
            if( tictactoe[i][j]=='X'){
              point +=1;
            }else if (tictactoe[i][j]=='O'){
              point -=1;
            }
          }
          if(point==3 || point ==(-3)){
            return point;
          }
        }
          //Columns
        for (int j = 0; j < tictactoe.length; j++) {
          point =0;
          for (int i = 0; i < tictactoe[0].length; i++) {
            if( tictactoe[i][j]=='X'){
              point +=1;
            }else if (tictactoe[i][j]=='O'){
              point -=1;
            }
          }
          if(point==3 || point ==(-3)){
            return point;
          }
        }

        //Diagonal 1
        for (int i = 0; i < tictactoe.length; i++) {
          int j=i;
          if( tictactoe[i][j]=='X'){
            point +=1;
          }else if (tictactoe[i][j]=='O'){
            point -=1;
          }
        }
        if(point==3 || point ==(-3)){
          return point;
          
        }

        //Diagonal 2
        for (int i = 0; i < tictactoe.length; i++) {
          int j=0;
          if (i==0){
              j=2;
          }else if (i==1){
            j=1;
          }else {
            j=0;
          }
          if( tictactoe[i][j]=='X'){
            point +=1;
          }else if (tictactoe[i][j]=='O'){
            point -=1;
          }
        }
        if(point==3 || point ==(-3)){
          return point;
          
        }
        point=0;
        return point;
     }
    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */


}
