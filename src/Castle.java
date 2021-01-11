public class Castle extends Piece {

    public Castle(Owner faction)
    {
        piecemap.add(53);
        piecemap.add(55);
        piecemap.add(43);
        piecemap.add(44);
        piecemap.add(45);
        ownedBy = faction;
        name = PieceName.CASTLE;
        score = 5;
    }

}
