package tictactoe;
import java.util.Scanner;
public class TicTacToeGame 
{
	static char playerInput='X';
	static char computerInput='O';
	public static void main(String[] args) 
	{
		char[][] gameBoard = {{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '}};
		determineInput();
		printGameBoard(gameBoard);
	}
public static void printGameBoard(char[][] gameBoard){
	for(char[] row:gameBoard)
	{
                   for(char c:row)
                   {
                           System.out.print(c);
                   }
                   System.out.println();
    	}

}
	//UC2
	public static void determineInput(){
        System.out.println("Choose an input letter 1.'O' or 2.'X' : ");
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
        	int input=scanner.nextInt();
        	if(input==1)
        	{
        		playerInput='O';
        		computerInput='X';
		break;
        	}
        else if(input==2)
        {
        	playerInput='X';
        	computerInput='O';
		break;
        }
        else
        	{
        		System.out.println("Enter a correct input!");
        	}
}
 	//System.out.println("PlayerInput letter: "+playerInput);
	//System.out.println("Computer input letter : "+computerInput);
}
}
