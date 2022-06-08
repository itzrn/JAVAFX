package com.example.fx;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FX_06b {

    /**
     * static method ma non-static cheez nhi aa skti hai
     * but non-static method ma staic ya non-static dono aa skta hai
     */

    static boolean answer;
    static Stage window;
    public static boolean display(String title, String message){
        window=new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label1=new Label();
        label1.setText(message);
        GridPane gridPane=new GridPane();


        Button yesButton=new Button("Yes");
        GridPane.setConstraints(yesButton,1,1);
        Button noButton=new Button("No");
        GridPane.setConstraints(noButton,2,1);


        yesButton.setOnAction(e -> {
            answer=true;
            window.close();
        });
        noButton.setOnAction(e -> {
            answer=false;
            window.close();
        });


        gridPane.getChildren().addAll(label1,yesButton,noButton);
        gridPane.setAlignment(Pos.CENTER);

        Scene scene=new Scene(gridPane,300,300);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }
}
