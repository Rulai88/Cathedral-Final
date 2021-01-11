public class Abbey extends Piece {

    public Abbey(Owner faction)
    {
        piecemap.add(74);
        piecemap.add(65);
        piecemap.add(64);
        piecemap.add(55);
        ownedBy  = faction;
        name = PieceName.ABBEY;
        score = 4;
    }

}
