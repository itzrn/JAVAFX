package com.example.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FX_11 extends Application{
    Stage window;
    Scene scene;
    Button button1;
    Button button2;
    public void start(Stage primaryStage){
        window=primaryStage;
        window.setTitle("Check Box");
        button1=new Button("Order Now!");
        button2=new Button("Exit");

        CheckBox checkBox1=new CheckBox("Fruit");
        CheckBox checkBox2=new CheckBox("Vegetable");
        CheckBox checkBox3=new CheckBox("Junk Food");
        checkBox1.setSelected(true);//this will check the checkBox as default
        Text text=new Text();

        button1.setOnAction(e->text.setText(handleOperation(checkBox1,checkBox2,checkBox3)));
        button2.setOnAction(e->window.close());

        VBox vBox=new VBox();
        vBox.setPadding(new Insets(30));
        vBox.setSpacing(10);
        vBox.getChildren().addAll(checkBox1,checkBox2,checkBox3,button1,button2,text);
        VBox.setMargin(text,new Insets(50));
        scene=new Scene(vBox,500,500);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    private String handleOperation(CheckBox checkBox1,CheckBox checkBox2,CheckBox checkBox3){
        String message="Your Order --->\n\n";
        if (checkBox1.isSelected())
            message=message+"Fruit\n";
        if (checkBox2.isSelected())
            message=message+"Vegetable\n";
        if (checkBox3.isSelected())
            message=message+"Junk Food\n";

        return message;
    }
}
