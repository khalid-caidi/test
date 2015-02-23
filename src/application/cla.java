package application;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class cla extends Parent{
    
    public cla(){
    			Rectangle fond_clavier = new Rectangle();
        fond_clavier.setWidth(400);
        fond_clavier.setHeight(200);
        fond_clavier.setArcWidth(30);
        fond_clavier.setArcHeight(30);
        fond_clavier.setFill(Color.BLACK);
       this.getChildren().add(fond_clavier);   
    }
}