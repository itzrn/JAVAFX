package com.example.fx;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FX_05b {//Alert box ---> which allow you to work on another displayed window
    //if you try to use the behind window it won't allow you to use ---> that's the alert box

    public static void display(String title, String message){
        Stage window=new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label1=new Label();
        label1.setText(message);

        Button closeButton=new Button("exit");
        closeButton.setOnAction(e->window.close());

        VBox vBox=new VBox();
        vBox.getChildren().addAll(label1,closeButton);
        vBox.setAlignment(Pos.CENTER);

        Scene scene=new Scene(vBox,300,300);
        window.setScene(scene);
        window.showAndWait();
    }
}
