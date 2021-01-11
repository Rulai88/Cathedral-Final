public class Inn extends Piece {

    public Inn(Owner faction)
    {
        piecemap.add(54);
        piecemap.add(55);
        piecemap.add(44);
        ownedBy  = faction;
        name = PieceName.INN;
        score = 3;


    }

}
