import java.util.*;


public class Inventory
{



public ArrayList<InventoryItem> PlayerInventory = new ArrayList<InventoryItem>();

public Inventory()
{
    PlayerInventory.add(new InventoryItem(PieceName.ABBEY, 1,4)); // Abbey
    PlayerInventory.add(new InventoryItem(PieceName.ACADEMY, 1, 5)); // Academy
    PlayerInventory.add(new InventoryItem(PieceName.BRIDGE, 1, 3)); // Bridge
    PlayerInventory.add(new InventoryItem(PieceName.CASTLE, 1, 5)); // Castle
    PlayerInventory.add(new InventoryItem(PieceName.INFIRMARY, 1, 5)); // Sq
    PlayerInventory.add(new InventoryItem(PieceName.INN, 2, 3)); // Inn
    PlayerInventory.add(new InventoryItem(PieceName.MANOR, 1, 4)); // Manor
    PlayerInventory.add(new InventoryItem(PieceName.SQUARE, 1, 4)); // Square
    PlayerInventory.add(new InventoryItem(PieceName.STABLE, 2, 2)); // Stable
    PlayerInventory.add(new InventoryItem(PieceName.TAVERN, 2, 1)); // Tavern
    PlayerInventory.add(new InventoryItem(PieceName.TOWER, 1, 5)); // Tower
}



    public void putBackPiece(PieceName name)
    {
        for (InventoryItem item: PlayerInventory)
        {
        if(name == item.pieceName)
        {
            item.quantity ++;
        }
        }
    }
    public void removePiece(PieceName name)
    {
        for (InventoryItem item: PlayerInventory)
        {
            if(name == item.pieceName)
            {
                item.quantity --;
            }
        }
    }

    public void ShowItemsinInventory()
    {
        for (InventoryItem item: PlayerInventory)
        {
            System.out.println(item.pieceName + " Quantity: " + item.quantity + " score: " + item.score);
        }
    }



}
