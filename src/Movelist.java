import java.util.ArrayList;
import java.util.Set;

public class Movelist {
    private ArrayList<Move> ListofMoves = new ArrayList<Move>();
    public Move pieceTobeRemoved = null;

    public Movelist() {
    }



    public void AppendToMovelist(Piece piece, int gonum) {
        ListofMoves.add(new Move(piece, gonum));
    }

    public enum PieceDetect {ONEPIECEFOUND, TWOORMOREPIECESFOUND, NOPIECESFOUND}

    public PieceDetect CheckMoveListforPiece(Set<Integer> prospectFill, Player currentplayer) {
        System.out.println("Running piece detection");
        int matches = 0;
        for (Move move : ListofMoves) {
            for (int num : move.Piecemap) {
                System.out.println("is " + num + " contained in set: " + prospectFill.toString() + "?");
                if (prospectFill.contains(num) && move.owner != currentplayer.owner) {
                    matches += 1;
                    pieceTobeRemoved = move;
                    break;
                }
            }
        }

        if (matches == 0) {
            System.out.println("MoveList detector says: No opponent pieces found in player area");
            return PieceDetect.NOPIECESFOUND;
        } else if (matches == 1) {
            System.out.println("MoveList detector says: single piece found, remove " + pieceTobeRemoved.piecename + "belonging to" + pieceTobeRemoved.owner);
            return PieceDetect.ONEPIECEFOUND;
        } else {
            System.out.println("more than two pieces found");
            return PieceDetect.TWOORMOREPIECESFOUND;
        }


    }
    public void showallmoves()
    {
        for (Move move : ListofMoves)
        {
            move.showmove();
        }
    }
}

