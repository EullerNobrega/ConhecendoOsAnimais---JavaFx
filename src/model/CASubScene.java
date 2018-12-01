/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.animation.TranslateTransition;
import javafx.scene.Parent;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.util.Duration;

/**
 *
 * @author Euller
 */
public class CASubScene extends SubScene {
    private final String BACKGROUND_IMAGE = "/resources/buttons/blue_panel.png";
    private boolean isHidden = true;

    public CASubScene() {
        super(new AnchorPane(), 800, 700);
        prefWidth(800);
        prefHeight(500);
        BackgroundImage image = new BackgroundImage(new Image(BACKGROUND_IMAGE, 800, 550, false, true), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);

        AnchorPane root2 = (AnchorPane) this.getRoot();

        root2.setBackground(new Background(image));

        setLayoutX(1320);
        setLayoutY(100);
    }
    
    public void moveSubScene() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.3), this);
        if (isHidden) {
            transition.setToX(-1000);
            isHidden = false;
        }else{
            transition.setToX(1000);
            isHidden = true;
        }
        transition.play();
    }
    
    public AnchorPane getPane(){
        return (AnchorPane) this.getRoot();
    }
}
