public class Card
{
    // Instance Variables
    private String rank;
    private String suit;
    private int point;

    // Constructors
    public Card(String theRank, String theSuit, int thePoint)
    {
        rank = theRank;
        suit = theSuit;
        point = thePoint;
    }

    // Methods
    public String getRank()
    {
        return rank;
    }

    public String getSuit()
    {
        return suit;
    }

    public int getPoint()
    {
        return point;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }

    public void setSuit(String suit)
    {
        this.suit = suit;
    }

    public void setPoint(int point)
    {
        this.point = point;
    }

    public String toString()
    {
        return rank + " of " + suit;
    }
}


