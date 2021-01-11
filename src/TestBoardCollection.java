public class TestBoardCollection
{

    Board testboard1Player1()
    {
        Board b = new Board();
        b.gameBoard[2][0].controlledBy = Owner.PLAYER1;
        b.gameBoard[2][1].controlledBy = Owner.PLAYER1;
        b.gameBoard[2][2].controlledBy = Owner.PLAYER1;

        b.gameBoard[0][2].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][2].controlledBy = Owner.PLAYER1;

        b.gameBoard[2][0].occupiedBy = Owner.PLAYER1;
        b.gameBoard[2][1].occupiedBy = Owner.PLAYER1;
        b.gameBoard[2][2].occupiedBy = Owner.PLAYER1;

        b.gameBoard[0][2].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][2].occupiedBy = Owner.PLAYER1;
        return b;

    }

    Board testboard2Player1()
    {
        Board b = new Board();
        b.gameBoard[5][8].controlledBy = Owner.PLAYER1;
        b.gameBoard[6][7].controlledBy = Owner.PLAYER1;
        b.gameBoard[6][8].controlledBy = Owner.PLAYER1;
        b.gameBoard[6][9].controlledBy = Owner.PLAYER1;

        b.gameBoard[7][7].controlledBy = Owner.PLAYER1;
        b.gameBoard[8][6].controlledBy = Owner.PLAYER1;
        b.gameBoard[8][7].controlledBy = Owner.PLAYER1;
        b.gameBoard[9][6].controlledBy = Owner.PLAYER1;

        b.gameBoard[5][8].occupiedBy = Owner.PLAYER1;
        b.gameBoard[6][7].occupiedBy = Owner.PLAYER1;
        b.gameBoard[6][8].occupiedBy = Owner.PLAYER1;
        b.gameBoard[6][9].occupiedBy = Owner.PLAYER1;

        b.gameBoard[7][7].occupiedBy = Owner.PLAYER1;
        b.gameBoard[8][6].occupiedBy = Owner.PLAYER1;
        b.gameBoard[8][7].occupiedBy = Owner.PLAYER1;
        b.gameBoard[9][6].occupiedBy = Owner.PLAYER1;
        return b;
    }

    Board testboard3Player1()
    {
        Board b = new Board();
        b.gameBoard[0][5].controlledBy = Owner.PLAYER1;
        b.gameBoard[0][6].controlledBy = Owner.PLAYER1;
        b.gameBoard[0][7].controlledBy = Owner.PLAYER1;
        b.gameBoard[0][8].controlledBy = Owner.PLAYER1;

        b.gameBoard[3][5].controlledBy = Owner.PLAYER1;
        b.gameBoard[3][6].controlledBy = Owner.PLAYER1;
        b.gameBoard[3][7].controlledBy = Owner.PLAYER1;
        b.gameBoard[3][8].controlledBy = Owner.PLAYER1;

        b.gameBoard[1][5].controlledBy = Owner.PLAYER1;
        b.gameBoard[2][5].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][8].controlledBy = Owner.PLAYER1;
        b.gameBoard[2][8].controlledBy = Owner.PLAYER1;

        b.gameBoard[0][5].occupiedBy = Owner.PLAYER1;
        b.gameBoard[0][6].occupiedBy = Owner.PLAYER1;
        b.gameBoard[0][7].occupiedBy = Owner.PLAYER1;
        b.gameBoard[0][8].occupiedBy = Owner.PLAYER1;

        b.gameBoard[3][5].occupiedBy = Owner.PLAYER1;
        b.gameBoard[3][6].occupiedBy = Owner.PLAYER1;
        b.gameBoard[3][7].occupiedBy = Owner.PLAYER1;
        b.gameBoard[3][8].occupiedBy = Owner.PLAYER1;

        b.gameBoard[1][5].occupiedBy = Owner.PLAYER1;
        b.gameBoard[2][5].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][8].occupiedBy = Owner.PLAYER1;
        b.gameBoard[2][8].occupiedBy = Owner.PLAYER1;

        return b;
    }

    Board testboard4Player1()
    {
        Board b = new Board();
        b.gameBoard[1][0].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][1].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][2].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][3].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][4].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][5].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][6].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][7].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][8].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][9].occupiedBy = Owner.PLAYER1;

        b.gameBoard[1][0].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][1].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][2].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][3].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][4].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][5].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][6].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][7].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][8].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][9].controlledBy = Owner.PLAYER1;
        return b;
    }

    Board testboard5gap()
    {
        Board b = new Board();
        b.gameBoard[2][0].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][1].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][2].controlledBy = Owner.PLAYER1;

        b.gameBoard[0][2].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][2].controlledBy = Owner.PLAYER1;

        b.gameBoard[2][0].occupiedBy = Owner.PLAYER2;
        b.gameBoard[2][1].occupiedBy = Owner.PLAYER2;
        b.gameBoard[2][2].occupiedBy = Owner.PLAYER1;

        b.gameBoard[0][2].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][2].occupiedBy = Owner.PLAYER1;
        return b;
    }

    Board testboard6gap()
    {
        Board b = new Board();
        b.gameBoard[5][8].controlledBy = Owner.PLAYER1;
        b.gameBoard[6][7].controlledBy = Owner.PLAYER1;
        b.gameBoard[6][8].controlledBy = Owner.PLAYER1;
        b.gameBoard[6][9].controlledBy = Owner.PLAYER2;

        b.gameBoard[7][7].controlledBy = Owner.PLAYER1;
        b.gameBoard[8][6].controlledBy = Owner.PLAYER1;
        b.gameBoard[8][7].controlledBy = Owner.PLAYER1;
        b.gameBoard[9][6].controlledBy = Owner.PLAYER1;

        b.gameBoard[5][8].occupiedBy = Owner.PLAYER1;
        b.gameBoard[6][7].occupiedBy = Owner.PLAYER1;
        b.gameBoard[6][8].occupiedBy = Owner.PLAYER1;
        b.gameBoard[6][9].occupiedBy = Owner.PLAYER2;

        b.gameBoard[7][7].occupiedBy = Owner.PLAYER1;
        b.gameBoard[8][6].occupiedBy = Owner.PLAYER1;
        b.gameBoard[8][7].occupiedBy = Owner.PLAYER1;
        b.gameBoard[9][6].occupiedBy = Owner.PLAYER1;
        return b;
    }

    Board testboard7GapCathedralP1()
    {
        Board b = new Board();
        b.gameBoard[2][0].controlledBy = Owner.CATHEDRAL;
        b.gameBoard[2][1].controlledBy = Owner.CATHEDRAL;
        b.gameBoard[2][2].controlledBy = Owner.PLAYER1;

        b.gameBoard[0][2].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][2].controlledBy = Owner.PLAYER1;

        b.gameBoard[2][0].occupiedBy = Owner.CATHEDRAL;
        b.gameBoard[2][1].occupiedBy = Owner.CATHEDRAL;
        b.gameBoard[2][2].occupiedBy = Owner.PLAYER1;

        b.gameBoard[0][2].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][2].occupiedBy = Owner.PLAYER1;
        return b;
    }

    Board testboard8GapCathedralP2()
    {
        Board b = new Board();
        b.gameBoard[2][0].controlledBy = Owner.CATHEDRAL;
        b.gameBoard[2][1].controlledBy = Owner.CATHEDRAL;
        b.gameBoard[2][2].controlledBy = Owner.PLAYER2;

        b.gameBoard[0][2].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][2].controlledBy = Owner.PLAYER2;

        b.gameBoard[2][0].occupiedBy = Owner.CATHEDRAL;
        b.gameBoard[2][1].occupiedBy = Owner.CATHEDRAL;
        b.gameBoard[2][2].occupiedBy = Owner.PLAYER2;

        b.gameBoard[0][2].occupiedBy = Owner.PLAYER2;
        b.gameBoard[1][2].occupiedBy = Owner.PLAYER2;
        return b;
    }

    Board testboard8GapCathedralMixed()
    {
        Board b = new Board();
        b.gameBoard[2][0].controlledBy = Owner.CATHEDRAL;
        b.gameBoard[2][1].controlledBy = Owner.CATHEDRAL;
        b.gameBoard[2][2].controlledBy = Owner.PLAYER2;

        b.gameBoard[0][2].controlledBy = Owner.PLAYER1;
        b.gameBoard[1][2].controlledBy = Owner.PLAYER1;

        b.gameBoard[2][0].occupiedBy = Owner.CATHEDRAL;
        b.gameBoard[2][1].occupiedBy = Owner.CATHEDRAL;
        b.gameBoard[2][2].occupiedBy = Owner.PLAYER2;

        b.gameBoard[0][2].occupiedBy = Owner.PLAYER1;
        b.gameBoard[1][2].occupiedBy = Owner.PLAYER1;
        return b;
    }



    Board testboard1Player2()
    {
        Board b = new Board();
        b.gameBoard[2][0].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][1].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][2].controlledBy = Owner.PLAYER2;

        b.gameBoard[0][2].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][2].controlledBy = Owner.PLAYER2;

        b.gameBoard[2][0].occupiedBy = Owner.PLAYER2;
        b.gameBoard[2][1].occupiedBy = Owner.PLAYER2;
        b.gameBoard[2][2].occupiedBy = Owner.PLAYER2;

        b.gameBoard[0][2].occupiedBy = Owner.PLAYER2;
        b.gameBoard[1][2].occupiedBy = Owner.PLAYER2;
        return b;
    }

    Board testboard2Player2()
    {
        Board b = new Board();
        b.gameBoard[5][8].controlledBy = Owner.PLAYER2;
        b.gameBoard[6][7].controlledBy = Owner.PLAYER2;
        b.gameBoard[6][8].controlledBy = Owner.PLAYER2;
        b.gameBoard[6][9].controlledBy = Owner.PLAYER2;

        b.gameBoard[7][7].controlledBy = Owner.PLAYER2;
        b.gameBoard[8][6].controlledBy = Owner.PLAYER2;
        b.gameBoard[8][7].controlledBy = Owner.PLAYER2;
        b.gameBoard[9][6].controlledBy = Owner.PLAYER2;

        b.gameBoard[5][8].occupiedBy = Owner.PLAYER2;
        b.gameBoard[6][7].occupiedBy = Owner.PLAYER2;
        b.gameBoard[6][8].occupiedBy = Owner.PLAYER2;
        b.gameBoard[6][9].occupiedBy = Owner.PLAYER2;

        b.gameBoard[7][7].occupiedBy = Owner.PLAYER1;
        b.gameBoard[8][6].occupiedBy = Owner.PLAYER1;
        b.gameBoard[8][7].occupiedBy = Owner.PLAYER1;
        b.gameBoard[9][6].occupiedBy = Owner.PLAYER1;

        return b;
    }

    Board testboard3Player2()
    {
        Board b = new Board();
        b.gameBoard[0][5].controlledBy = Owner.PLAYER2;
        b.gameBoard[0][6].controlledBy = Owner.PLAYER2;
        b.gameBoard[0][7].controlledBy = Owner.PLAYER2;
        b.gameBoard[0][8].controlledBy = Owner.PLAYER2;

        b.gameBoard[3][5].controlledBy = Owner.PLAYER2;
        b.gameBoard[3][6].controlledBy = Owner.PLAYER2;
        b.gameBoard[3][7].controlledBy = Owner.PLAYER2;
        b.gameBoard[3][8].controlledBy = Owner.PLAYER2;

        b.gameBoard[1][5].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][5].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][8].controlledBy = Owner.PLAYER2;
        b.gameBoard[2][8].controlledBy = Owner.PLAYER2;

        b.gameBoard[0][5].occupiedBy = Owner.PLAYER2;
        b.gameBoard[0][6].occupiedBy = Owner.PLAYER2;
        b.gameBoard[0][7].occupiedBy = Owner.PLAYER2;
        b.gameBoard[0][8].occupiedBy = Owner.PLAYER2;

        b.gameBoard[3][5].occupiedBy = Owner.PLAYER2;
        b.gameBoard[3][6].occupiedBy = Owner.PLAYER2;
        b.gameBoard[3][7].occupiedBy = Owner.PLAYER2;
        b.gameBoard[3][8].occupiedBy = Owner.PLAYER2;

        b.gameBoard[1][5].occupiedBy = Owner.PLAYER2;
        b.gameBoard[2][5].occupiedBy = Owner.PLAYER2;
        b.gameBoard[1][8].occupiedBy = Owner.PLAYER2;
        b.gameBoard[2][8].occupiedBy = Owner.PLAYER2;
        return b;
    }

    Board testboard4Player2()
    {
        Board b = new Board();
        b.gameBoard[1][0].occupiedBy = Owner.PLAYER2;
        b.gameBoard[1][1].occupiedBy = Owner.PLAYER2;
        b.gameBoard[1][2].occupiedBy = Owner.PLAYER2;
        b.gameBoard[1][3].occupiedBy = Owner.PLAYER2;
        b.gameBoard[1][4].occupiedBy = Owner.PLAYER2;
        b.gameBoard[1][5].occupiedBy = Owner.PLAYER2;
        b.gameBoard[1][6].occupiedBy = Owner.PLAYER2;
        b.gameBoard[1][7].occupiedBy = Owner.PLAYER2;
        b.gameBoard[1][8].occupiedBy = Owner.PLAYER2;
        b.gameBoard[1][9].occupiedBy = Owner.PLAYER2;

        b.gameBoard[1][0].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][1].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][2].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][3].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][4].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][5].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][6].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][7].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][8].controlledBy = Owner.PLAYER2;
        b.gameBoard[1][9].controlledBy = Owner.PLAYER2;
        return b;
    }

    Board TestBoard9AllOccupiedByPlayer1()
    {
    Board b = new Board();
        for (BSquare[] row: b.gameBoard)
        {
            for (BSquare square: row)
            {
            square.occupiedBy = Owner.PLAYER1;
            square.controlledBy = Owner.PLAYER1;
            }
        }
        return b;
    }


    Board TestBoard9AllOccupiedByPlayer2()
    {
        Board b = new Board();
        for (BSquare[] row: b.gameBoard)
        {
            for (BSquare square: row)
            {
                square.occupiedBy = Owner.PLAYER2;
                square.controlledBy = Owner.PLAYER2;
            }
        }
        return b;
    }
}
