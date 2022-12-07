import java.util.ArrayList;

public class Deck
{
    // Instance Variables
    private ArrayList<Card> cards;
    private int cardsLeft;

    // Constructor

    public Deck(String[] ranks, String[] suits, int[] points)
    {
        cards = new ArrayList<Card>();
        for(int i = 0; i < ranks.length; i++)
        {
            for (int j = 0; j < suits.length; j++)
            {
                Card card = new Card(ranks[i], suits[j], points[i]);
                cards.add(card);
                cardsLeft++;
            }
        }
    }
    // Methods

    public boolean isEmpty()
    {
        // Returns true if the deck is empty
        if (cardsLeft == 0)
        {
            return true;
        }
        return false;
    }

    public int getCardsLeft()
    {
        // returns the number of cards in the deck that are left to be dealt.
        return cardsLeft;
    }

    public Card deal()
    {
        // Checks if the deck is empty
        if (cards.isEmpty() == true)
        {
            return null;
        }
        return cards.remove(cardsLeft);
    }

    public void shuffle()
    {
        // Starting at the last index (i=4)
        // Pick a random number, r, between 0 and i (let’s say r=2)
        // Swap the card at index i with the card at index r
        // Decrement i
        for (int i = cardsLeft; i > 0 ; i--)
        {
            int r = (int) (Math.random() * cardsLeft);
            Card firstSwitch = cards.get(i);
            Card secondSwitch = cards.get(r);
            cards.set(i, secondSwitch);
            cards.set(r, firstSwitch);
        }
    }



}