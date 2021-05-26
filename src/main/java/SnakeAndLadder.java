public class SnakeAndLadder {
    public static final int ladder = 0;
    public static final int snake = 1;

    public static final int winning_Points = 100;
    public static int check=0;
    public static int player2_Position = 0;
    public static int player1_Position = 0;


    public static void player() {
        if (check == 1) {
            int count = 1;
            while (player1_Position < winning_Points) {
                int random = (int) (Math.random() * 6) + 1;
                //System.out.println(" Random variables from 1 - 6 : "+random);
                int result = 0;
                int check1 = (int) (Math.random() * 3);
                switch (check1) {
                    case ladder:
                        if ((player1_Position + random) <= 100) {
                            player1_Position += random;
                        } else
                            player1_Position += 0;
                        break;
                    case snake:
                        result -= random;
                        break;
                    default:
                        result += 0;
                        break;
                }
                player1_Position += result;

                if (player1_Position < 0) {
                    player1_Position = 0;
                }
                player1_Position = player1_Position + result;
                count++;
                //System.out.println("Position : " +player_Position+ " at dice roll " +dice);
            }
            System.out.println("Winning position of player1 : " + player1_Position + " WINNNER " + "\n" + "No.of times the dice rolled : " + count);
            System.out.println("Winning position of player2 : " + player2_Position + " WINNNER " + "\n" + "No.of times the dice rolled : " + count);

    }
         else {
            int count = 1;
            while (player2_Position < winning_Points) {
                int random = (int) (Math.random() * 6) + 1;
                //System.out.println(" Random variables from 1 - 6 : "+random);
                int result = 0;
                int check2 = (int) (Math.random() * 3);
                switch (check2) {
                    case ladder:
                        if ((player2_Position + random) <= 100) {
                            player2_Position += random;
                        } else
                            player2_Position += 0;
                        break;
                    case snake:
                        result -= random;
                        break;
                    default:
                        result += 0;
                        break;
                }
                player2_Position += result;

                if (player2_Position < 0) {
                    player2_Position = 0;
                }
                player2_Position = player2_Position + result;
                count++;
                //System.out.println("Position : " +player_Position+ " at dice roll " +dice);
            }
            System.out.println("Winning position of player1 : " + player1_Position + " WINNNER " + "\n" + "No.of times the dice rolled : " + count);
            System.out.println("Winning position of player2 : " + player2_Position + " WINNNER " + "\n" + "No.of times the dice rolled : " + count);
        }


    }

    public static void main(String[] args) {
        System.out.println("Welcome to the simple Snake & Ladder Game");
        check = (int) (Math.random() * 3);
        player();

    }
}
