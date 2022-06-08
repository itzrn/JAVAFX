package com.example.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FX_03b extends Application {
    Button button01;
    Button button02;
    public void start(Stage primaryStage){
        button01=new Button("start");
        button02=new Button("exit");

        button01.setOnAction(e->{
            System.out.println("This is Button Start");
            System.out.println("I love you");
        });

        button02.setOnAction(e->{
            System.out.println("This program is going to Exit");
            System.exit(0);//or we can use System.exit(0);
        });

        VBox vBox=new VBox();
        vBox.getChildren().addAll(button01,button02);

        Scene scene=new Scene(vBox,400,400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
