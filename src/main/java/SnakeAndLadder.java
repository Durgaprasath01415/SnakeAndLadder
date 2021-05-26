import java.util.Random;

public class SnakeAndLadder {

    public static final int START_POSITION = 0;
    public static final int END_POSITION = 100;
    public static final int NO_PlAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    static String TASK;

    public static int diceRoll() {
        Random random = new Random();
        int diceValue = random.nextInt(6) + 1;
        return diceValue;
    }

    public static int play() {
        Random random = new Random();
        int moveValue = random.nextInt(3);
        return moveValue;
    }

    public int dice_player(int diceCount) {
        diceCount++;
        return diceCount;
    }

    public int gamePlay(int currentPosition, int diceCount) {
        if (currentPosition < END_POSITION) {
            int diceNumber = diceRoll();
            int playerMove = play();
            switch (playerMove) {
                case NO_PlAY:
                    currentPosition += 0;
                    TASK = "No Play";
                    break;
                case LADDER:
                    if (currentPosition + diceNumber <= END_POSITION) {
                        currentPosition += diceNumber;
                        TASK = "Ladder";
                    }
                    break;
                case SNAKE:
                    if (currentPosition - diceNumber >= START_POSITION) {
                        currentPosition -= diceNumber;
                        TASK = "Snake";
                    }
                    break;
            }
            System.out.println("Dice : " + diceNumber + " for " + TASK + " is at position " + currentPosition);
        }
        if (TASK.equals("Ladder") && currentPosition != END_POSITION) {
            diceCount = dice_player(diceCount);
            gamePlay(currentPosition, diceCount);
        }
        return currentPosition;
    }
    public void twoPlayer(){
        int playerOne = START_POSITION;
        int playerTwo = START_POSITION;
        int diceCount = 0;
        while( playerOne < END_POSITION && playerTwo < END_POSITION){
            System.out.println("Player 1: ");
            playerOne = gamePlay( playerOne , diceCount);
            diceCount = dice_player(diceCount);
            if(playerOne == END_POSITION){
                break;
            }
            System.out.println("Player 2: ");
            playerTwo =gamePlay( playerTwo , diceCount);
            diceCount = dice_player(diceCount);
        }
        System.out.println("");
        if(playerOne == END_POSITION)
            System.out.println("Player 1 won the game");
        else if (playerTwo == END_POSITION){
            System.out.println("Player 2 won the game");
        }
        System.out.println("Total diceRolled : " +diceCount);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game");
        SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
        snakeAndLadder.twoPlayer();
    }
}