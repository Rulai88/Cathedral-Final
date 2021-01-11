public class BoardClone
{
    public BoardClone()
    {

    }

    static Board bclone (Board b) // watch out for this this can trip you
    {
        Board copy = new Board();
            int x = 0;
            int y = 0;
            for (BSquare[] row: b.gameBoard)
            {
                for (BSquare square: row)
                {
                    copy.gameBoard[x][y].occupiedBy = square.occupiedBy;
                    copy.gameBoard[x][y].controlledBy = square.controlledBy;
                    y += 1;
                }
                x+= 1;
                y = 0;
            }
            return copy;
    }


}

