package Codewars;

public class greedDiceGame {
    public static void main(String[] args) {
        int[] diceRoll = {1,1,2,4,5};
        System.out.println(greedy(diceRoll));
    }
    public static int greedy(int[] dice){
        int score=0;
        int one=0;
        int two=0;
        int three=0;
        int four=0;
        int five=0;
        int six=0;

        // Three 1's => 1000 points
        // Three 6's =>  600 points
        // Three 5's =>  500 points
        // Three 4's =>  400 points
        // Three 3's =>  300 points
        // Three 2's =>  200 points
        // One   1   =>  100 points
        // One   5   =>   50 point

        for (int die : dice) { //tally the die.
            switch (die) {
                case (1): {
                    one++;
                    break;
                }
                case (2): {
                    two++;
                    break;
                }
                case (3): {
                    three++;
                    break;
                }
                case (4): {
                    four++;
                    break;
                }
                case (5): {
                    five++;
                    break;
                }
                case (6): {
                    six++;
                    break;
                }
            }
        }
        score+= triple(one,1);
        score+= triple(two,2);
        score+= triple(three,3);
        score+= triple(four,4);
        score+= triple(five,5);
        score+= triple(six,6);

        score +=(one%3*100);
        score +=(five%3*100);

        return score;
    }

    private static int triple(int tally,int side){
        int worth = 0;
        switch (side) {
            case (1): {
                worth=1000;
                break;
            }
            case (2): {
                worth=200;
                break;
            }
            case (3): {
                worth=300;
                break;
            }
            case (4): {
                worth=400;
                break;
            }
            case (5): {
                worth=500;
                break;
            }
            case (6): {
                worth=600;
                break;
            }
        }
        
        if (tally>=3){
            return (int)(Math.floor(tally/3)*worth);
        }

        return 0;
    }
}
