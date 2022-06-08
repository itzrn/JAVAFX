package com.example.fx;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.*;

public class KFX_01 extends Application{
    @Override
    public void start(Stage mystage){
        Button b1=new Button("B1");
        Button b2=new Button("B2");
        Button b3=new Button("Exit");
        b1.setOnAction(e->{
            System.out.println("Button1");
            System.out.println("Button");
        });
        b2.setOnAction(e->System.out.println("Button2"));

        b3.setOnAction(e->System.exit(0));

        FlowPane fp = new FlowPane();
        fp.getChildren().addAll(b1,b2,b3);

        Scene scene = new Scene(fp,400,400);
        mystage.setScene(scene);

        mystage.show();

    }
    public static void main(String[]args)
    {
        launch(args);
    }
}
