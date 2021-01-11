
import org.junit.Assert;
import org.junit.Test;

public class BoardCloneTest
{

    public static Boolean BoardCompare(BSquare[][] compa, BSquare[][] compb) //
    {
        Boolean returnvalue = true;
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if(compa[i][j].occupiedBy != compb[i][j].occupiedBy || compa[i][j].controlledBy != compb[i][j].controlledBy || compa[i][j].Squarenum != compb[i][j].Squarenum)
                {
                    returnvalue = false;
                }
            }
        }
        return returnvalue;
    }

    @Test
    public void cloneWorks()
    {
        BoardClone cloner = new BoardClone();
        Board b = new Board();
        b.gameBoard[0][0].controlledBy = Owner.PLAYER2;
        b.gameBoard[0][1].controlledBy = Owner.PLAYER2;
        b.gameBoard[0][2].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][0].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][1].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][2].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][0].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][2].controlledBy = Owner.PLAYER2;

        Board bcloned = cloner.bclone(b);


        boolean comp = BoardCompare(b.gameBoard, bcloned.gameBoard);
        Assert.assertTrue(comp);


    }

    @Test
    public void CloneDoesNotAffectOriginal()
    {
        BoardClone cloner = new BoardClone();
        Board b = new Board();
        b.gameBoard[0][0].controlledBy = Owner.PLAYER2;
        b.gameBoard[0][1].controlledBy = Owner.PLAYER2;
        b.gameBoard[0][2].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][0].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][1].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][2].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][0].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][2].controlledBy = Owner.PLAYER2;
        Board bcloned = cloner.bclone(b);
        bcloned.gameBoard[0][0].controlledBy = Owner.EMPTY;
        boolean comp = BoardCompare(b.gameBoard, bcloned.gameBoard);
        Assert.assertEquals(false, comp);
    }

    @Test
    public void OrginalDoesNotAffectClone()
    {
        BoardClone cloner = new BoardClone();
        Board b = new Board();
        b.gameBoard[0][0].controlledBy = Owner.PLAYER2;
        b.gameBoard[0][1].controlledBy = Owner.PLAYER2;
        b.gameBoard[0][2].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][0].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][1].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][2].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][0].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][2].controlledBy = Owner.PLAYER2;
        Board bcloned = cloner.bclone(b);
        b.gameBoard[1][2].controlledBy = Owner.EMPTY;
        boolean comp = BoardCompare(b.gameBoard, bcloned.gameBoard);
        Assert.assertEquals(false, comp);
    }


}
