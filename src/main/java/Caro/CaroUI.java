package src.main.java.Caro;

import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.geometry.Pos;


public class CaroUI extends Application {
    public int boardSize = 15;
    public Board board = new Board(boardSize);
    public Button button = new Button();
    public Stage window;
    public Scene scene1, scene2, scene3, scene4;

    public void newGame() {
        GridPane layout2 = new GridPane();
        int SIZE = boardSize;
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                Button cell = new Button("");
                cell.setPrefSize(40, 40);

                int r = row;
                int c = col;

                cell.setOnAction(e -> {
                    if(board.isValid(r,c)) {
                        char x;
                        String txt;
                        if(board.turn % 2 == 1) {
                            x = 'X';
                            txt = "X";
                        }
                        else {
                            x = 'O';
                            txt = "O";
                        }
                        board.playSymbol(x, r, c);
                        cell.setText(txt);
                        if(board.isWin() && board.turn % 2 == 1) window.setScene(scene4);
                        else if(board.isWin() && board.turn % 2 == 0) window.setScene(scene3);
                    }
                });

                layout2.add(cell, col, row);
            }
        }
        scene2 = new Scene(layout2, 600,600);
        window.setScene(scene2);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        //restart button
        Button restart1 = new Button("Restart");
        restart1.setOnAction(e -> {
            board = new Board(boardSize);
            newGame();
        });

        Button restart2 = new Button("Restart");
        restart2.setOnAction(e -> {
            board = new Board(boardSize);
            newGame();
        });
        
        //Scene 1

        Button button1 = new Button("Start");
        button1.setOnAction(event ->{
            newGame();
        });
        StackPane layout1 = new StackPane();
        layout1.getChildren().addAll(button1);
        scene1 = new Scene(layout1, 500, 400);

        //scene 3
        StackPane layout3 = new StackPane();
        Label label = new Label("Congratulation! Player 1 is the Winner.");
        StackPane.setAlignment(label, Pos.CENTER);
        StackPane.setAlignment(restart1, Pos.BOTTOM_CENTER);
        layout3.getChildren().addAll(label, restart1);
        scene3 = new Scene(layout3, 400, 150);
        
        //scene 4
        StackPane layout4 = new StackPane();
        Label label1 = new Label("Congratulation! Player 2 is the Winner.");
        StackPane.setAlignment(label1, Pos.CENTER);
        StackPane.setAlignment(restart2, Pos.BOTTOM_CENTER);
        layout4.getChildren().addAll(label1, restart2);
        scene4 = new Scene(layout4, 400, 150);

        window.setScene(scene1);
        window.show();
    }
}