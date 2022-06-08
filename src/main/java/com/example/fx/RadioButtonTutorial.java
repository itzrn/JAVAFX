package com.example.fx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonTutorial extends Application implements EventHandler<ActionEvent> {
    Stage window;
    RadioButton yes,no;
    Button submit;
    ToggleGroup answer;
    VBox mainLayout;
    HBox radios;
    public void start(Stage primaryStage) throws Exception{
        //creating window
        window=primaryStage;
        window.setTitle("Radio Button");

        //create VBox
        mainLayout=new VBox();
        mainLayout.setSpacing(20);
        mainLayout.prefWidth(300);
        mainLayout.setPadding(new Insets(15));

        //HBox for Radio Button
        radios=new HBox();
        radios.setSpacing(20);
        radios.setPadding(new Insets(0));
        radios.setPrefWidth(300);

        // Ask Question
        Label question=new Label("Do u like your classes?");

        //creating a toggle group nad radio Button
        answer=new ToggleGroup();
        yes=new RadioButton("Yes");
        yes.setToggleGroup(answer);
        no=new RadioButton("No");
        no.setToggleGroup(answer);

        //creating submit button
        submit=new Button("Submit");
        submit.setOnAction(this);

        //Adding all element to GUI
        radios.getChildren().addAll(yes,no);
        mainLayout.getChildren().addAll(question);//order matters
        mainLayout.getChildren().addAll(radios,submit);

        mainLayout.setAlignment(Pos.CENTER);
        radios.setAlignment(Pos.CENTER);

        Scene scene=new Scene(mainLayout,500,500);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    public void handle(ActionEvent actionEvent){
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        if (yes.isSelected()){
            alert.setTitle("Message");
            alert.setContentText("That's great");
            alert.showAndWait();
        }
        else {
            alert.setTitle("Message");
            alert.setContentText("HopeFully nest semester is better");
            alert.showAndWait();
        }
    }
}
