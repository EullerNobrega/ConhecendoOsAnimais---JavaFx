package model;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.SubScene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
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
public class CASubSceneAnimal extends SubScene {

    private final String BACKGROUND_IMAGE = "/resources/buttons/grey_panel.png";
    private boolean isEscondido = true;
    private final CAExitButton fechar;

    public CASubSceneAnimal() {
        super(new AnchorPane(), 1300, 690);
        prefWidth(1300);
        prefHeight(690);
        BackgroundImage image;
        image = new BackgroundImage(new Image(BACKGROUND_IMAGE, 1280, 690, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);

        AnchorPane root2 = (AnchorPane) this.getRoot();

        root2.setBackground(new Background(image));

        fechar = new CAExitButton(this);
        fechar.setLayoutX(1180);
        fechar.setLayoutY(30);
        this.getPane().getChildren().add(fechar);

        setLayoutX(1320);
        setLayoutY(5);
    }

    public void moveSubScene() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(0.3), this);
        if (isEscondido) {
            transition.setToX(-1310);
            isEscondido = false;
        } else {
            transition.setToX(1310);
            isEscondido = true;
        }
        transition.play();
    }

    public AnchorPane getPane() {
        return (AnchorPane) this.getRoot();
    }
}
