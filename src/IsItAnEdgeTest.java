import org.junit.Assert;
import org.junit.Test;


public class IsItAnEdgeTest {

    IsItAnEdge e = new IsItAnEdge();
    int North = 5;
    int South = 96;
    int East = 59;
    int West = 40;
    int NWCorner = 0;
    int NEcorner = 9;
    int SWcorner = 90;
    int SEcorner = 99;


    @Test
    public void NotNorthNum()
    {
        Assert.assertEquals("n", e.WhichEdge(North));
        Assert.assertEquals("n", e.WhichEdge(4));
        Assert.assertEquals("n", e.WhichEdge(3));
        Assert.assertNotEquals("n", e.WhichEdge(9));
    }

    @Test
    public void SouthNum()
    {
        Assert.assertEquals("s", e.WhichEdge(South));
        Assert.assertEquals("s", e.WhichEdge(94));
        Assert.assertEquals("s", e.WhichEdge(93));
        Assert.assertNotEquals("s", e.WhichEdge(99));
    }

    @Test
    public void EastNum()
    {
        Assert.assertEquals("e", e.WhichEdge(East));
        Assert.assertEquals("e", e.WhichEdge(49));
        Assert.assertEquals("e", e.WhichEdge(39));
        Assert.assertNotEquals("e", e.WhichEdge(99));
    }

    @Test
    public void WestNum()
    {
        Assert.assertEquals("w", e.WhichEdge(West));
        Assert.assertEquals("w", e.WhichEdge(40));
        Assert.assertEquals("w", e.WhichEdge(30));
        Assert.assertNotEquals("w", e.WhichEdge(90));
    }

    @Test
    public void NECNum()
    {
        Assert.assertEquals("nec", e.WhichEdge(NEcorner));
    }

    @Test
    public void NWCNum()
    {
        Assert.assertEquals("nwc", e.WhichEdge(NWCorner));
    }

    @Test
    public void SECNum()
    {
        Assert.assertEquals("sec", e.WhichEdge(SEcorner));
    }

    @Test
    public void SWCNum()
    {
        Assert.assertEquals("swc", e.WhichEdge(SWcorner));
    }

    @Test
    public void NotEdge()
    {
        Assert.assertEquals("na", e.WhichEdge(44));
    }

}
