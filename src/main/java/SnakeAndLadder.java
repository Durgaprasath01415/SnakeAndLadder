public class SnakeAndLadder {
    public static final int ladder = 1;
    public static final int snake = 2;
    public static final int winning_Points = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to the simple Snake & Ladder Game");
        int player_Position = 0;
        int count = 1;
        for ( int dice = 0; player_Position < winning_Points; dice++ ){
        int random = (int)(Math.random()*6) + 1;
        //System.out.println(" Random variables from 1 - 6 : "+random);
        int result=0;
        int check = (int)(Math.random()*3);
        switch (check) {
            case ladder:
                if( (player_Position + random) <= 100 ){
                    player_Position += random; }
                else
                    player_Position += 0;
                break;
            case snake:
                result -= random;
                break;
            default:
                result += 0;
                break;
        }
            player_Position += result;

            if ( player_Position < 0 ){
                player_Position = 0;
            }
            player_Position = player_Position + result;
            count++;
            System.out.println("Position : " +player_Position+ " at dice roll " +dice);
        }

        System.out.println("Winning position of player : "+ player_Position +" WINNNER "+"\n"+"No.of times the dice rolled : "+count);
    }
}