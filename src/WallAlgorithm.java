import java.util.HashSet;
import java.util.Set;

public class WallAlgorithm
{

    Move givebackpiecename;

    public enum RemovePiece{PIECETOBEREMOVED, NOPIECETOREMOVE}
    public RemovePiece removepiece = RemovePiece.NOPIECETOREMOVE;

    public WallAlgorithm()
    {

    }

public void RunWallAlgorithm(Board board, Piece piece, Movelist list_of_moves, Player currentPlayer)
{

    SquareTraversal squaretrav = new SquareTraversal();
    FindOccupiedArea find = new FindOccupiedArea();
    Set<Integer> resultofWallAlgoritm = find.ReturnAreaToBeFilled(squaretrav.LevelOrderTraversal(board, piece.piecemap.get(0), piece.ownedBy));
    removepiece = RemovePiece.NOPIECETOREMOVE;
    
    if(resultofWallAlgoritm.contains(999) || list_of_moves.CheckMoveListforPiece(resultofWallAlgoritm, currentPlayer) == Movelist.PieceDetect.TWOORMOREPIECESFOUND) // all results defined as the same OR two many piece bits, no fill needed.
    {
        System.out.println("Two or more pieces found or no fill needed");
    }

    else
        {
            if(list_of_moves.CheckMoveListforPiece(resultofWallAlgoritm, currentPlayer) == Movelist.PieceDetect.NOPIECESFOUND) // just fills, no pieces detected
            {
                for (Integer num: resultofWallAlgoritm)
                {
                    board.gameBoard[CoordGet.getcoord(num)[0]][CoordGet.getcoord(num)[1]].controlledBy = piece.ownedBy;
                }
                givebackpiecename = null;
                removepiece = RemovePiece.NOPIECETOREMOVE;
                System.out.println("No piece found in fill area");
            }
            else if (list_of_moves.CheckMoveListforPiece(resultofWallAlgoritm, currentPlayer) == Movelist.PieceDetect.ONEPIECEFOUND) // removes the piece and then fills
            {
                givebackpiecename = list_of_moves.pieceTobeRemoved;
                removepiece = RemovePiece.PIECETOBEREMOVED;
                for (Integer num: resultofWallAlgoritm)
                {
                    board.gameBoard[CoordGet.getcoord(num)[0]][CoordGet.getcoord(num)[1]].controlledBy = piece.ownedBy;
                    board.gameBoard[CoordGet.getcoord(num)[0]][CoordGet.getcoord(num)[1]].occupiedBy = Owner.EMPTY;
                }
                System.out.println("One piece found");
            }
            else
                {
                System.out.println("No valid input");
            }

        }
    }




}







