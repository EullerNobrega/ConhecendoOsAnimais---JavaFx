/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author Euller Nóbrega
 */
public class ComidaButton extends Button{
    private final String comida;
    
    public ComidaButton(ImageView comidaImg, String comida) {
        this.comida = comida;
        comidaImg.setFitHeight(120);
        comidaImg.setFitWidth(120);
        setGraphic(comidaImg);
    }

    public String getComida() {
        return comida;
    }
    
    public void initializeButtonListeners() {
        setOnMouseEntered((MouseEvent event) -> {
            setEffect(new DropShadow(10, Color.CHARTREUSE));
        });

        setOnMouseExited((MouseEvent event) -> {
            setEffect(null);
        });
        
        setOnMouseClicked((MouseEvent event) -> {
        });
    }
}
