public class Board
{
    public BSquare[][] gameBoard = new BSquare[10][10];
    protected CoordGet cget = new CoordGet();

    public Board()
    {
        int snum = 0;

        for (int i = 0; i < 10 ; i++)
        {
            BSquare[] Row = new BSquare[10]; // this creates a row of ten square objects assigned to an array
            for (int j = 0; j < 10; j++) // this adds 'square' objects into the row array
            {
                Row[j] = new BSquare(snum, Owner.EMPTY, Owner.EMPTY);
                snum ++;
            }
            gameBoard[i] = Row; // each row is assigned to the class variable and will not be initialised until then.
        }
    }

    public void ShowAreaOccupied()
    {
        int rownum = 0;
        for (BSquare[] row : gameBoard)
        {
            String rowrepresentation = "";

            for ( BSquare square : row)
            {
                rowrepresentation += square.claim();
            }

            System.out.println(rowrepresentation);
        }
    }

    public void ShowAreaClaimied()
    {
        int rownum = 0;
        for (BSquare[] row : gameBoard)
        {
            String rowrepresentation = "";

            for ( BSquare square : row)
            {
                rowrepresentation += square.occupy();
            }

            System.out.println(rowrepresentation);
        }
    }

    public void ShowSquarenums()
    {
        int rownum = 0;
        for (BSquare[] row : gameBoard)
        {
            String rowrepresentation = "";

            for ( BSquare square : row)
            {
                rowrepresentation += square.snum();
            }

            System.out.println(rowrepresentation);
        }
    }









}
