import java.util.ArrayList;

public class Player
{
    // Instance Variables
    private ArrayList<Card> hand;
    private int points;

    // Constructor

    public Player(String name)
    {
        points = 0;
    }

    public Player(String name, Card hand)
    {
        points = 0;
    }

    // Getter methods
    public int getPoints()
    {
        return points;
    }

    public ArrayList<Card> getHand()
    {
        return hand;
    }
}
