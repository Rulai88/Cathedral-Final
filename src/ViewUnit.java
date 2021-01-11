import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class ViewUnit extends Application {

    private GridPane root;
    ControlUnit control = new ControlUnit();
    ComboBox AvailableInventory;
    Label Player1ScoreBoard;
    Label Player2ScoreBoard;

    protected Color whatColourBoard(Owner ownedby) {
        Color color;
        if (ownedby == Owner.PLAYER1) {
            color = Color.DARKBLUE;
        } else if (ownedby == Owner.PLAYER2) {
            color = Color.MAROON;
        } else if (ownedby == Owner.CATHEDRAL) {
            color = Color.DARKGREEN;
        } else {
            color = Color.GREY;
        }
        return color;
    }

    protected Color whatColourPiece(Owner ownedby) {
        Color color;
        if (ownedby == Owner.PLAYER1) {
            color = Color.BLUE;
        } else if (ownedby == Owner.PLAYER2) {
            color = Color.RED;
        } else if (ownedby == Owner.CATHEDRAL) {
            color = Color.GREEN;
        } else {
            color = Color.GREY;
        }
        return color;
    }


    public void displayBoard() // redisplay, this occurs every time you actually hit a button
    {
        
        for (BSquare[] row : control.gameboard.gameBoard) {
            for (BSquare boardSquare : row) {
                Rectangle square = new Rectangle(40, 40); // this could be a function or two?
                Color color;

                color = whatColourBoard(boardSquare.occupiedBy);
                if(color.equals(Color.GREEN))
                {
                control.gameboard.ShowAreaOccupied();
                }

                square.setFill(color); // could be the colour based on the board
                root.add(square, CoordGet.getcoord(boardSquare.Squarenum)[0], CoordGet.getcoord(boardSquare.Squarenum)[1]);

            }

            for (int mapnumber : control.selectedpiece.piecemap)
            {
                Rectangle pieceSquare = new Rectangle(40, 40);
                Color color;
                color = whatColourPiece(control.selectedpiece.ownedBy);
                pieceSquare.setFill(color); // could be the colour based on the board
                root.add(pieceSquare, CoordGet.getcoord(mapnumber)[0], CoordGet.getcoord(mapnumber)[1]);
            }
        }
        
    }

    public void IncrementScore()
    {
        Player1ScoreBoard.setText("Player 1 Score: " + control.player1.Score);
        Player2ScoreBoard.setText("Player 2 Score: " + control.player2.Score);
    }
    
    public void ShowPlayerInventory()
    {
        AvailableInventory.getItems().clear(); // check to see this works.
        Player player = control.currentplayer;
        
        //System.out.println("Current player is player " + player.owner);
        
         for (InventoryItem item : player.inv.PlayerInventory) {

                if(item.quantity > 0)
                {
                    AvailableInventory.getItems().add(item.pieceName);
                    // System.out.println(player.owner + " has " + item.quantity + " " + item.pieceName);
                }
            }

    }

    public void GameOver()
    {

        String content = "";
        String header  = "";

        if (control.player1.Score > control.player2.Score)
        {
             content = "Player 1 wins the game with a score of: " + control.player1.Score +  " \n Would you like to play again?";
            header = "Player 1 wins the game";
        }
        else if(control.player2.Score > control.player1.Score)
        {
            content = "Player 2 wins the game with a score of: " + control.player2.Score + " \n Would you like to play again?";
            header = "Player 2 wins the game";
        }

        else
            {
                content = "The Game is a Draw " + "\n Would you like to play again?";
                header = "Draw";
            }


        Alert Wingame = new Alert(Alert.AlertType.CONFIRMATION,content, ButtonType.YES, ButtonType.NO);
        Wingame.setTitle("GAME OVER");
        Wingame.setHeaderText(header);
        Wingame.showAndWait();

        if (Wingame.getResult() == ButtonType.YES) {
            control.ResetBoard();
            displayBoard();
        }
        else if(Wingame.getResult() == ButtonType.NO)
        {
            Platform.exit();
        }

    }



    @Override
    public void start(Stage primaryStage)
    {
        //System.out.println("Should see a board now");
        root = new GridPane();
        displayBoard();
        //System.out.println("have you seen the board?");

        Button MoveNorth = new Button("N");
        Button MoveSouth = new Button("S");
        Button MoveWest = new Button("W");
        Button MoveEast = new Button("E");
        Button MoveRotateL = new Button("L");
        Button MoveRotateR = new Button("R");
        Button Place = new Button("P");
        Button Endgame = new Button("Resign");
        Button PassMove = new Button("Pass");
        Player1ScoreBoard = new Label( "Player 1 Score: " + control.player1.Score);
        Player2ScoreBoard = new Label("Player 2 Score: " + control.player1.Score);
        root.add(Player1ScoreBoard, 24, 0); // make sure you have the increment score in place piece
        root.add(Player2ScoreBoard, 24, 1);



        MoveNorth.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                control.selectedpiece.MoveWest();
                //System.out.println("Piecemap Defined as: " + control.selectedpiece.piecemap.toString());
                displayBoard();
            }
        });
        MoveSouth.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                control.selectedpiece.MoveEast1();
                //System.out.println(control.selectedpiece.piecemap.toString());
                displayBoard();
            }
        });
        MoveWest.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                control.selectedpiece.MoveNorth();
                //System.out.println(control.selectedpiece.piecemap.toString());
                displayBoard();
            }
        });
        MoveEast.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                control.selectedpiece.MoveSouth();
                //System.out.println(control.selectedpiece.piecemap.toString());
                displayBoard();
            }
        });
        MoveRotateR.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                control.selectedpiece.rotateCounterClockwise();
                displayBoard();
            }
        });
        MoveRotateL.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                control.selectedpiece.rotateClockwise();
                //System.out.println(control.selectedpiece.piecemap.toString());
                displayBoard();
            }
        });
        Place.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
                control.PlacePiece(control.gameboard);
                displayBoard();
                ShowPlayerInventory();
                IncrementScore();
