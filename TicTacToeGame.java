package tictactoe;
import java.util.Scanner;
public class TicTacToeGame 
{
	static char playerInput='X';
	static char computerInput='O';
	
	public static void main(String[] args) 
	{
		//UC1:Declaration of Game Board
		char[][] gameBoard = {{' ','|',' ','|',' '},
							  {'-','+','-','+','-'},
							  {' ','|',' ','|',' '},
							  {'-','+','-','+','-'},
							  {' ','|',' ','|',' '}};
		determineInput();
		//UC3:Displaying Game Board
		printGameBoard(gameBoard);
		//UC4:Put element to desired Place
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your placement (1-9)");
		int place = scan.nextInt();
		System.out.println(place);
		switch(place)
		{
		case 1:
			gameBoard[0][0]=playerInput;
			break;
		case 2:
			gameBoard[0][2]=playerInput;
			break;
		case 3:
			gameBoard[0][4]=playerInput;
			break;
		case 4:
			gameBoard[2][0]=playerInput;
			break;
		case 5:
			gameBoard[2][2]=playerInput;
			break;
		case 6:
			gameBoard[2][4]=playerInput;
			break;
		case 7:
			gameBoard[4][0]=playerInput;
			break;
		case 8:
			gameBoard[4][2]=playerInput;
			break;
		case 9:
			gameBoard[4][4]=playerInput;
			break;
		}
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
	//UC2:Taking Inputs
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
