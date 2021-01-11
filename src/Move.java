import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Move
{
Set<Integer> Piecemap;
Owner owner;
int movenum;
PieceName piecename;

public Move(Piece piece, int num)
{
owner = piece.ownedBy;
movenum = num;
piecename = piece.name;
    Set<Integer> map = new HashSet<>();

for (int n: piece.piecemap)
    {
        map.add(n);
    }
Piecemap = map;

}

public void showmove()
{
System.out.println(movenum + "player " + owner + "place a " + piecename + " at " + Piecemap.toString());
}

}
