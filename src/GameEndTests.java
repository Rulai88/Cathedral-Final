import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;


public class GameEndTests
{

    @Test
    public void TestPlayer1TavernGap() {

        Player testPlayer1 = new Player(Owner.PLAYER1);

        for (InventoryItem item : testPlayer1.inv.PlayerInventory)
        {
            if (item.pieceName != PieceName.TAVERN) { item.quantity = 0; } else { item.quantity = 1;}
        }

        for (InventoryItem item: testPlayer1.inv.PlayerInventory)
        {
            System.out.println(item.pieceName + " Quantity: " + item.quantity + " score: " + item.score);
        }

            Board testboardPos = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            testboardPos.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboardPos.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboardPos.gameBoard[4][5].controlledBy = Owner.EMPTY;
            testboardPos.gameBoard[4][5].occupiedBy = Owner.EMPTY;
            Board testboardNeg = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            Assert.assertEquals(GameEndCondition.EndGame(testPlayer1,testboardPos), false);
            Assert.assertEquals(GameEndCondition.EndGame(testPlayer1,testboardNeg), true);

        }

        @Test
        public void TestPlayer2TavernGap()
        {
            Player testPlayer1 = new Player(Owner.PLAYER2);

            for (InventoryItem item : testPlayer1.inv.PlayerInventory)
            {
                if (item.pieceName != PieceName.TAVERN) { item.quantity = 0; } else { item.quantity = 1;}
            }

            for (InventoryItem item: testPlayer1.inv.PlayerInventory)
            {
                System.out.println(item.pieceName + " Quantity: " + item.quantity + " score: " + item.score);
            }

            Board testboardNeg = new TestBoardCollection().TestBoard9AllOccupiedByPlayer2();
            Board testboardPos = new TestBoardCollection().TestBoard9AllOccupiedByPlayer2();
            testboardPos.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboardPos.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            Assert.assertEquals(GameEndCondition.EndGame(testPlayer1,testboardPos), false);
            Assert.assertEquals(GameEndCondition.EndGame(testPlayer1,testboardNeg), true);

        }

        @Test
        public void TestPlayer1StableGap ()
        {

            Player testPlayer1 = new Player(Owner.PLAYER1);

            for (InventoryItem item : testPlayer1.inv.PlayerInventory)
            {
                if (item.pieceName != PieceName.STABLE) { item.quantity = 0; } else { item.quantity = 1;}
            }

            for (InventoryItem item: testPlayer1.inv.PlayerInventory)
            {
                System.out.println(item.pieceName + " Quantity: " + item.quantity + " score: " + item.score);
            }


            Board testboardPos = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            testboardPos.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboardPos.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboardPos.gameBoard[3][5].controlledBy = Owner.EMPTY;
            testboardPos.gameBoard[3][5].occupiedBy = Owner.EMPTY;
            Board testboardNeg = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            testboardNeg.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            Assert.assertEquals(GameEndCondition.EndGame(testPlayer1,testboardPos), false);
            Assert.assertEquals(GameEndCondition.EndGame(testPlayer1,testboardNeg), true);

        }

        @Test
        public void TestPlayer2StableGap ()
        {
            Player testPlayer1 = new Player(Owner.PLAYER2);

            for (InventoryItem item : testPlayer1.inv.PlayerInventory)
            {
                if (item.pieceName != PieceName.STABLE) { item.quantity = 0; } else { item.quantity = 1;}
            }

            for (InventoryItem item: testPlayer1.inv.PlayerInventory)
            {
                System.out.println(item.pieceName + " Quantity: " + item.quantity + " score: " + item.score);
            }


            Board testboardPos = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            testboardPos.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboardPos.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboardPos.gameBoard[3][5].controlledBy = Owner.EMPTY;
            testboardPos.gameBoard[3][5].occupiedBy = Owner.EMPTY;
            Board testboardNeg = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            testboardNeg.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            Assert.assertEquals(GameEndCondition.EndGame(testPlayer1,testboardPos), false);
            Assert.assertEquals(GameEndCondition.EndGame(testPlayer1,testboardNeg), true);
        }

