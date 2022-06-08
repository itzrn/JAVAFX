package com.example.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FX_06a extends Application {
    Stage window;
    Button button;
    Button button1;
    public void start(Stage primaryStage)throws Exception{
        window=primaryStage;
        window.setTitle("The New Boston");

        button=new Button("click me");
        button.setOnAction(e-> {
            boolean result=FX_06b.display("Title Of the Window","Want to send some photos to ur ex-girlfriend");
            System.out.println(result);
        });
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