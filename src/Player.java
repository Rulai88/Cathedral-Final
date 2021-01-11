public class Player {
    public Inventory inv;
    public int Score = 0;;
    public Owner owner;


    public Player(Owner own)
    {
     owner = own;
     inv = new Inventory();
    }

    public void update_score_int(int num)
    {
    Score += num;
    }


}
