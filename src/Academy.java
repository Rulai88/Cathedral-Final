public class Academy extends Piece {

    public Academy(Owner faction)
    {
        piecemap.add(74);
        piecemap.add(63);
        piecemap.add(64);
        piecemap.add(54);
        piecemap.add(55);
        ownedBy  = faction;
        name = PieceName.ACADEMY;
        score = 5;



    }

}
