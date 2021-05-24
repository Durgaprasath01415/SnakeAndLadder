public class SnakeAndLadder {
    public static final int ladder = 0;
    public static final int snake = 1;

    public static final int winning_Points = 100;
    public static int check=0;

    public static void player1(){
        int player1_Position = 0;
        int count = 1;
        for ( int dice = 0; player1_Position < winning_Points; dice++ ){
            int random = (int)(Math.random()*6) + 1;
            //System.out.println(" Random variables from 1 - 6 : "+random);
            int result=0;
            check = (int)(Math.random()*3);
            switch (check) {
                case ladder:
                    if( (player1_Position + random) <= 100 ){
                        player1_Position += random; }
                    else
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

            if ( player1_Position < 0 ){
                player1_Position = 0;
            }
            player1_Position = player1_Position + result;
            count++;
            //System.out.println("Position : " +player_Position+ " at dice roll " +dice);
        }
        System.out.println("Winning position of player1 : "+ player1_Position +" WINNNER "+"\n"+"No.of times the dice rolled : "+count);

    }
    public static void player2(){
        int player2_Position = 0;
        int count = 1;
        for ( int dice = 0; player2_Position < winning_Points; dice++ ){
            int random = (int)(Math.random()*6) + 1;
            //System.out.println(" Random variables from 1 - 6 : "+random);
            int result=0;
            check = (int)(Math.random()*3);
            switch (check) {
                case ladder:
                    if( (player2_Position + random) <= 100 ){
                        player2_Position += random; }
                    else
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

            if ( player2_Position < 0 ){
                player2_Position = 0;
            }
            player2_Position = player2_Position + result;
            count++;
            //System.out.println("Position : " +player_Position+ " at dice roll " +dice);
        }
        System.out.println("Winning position of player2 : "+ player2_Position +" WINNNER "+"\n"+"No.of times the dice rolled : "+count);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the simple Snake & Ladder Game");
        for (int count=0; count<10; count++ ){
        check = (int)(Math.random()*3);
        if (check == snake)
            player2();
        else
            player1();

    }
}
}