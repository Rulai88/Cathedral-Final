public class IsItAnEdge
{

    public IsItAnEdge(){}

    public enum Edges
    {
        NORTH, SOUTH, EAST, WEST, NORTHEASTC, NORTHWESTC, SOUTHEASTC, SOUTHWESTC, NOTEDGE
    }





    public static Edges WhichEdge(int num)
    {
        int[]coord = CoordGet.getcoord(num);

        if(coord[0] == 0 && coord[1] == 0)
        {
        return Edges.NORTHWESTC;
        }

        else if(coord[0] == 0 && coord[1] == 9)
        {
        return Edges.NORTHEASTC;
        }

         else if(coord[0] == 9 && coord[1] == 0)
         {
             return Edges.SOUTHWESTC;
         }

         else if(coord[0] == 9 && coord[1] == 9)
         {
             return Edges.SOUTHEASTC;
         }

        else if(coord[1] == 0)
        {
        return Edges.WEST;
        }

        else if(coord[1] == 9)
        {
        return Edges.EAST;
        }


        else if(coord[0] == 0)
        {
            return Edges.NORTH;
        }

        else if(coord[0] == 9)
        {
            return Edges.SOUTH;
        }

        else if(coord[1] == 0)
        {
            return Edges.WEST;
        }

        else if(coord[1] == 9)
        {
            return Edges.EAST;
        }

        else{return Edges.NOTEDGE;}
    }

}
