public class Bridge  extends Piece
{
    public Bridge(Owner faction)
    {
        piecemap.add(63);
        piecemap.add(64);
        piecemap.add(65);
        ownedBy  = faction;
        name = PieceName.BRIDGE;
        score = 3;


    }


}
