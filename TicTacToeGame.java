package tictactoe;

public class TicTacToeGame {

	public static void main(String[] args) {
				System.out.print("Welcome to tictactoe Game");
		char[][] ShowBoard = {{' ','|',' ','|',' '},
				{'-','-','-','-','-'},
				{' ','|',' ','|',' '},
				{'-','-','-','-','-'},
				{' ','|',' ','|',' '}};

	}
	public static void displayGameBoard(char[][] ShowBoard){
		for(char[] row:ShowBoard){
                       for(char inputs:row){
                               System.out.print(inputs);
                       }
                      
        	} System.out.println();

	}
}
