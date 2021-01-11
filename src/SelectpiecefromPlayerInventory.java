public class SelectpiecefromPlayerInventory
{

public static Piece select(Player player)
{
    Piece returnvalue = new PlaceHolderPiece();
    for (InventoryItem item : player.inv.PlayerInventory) {
        PieceName name = item.pieceName;
        int num = item.quantity;
        if(num >= 1)
        {
            switch (name) {
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
            }
            break;
        }
    }
    return returnvalue;
}




}
