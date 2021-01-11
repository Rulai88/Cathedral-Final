public class Stable extends Piece {

    public Stable(Owner faction)
    {
        piecemap.add(44);
        piecemap.add(45);
        ownedBy = faction;
        name = PieceName.STABLE;
        score = 2;



    }

}
