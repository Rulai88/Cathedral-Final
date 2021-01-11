public class ControlUnit implements IControlUnit

{
    Board gameboard;
    Player player1;
    Player player2;
    Player currentplayer;
    Movelist movelist;
    Piece selectedpiece = new Cathedral();
    Tools toolbox = new Tools();
    WallAlgorithm wallAlgorithm = new WallAlgorithm();
    public enum WhoseGo{PLAYER1, PLAYER2 }
    WhoseGo whosego = WhoseGo.PLAYER1;
    int movenum = 0;
    boolean Endgame = false;


    public ControlUnit()
    {
        player1 = new Player(Owner.PLAYER1);
        player2 = new Player(Owner.PLAYER2);
        currentplayer = player1;
        movelist = new Movelist();
        gameboard = new Board();
    }



    @Override
    public void PlacePiece(Board b)
    {

        // this is the final thing that needs to be done to update the board.
        // this effectivly locks in the decision to place a piece on the board and checks to see if if
        // has space to be placed.

            if(toolbox.ValidMove(b, selectedpiece) == true) // if this returns true then the function will map the existing piece value onto the board
            // if false it will simply return the board with no additions made
            {

                for (int value: selectedpiece.piecemap)
                {
                    int[] coord = toolbox.coordchanger(value);

                    b.gameBoard[coord[0]][coord[1]].occupiedBy = selectedpiece.ownedBy;
                    b.gameBoard[coord[0]][coord[1]].controlledBy = selectedpiece.ownedBy;
                }

                wallAlgorithm.RunWallAlgorithm(gameboard, selectedpiece, movelist, currentplayer); // runs the wallalgorithm on the board
                if(wallAlgorithm.removepiece == WallAlgorithm.RemovePiece.PIECETOBEREMOVED)
                {
                    if(wallAlgorithm.givebackpiecename.owner == Owner.PLAYER1)
                    {
                        player1.inv.putBackPiece(wallAlgorithm.givebackpiecename.piecename); // add the subtraction thing in
                        player1.Score -= SubtractScore.Subtract(wallAlgorithm.givebackpiecename.piecename);
                    }
                    else if(wallAlgorithm.givebackpiecename.owner == Owner.PLAYER2)
                    {
                        player2.inv.putBackPiece(wallAlgorithm.givebackpiecename.piecename);
                        player2.Score -= SubtractScore.Subtract(wallAlgorithm.givebackpiecename.piecename);
                    }


                }

                currentplayer.inv.removePiece(selectedpiece.name); // removes piece when you place a piece
                movelist.AppendToMovelist(selectedpiece, movenum);
                movenum++;
                currentplayer.update_score_int(selectedpiece.score);
                System.out.println("Score for " + currentplayer.owner + " is " + currentplayer.Score);
                //movelist.showallmoves();

                if(currentplayer.owner == Owner.PLAYER1)
                {
                    currentplayer = player2;
                }
                else {
                    currentplayer = player1;
                }

                selectedpiece = SelectpiecefromPlayerInventory.select(currentplayer);

                if(movenum > 10)
                {
                    boolean Endgame = GameEndCondition.EndGame(currentplayer, gameboard);
                }

            }
            //else{System.out.println("MOVE INVALID");}
    }

    public void switchgo()
    {
        if(currentplayer.owner == Owner.PLAYER1)
        {
            currentplayer = player2;
            selectedpiece = SelectpiecefromPlayerInventory.select(currentplayer);
        }
        else {
            currentplayer = player1;
            selectedpiece = SelectpiecefromPlayerInventory.select(currentplayer);
        }
    }


    @Override
    public void ResetBoard()
    {
        gameboard = new Board();
        player1 = new Player(Owner.PLAYER1);
        player2 = new Player(Owner.PLAYER2);
        currentplayer = player1;
        movelist = new Movelist();
        selectedpiece = new Cathedral();
        ControlUnit.WhoseGo whosego = ControlUnit.WhoseGo.PLAYER1;
        Boolean gamecontinue = true;
        movenum = 0;
    }



}
