package com.example.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Thia is all about separate Scene, not about separate window

public class FX_04 extends Application {//here we will
    // see multiple scene and to switch between them

    Stage window;
    Scene scene01,scene02;//tool two scene bcz we have to switch between two scene
    Button button01;
    Button button02;
    Button button03;
    public void start(Stage primaryStage){
        window=primaryStage;

        Label label01 = new Label("Welcome to Fist Scene");//this take Object as an argument
        button01=new Button("Go to Scene2");
        button01.setOnAction(e-> window.setScene(scene02));
        button03=new Button("exit");// --- >its in Scene 1
        button03.setOnAction(e->{
            System.exit(0);
        });

        //layout 1 ---> Children are laid out in vertical column
        VBox vBox=new VBox();
        vBox.getChildren().addAll(label01,button01,button03);

        scene01=new Scene(vBox,200,200);

        //button02
        Label label02=new Label("Welcome to Scene2");
        button02=new Button("Go to scene1");
        button02.setOnAction(e-> window.setScene(scene01));

        //layout 2

        VBox vBox1=new VBox();
        vBox1.getChildren().addAll(label02,button02);
        scene02=new Scene(vBox1,500,500);

        window.setScene(scene01);
        window.setTitle("Title Here");
        window.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

