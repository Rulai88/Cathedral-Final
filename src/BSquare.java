public class BSquare extends SelectPieceFromInventoryTesting {
public Owner occupiedBy;
public Owner controlledBy;
public int Squarenum;

public BSquare(int num, Owner occupy, Owner control)
{
 occupiedBy = occupy;
 controlledBy = occupy;
 Squarenum = num;
}

public String claim()
{
 if(controlledBy == Owner.PLAYER1)
 {
  return "[" + 1 + "]";
 }
 else if (controlledBy == Owner.PLAYER2)
 {
  return "[" + 2 + "]";
 }
else if (controlledBy == Owner.CATHEDRAL)
 {
  return "[" + 3 + "]";
 }
else {
  return "[" + 0 + "]";
 }

}

public String occupy()
{
 if(occupiedBy == Owner.PLAYER1)
 {
  return "[" + 1 + "]";
 }
 else if (controlledBy == Owner.PLAYER2)
 {
  return "[" + 2 + "]";
 }
 else if (controlledBy == Owner.CATHEDRAL)
 {
  return "[" + 3 + "]";
 }
 else {
  return "[" + 0 + "]";
 }

}

 public String snum()
 { return "[" + Squarenum + "]";}

}
