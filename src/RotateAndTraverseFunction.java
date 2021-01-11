import java.util.ArrayList;

public class RotateAndTraverseFunction implements IRotationandTraverseFunction

{
    protected boolean isAvalidRotation(ArrayList<Integer> propectivemoves)
    {
        boolean valid = true;

        for (int value: propectivemoves)

        {
            if(value < 0) // north
            {
            valid = false;
            break;
            }
            else  if (value % 10 == 9) // east
            {
                valid = false;
                break;
            }
            else  if (value > 90) // south
            {
                valid = false;
            }
            else if (value % 10 == 1)
            {
                valid = false;
                break;
            }
        }
        return valid;
    }

    protected int[] coordchanger(int traversevalue) // this takes values from the piece and translates them into coordinates for the map
    {
        int[] coord = new int[2];
        if (traversevalue > 10) {
            coord[1] = traversevalue % 10;
            coord[0] = Math.floorDiv(traversevalue, 10);

        } else if (traversevalue < 10) {
            coord[0] = 0;
            coord[1] = traversevalue;
        }

        return coord;
    }

    public void rotateCounterClockwise(Piece rotatingPiece) // defines the order of methods for right rotation
    {
        int index = 0;
        ArrayList<Integer> prospectiverotation = new ArrayList<Integer>();
        int[] pointofroation = coordchanger(rotatingPiece.piecemap.get(rotatingPiece.piecemap.size() / 2));
        for (int value : rotatingPiece.piecemap) {
            int[] valuecoords = coordchanger(value);

            int X1 = (pointofroation[0] + (valuecoords[1] - pointofroation[1])) * 10; // these are redundent but I keep them to avoid being buried in a long line of code
            int Y1 = (pointofroation[1] + (-1 * (valuecoords[0] - pointofroation[0])));

            int X1andY1 = ((pointofroation[0] + (valuecoords[1] - pointofroation[1])) * 10) + (pointofroation[1] + (-1 * (valuecoords[0] - pointofroation[0])));

            prospectiverotation.add(X1andY1);
            index += 1;
        }
        if(isAvalidRotation(prospectiverotation) == true)
            {
            rotatingPiece.piecemap = prospectiverotation;
            }
    }


    public void rotateClockwise(Piece rotatingPiece) // defines the order or use of methods for the right rotation
    {
        int index = 0;
        ArrayList<Integer> prospectiverotation = new ArrayList<Integer>();
        int[] pointofroation = coordchanger(rotatingPiece.piecemap.get(rotatingPiece.piecemap.size() / 2));
        for (int value : rotatingPiece.piecemap) {
            int[] valuecoords = coordchanger(value);

            int X1 = (pointofroation[0] + (-1 * (valuecoords[1] - pointofroation[1]))) * 10;
            int Y1 = pointofroation[1] + (valuecoords[0] - pointofroation[0]);

            int X1andY1 = ((pointofroation[0] + (-1 * (valuecoords[1] - pointofroation[1]))) * 10) + pointofroation[1] + (valuecoords[0] - pointofroation[0]);

            prospectiverotation.add(X1andY1);
            index += 1;
        }
        if(isAvalidRotation(prospectiverotation) == true)
        {
            rotatingPiece.piecemap = prospectiverotation;
        }

    }

    public void MoveNorth(Piece targetPiece)
    {

        ArrayList<Integer> prospectivemove = new ArrayList<Integer>();

        for (int i = 0; i < targetPiece.piecemap.size(); i++)
        {
            int newXY;
            newXY = targetPiece.piecemap.get(i) - 10;
            if(newXY < 0)
            {
             break;
            }
            else {
                prospectivemove.add(newXY);
            }
        }
        if(prospectivemove.size() == targetPiece.piecemap.size())
        {
            targetPiece.piecemap = prospectivemove;
        }
        else
            {

        }
    }


    public void MoveEast1(Piece targetPiece) {
        boolean canmoveEast = true;
        for (int value : targetPiece.piecemap) {
            if (value % 10 == 9) {
                canmoveEast = false;
            }
        }


        if (canmoveEast = true) {
            for (int i = 0; i < targetPiece.piecemap.size(); i++) {
                targetPiece.piecemap.set(i, targetPiece.piecemap.get(i) + 1);
            }
        }

    }


    public void MoveSouth(Piece targetPiece) // this prevents a piece from going over the border
    {
        boolean canmoveSouth = true;

        for (int value : targetPiece.piecemap) {
            if (value >= 90) {
                canmoveSouth = false;
            }
        }


        if (canmoveSouth = true) {

            for (int i = 0; i < targetPiece.piecemap.size(); i++) {
                targetPiece.piecemap.set(i, targetPiece.piecemap.get(i) + 10);
            }

        }
    }

    public void MoveWest(Piece targetPiece)
    {

        boolean canmoveWest = true;
        for (int value : targetPiece.piecemap) {
            if (value % 10 == 0) {
                    canmoveWest = false;
            }

        }

        if (canmoveWest = true) {
            for (int i = 0; i < targetPiece.piecemap.size(); i++) {
                targetPiece.piecemap.set(i, targetPiece.piecemap.get(i) - 1);
            }
        }

    }

}
