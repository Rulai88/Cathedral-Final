public class Tools  // this is to be a sort of 'toolbag' for things required for the mapping function that i
    // do not want to clog up the class with, also better in that it adds modularity.
{
    public static int[] coordchanger(int traversevalue) // this takes values from the piece and translates them into coordinates for the map
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

    public static boolean ValidMove(Board currentboard, Piece selectedPiece)
    {
        boolean returnvalue = true;

        for (int value : selectedPiece.piecemap)
        {
                int x = coordchanger(value)[0];
                int y = coordchanger(value)[1];

                if(currentboard.gameBoard[x][y].controlledBy != Owner.EMPTY || currentboard.gameBoard[x][y].occupiedBy != Owner.EMPTY ) // if the board is occupied or controlled
                {
                    if(currentboard.gameBoard[x][y].occupiedBy != Owner.EMPTY) // if the square has a piece on it
                    {
                        returnvalue = false;
                        break;
                    }
                    else if(currentboard.gameBoard[x][y].occupiedBy == Owner.EMPTY && currentboard.gameBoard[x][y].controlledBy != Owner.EMPTY) // if the square is controlled in some way
                    {
                        if (currentboard.gameBoard[x][y].controlledBy != selectedPiece.ownedBy) // if the square is not controlled by the player
                        {
                            returnvalue = false;
                            break;
                        }
                    }
                }
                else { }


        }
        return returnvalue;
    }

}

