package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.text.Font;

/**
 *
 * @author Euller Nóbrega
 */
public class ComidaLabel extends Label{
       private final static String FONT_PATH = "src/resources/fonts/KarmaFuture.ttf";

    public ComidaLabel(String text) {
        setPrefWidth(600);
        setPrefHeight(150);
        BackgroundImage backgroundImage = new BackgroundImage(new Image("/resources/buttons/grey_comida_label.png", 600, 150, false, true), BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);
        setBackground(new Background(backgroundImage));
        setAlignment(Pos.TOP_CENTER);
        setPadding(new Insets(10, 10, 10, 10));
        setLabelFont();
        setText(text);
    }

    private void setLabelFont() {
        try {
            setFont(Font.loadFont(new FileInputStream(new File(FONT_PATH)), 40));
        } catch (FileNotFoundException ex) {
            setFont(Font.font("Verdana", 40));
        }
    }
}
