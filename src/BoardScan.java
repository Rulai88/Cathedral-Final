public class BoardScan implements IBoardScan
{


    private Piece getPieceForscan(PieceName name, Player player){
      Piece returnvalue = new PlaceHolderPiece();

        switch(name)
        {
            case ACADEMY:
        returnvalue = new Academy(player.owner);
        break;
    case ABBEY:
        returnvalue = new Abbey(player.owner);
        break;
    case BRIDGE:
        returnvalue = new Bridge(player.owner);
        break;
    case CASTLE:
        returnvalue = new Castle(player.owner);
        break;
    case INFIRMARY:
        returnvalue = new Infirmary(player.owner);
        break;
    case INN:
        returnvalue = new Inn(player.owner);
        break;
    case MANOR:
        returnvalue = new Manor(player.owner);
        break;
    case SQUARE:
        returnvalue = new Square(player.owner);
        break;
    case STABLE:
        returnvalue = new Stable(player.owner);
        break;
    case TAVERN:
        returnvalue = new  Tavern(player.owner);
        break;
    case TOWER:
        returnvalue = new Tower(player.owner);
        break;
            default:
                break;

}
        return returnvalue;
    }



    @Override
    public Boolean ScanNorth(InventoryItem item, Board currentBoard, Player p) {
        System.out.println("SCANNING NORTH ROTATION");
        boolean CanPlacePiece = false;
        int index = 0;
        Piece scanningpiece = getPieceForscan(item.pieceName, p);

        // piece moved to top left corner
        for (int i = 0; i < 5; i++)
        {
        scanningpiece.MoveNorth();
        }
        for (int i = 0; i < 5; i++)
        {
            scanningpiece.MoveWest();
        }

        while (CanPlacePiece = false || index < 10){

            for (int east = 0; east < 10 ; east++)
            {
                scanningpiece.MoveEast1();
                System.out.println("Piecemap is: " + scanningpiece.piecemap.toString());
                CanPlacePiece = Tools.ValidMove(currentBoard, scanningpiece);
                if(CanPlacePiece == true) { break; }
            }
            if(CanPlacePiece == true) { break; }
            for (int j = 0; j < 10; j++)
            {
                scanningpiece.MoveWest();
                System.out.println("Piecemap is: " + scanningpiece.piecemap.toString());
                CanPlacePiece = Tools.ValidMove(currentBoard, scanningpiece);
                if(CanPlacePiece == true) { break; }
            }
            CanPlacePiece = Tools.ValidMove(currentBoard, scanningpiece);
            if(CanPlacePiece == true) { break; }
            scanningpiece.MoveSouth();
            System.out.println("Piecemap is: " + scanningpiece.piecemap.toString());
            index ++;
        }
        return CanPlacePiece;
    }

    @Override
    public Boolean ScanEast(InventoryItem item, Board currentBoard, Player p) {
        System.out.println("SCANNING EAST ROTATION");
        boolean CanPlacePiece;
        int index = 0;
        Piece scanningpiece = getPieceForscan(item.pieceName, p);
        scanningpiece.rotateCounterClockwise();
        for (int i = 0; i < 5; i++)
        {
            scanningpiece.MoveNorth();
        }
        for (int i = 0; i < 5; i++)
        {
            scanningpiece.MoveWest();
        }

        while (CanPlacePiece = false || index < 10){

            for (int east = 0; east < 10 ; east++)
            {
                scanningpiece.MoveEast1();
                System.out.println("Piecemap is: " + scanningpiece.piecemap.toString());
                CanPlacePiece = Tools.ValidMove(currentBoard, scanningpiece);
                if(CanPlacePiece == true) { break; }
            }
            if(CanPlacePiece == true) { break; }
            for (int j = 0; j < 10; j++)
            {
                scanningpiece.MoveWest();
                System.out.println("Piecemap is: " + scanningpiece.piecemap.toString());
                CanPlacePiece = Tools.ValidMove(currentBoard, scanningpiece);
                if(CanPlacePiece == true) { break; }
            }
            CanPlacePiece = Tools.ValidMove(currentBoard, scanningpiece);
            if(CanPlacePiece == true) { break; }
            scanningpiece.MoveSouth();
            System.out.println("Piecemap is: " + scanningpiece.piecemap.toString());
            index ++;
        }
        return CanPlacePiece;
    }

    @Override
    public Boolean ScanWest(InventoryItem item, Board currentBoard, Player p)
    {
        System.out.println("SCANNING WEST ROTATION");
        boolean CanPlacePiece;
            int index = 0;
            Piece scanningpiece = getPieceForscan(item.pieceName, p);
            scanningpiece.rotateClockwise();
            for (int i = 0; i < 5; i++)
            {
                scanningpiece.MoveNorth();
            }
            for (int i = 0; i < 5; i++)
            {
                scanningpiece.MoveWest();
            }

            while (CanPlacePiece = false || index < 10){

                for (int east = 0; east < 10 ; east++)
                {
                    scanningpiece.MoveEast1();
                    System.out.println("Piecemap is: " + scanningpiece.piecemap.toString());
                    CanPlacePiece = Tools.ValidMove(currentBoard, scanningpiece);
                    if(CanPlacePiece == true) { break; }
                }
                if(CanPlacePiece == true) { break; }
                for (int j = 0; j < 10; j++)
                {
                    scanningpiece.MoveWest();
                    System.out.println("Piecemap is: " + scanningpiece.piecemap.toString());
                    CanPlacePiece = Tools.ValidMove(currentBoard, scanningpiece);
                    if(CanPlacePiece == true) { break; }
                }
                CanPlacePiece = Tools.ValidMove(currentBoard, scanningpiece);
                if(CanPlacePiece == true) { break; }
                scanningpiece.MoveSouth();
                System.out.println("Piecemap is: " + scanningpiece.piecemap.toString());
                index ++;
            }
            return CanPlacePiece;
    }

    @Override
    public Boolean ScanSouth(InventoryItem item, Board currentBoard, Player p)
    {
            System.out.println("SCANNING SOUTH ROTATION");
            boolean CanPlacePiece;
            int index = 0;
            Piece scanningpiece = getPieceForscan(item.pieceName, p);
            scanningpiece.rotateCounterClockwise();
            scanningpiece.rotateCounterClockwise();
            for (int i = 0; i < 5; i++)
            {
                scanningpiece.MoveNorth();
            }
            for (int i = 0; i < 5; i++)
            {
                scanningpiece.MoveWest();
            }

            while (CanPlacePiece = false || index < 10){

                for (int east = 0; east < 10 ; east++)
                {
                    scanningpiece.MoveEast1();
                    System.out.println("Piecemap is: " + scanningpiece.piecemap.toString());
                    CanPlacePiece = Tools.ValidMove(currentBoard, scanningpiece);
                    if(CanPlacePiece == true) { break; }
                }
                if(CanPlacePiece == true) { break; }
                for (int j = 0; j < 10; j++)
                {
                    scanningpiece.MoveWest();
                    System.out.println("Piecemap is: " + scanningpiece.piecemap.toString());
                    CanPlacePiece = Tools.ValidMove(currentBoard, scanningpiece);
                    if(CanPlacePiece == true) { break; }
                }
                CanPlacePiece = Tools.ValidMove(currentBoard, scanningpiece);
                if(CanPlacePiece == true) { break; }
                scanningpiece.MoveSouth();
                System.out.println("Piecemap is: " + scanningpiece.piecemap.toString());
                index ++;
            }
            return CanPlacePiece;
    }
}
