package com.example.fx;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.stage.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.Scene;

public class KFX_02 extends Application {
    @Override
    public void start(Stage mystage) {
        Button b1,b2,b3,b4;
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b1.setMinSize(50,50);

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(200));
        TextField tf = new TextField();
        b1.setOnAction(e->{
            tf.setText("String1");
        });
        b2.setOnAction(e->{
            tf.setText("String2");
        });
        b3.setOnAction(e->{
            tf.setText("String3");
        });
        b4.setOnAction(e->{
            tf.setText("String4");
        });
        gp.setVgap(10);
        gp.setHgap(10);
        gp.add(tf,1,0);
        gp.add(b1,0,1);
        gp.add(b2,1,1);
        gp.add(b3,0,2);
        gp.add(b4,1,2);

        Scene scene = new Scene(gp,500,500);
        mystage.setScene(scene);
        mystage.show();

    }
    public static void main(String[]args) {
        launch(args);
    }
}
