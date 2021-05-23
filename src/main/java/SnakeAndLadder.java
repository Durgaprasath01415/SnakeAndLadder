public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to the simple Snake & Ladder Game");
        int player_position = 0;
        System.out.println(" Starting position of player : "+player_position);
        int random = (int)(Math.random()*6) + 1;
        System.out.println(" Random variables from 1 - 6 : "+random);
    }
}