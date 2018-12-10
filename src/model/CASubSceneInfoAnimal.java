/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.SubScene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.text.Font;
import javafx.util.Duration;

/**
 *
 * @author Euller Nóbrega
 */
public class CASubSceneInfoAnimal extends SubScene {

    private final String BACKGROUND_IMAGE = "/resources/buttons/grey_panel.png";
    private boolean isEscondido = true;
    private final Animal animalInfo;
    private Label info;

    public CASubSceneInfoAnimal(Animal animal) {
        super(new AnchorPane(), 840, 480);
        prefWidth(840);
        prefHeight(480);
        BackgroundImage image;
        image = new BackgroundImage(new Image(BACKGROUND_IMAGE, 840, 480, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);
        AnchorPane root2 = (AnchorPane) this.getRoot();
        root2.setBackground(new Background(image));
        this.animalInfo = animal;
        SubSceneElementos();

        setLayoutX(1320);
        setLayoutY(35);
    }

    public void SubSceneElementos() {
        info = new Label(animalInfo.toString());
        info.prefWidth(840);
        info.prefHeight(480);
        setLabelFont();
        info.setPadding(new Insets(30, 40, 30, 40));
        info.setAlignment(Pos.TOP_LEFT);
        
        this.getPane().getChildren().add(info);
    }

    public void moveSubScene() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.3), this);
        if (isEscondido) {
            transition.setToX(-980);
            isEscondido = false;
        } else {
            transition.setToX(1310);
            isEscondido = true;
        }
        transition.play();
    }

    private void setLabelFont() {
        String FONT_PATH = "src/resources/fonts/KarmaFuture.ttf";
        try {
            info.setFont(Font.loadFont(new FileInputStream(new File(FONT_PATH)), 18));
        } catch (FileNotFoundException ex) {
            info.setFont(Font.font("Verdana", 18));
        }
    }

    public AnchorPane getPane() {
        return (AnchorPane) this.getRoot();
    }
}
