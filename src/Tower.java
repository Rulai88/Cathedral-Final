public class Tower extends Piece {

    public Tower(Owner faction)
    {
        piecemap.add(65);
        piecemap.add(54);
        piecemap.add(55);
        piecemap.add(43);
        piecemap.add(44);
        ownedBy = faction;
        name = PieceName.TOWER;
        score = 5;

    }
}