//                control.gameboard.ShowAreaOccupied();
//                control.gameboard.ShowAreaClaimied();
//                control.gameboard.ShowSquarenums();

                if(control.Endgame == true)
                {
                GameOver();
                }
                //control.gameboard.ShowAreaClaimied();
                // check boolean Game over to see if anything is happening
                // if yes then run the game over thing.

            }
        });

        Endgame.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event) {
               GameOver();
            }
        });
        PassMove.setOnAction(new EventHandler() {
            @Override
            public void handle(Event event)
            {
                control.switchgo();
                displayBoard();
            }
        });


        AvailableInventory = new ComboBox();

        // for loop with if statement based on inventory numbers. pull this out into the it's own thing
        // needs to trigger
//        AvailableInventory.getItems().add("Abbey");
//        AvailableInventory.getItems().add("Academy");
//        AvailableInventory.getItems().add("Bridge");
//        AvailableInventory.getItems().add("Castle");
//        AvailableInventory.getItems().add("Infirmary");
//        AvailableInventory.getItems().add("Inn");
//        AvailableInventory.getItems().add("Manor");
//        AvailableInventory.getItems().add("Square");
//        AvailableInventory.getItems().add("Stable");
//        AvailableInventory.getItems().add("Tavern");
//        AvailableInventory.getItems().add("Tower");


        root.add(AvailableInventory, 20, 1);



        root.add(MoveNorth, 14, 2);
        root.add(MoveEast, 15, 3);
        root.add(MoveWest, 13, 3);
        root.add(MoveSouth, 14, 4);
        root.add(MoveRotateL, 13, 2);
        root.add(MoveRotateR, 15, 2);
        root.add(Place, 14, 3);
        root.add(PassMove,15, 10);
        root.add(Endgame,16, 10);

        AvailableInventory.valueProperty().addListener((obs, oldItem, newItem) -> {
            if (newItem == null)
            {
                // do nothing
            }
            else
                {
                    //System.out.println(newItem);
                    switch(newItem.toString())
                {
                    case "ACADEMY":
                        control.selectedpiece = new Academy(control.currentplayer.owner);
                        displayBoard();
                        break;
                    case "ABBEY":
                        control.selectedpiece = new Abbey(control.currentplayer.owner);
                        displayBoard();
                        break;
                    case "BRIDGE":
                        control.selectedpiece = new Bridge(control.currentplayer.owner);
                        displayBoard();
                        break;
                    case "CASTLE":
                        control.selectedpiece = new Castle(control.currentplayer.owner);
                        displayBoard();
                        break;
                    case "INFIRMARY":
                        control.selectedpiece = new Infirmary(control.currentplayer.owner);
                        displayBoard();
                        break;
                    case "INN":
                        control.selectedpiece = new Inn(control.currentplayer.owner);
                        displayBoard();
                        break;
                    case "MANOR":
                        control.selectedpiece = new Manor(control.currentplayer.owner);
                        displayBoard();
                        break;
                    case "SQUARE":
                        control.selectedpiece = new Square(control.currentplayer.owner);
                        displayBoard();
                        break;
                    case "STABLE":
                        control.selectedpiece = new Stable(control.currentplayer.owner);
                        displayBoard();
                        break;
                    case "TAVERN":
                        control.selectedpiece = new Tavern(control.currentplayer.owner);
                        displayBoard();
                        break;
                    case "TOWER":
                        control.selectedpiece = new Tower(control.currentplayer.owner);
                        displayBoard();
                        break;
                    default:
                        System.out.println("No matches found");

                }

                }
            });

        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();

    }




    public static void main(String[] args)
    {
        System.out.println("Launching program");
        ViewUnit.launch();
    }

}







