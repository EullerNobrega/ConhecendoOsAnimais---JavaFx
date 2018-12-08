/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

/**
 *
 * @author Euller Nóbrega
 */
public class CAExitButton extends Button {

    private final String BUTTON_PRESSED_STYLE = "-fx-backgroud-color: transparent; -fx-background-image: url('/resources/buttons/red_boxCross.png');";
    private final String BUTTON_FREE_STYLE = "-fx-backgroud-color: transparent; -fx-background-image: url('/resources/buttons/grey_boxCross.png');";
    private CASubSceneAnimal atual;

    public CAExitButton(CASubSceneAnimal subscene) {
        setPrefHeight(36);
        setPrefWidth(38);
        setStyle(BUTTON_FREE_STYLE);
        initializeButtonListeners();
        atual = subscene;

    }

    public void initializeButtonListeners() {
        setOnMouseEntered((MouseEvent event) -> {
            setStyle(BUTTON_PRESSED_STYLE);
            setEffect(new DropShadow());
        });

        setOnMouseExited((MouseEvent event) -> {
            setStyle(BUTTON_FREE_STYLE);
            setEffect(null);
        });

        setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TranslateTransition transition = new TranslateTransition(Duration.seconds(0.3), atual);
                transition.setToX(1310);
                transition.play();
            }
        });
    }
}
