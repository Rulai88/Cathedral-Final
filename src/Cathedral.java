public class Cathedral extends Piece
{


    public Cathedral() // this one is special.

    {
        this.piecemap.add(65);
        this.piecemap.add(55);
        this.piecemap.add(45);
        this.piecemap.add(35);
        this.piecemap.add(54);
        this.piecemap.add(56);
        ownedBy  = Owner.CATHEDRAL;
        name = PieceName.CATHEDRAL;
        score = 0;
    }


}
