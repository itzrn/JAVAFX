package com.example.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FX_10B extends Application {
    Stage window;
    TextField textField;
    Button button1;
    Button button2;
    public void start(Stage primaryStage){
        window=primaryStage;
        window.setTitle("Text Filed");
        textField=new TextField("Enter Age");
        button1=new Button("Click");
        button2=new Button("Exit");

        //if we want to get enter the particular type ---> integer or character
        button1.setOnAction(e->isInt(textField));//here it will enter only integer part
        button2.setOnAction(e->window.close());
        VBox vBox=new VBox();
        vBox.getChildren().addAll(textField,button1,button2);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(20));

        Scene scene=new Scene(vBox,500,500);
        window.setScene(scene);
        window.show();
    }

    private boolean isInt(TextField textField){
        try {
            int age=Integer.parseInt((textField.getText()));
            System.out.println("User age is ---> "+age);
            return true;
        }catch (NumberFormatException e){
            System.out.println("Error! "+ textField.getText()+" is not a number");
        }
        return false;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
