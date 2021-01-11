public class Manor extends Piece {

    public Manor(Owner faction)
    {
        piecemap.add(43);
        piecemap.add(44);
        piecemap.add(45);
        piecemap.add(54);
        ownedBy = faction;
        name = PieceName.MANOR;
        score = 4;


    }

}
