//Tamara Julia Johnson
//CSE 002 310
//Hw10-MineSweeper
//11/12/15
//Create a minesweeper game!

//import scanner class
    import java.util.Scanner;
        //define class
            public class MineSweeper{
                //add main method
                    public static void main(String[] args){
                        //create an instance that will take input from STDIN
                            Scanner myScanner = new Scanner ( System.in );
                            //ask user for board size and create variables
                            System.out.println("Please enter the size of the board you would like to play on (it must be no larger than 30 but no smaller than 2): ");
                            int gameBoard = myScanner.nextInt();
    
                            if(gameBoard<2 || gameBoard>30){
                                System.out.println("Invalid Number! ");}
    
                            int[][]board = new int [gameBoard][gameBoard];
                                System.out.println("Enter the number of mines scattered on the board: ");
                                int mines = myScanner.nextInt();
    
                                if(mines<1 || mines>gameBoard*gameBoard){
                                    System.out.println("Invalid Number! ");}
                                for(int i=0; i<mines; i++){
                                    int X = (int)(Math.random()*gameBoard);
                                    int Y = (int)(Math.random()*gameBoard);
                                       board[X][Y]=10;}
    
                                    for(int i=0;i<gameBoard;i++){  
                                       for(int j=0;j<board[i].length;j++){  
                                           if(board[i][j]>8){  
                                           if(j>0){            
                                           board[i][j-1]++;  
                                                       }  
                                           if(j<board[i].length-1){  
                                           board[i][j+1]++; 
                                                       }  
                                           if(i>0){            
                                               board[i-1][j]++;  
                                           if(j>0){  
                                           board[i-1][j-1]++;  
                                                           }  
                                           if(j<board[i].length-1){  
                                           board[i-1][j+1]++;  
                                                           }  
                                                       } 
                                           if(i<gameBoard-1){               
                                               board[i+1][j]++;  
                                           if(j>0){  
                                           board[i+1][j-1]++;  
                                                           }  
                                           if(j<board[i].length-1){  
                                            board[i+1][j+1]++;  
                                                           }  
                                                         }  
                                                         }  
                                                      }  
                                                     }  
        
                                            for(int i=0;i<gameBoard;i++){  
                                               for(int j=0;j<gameBoard;j++){  
                                               if(board[i][j]>=10)  
                                               System.out.print(" M ");  
                                               else  
                                               System.out.print(" "+board[i][j]+" " );  
                                               }  
                                               System.out.println( );  
        }  
     }
}