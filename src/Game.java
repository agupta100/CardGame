public class Game
{
    public static void main(String[] args)
    {
        // Test Code
        Card test = new Card("7", "King", 7);
        String[] ranks = {"7", "8", "9"};
        String[] suits = {"King", "Queen", "Jack", "Queen"};
        int[] points = {7, 8, 9};
        Deck test2 = new Deck(ranks, suits, points);
//        test2.shuffle();
        String suit = test.getSuit();
        System.out.println(suit);

    }

}
