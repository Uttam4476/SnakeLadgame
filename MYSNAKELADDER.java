import java.util.Random;

public class MYSNAKELADDER {
    public static void main(String[] args) {
            int player1 = 0;
            int player2 = 0;
            startgame(player1, player2);
        }

        public static void startgame(int player1, int player2) {
            while(player1 < 100 && player2 < 100) {
                int roll1 = rolladice("player 1");
                if (player1 + roll1 <= 100) {
                    player1 += roll1;
                    player1 = checkLadderOrSnake(player1);
                }

                int roll2 = rolladice("player 2");
                if (player2 + roll2 <= 100) {
                    player2 += roll2;
                    player2 = checkLadderOrSnake(player2);
                }
            }

            if (player1 == 100) {
                System.out.println("PLyer1 wins \n Player2 loses");
            } else {
                System.out.println("Player2 wins \n Player1 loses");
            }

        }

        public static int rolladice(String s) {
            Random rand = new Random();
            int diceRoll = rand.nextInt(6) + 1;
            System.out.println(s + " got " + diceRoll);
            return diceRoll;
        }

        public static void creators() {
            String l = "UTTAM";
            String m = "Piyush";
        }

        public static int checkLadderOrSnake(int p) {

            if (p == 2) {
                p = 38;
                return p;
            } else if (p == 9) {
                p = 14;
                return p;
            } else if (p == 15) {
                p = 82;
                return p;
            } else if (p == 16) {
                p = 54;
                return p;
            } else if (p == 50) {
                p = 91;
                return p;
            } else if (p == 74) {
                p = 87;
                return p;
            } else if (p == 18) {
                p = 6;
                return p;
            } else if (p == 24) {
                p = 7;
                return p;
            } else if (p == 61) {
                p = 16;
                return p;
            } else if (p == 72) {
                p = 47;
                return p;
            } else {
                return p == 96 ? 76 : p;
            }
        }
    }


