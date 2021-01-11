import java.util.ArrayList;

public class GameEndCondition
{
    public static Boolean EndGame(Player p, Board b)
    {
        BoardScan bscan = new BoardScan();
        ArrayList<Boolean> values = new ArrayList<Boolean>();

        for (InventoryItem item : p.inv.PlayerInventory)
        {
            if(item.quantity > 0){

            Boolean North = bscan.ScanNorth(item, b, p);
            Boolean East = bscan.ScanEast(item, b, p);
            Boolean South = bscan.ScanSouth(item, b, p);
            Boolean West = bscan.ScanWest(item, b, p);
            if (North == true || East == true || South == true || West == true) {
                values.add(true);
            } else {
                values.add(false);
            }
        }
        }

        if(values.isEmpty())
        {
        return true;
        }
        else if(values.contains(true))
        {
        return false;
        }
        else {return true;}

    }

    
}