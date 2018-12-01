/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.animation.TranslateTransition;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.util.Duration;

/**
 *
 * @author Euller
 */
public class CAContScene extends SubScene {

 
    private final int WIDTH = 1300;
    private final int HEIGHT = 700;

    private boolean isHidden = true;

    public CAContScene(String BACKGROUND_IMAGE) {
        super(new AnchorPane(), 1300, 700);
        prefWidth(1300);
        prefHeight(700);
        BackgroundImage image = new BackgroundImage(new Image(BACKGROUND_IMAGE, WIDTH, HEIGHT, false, true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);

        AnchorPane root2 = (AnchorPane) this.getRoot();

        root2.setBackground(new Background(image));

        setLayoutX(1320);
        setLayoutY(0);
    }
    
    public void moveSubScene() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.3), this);
        if (isHidden) {
            transition.setToX(+1000);
            isHidden = false;
        }else{
            transition.setToX(-1000);
            isHidden = true;
        }
        transition.play();
    }
    
    public AnchorPane getPane(){
        return (AnchorPane) this.getRoot();
    }
}
