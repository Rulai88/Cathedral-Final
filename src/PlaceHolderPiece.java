public class PlaceHolderPiece extends Piece {

    public PlaceHolderPiece()
    {
        piecemap.add(74);
        ownedBy  = Owner.EMPTY;
        name = PieceName.PLACEHOLDER;
        score = 0;
    }

}