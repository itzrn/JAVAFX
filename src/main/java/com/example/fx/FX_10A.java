package com.example.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FX_10A extends Application {
    Stage window;
    Button button1;
    Button button2;
    public void start(Stage primaryStage){
        window=primaryStage;
        window.setTitle("Coding With Aryan");
        VBox vBox=new VBox();
        vBox.setPadding(new Insets(2));

        //form
        TextField textField1=new TextField("Enter Name");
        button1=new Button("Click1");
        button2=new Button("Click2");
        textField1.setMaxWidth(100);//setting Max width of text field
        /*
        if you are using VBox as layout
        then in that default width of text field will be equal to width of scene created
        so, we can use .setMaxWidth(10) to set the max width of text field

        but in gridPane layout the case is different with text field
         */
        button1.setOnAction(e-> System.out.println(textField1.getText()));

//        vBox.getChildren().add(0,textField1);
        vBox.getChildren().addAll(textField1,button1,button2);//the sequence of control will be same
        //as u gave it as parameter of addAll() method
        //means ---> first text field will appear then click1 then click2 button


        Text text=new Text("Aryan");
        vBox.getChildren().add(text);
        Label label=new Label("Aryan Prajapati");
        vBox.getChildren().add(label);
        //Label and text ---> both are similar
        vBox.setSpacing(10);//this will set space between two Controllers

        vBox.setAlignment(Pos.TOP_CENTER);//it will set the position of vbox

        vBox.setPadding(new Insets(50,10,10,10));
        // we can even set the padding for VBox and HBox as we did in Grid Pane

        VBox.setMargin(label,new Insets(20));//here setting margin means position that particular element
        //will be changed

        Scene scene=new Scene(vBox,500,500);
        window.setScene(scene);
        window.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
