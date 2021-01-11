import java.util.HashSet;
import java.util.Set;

public class FloodfillImpl
{
    int LnD = 10; // length and depth
    public Set<Integer> coordlist = new HashSet<Integer>();

    public FloodfillImpl()
    {

    }

    private void Flood(Board board, int startX, int startY, Owner squareColour, Owner playersColour) // squareColour = new Colour, newC = new colour
    {
//        if(startX < 0) { startX = 0; }
//        if(startX > 9) { startX = 9; }
//        if(startY < 0) { startY = 0; }
//        if(startY > 9) { startY = 9; }

        if (startX < 0 || startX >= LnD || startY < 0 || startY >= LnD) // stops from going out of bounds
            return;
        //if (board.gameBoard[startX][startY].controlledBy != squareColour) // this states that it will ignore things that are not the right 'colour', in this case the relevent occupation value
            //return;
        if (board.gameBoard[startX][startY].controlledBy == playersColour)
            return;

            board.gameBoard[startX][startY].controlledBy = playersColour;
            coordlist.add(board.gameBoard[startX][startY].Squarenum);

        Flood(board, startX + 1, startY, squareColour, playersColour); // south
        Flood(board, startX-1, startY, squareColour, playersColour); // north
        Flood(board, startX,  startY+1, squareColour, playersColour); // east
        Flood(board, startX,  startY-1, squareColour, playersColour); // west
        Flood(board, startX+1,  startY-1, squareColour, playersColour); // southwest
        Flood(board, startX-1,  startY-1, squareColour, playersColour); // northwest
        Flood(board, startX+1, startY+1, squareColour, playersColour); // southeast
        Flood(board, startX -1,  startY+1, squareColour, playersColour); // northeast
    }

    public Set<Integer> FloodFill(Board board, int x, int y, Owner PlayersColour)
    {
        coordlist.clear(); // clears the list prior to initiating fill
        Owner prevC = board.gameBoard[x][y].controlledBy;
        Flood(board, x, y, prevC, PlayersColour);
        return coordlist;
    }




}