        @Test
        public void TestPlayer1InnGap ()
        {
            Player testPlayer1 = new Player(Owner.PLAYER1);

            for (InventoryItem item : testPlayer1.inv.PlayerInventory)
            {
                if (item.pieceName != PieceName.INN) { item.quantity = 0; } else { item.quantity = 1;}
            }

            for (InventoryItem item: testPlayer1.inv.PlayerInventory)
            {
                System.out.println(item.pieceName + " Quantity: " + item.quantity + " score: " + item.score);
            }

            Board testboardPos = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            testboardPos.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboardPos.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboardPos.gameBoard[2][6].controlledBy = Owner.EMPTY;
            testboardPos.gameBoard[2][6].occupiedBy = Owner.EMPTY;
            testboardPos.gameBoard[3][5].controlledBy = Owner.EMPTY;
            testboardPos.gameBoard[3][5].occupiedBy = Owner.EMPTY;
            Board testboardNeg = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            testboardNeg.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][6].controlledBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][6].occupiedBy = Owner.EMPTY;
            Assert.assertEquals(GameEndCondition.EndGame(testPlayer1,testboardPos), false);
            Assert.assertEquals(GameEndCondition.EndGame(testPlayer1,testboardNeg), true);
        }

        @Test
        public void TestPlayer2InnGap ()
        {
            Board testboard = new TestBoardCollection().TestBoard9AllOccupiedByPlayer2();
            testboard.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboard.gameBoard[2][6].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][6].occupiedBy = Owner.EMPTY;
            testboard.gameBoard[3][5].controlledBy = Owner.EMPTY;
            testboard.gameBoard[3][5].occupiedBy = Owner.EMPTY;
            Board testboardNeg = new TestBoardCollection().TestBoard9AllOccupiedByPlayer2();
            testboardNeg.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][6].controlledBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][6].occupiedBy = Owner.EMPTY;
        }

        @Test
        public void TestPlayer1SquareGap()
        {
            Board testboard = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            testboard.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboard.gameBoard[2][6].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][6].occupiedBy = Owner.EMPTY;
            testboard.gameBoard[3][5].controlledBy = Owner.EMPTY;
            testboard.gameBoard[3][5].occupiedBy = Owner.EMPTY;
            testboard.gameBoard[3][6].controlledBy = Owner.EMPTY;
            testboard.gameBoard[3][6].occupiedBy = Owner.EMPTY;
            Board testboardNeg = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            testboardNeg.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][6].controlledBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][6].occupiedBy = Owner.EMPTY;
        }

        @Test
        public void TestPlayer2SquareGap ()
        {
            Board testboard = new TestBoardCollection().TestBoard9AllOccupiedByPlayer2();
            testboard.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboard.gameBoard[2][6].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][6].occupiedBy = Owner.EMPTY;
            testboard.gameBoard[3][5].controlledBy = Owner.EMPTY;
            testboard.gameBoard[3][5].occupiedBy = Owner.EMPTY;
            testboard.gameBoard[3][6].controlledBy = Owner.EMPTY;
            testboard.gameBoard[3][6].occupiedBy = Owner.EMPTY;
            Board testboardNeg = new TestBoardCollection().TestBoard9AllOccupiedByPlayer2();
            testboardNeg.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][6].controlledBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][6].occupiedBy = Owner.EMPTY;
        }

        @Test
        public void TestPlayer1BridgeGap ()
        {
            Board testboard = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            testboard.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboard.gameBoard[2][6].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][6].occupiedBy = Owner.EMPTY;
            testboard.gameBoard[2][7].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][7].occupiedBy = Owner.EMPTY;
            Board testboardNeg = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            testboard.gameBoard[2][7].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][7].occupiedBy = Owner.EMPTY;

        }
        @Test
        public void TestPlayer2BridgeGap ()
        {
            Board testboard = new TestBoardCollection().TestBoard9AllOccupiedByPlayer2();
            testboard.gameBoard[2][5].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][5].occupiedBy = Owner.EMPTY;
            testboard.gameBoard[2][6].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][6].occupiedBy = Owner.EMPTY;
            testboard.gameBoard[2][7].controlledBy = Owner.EMPTY;
            testboard.gameBoard[2][7].occupiedBy = Owner.EMPTY;
            Board testboardNeg = new TestBoardCollection().TestBoard9AllOccupiedByPlayer1();
            testboardNeg.gameBoard[2][7].controlledBy = Owner.EMPTY;
            testboardNeg.gameBoard[2][7].occupiedBy = Owner.EMPTY;
        }

    }
