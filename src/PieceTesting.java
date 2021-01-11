import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PieceTesting
{
    @Test
    public void coordcreatetesting()
    {
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        int TestCoord = 35;
        int[] Coords = {3, 5};
        Assert.assertArrayEquals(rt.coordchanger(TestCoord), Coords);

    }

    @Test
    public void InvalidmovecheckN()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitions = new ArrayList<Integer>();
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        newxypostitions.add(35);
        newxypostitions.add(25);
        newxypostitions.add(15);
        newxypostitions.add(5);
        newxypostitions.add(24);
        newxypostitions.add(26);
        rt.MoveNorth(testcathedral);
        rt.MoveNorth(testcathedral);
        rt.MoveNorth(testcathedral);
        rt.MoveNorth(testcathedral);
        rt.rotateClockwise(testcathedral);
        Assert.assertEquals(newxypostitions, testcathedral.piecemap);

    }

    @Test
    public void ValidmovecheckW()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitions = new ArrayList<Integer>();
        newxypostitions.add(61);
        newxypostitions.add(51);
        newxypostitions.add(41);
        newxypostitions.add(31);
        newxypostitions.add(50);
        newxypostitions.add(52);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.MoveWest(testcathedral);
        rt.MoveWest(testcathedral);
        rt.MoveWest(testcathedral);
        rt.MoveWest(testcathedral);
        rt.rotateCounterClockwise(testcathedral);
        Assert.assertEquals(newxypostitions, testcathedral.piecemap);
    }

    @Test
    public void ValidmovecheckS()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(88);
        newxypostitionsleft.add(87);
        newxypostitionsleft.add(86);
        newxypostitionsleft.add(85);
        newxypostitionsleft.add(97);
        newxypostitionsleft.add(77);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.rotateClockwise(testcathedral);
        rt.MoveSouth(testcathedral);
        rt.MoveSouth(testcathedral);
        rt.MoveSouth(testcathedral);
        rt.MoveSouth(testcathedral);
        rt.MoveSouth(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);
    }

    @Test
    public void ValidmovecheckE() // checks rotation off of board edge
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(68);
        newxypostitionsleft.add(58);
        newxypostitionsleft.add(48);
        newxypostitionsleft.add(38);
        newxypostitionsleft.add(57);
        newxypostitionsleft.add(59);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.MoveEast1(testcathedral);
        rt.MoveEast1(testcathedral);
        rt.MoveEast1(testcathedral);
        rt.rotateClockwise(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);
    }

    @Test
    public void test_rotationEquationClockwise1()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(38);
        newxypostitionsleft.add(37);
        newxypostitionsleft.add(36);
        newxypostitionsleft.add(35);
        newxypostitionsleft.add(47);
        newxypostitionsleft.add(27);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.rotateClockwise(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);

    }

    @Test
    public void test_rotationClockwise2()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(5);
        newxypostitionsleft.add(15);
        newxypostitionsleft.add(25);
        newxypostitionsleft.add(35);
        newxypostitionsleft.add(16);
        newxypostitionsleft.add(14);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.rotateClockwise(testcathedral);
        rt.rotateClockwise(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);

    }

    @Test
    public void test_rotationClockwise3()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(32);
        newxypostitionsleft.add(33);
        newxypostitionsleft.add(34);
        newxypostitionsleft.add(35);
        newxypostitionsleft.add(23);
        newxypostitionsleft.add(43);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.rotateClockwise(testcathedral);
        rt.rotateClockwise(testcathedral);
        rt.rotateClockwise(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);

    }

    @Test
    public void test_rotationEquationleft4()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(65);
        newxypostitionsleft.add(55);
        newxypostitionsleft.add(45);
        newxypostitionsleft.add(35);
        newxypostitionsleft.add(54);
        newxypostitionsleft.add(56);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.rotateClockwise(testcathedral);
        rt.rotateClockwise(testcathedral);
        rt.rotateClockwise(testcathedral);
        rt.rotateClockwise(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);

    }

    @Test
    public void test_rotatationCounterClockwise1()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(32);
        newxypostitionsleft.add(33);
        newxypostitionsleft.add(34);
        newxypostitionsleft.add(35);
        newxypostitionsleft.add(23);
        newxypostitionsleft.add(43);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.rotateCounterClockwise(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);
    }

    @Test
    public void test_rotationCounterClockwise2()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(5);
        newxypostitionsleft.add(15);
        newxypostitionsleft.add(25);
        newxypostitionsleft.add(35);
        newxypostitionsleft.add(16);
        newxypostitionsleft.add(14);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.rotateCounterClockwise(testcathedral);
        rt.rotateCounterClockwise(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);
    }

    @Test
    public void test_rotationCounterClockwise3()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(38);
        newxypostitionsleft.add(37);
        newxypostitionsleft.add(36);
        newxypostitionsleft.add(35);
        newxypostitionsleft.add(47);
        newxypostitionsleft.add(27);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.rotateCounterClockwise(testcathedral);
        rt.rotateCounterClockwise(testcathedral);
        rt.rotateCounterClockwise(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);

    }

    @Test
    public void test_rotationCounterclockwise4()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(65);
        newxypostitionsleft.add(55);
        newxypostitionsleft.add(45);
        newxypostitionsleft.add(35);
        newxypostitionsleft.add(54);
        newxypostitionsleft.add(56);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.rotateCounterClockwise(testcathedral);
        rt.rotateCounterClockwise(testcathedral);
        rt.rotateCounterClockwise(testcathedral);
        rt.rotateCounterClockwise(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);
    }

    @Test
    public void test_traverseNorth()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(55);
        newxypostitionsleft.add(45);
        newxypostitionsleft.add(35);
        newxypostitionsleft.add(25);
        newxypostitionsleft.add(44);
        newxypostitionsleft.add(46);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.MoveNorth(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);
    }

    @Test
    public void test_traverseSouth()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(75);
        newxypostitionsleft.add(65);
        newxypostitionsleft.add(55);
        newxypostitionsleft.add(45);
        newxypostitionsleft.add(64);
        newxypostitionsleft.add(66);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.MoveSouth(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);
    }

    @Test
    public void test_traverseWest()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(64);
        newxypostitionsleft.add(54);
        newxypostitionsleft.add(44);
        newxypostitionsleft.add(34);
        newxypostitionsleft.add(53);
        newxypostitionsleft.add(55);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.MoveWest(testcathedral);
        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);
    }

    @Test
    public void test_traverseEast()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostition = new ArrayList<Integer>();
        newxypostition.add(66);
        newxypostition.add(56);
        newxypostition.add(46);
        newxypostition.add(36);
        newxypostition.add(55);
        newxypostition.add(57);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.MoveEast1(testcathedral);
        Assert.assertEquals(newxypostition, testcathedral.piecemap);
    }



    @Test
    public void test_traverseNorthToEdge()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(35);
        newxypostitionsleft.add(25);
        newxypostitionsleft.add(15);
        newxypostitionsleft.add(5);
        newxypostitionsleft.add(24);
        newxypostitionsleft.add(26);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.MoveNorth(testcathedral);
        rt.MoveNorth(testcathedral);
        rt.MoveNorth(testcathedral);
        rt.MoveNorth(testcathedral);
        rt.MoveNorth(testcathedral);


        Assert.assertEquals(newxypostitionsleft, testcathedral.piecemap);
    }

    @Test
    public void test_traverseSouthToEdge()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(95);
        newxypostitionsleft.add(85);
        newxypostitionsleft.add(75);
        newxypostitionsleft.add(65);
        newxypostitionsleft.add(84);
        newxypostitionsleft.add(86);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.MoveSouth(testcathedral);
        rt.MoveSouth(testcathedral);
        rt.MoveSouth(testcathedral);
        rt.MoveSouth(testcathedral);
        rt.MoveSouth(testcathedral);
        rt.MoveSouth(testcathedral);
        rt.MoveSouth(testcathedral);
    }

    @Test
    public void test_traverseEastToEdge()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(68);
        newxypostitionsleft.add(58);
        newxypostitionsleft.add(48);
        newxypostitionsleft.add(38);
        newxypostitionsleft.add(57);
        newxypostitionsleft.add(59);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.MoveWest(testcathedral);
        rt.MoveWest(testcathedral);
        rt.MoveWest(testcathedral);
        rt.MoveWest(testcathedral);
        rt.MoveWest(testcathedral);
        rt.MoveWest(testcathedral);
        rt.MoveWest(testcathedral);
    }

    @Test
    public void test_traverseWestToEdge()
    {
        Cathedral testcathedral = new Cathedral();
        ArrayList<Integer> newxypostitionsleft = new ArrayList<Integer>();
        newxypostitionsleft.add(61);
        newxypostitionsleft.add(51);
        newxypostitionsleft.add(41);
        newxypostitionsleft.add(31);
        newxypostitionsleft.add(50);
        newxypostitionsleft.add(52);
        RotateAndTraverseFunction rt = new RotateAndTraverseFunction();
        rt.MoveEast1(testcathedral);
        rt.MoveEast1(testcathedral);
        rt.MoveEast1(testcathedral);
        rt.MoveEast1(testcathedral);
        rt.MoveEast1(testcathedral);
        rt.MoveEast1(testcathedral);
        rt.MoveEast1(testcathedral);
    }

}
