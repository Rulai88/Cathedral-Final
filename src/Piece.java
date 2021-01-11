import java.util.ArrayList;

public abstract class Piece
{

    PieceName name;
    Owner ownedBy; //refactored to reflect new reality
    protected ArrayList<Integer> piecemap = new ArrayList<Integer>(); // the map of coords given to a piece
    int score;

    public void showpiece() // this is mostly for testing purposes, and to display the piece on a 'demo' board.
    {
        System.out.println(piecemap);
    }


    protected boolean isAvalidRotation(ArrayList<Integer> propectivemoves)
    {
        boolean valid = true;

        for (int value: propectivemoves)

        {
            if(coordchanger(value)[0] <= -1) // north
            {
                valid = false;
                break;
            }
            else  if (coordchanger(value)[1] >= 9) // east
            {
                valid = false;
                break;
            }
            else  if (coordchanger(value)[0] >= 10) // south
            {
                valid = false;
            }
            else if (coordchanger(value)[1] <= -1) // west
            {
                valid = false;
                break;
            }
            else
                {

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

    public void rotateCounterClockwise() // defines the order of methods for right rotation
    {
        int index = 0;
        ArrayList<Integer> prospectiverotation = new ArrayList<Integer>();
        int[] pointofroation = coordchanger(piecemap.get(piecemap.size() / 2));
        for (int value : piecemap) {
            int[] valuecoords = coordchanger(value);

            int X1 = (pointofroation[0] + (valuecoords[1] - pointofroation[1])) * 10;
            int Y1 = (pointofroation[1] + (-1 * (valuecoords[0] - pointofroation[0])));

            int X1andY1 = ((pointofroation[0] + (valuecoords[1] - pointofroation[1])) * 10) + (pointofroation[1] + (-1 * (valuecoords[0] - pointofroation[0])));

            prospectiverotation.add(X1andY1);
            index += 1;
        }
        if(isAvalidRotation(prospectiverotation) == true)
        {
            piecemap = prospectiverotation;
        }
    }


    public void rotateClockwise() // defines the order or use of methods for the right rotation
    {
        int index = 0;
        ArrayList<Integer> prospectiverotation = new ArrayList<Integer>();
        int[] pointofroation = coordchanger(piecemap.get(piecemap.size() / 2));
        for (int value : piecemap) {
            int[] valuecoords = coordchanger(value);

            int X1 = (pointofroation[0] + (-1 * (valuecoords[1] - pointofroation[1]))) * 10;
            int Y1 = pointofroation[1] + (valuecoords[0] - pointofroation[0]);

            int X1andY1 = ((pointofroation[0] + (-1 * (valuecoords[1] - pointofroation[1]))) * 10) + pointofroation[1] + (valuecoords[0] - pointofroation[0]);

            prospectiverotation.add(X1andY1);
            index += 1;
        }
        if(isAvalidRotation(prospectiverotation) == true)
        {
            piecemap = prospectiverotation;
        }

    }

    public void MoveNorth()
    {

        ArrayList<Integer> prospectiverotation = new ArrayList<Integer>();

        for (int i = 0; i < piecemap.size(); i++)
        {
            prospectiverotation.add(piecemap.get(i) - 10);
        }
        //System.out.println(prospectiverotation.toString());
        if (isAvalidRotation(prospectiverotation) == true)
        {
            piecemap = prospectiverotation;
        }
    }



    public void MoveEast1()
    {

        ArrayList<Integer> prospectiverotation = new ArrayList<Integer>();

            boolean Moveeast = true;
            for (int i = 0; i < piecemap.size(); i++)
            {
                if((piecemap.get(i) + 1) % 10 != 0)
                {
                    prospectiverotation.add(piecemap.get(i) + 1);
                }
            }
            //System.out.println(prospectiverotation.toString());

            if(piecemap.size() == prospectiverotation.size())
            {
                piecemap = prospectiverotation;
            }
            else{}
        }





    public void MoveSouth() // this prevents a piece from going over the border
    {
        ArrayList<Integer> prospectiverotation = new ArrayList<Integer>();

        for (int i = 0; i < piecemap.size(); i++)
        {
            prospectiverotation.add(piecemap.get(i) + 10);
        }
        if (isAvalidRotation(prospectiverotation) == true)
        {
            piecemap = prospectiverotation;
        }
    }

    public void MoveWest()
    {

        ArrayList<Integer> prospectiverotation = new ArrayList<Integer>();

        for (int i = 0; i < piecemap.size(); i++)
        {
            prospectiverotation.add(piecemap.get(i) - 1);
        }
        if (isAvalidRotation(prospectiverotation) == true)
        {
            piecemap = prospectiverotation;
        }

    }


}


