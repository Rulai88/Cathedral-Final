import org.junit.Assert;
import org.junit.Test;

public class SelectPieceFromInventoryTesting
{

@Test
    public void ReturnCorrectPiece1()
{
    Player testplayer = new Player(Owner.PLAYER1);
    Piece result = SelectpiecefromPlayerInventory.select(testplayer);
    Assert.assertEquals(PieceName.ABBEY, result.name);

}



}
