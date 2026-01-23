package src.main.java.Caro;



import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class test extends Application {
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        //Scene 1
        Label label = new Label("Caro Game");
        Button button1 = new Button("Start");
        VBox layout1 = new VBox();
        layout1.getChildren().addAll(label, button1);
        scene1 = new Scene(layout1, 500, 400);

        //Scene 2
        Button button2 = new Button("Back");
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 500, 400);
        
    }
}