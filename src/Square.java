public class Square  extends Piece {

    public Square(Owner faction)
    {
        piecemap.add(54);
        piecemap.add(55);
        piecemap.add(44);
        piecemap.add(45);
        ownedBy = faction;
        name = PieceName.SQUARE;
        score = 4;


    }

}
