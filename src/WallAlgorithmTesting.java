import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WallAlgorithmTesting {

    @Test
    public void testfloodfill1p1andp2()
    {
        FloodfillImpl flood = new FloodfillImpl();
        TestBoardCollection tb = new TestBoardCollection();
        Board testboardp1 = tb.testboard1Player1();
        Board testboardp2 = tb.testboard1Player2();

        System.out.println("Running test 1");
        testboardp1.ShowAreaOccupied();
        System.out.println(" ");
        testboardp1.ShowAreaClaimied();
        System.out.println(" ");
        testboardp2.ShowAreaOccupied();
        System.out.println(" ");
        testboardp2.ShowAreaClaimied();
        System.out.println(" ");

        Set<Integer> baselinep1 = new HashSet<>();
        baselinep1.add(0);
        baselinep1.add(1);
        baselinep1.add(10);
        baselinep1.add(11);
        Set<Integer> baselinep2 = new HashSet<>();
        baselinep2.add(0);
        baselinep2.add(1);
        baselinep2.add(10);
        baselinep2.add(11);
        Set<Integer> resultsp1 = flood.FloodFill(testboardp1,1, 1,Owner.PLAYER1);
        Assert.assertEquals(baselinep1, resultsp1);
        Set<Integer> resultsp2 = flood.FloodFill(testboardp2,1, 1,Owner.PLAYER2);
        Assert.assertEquals(baselinep2, resultsp2);
    }

    @Test
    public void testfloodfill2p1andp2()
    {

        FloodfillImpl flood = new FloodfillImpl();
        TestBoardCollection tb = new TestBoardCollection();
        Board testboardp1 = tb.testboard2Player1();
        Board testboardp2 = tb.testboard2Player2();

        System.out.println("Running test 2");
        testboardp1.ShowAreaOccupied();
        System.out.println(" ");
        testboardp1.ShowAreaClaimied();
        System.out.println(" ");
        testboardp2.ShowAreaOccupied();
        System.out.println(" ");
        testboardp2.ShowAreaClaimied();
        System.out.println(" ");


        Set<Integer> baselinep1 = new HashSet<>();
        baselinep1.add(78);
        baselinep1.add(79);
        baselinep1.add(88);
        baselinep1.add(89);
        baselinep1.add(97);
        baselinep1.add(98);
        baselinep1.add(99);
        Set<Integer> baselinep2 = new HashSet<>();
        baselinep2.add(78);
        baselinep2.add(79);
        baselinep2.add(88);
        baselinep2.add(89);
        baselinep2.add(97);
        baselinep2.add(98);
        baselinep2.add(99);


        Set<Integer> resultsp1 = flood.FloodFill(testboardp1,9, 9,Owner.PLAYER1);
        Assert.assertEquals(baselinep1, resultsp1);
        Set<Integer> resultsp2 = flood.FloodFill(testboardp2,9, 9,Owner.PLAYER2);
        Assert.assertEquals(baselinep1, resultsp2);
    }

    @Test
    public void testfloodfill3p1andp2() {

        FloodfillImpl flood = new FloodfillImpl();
        TestBoardCollection tb = new TestBoardCollection();
        Board testboardp1 = tb.testboard3Player1();
        Board testboardp2 = tb.testboard3Player2();

        System.out.println("Running test 3");
        testboardp1.ShowAreaOccupied();
        System.out.println(" ");
        testboardp1.ShowAreaClaimied();
        System.out.println(" ");
        testboardp2.ShowAreaOccupied();
        System.out.println(" ");
        testboardp2.ShowAreaClaimied();;
        System.out.println(" ");

        Set<Integer> baselinep1 = new HashSet<>();
        baselinep1.add(16);
        baselinep1.add(17);
        baselinep1.add(26);
        baselinep1.add(27);

        Set<Integer> baselinep2 = new HashSet<>();
        baselinep2.add(16);
        baselinep2.add(17);
        baselinep2.add(26);
        baselinep2.add(27);

        Set<Integer> resultsp1 = flood.FloodFill(testboardp1,1, 7,Owner.PLAYER1);
        Assert.assertEquals(baselinep1, resultsp1);
        Set<Integer> resultsp2 = flood.FloodFill(testboardp2,1, 7,Owner.PLAYER2);
        Assert.assertEquals(baselinep1, resultsp2);
    }

    @Test
    public void testfloodfill4p1andp2() {
        FloodfillImpl flood = new FloodfillImpl();
        TestBoardCollection tb = new TestBoardCollection();
        Board testboardp1 = tb.testboard4Player1();
        Board testboardp2 = tb.testboard4Player2();

        System.out.println("Running test 4");
        testboardp1.ShowAreaOccupied();
        System.out.println(" ");
        testboardp1.ShowAreaClaimied();
        System.out.println(" ");
        testboardp2.ShowAreaOccupied();
        System.out.println(" ");
        testboardp2.ShowAreaClaimied();;
        System.out.println(" ");

        Set<Integer> baselinep1 = new HashSet<>();
        baselinep1.add(0);
        baselinep1.add(1);
        baselinep1.add(2);
        baselinep1.add(3);
        baselinep1.add(4);
        baselinep1.add(5);
        baselinep1.add(6);
        baselinep1.add(7);
        baselinep1.add(8);
        baselinep1.add(9);
        Set<Integer> baselinep2 = new HashSet<>();
        baselinep2.add(0);
        baselinep2.add(1);
        baselinep2.add(2);
        baselinep2.add(3);
        baselinep2.add(4);
        baselinep2.add(5);
        baselinep2.add(6);
        baselinep2.add(7);
        baselinep2.add(8);
        baselinep2.add(9);

        Set<Integer> resultsp1 = flood.FloodFill(testboardp1,0, 7,Owner.PLAYER1);
        Assert.assertEquals(baselinep1, resultsp1);
        Set<Integer> resultsp2 = flood.FloodFill(testboardp2,0, 7,Owner.PLAYER2);
        Assert.assertEquals(baselinep1, resultsp2);
    }
    @Test
    public void testflood5withgaps()
    {
        FloodfillImpl flood = new FloodfillImpl();
        TestBoardCollection tb = new TestBoardCollection();
        Board testboard = tb.testboard5gap();

        Set<Integer> baseline = new HashSet<>();
        baseline.add(0);
        baseline.add(1);
        baseline.add(10);
        baseline.add(11);
        Set<Integer> resultsp1 = flood.FloodFill(testboard,0, 0,Owner.PLAYER1);
        Assert.assertNotEquals(baseline, resultsp1);
    }

    @Test
    public void testflood6withgaps()
    {
        FloodfillImpl flood = new FloodfillImpl();
        TestBoardCollection tb = new TestBoardCollection();
        Board testboard = tb.testboard6gap();

        Set<Integer> baseline = new HashSet<>();
        baseline.add(78);
        baseline.add(79);
        baseline.add(88);
        baseline.add(89);
        baseline.add(97);
        baseline.add(98);
        baseline.add(99);

        Set<Integer> results = flood.FloodFill(testboard,0, 0,Owner.PLAYER2);
        Assert.assertNotEquals(baseline, results);
    }

    @Test
    public void testflood7withgapCathedralP1()
    {
        FloodfillImpl flood = new FloodfillImpl();
        TestBoardCollection tb = new TestBoardCollection();
        Board testboard = tb.testboard7GapCathedralP1();

        Set<Integer> baseline = new HashSet<>();
        baseline.add(0);
        baseline.add(1);
        baseline.add(10);
        baseline.add(11);

        Set<Integer> results = flood.FloodFill(testboard,0, 0,Owner.PLAYER1);
        Assert.assertNotEquals(baseline, results);
    }

    @Test
    public void testflood8withgapCathedralP2()
    {
        FloodfillImpl flood = new FloodfillImpl();
        TestBoardCollection tb = new TestBoardCollection();
        Board testboard = tb.testboard8GapCathedralP2();

        Set<Integer> baseline = new HashSet<>();
        baseline.add(0);
        baseline.add(1);
        baseline.add(10);
        baseline.add(11);

        Set<Integer> results = flood.FloodFill(testboard,0, 0,Owner.PLAYER2);
        Assert.assertNotEquals(baseline, results);
    }

    @Test
    public void testflood9withgapCathedralmixes()
    {
        FloodfillImpl flood = new FloodfillImpl();
        TestBoardCollection tb = new TestBoardCollection();
        Board testboard = tb.testboard8GapCathedralMixed();

        Set<Integer> baseline = new HashSet<>();
        baseline.add(0);
        baseline.add(1);
        baseline.add(10);
        baseline.add(11);

        Set<Integer> results = flood.FloodFill(testboard,0, 0,Owner.PLAYER1);
        Assert.assertNotEquals(baseline, results);
    }




    @Test
        public void Squaretracetest1singleplayer()
        {

            Board testboard1 = new Board();
            SquareTraversal squareT = new SquareTraversal();
            FindOccupiedArea find = new FindOccupiedArea();

            testboard1.gameBoard[0][0].occupiedBy = Owner.PLAYER1;
            testboard1.gameBoard[0][1].occupiedBy = Owner.PLAYER1;
            testboard1.gameBoard[0][2].occupiedBy = Owner.PLAYER1;
            testboard1.gameBoard[0][3].occupiedBy = Owner.PLAYER1;

            testboard1.gameBoard[3][0].occupiedBy = Owner.PLAYER1;
            testboard1.gameBoard[3][1].occupiedBy = Owner.PLAYER1;
            testboard1.gameBoard[3][2].occupiedBy = Owner.PLAYER1;
            testboard1.gameBoard[3][3].occupiedBy = Owner.PLAYER1;

            testboard1.gameBoard[2][3].occupiedBy = Owner.PLAYER1;
            testboard1.gameBoard[1][3].occupiedBy = Owner.PLAYER1;
            testboard1.gameBoard[2][0].occupiedBy = Owner.PLAYER1;
            testboard1.gameBoard[1][0].occupiedBy = Owner.PLAYER1;

            Set<Integer> baseline = new HashSet<>();
            baseline.add(21);
            baseline.add(22);
            baseline.add(11);
            baseline.add(12);

            testboard1.ShowAreaClaimied();
            Set<Set<Integer>> result = squareT.LevelOrderTraversal(testboard1, 0,Owner.PLAYER1);
            System.out.println("Generating results");
            for (Set<Integer> res: result)
            {
             res.toString();
             System.out.println("result contains: " + res.toString());
            }
            System.out.println("ending");

            // this works.
        }

    @Test
    public void WallTest1p1()
    {

        TestBoardCollection tb = new TestBoardCollection();
        Board testboard1 = tb.testboard1Player1();
        SquareTraversal squareT = new SquareTraversal();
        FindOccupiedArea find = new FindOccupiedArea();


        Set<Integer> baseline = new HashSet<>();
        baseline.add(0);
        baseline.add(1);
        baseline.add(10);
        baseline.add(11);

        Set<Integer> result = find.ReturnAreaToBeFilled(squareT.LevelOrderTraversal(testboard1, 20, Owner.PLAYER1));

        Assert.assertEquals(baseline, result);
    }
    @Test
    public void WallTest1p2()
    {

        TestBoardCollection tb = new TestBoardCollection();
        Board testboard1 = tb.testboard1Player2();
        SquareTraversal squareT = new SquareTraversal();
        FindOccupiedArea find = new FindOccupiedArea();


        Set<Integer> baseline = new HashSet<>();
        baseline.add(0);
        baseline.add(1);
        baseline.add(10);
        baseline.add(11);

        Set<Integer> result = find.ReturnAreaToBeFilled(squareT.LevelOrderTraversal(testboard1, 20, Owner.PLAYER2));

        Assert.assertEquals(baseline, result);
    }

    @Test
    public void WallTest2p1() {

        TestBoardCollection tb = new TestBoardCollection();
        Board testboard = tb.testboard2Player1();
        SquareTraversal squareT = new SquareTraversal();
        FindOccupiedArea find = new FindOccupiedArea();


        Set<Integer> baseline = new HashSet<>();
        baseline.add(78);
        baseline.add(79);
        baseline.add(88);
        baseline.add(89);
        baseline.add(97);
        baseline.add(98);
        baseline.add(99);

        Set<Integer> result = find.ReturnAreaToBeFilled(squareT.LevelOrderTraversal(testboard, 77, Owner.PLAYER1));
        Assert.assertEquals(baseline, result);
    }

    @Test
    public void WallTest2p2() {

        TestBoardCollection tb = new TestBoardCollection();
        Board testboard1 = tb.testboard2Player2();
        SquareTraversal squareT = new SquareTraversal();
        FindOccupiedArea find = new FindOccupiedArea();


        Set<Integer> baseline = new HashSet<>();
        baseline.add(78);
        baseline.add(79);
        baseline.add(88);
        baseline.add(89);
        baseline.add(97);
        baseline.add(98);
        baseline.add(99);

        Set<Integer> result = find.ReturnAreaToBeFilled(squareT.LevelOrderTraversal(testboard1, 77, Owner.PLAYER2));

        Assert.assertEquals(baseline, result);
    }

    @Test
    public void WallTest3p1()
    {
        TestBoardCollection tb = new TestBoardCollection();
        Board testboard1 = tb.testboard3Player1();
        SquareTraversal squareT = new SquareTraversal();
        FindOccupiedArea find = new FindOccupiedArea();

        Set<Integer> baseline = new HashSet<>();
        baseline.add(16);
        baseline.add(17);
        baseline.add(26);
        baseline.add(27);
        Set<Integer> result = find.ReturnAreaToBeFilled(squareT.LevelOrderTraversal(testboard1, 5, Owner.PLAYER1));

        Assert.assertEquals(baseline, result);
    }

    @Test
    public void WallTest3p2()
    {
        TestBoardCollection tb = new TestBoardCollection();
        Board testboard1 = tb.testboard3Player2();
        SquareTraversal squareT = new SquareTraversal();
        FindOccupiedArea find = new FindOccupiedArea();

        Set<Integer> baseline = new HashSet<>();
        baseline.add(16);
        baseline.add(17);
        baseline.add(26);
        baseline.add(27);
        Set<Integer> result = find.ReturnAreaToBeFilled(squareT.LevelOrderTraversal(testboard1, 5, Owner.PLAYER2));

        Assert.assertEquals(baseline, result);
    }

    @Test
    public void WallTest4p1()
    {
        TestBoardCollection tb = new TestBoardCollection();
        Board testboard1 = tb.testboard4Player1();
        SquareTraversal squareT = new SquareTraversal();
        FindOccupiedArea find = new FindOccupiedArea();

        Set<Integer> baseline = new HashSet<>();
        baseline.add(0);
        baseline.add(1);
        baseline.add(2);
        baseline.add(3);
        baseline.add(4);
        baseline.add(5);
        baseline.add(6);
        baseline.add(7);
        baseline.add(8);
        baseline.add(9);

        Set<Integer> result = find.ReturnAreaToBeFilled(squareT.LevelOrderTraversal(testboard1, 10, Owner.PLAYER1));

        Assert.assertEquals(baseline, result);

    }

    @Test
    public void WallTest4p2()
    {
        TestBoardCollection tb = new TestBoardCollection();
        Board testboard1 = tb.testboard4Player2();
        SquareTraversal squareT = new SquareTraversal();
        FindOccupiedArea find = new FindOccupiedArea();

        Set<Integer> baseline = new HashSet<>();
        baseline.add(0);
        baseline.add(1);
        baseline.add(2);
        baseline.add(3);
        baseline.add(4);
        baseline.add(5);
        baseline.add(6);
        baseline.add(7);
        baseline.add(8);
        baseline.add(9);

        Set<Integer> result = find.ReturnAreaToBeFilled(squareT.LevelOrderTraversal(testboard1, 10, Owner.PLAYER2));

        Assert.assertEquals(baseline, result);
    }



    }
