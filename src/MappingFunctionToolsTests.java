//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.Arrays;
//
//
//public class MappingFunctionToolsTests {
//
//    public static Boolean BoardCompare(BoardSquare[][] compa, BoardSquare[][] compb) //
//    {
//        Boolean returnvalue = true;
//        for (int i = 0; i < 10; i++)
//        {
//            for (int j = 0; j < 10; j++)
//            {
//                if(compa[i][j].OccupiedLightorDarkorCathedral != compb[i][j].OccupiedLightorDarkorCathedral)
//                {
//                    returnvalue = false;
//                }
//            }
//        }
//        return returnvalue;
//    }
//
//
//    @Test
//    public void testgreaterthan10()
//    {
//        MappingFunctionTools m = new MappingFunctionTools();
//        int[] t = {3,7};
//        int[] x = m.coordchanger(37);
//        System.out.println(Arrays.toString(x));
//        Assert.assertArrayEquals(t, x);
//
//    }
//
//    @Test
//    public void testlessthan10()
//    {
//        MappingFunctionTools m = new MappingFunctionTools();
//        int[] t = {0,2};
//        int[] x = m.coordchanger(2);
//        System.out.println(Arrays.toString(x));
//        Assert.assertArrayEquals(t, x);
//
//    }
//    @Test
//    public void testgettingavaluefromPiece()
//    {
//        MappingFunctionTools m = new MappingFunctionTools();
//        Cathedral testCathedral = new Cathedral();
//        int[] t = {6, 5};
//        int[] x = m.coordchanger(testCathedral.piecemap.get(0));
//        System.out.println(Arrays.toString(x));
//        Assert.assertArrayEquals(t, x);
//    }
//
//    @Test
//    public void change_a_singleboardvalue()
//    {
//        Board brd = new Board();
//        MappingFunctionTools m = new MappingFunctionTools();
//        Cathedral testCathedral = new Cathedral();
//        int[] coord = m.coordchanger(testCathedral.piecemap.get(0));
//        brd.gameBoard[coord[0]][coord[1]].ClaimedLightorDarkorCathedral = 3;
//        brd.ShowAreaClaimied();
//        Assert.assertEquals(3, brd.gameBoard[6][5].ClaimedLightorDarkorCathedral);
//    }
//
//    @Test
//    public void checkifmovevalid()
//    {
//        Abbey a = new Abbey(1);
//        Board b = new Board();
//        MappingFunctionTools tools = new MappingFunctionTools();
//        boolean valid = tools.ValidMove(b, a);
//        Assert.assertEquals(true, valid);
//    }
//
//    @Test
//    public void checkifmoveNOTvalid()
//        {
//            Abbey a = new Abbey(1);
//            Board b = new Board();
//            MappingFunctionTools tools = new MappingFunctionTools();
//            MappingFunctions map = new MappingFunctions(b);
//            map.SelectAPiece(a);
//            map.Place_a_piece(b);
//            boolean valid = tools.ValidMove(b, a);
//            Assert.assertEquals(false, valid);
//
//        }
//    @Test
//    public void checkintermeshingworks()
//    {
//        Manor m = new Manor(1);
//        Castle c = new Castle(1);
//        Board b = new Board();
//        MappingFunctionTools tools = new MappingFunctionTools();
//        MappingFunctions map = new MappingFunctions(b);
//        map.SelectAPiece(c);
//        map.Place_a_piece(b);
//        b.ShowAreaClaimied();
//        map.SelectAPiece(m);
//        map.('r');
//        map.RotateAPiece('r');
//        map.MoveAPiece("n");
//        map.MoveAPiece("w");
//        map.UpdatePiecePosition();
//        boolean valid = tools.ValidMove(b, m);
//        Assert.assertEquals(true, valid);
//        map.Place_a_piece(b);
//
//    }
//
//
//    @Test
//    public void InvalidMoveTwoPlayer()
//    {
//        Abbey a1 = new Abbey(1);
//        Abbey a2 = new Abbey(2);
//        Board b = new Board();
//        MappingFunctionTools tools = new MappingFunctionTools();
//        MappingFunctions map = new MappingFunctions(b);
//        map.SelectAPiece(a1);
//        map.Place_a_piece(b);
//        boolean valid = tools.ValidMove(b, a2);
//        Assert.assertEquals(false, valid);
//    }
//
//    @Test
//    public void CheckMeshTwoPlayer()
//    {
//        Manor m = new Manor(1);
//        Castle c = new Castle(2);
//        Board b = new Board();
//        MappingFunctionTools tools = new MappingFunctionTools();
//        MappingFunctions map = new MappingFunctions(b);
//        map.SelectAPiece(c);
//        map.Place_a_piece(b);
//        b.ShowAreaClaimied();
//        map.SelectAPiece(m);
//        map.RotateAPiece('r');
//        map.RotateAPiece('r');
//        map.MoveAPiece("n");
//        map.MoveAPiece("w");
//        map.UpdatePiecePosition();
//        boolean valid = tools.ValidMove(b, m);
//        Assert.assertEquals(true, valid);
//        map.Place_a_piece(b);
//    }
//
//    @Test
//    public void TestComparator()
//    {
//        Board baseline = new Board();
//        Board testingboard = new Board();
//        Cathedral c = new Cathedral();
//        MappingFunctions Map = new MappingFunctions(testingboard);
//        baseline.gameBoard[2][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[3][4].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[3][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[3][6].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[4][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[5][5].OccupiedLightorDarkorCathedral = 3;
//        Map.SelectAPiece(c);
//        Map.Place_a_piece(testingboard);
//
//        Boolean thesame = BoardCompare(baseline.gameBoard, testingboard.gameBoard);
//        Assert.assertEquals(false, thesame);
//    }
//
//
//    @Test
//    public void MovingNorth()
//    {
//        Board baseline = new Board();
//        Board testingboard = new Board();
//        Cathedral c = new Cathedral();
//        MappingFunctions Map = new MappingFunctions(testingboard);
//        baseline.gameBoard[5][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[4][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[3][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[2][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[4][4].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[4][6].OccupiedLightorDarkorCathedral = 3;
//        Map.SelectAPiece(c);
//        Map.MoveAPiece("n");
//        Map.Place_a_piece(testingboard);
//
////        System.out.println("Baseline"); // commenting this in allows you to see a representation of the board, handy for testing.
////        baseline.ShowBoard();
////        System.out.println("...");
////        System.out.println("Code Test");
////        testingboard.ShowBoard();
////        System.out.println("...");
//
//        Boolean thesame = BoardCompare(baseline.gameBoard, testingboard.gameBoard);
//        Assert.assertEquals(true, thesame);
//
//    }
//
//    @Test
//    public void MovingSouth()
//    {
//        Board baseline = new Board();
//        Board testingboard = new Board();
//        Cathedral c = new Cathedral();
//        MappingFunctions Map = new MappingFunctions(testingboard);
//        baseline.gameBoard[7][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[6][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[5][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[4][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[6][4].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[6][6].OccupiedLightorDarkorCathedral = 3;
//        Map.SelectAPiece(c);
//        Map.MoveAPiece("s");
//        Map.Place_a_piece(testingboard);
//
//        System.out.println("Baseline");
//        baseline.ShowAreaOccupied();
//        System.out.println("...");
//        System.out.println("Code Test");
//        testingboard.ShowAreaOccupied();
//        System.out.println("...");
//
//        Boolean thesame = BoardCompare(baseline.gameBoard, testingboard.gameBoard);
//        Assert.assertEquals(true, thesame);
//    }
//
//    @Test
//    public void MovingEast()
//    {
//        Board baseline = new Board();
//        Board testingboard = new Board();
//        Cathedral c = new Cathedral();
//        MappingFunctions Map = new MappingFunctions(testingboard);
//        baseline.gameBoard[6][6].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[5][6].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[4][6].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[3][6].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[5][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[5][7].OccupiedLightorDarkorCathedral = 3;
//        Map.SelectAPiece(c);
//        Map.MoveAPiece("e");
//        Map.Place_a_piece(testingboard);
//
////        System.out.println("Baseline");
////        baseline.ShowBoard();
////        System.out.println("...");
////        System.out.println("Code Test");
////        testingboard.ShowBoard();
////        System.out.println("...");
////        System.out.println();
//
//        Boolean thesame = BoardCompare(baseline.gameBoard, testingboard.gameBoard);
//        Assert.assertEquals(true, thesame);
//    }
//    @Test
//    public void MovingWest()
//    {
//        Board baseline = new Board();
//        Board testingboard = new Board();
//        Cathedral c = new Cathedral();
//        MappingFunctions Map = new MappingFunctions(testingboard);
//        baseline.gameBoard[6][4].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[5][4].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[4][4].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[3][4].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[5][3].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[5][5].OccupiedLightorDarkorCathedral = 3;
//        Map.SelectAPiece(c);
//        Map.MoveAPiece("w");
//        Map.Place_a_piece(testingboard);
//
////        System.out.println("Baseline");
////        baseline.ShowBoard();
////        System.out.println("...");
////        System.out.println("Code Test");
////        testingboard.ShowBoard();
////        System.out.println("...");
//
//        Boolean thesame = BoardCompare(baseline.gameBoard, testingboard.gameBoard);
//        Assert.assertEquals(true, thesame);
//    }
//
//    @Test
//    public void MovingRotateRight1()
//    {
//        Board baseline = new Board();
//        Board testingboard = new Board();
//        Cathedral c = new Cathedral();
//        MappingFunctions Map = new MappingFunctions(testingboard);
//        baseline.gameBoard[3][8].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[3][7].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[3][6].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[3][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[4][7].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[2][7].OccupiedLightorDarkorCathedral = 3;
//
//        Map.SelectAPiece(c);
//        Map.RotateAPiece('r');
//        Map.Place_a_piece(testingboard);
//
//        /*System.out.println("Baseline");
//        baseline.ShowBoard();
//        System.out.println("...");
//        System.out.println("Code Test");
//        testingboard.ShowBoard();
//        System.out.println("...");
//*/
//        Boolean thesame = BoardCompare(baseline.gameBoard, testingboard.gameBoard);
//        Assert.assertEquals(true, thesame);
//    }
//
//    @Test
//    public void MovingRotateLeft1()
//    {
//        Board baseline = new Board();
//        Board testingboard = new Board();
//        Cathedral c = new Cathedral();
//        MappingFunctions Map = new MappingFunctions(testingboard);
//        baseline.gameBoard[3][2].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[3][3].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[3][4].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[3][5].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[4][3].OccupiedLightorDarkorCathedral = 3;
//        baseline.gameBoard[2][3].OccupiedLightorDarkorCathedral = 3;
//
//        Map.SelectAPiece(c);
//        Map.RotateAPiece('l');
//        Map.Place_a_piece(testingboard);
//
//        /*System.out.println("Baseline");
//        baseline.ShowBoard();
//        System.out.println("...");
//        System.out.println("Code Test");
//        testingboard.ShowBoard();
//        System.out.println("...");
//*/
//        Boolean thesame = BoardCompare(baseline.gameBoard, testingboard.gameBoard);
//        Assert.assertEquals(true, thesame);
//    }
//
//}
