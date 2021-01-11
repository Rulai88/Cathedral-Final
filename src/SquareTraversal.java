import java.util.*;

public class SquareTraversal
{

    public SquareTraversal(){}


    // this takes in the three main parts we will need.
    // A percieved start point for our algorithm as well as the board itself which contains the rest of the data we need.
    public Set<Set<Integer>> LevelOrderTraversal (Board board, int firstIntofPiecemap, Owner occupy)

    {
        Set<Set<Integer>> FloodFillCoords = new HashSet<Set<Integer>>();
        BSquare root = board.gameBoard[CoordGet.getcoord(firstIntofPiecemap)[0]][CoordGet.getcoord(firstIntofPiecemap)[1]];
        boolean[] visited = new boolean[100];
        Queue<BSquare> Q = new LinkedList<>(); // Creates a queue of BoardSquare objects
        Q.add(root); // Adds root to the queue

        int n = 200;
        Set<Integer> OccupiedSquares = new HashSet<Integer>();

        while (n > 0 && !Q.isEmpty()) {
            Set<Set<Integer>> LoopResults = new HashSet<Set<Integer>>();
            FloodfillImpl fld = new FloodfillImpl();


            BSquare p = Q.peek(); // point where we need to check for child nodes
            int[] xy = CoordGet.getcoord(p.Squarenum); // this takes the current square at the head of the queue and provides it's XY values
            //System.out.println("Current xy is: [" + xy[0] + "," + xy[1] + "]");
            IsItAnEdge.Edges edgecheck = IsItAnEdge.WhichEdge(p.Squarenum); // checks if the currently examined square is an edge and if it does applies specific boundary condition rules.
            OccupiedSquares.add(p.Squarenum); // this is just the squares that form a wall.
            Q.remove();// Dequeue an item from queue

            // at this point we run the boundary fill algorithm

            // Enqueue all children of the dequeued item, normally this would be indicated as a 'child' node, but we are instead moving 'blind'
            // i.e. the program does not know at any one point how many probable children that a node could have so we have to check each adjacent square to see if any 'children' exist and
            // add them to the queue if we find them.

            if (!edgecheck.equals(IsItAnEdge.Edges.NORTH) && !edgecheck.equals(IsItAnEdge.Edges.NORTHEASTC) && !edgecheck.equals(IsItAnEdge.Edges.NORTHWESTC)) // checks to see if the square is either a north edge or north corner
            {
                if (board.gameBoard[xy[0] - 1][xy[1]].occupiedBy == occupy) // looks north to add a child, if it finds a child node, will enqueue it.
                {
                    Q.add(board.gameBoard[xy[0] - 1][xy[1]]); // adds the square to the queue
                     //System.out.println("Adding Square " + board.gameBoard[xy[0] - 1][xy[1]].Squarenum + " To the Queue" );
                } else {
                    Board bcopy = BoardClone.bclone(board); // makes a quick copy of the board for editing purposes
                    LoopResults.add(fld.FloodFill(bcopy, xy[0] - 1, xy[1], occupy)); // starts a flood fill using the players 'number' based on the XY provided and adds the fill results to the Filled Areas ArrayList
                    //System.out.println("Flooding north from " + (xy[0] -1) + xy[1]);
                    //System.out.println(resNorth.toString());


                }
            }

            if (!edgecheck.equals(IsItAnEdge.Edges.EAST) && !edgecheck.equals(IsItAnEdge.Edges.SOUTHEASTC) && !edgecheck.equals(IsItAnEdge.Edges.NORTHEASTC)) {

                if (board.gameBoard[xy[0]][xy[1] + 1].occupiedBy == occupy) // looks east for prospective child nodes
                {
                    Q.add(board.gameBoard[xy[0]][xy[1] + 1]);
                    //System.out.println("Adding Square " + board.gameBoard[xy[0]][xy[1] + 1].Squarenum + " To the Queue" );
                } else {
                    Board bcopy = BoardClone.bclone(board); // makes a quick copy of the board for editing purposes
                    LoopResults.add(fld.FloodFill(bcopy, xy[0], xy[1] + 1, occupy)); // starts a flood fill using the players 'number' based on the XY provided and adds the fill results to the Filled Areas ArrayList
                    //System.out.println("Flooding east from " + xy[0] + (xy[1] + 1));
                }


            }

            if (!edgecheck.equals(IsItAnEdge.Edges.SOUTH) && !edgecheck.equals(IsItAnEdge.Edges.SOUTHEASTC) && !edgecheck.equals(IsItAnEdge.Edges.SOUTHWESTC)) {

                if (board.gameBoard[xy[0] + 1][xy[1]].occupiedBy == occupy) // looks south
                {
                    Q.add(board.gameBoard[xy[0] + 1][xy[1]]);
                    //System.out.println("Adding Square " + board.gameBoard[xy[0] + 1][xy[1]].Squarenum + " To the Queue" );
                } else {
                    Board bcopy = BoardClone.bclone(board); // makes a quick copy of the board for editing purposes
                    LoopResults.add(fld.FloodFill(bcopy, xy[0] + 1, xy[1], occupy)); // starts a flood fill using the players 'number' based on the XY provided and adds the fill results to the Filled Areas ArrayList
                    //System.out.println("Flooding south from " + (xy[0] + 1) + xy[1]);

                }
            }

            if (!edgecheck.equals(IsItAnEdge.Edges.WEST) && !edgecheck.equals(IsItAnEdge.Edges.SOUTHWESTC) && !edgecheck.equals(IsItAnEdge.Edges.NORTHWESTC)) {

                if (board.gameBoard[xy[0]][xy[1] - 1].occupiedBy == occupy) // looks west
                {
                    Q.add(board.gameBoard[xy[0]][xy[1] - 1]);
                    //System.out.println("Adding Square " + board.gameBoard[xy[0]][xy[1] - 1].Squarenum + " To the Queue" );
                } else {
                    Board bcopy = BoardClone.bclone(board); // makes a quick copy of the board for editing purposes
                    LoopResults.add(fld.FloodFill(bcopy, xy[0], xy[1] - 1, occupy)); // starts a flood fill using the players 'number' based on the XY provided and adds the fill results to the Filled Areas ArrayList
                     //System.out.println("Flooding west from " + xy[0] + (xy[1] - 1));

                }
            }



            if (LoopResults.size() > 0)
            {

                for (Set<Integer> result: LoopResults)
                {
                FloodFillCoords.add(result);
                break;
                }

            }


            n = n - 1;


            //System.out.println("Restarting Loop");
        }
        for (Set<Integer> nums: FloodFillCoords)
        {
        // System.out.println(nums.toString());
        }

        return FloodFillCoords;
    }

}

