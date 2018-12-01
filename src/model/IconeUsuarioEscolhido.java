/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author Euller
 */
public class IconeUsuarioEscolhido extends VBox {

    private ImageView circleImage;
    private ImageView userIconImage;

    private String circleNotChoosen = "resources/imagens/users/grey_circle.png";
    private String circleChoosen = "resources/imagens/users/blue_boxTick.png";

    private IconeUsuario userIcon;
    private boolean isCircleChoosen;

    public IconeUsuarioEscolhido(IconeUsuario userIcon) {
        circleImage = new ImageView(circleNotChoosen);
        userIconImage = new ImageView(userIcon.getUrlUserIcon());
        this.userIcon = userIcon;
        isCircleChoosen = false;
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.getChildren().add(circleImage);
        this.getChildren().add(userIconImage);
        userIconImage.setFitHeight(100);
        userIconImage.setFitWidth(100);
    }

    public IconeUsuario getUserIcon() {
        return userIcon;
    }

    public boolean isIsCircleChoosen() {
        return isCircleChoosen;
    }

    public void setIsCircleChoosen(boolean isCircleChoosen) {
        this.isCircleChoosen = isCircleChoosen;
        String imageToSet = this.isCircleChoosen ? circleChoosen : circleNotChoosen;
        circleImage.setImage(new Image(imageToSet));
    }

}
