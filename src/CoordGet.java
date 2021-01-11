public class CoordGet // I needed to use a function  that grabbed coords so often that it was easier to just put it in
    // it's own class rather than having to repeat myself or add it to a larger class and end up breaking SOLID rules.
{

    public CoordGet()
    {

    }

    public static int[] getcoord(int traversevalue) // this takes values from the piece and translates them into coordinates for the map
    {
        int[] coord = new int[2];
        if (traversevalue >= 10) {
            coord[1] = traversevalue % 10;
            coord[0] = Math.floorDiv(traversevalue, 10);

        } else if (traversevalue < 10) {
            coord[0] = 0;
            coord[1] = traversevalue;
        }

        return coord;
    }


}

