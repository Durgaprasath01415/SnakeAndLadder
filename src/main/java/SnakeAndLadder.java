public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to the simple Snake & Ladder Game");
        int player_Position = 0;
        int random = (int)(Math.random()*6) + 1;
        System.out.println(" Random variables from 1 - 6 : "+random);

        int check = (int)(Math.random()*3);
        if ( check == 1 )
            player_Position += random;
        else if ( check == 2 )
            player_Position -= random;
        else
            player_Position += 0;

        System.out.println(" Starting position of player : "+player_Position);
    }
}