/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Euller
 */
public class CAContButton extends ImageView {
    
    public CAContButton(Image img) {
        setImage(img);
        initializeButtonListeners();
    }


    public void setButtonPressedStyle() {
        setLayoutY(getLayoutY() + 4);
    }

    private void setButtonReleasedStyle() {
        setLayoutY(getLayoutY() - 4);
    }

    public void initializeButtonListeners() {
        setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.ENTER)){
                    setButtonPressedStyle();
                }
            }
        });

        setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.ENTER)) {
                    setButtonReleasedStyle();
                }
            }
        });
    }

}
