// EightQueensProblem.java
// JAC444 assignment 1 - task 2 
// October 14th, 2017
// Coded with love and passion by Anton Elistratov
package assignment1_task2;

public class EightQueensProblem {

  private static int board[][];
  private int numQueens;

  // no params assume it's 8x8 chessboard
  public EightQueensProblem() {
    numQueens = 0;
    board = new int[8][8];
    
    // filling the board with 0
    for (int rows = 0; rows < 8; rows++) {
      for (int cols = 0; cols < 8; cols++) {
        board[rows][cols] = 0;
      }
    }
  }

  public int getNumQueens() {
    return numQueens;
  }

  public void start() {
    solve(0);
  }

  public boolean solve(int numQueens) {
    if (numQueens == 8) {
      this.printBoard();
      return true;
    }
    else {
      for (int rows = 0; rows < 8; rows++) {
        for (int cols = 0; cols < 8; cols++) {
          if (validMove(rows,cols) == 0) {
            this.placeQueen(rows, cols, 0); // place ONE queen
            numQueens++; //adds one
            if (solve(numQueens)) {
              return true; // when solved
            }
            else {
              this.placeQueen(rows, cols, 1); // remove ONE queen
              numQueens--; // removes one
            }
          }
        }
      }
    }
    return false;
  }

  // validation
  public static int validMove(int x, int y) {
    // check straight lines
    for (int j = 0; j < 8; j++) {
      if (get(x,j) == 1) {
        return -1;
      }
      if (get(j,y) == 1) {
        return -1;
      }
    }
    
    // check diagonals
    for (int j = 0; j < 8; j++) {
      if (get(x-j, y-j) == 1) {
        return -1;
      }
      
      if (get(x-j, y+j) == 1) {
        return -1;
      }
      
      if (get(x+j, y-j) == 1) {
        return -1;
      }
      
      if (get(x+j, y+j) == 1) {
        return -1;
      }
    }
    // passed all the tests
    return 0;
  }

  // type 0 means = place one more queen
  // type 1 means = remove one queen
  public int placeQueen(int row, int col, int type) {
    if (type == 0) {
      board[row][col] = 1;
      numQueens++;
      return 0;
    } else if(type == 1) {
      board[row][col] = 0;
      return 0;
    }
    return -1;
  }

  public static int get(int row, int col) {
    if (row < 0 || row > 7 || col < 0 || col > 7) {
      return -1;
    }
    return board[row][col];
  }

  public void printBoard() {
    System.out.println("Eight queens solution");
    for (int rows = 0; rows < 8; rows++) {
      for (int cols = 0; cols < 8; cols++) {
        System.out.print(get(rows,cols) + " ");
      }
      System.out.println();
    }
  }
} // EightQueensProblem
