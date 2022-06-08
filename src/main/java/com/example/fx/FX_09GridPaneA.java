package com.example.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FX_09GridPaneA extends Application {
    Stage window;
    Button login;
    @Override
    public void start(Stage primaryStage){
        window=primaryStage;
        window.setTitle("Grid Pane");

        GridPane gridPane=new GridPane();
        gridPane.setPadding(new Insets(50));
        gridPane.setVgap(8);
        gridPane.setHgap(8);
        /*
        Insets(double topRightBottomLeft)
        Constructs a new Insets instance with same value for all four offsets.


        Insets(double top, double right, double bottom, double left)
        Constructs a new Insets instance with four different offsets
         */
        //Name Label
        Label nameLabel1=new Label("User Name");
        GridPane.setConstraints(nameLabel1,0,0);

        //Name Input
        TextField nameInput=new TextField("Name");// with no default text in it ---> TextField nameInput=new TextField();
        GridPane.setConstraints(nameInput,1,0);//(side shift, vertical shift)

        //Password Label
        Label passLabel=new Label("Password");
        GridPane.setConstraints(passLabel,0,1);

        //password Input
        TextField passInput=new TextField();
        passInput.setPromptText("Password");//it will set a text in the text field
        GridPane.setConstraints(passInput,1,1);

        login=new Button("Login");
        GridPane.setConstraints(login,1,2);

        gridPane.getChildren().addAll(nameLabel1,nameInput,passLabel,passInput,login);



        Scene scene=new Scene(gridPane,400,400);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
