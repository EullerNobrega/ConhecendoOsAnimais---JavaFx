package model;

import javafx.animation.TranslateTransition;
import javafx.scene.SubScene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 *
 * @author Euller
 */
public class CASubSceneAnimal extends SubScene {

    private final String BACKGROUND_IMAGE = "/resources/buttons/grey_panel.png";
    private boolean isEscondido = true;
    private final Animal animal;

    public CASubSceneAnimal(Animal animal) {
        super(new AnchorPane(), 1300, 690);
        prefWidth(1300);
        prefHeight(690);
        BackgroundImage image;
        image = new BackgroundImage(new Image(BACKGROUND_IMAGE, 1280, 690, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);

        AnchorPane root2 = (AnchorPane) this.getRoot();

        root2.setBackground(new Background(image));

        this.animal = animal;

        SubSceneElementos();

        setLayoutX(1320);
        setLayoutY(5);
    }

    public void SubSceneElementos() {
        ImageView imagemAnimal = animal.getImagemAnimal2();
        imagemAnimal.setLayoutX(100);
        imagemAnimal.setLayoutY(120);
        imagemAnimal.setEffect(new DropShadow(20, Color.SLATEGREY));
        this.getPane().getChildren().add(imagemAnimal);

        CAExitButton fechar = new CAExitButton(this);
        fechar.setLayoutX(1180);
        fechar.setLayoutY(30);
        this.getPane().getChildren().add(fechar);
        
        ComidaLabel comidaLabel = new ComidaLabel("Qual alimento esse \n     animal come?");
        comidaLabel.setLayoutX(480);
        comidaLabel.setLayoutY(50);
        this.getPane().getChildren().add(comidaLabel);
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
