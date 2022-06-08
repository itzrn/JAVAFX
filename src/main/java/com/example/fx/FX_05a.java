package com.example.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FX_05a extends Application {
    Stage window;
    Button button;
    Button button1;
    public void start(Stage primaryStage){
        window=primaryStage;
        window.setTitle("The New Boston");

        button=new Button("click me");
        button.setOnAction(e-> FX_05b.display("Title Of the Window","Wow this alert Box is Awesome"));
        button1=new Button("exit");
        button1.setOnAction(e->window.close());

        VBox vBox=new VBox();
        vBox.getChildren().addAll(button,button1);


        Scene scene=new Scene(vBox,500,500);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
