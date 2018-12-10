package model;

import Telas.TelaJogo;
import java.util.List;
import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.scene.SubScene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
    private final List<Comida> comidas;
    private TelaJogo jogo;
    private int pontos = 0;

    public CASubSceneAnimal(Animal animal, List<Comida> comidas) {
        super(new AnchorPane(), 1300, 690);
        prefWidth(1300);
        prefHeight(690);
        BackgroundImage image;
        image = new BackgroundImage(new Image(BACKGROUND_IMAGE, 1280, 690, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, null);
        AnchorPane root2 = (AnchorPane) this.getRoot();
        root2.setBackground(new Background(image));
        this.animal = animal;
        this.comidas = comidas;
        SubSceneElementos();
        setLayoutX(1320);
        setLayoutY(5);
    }

    public boolean SubSceneElementos() {
        ImageView imagemAnimal = animal.getImagemAnimal2();
        imagemAnimal.setFitWidth(240);
        imagemAnimal.setFitHeight(350);
        imagemAnimal.setLayoutX(90);
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

        String ACERTO_PATH = "resources/buttons/acerto.png";
        ImageView acerto = new ImageView(ACERTO_PATH);
        String ERRO_PATH = "resources/buttons/erro.png";
        ImageView erro = new ImageView(ERRO_PATH);

        CASubSceneInfoAnimal infoAnimal = new CASubSceneInfoAnimal(animal);
        this.getPane().getChildren().add(infoAnimal);

        int i = 0;
        for (Comida img : comidas) {

            ImageView comidaImg = new ImageView(img.getUrlComidaIcon());
            ComidaButton buttonComida = new ComidaButton(comidaImg, img.getUrlComidaIcon());
            buttonComida.setGraphic(comidaImg);
            buttonComida.setLayoutX(500 + i);
            buttonComida.setLayoutY(530);

            buttonComida.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    if (buttonComida.getComida().equals(animal.getComida().getUrlComidaIcon())) {
                        TelaJogo.pontuacao += 10;
                        System.out.println("Acertou");
                        acerto.setLayoutX(160);
                        acerto.setLayoutY(500);
                        if (getPane().getChildren().contains(erro)) {
                            getPane().getChildren().remove(erro);

                        }
                        if (!getPane().getChildren().contains(acerto)) {
                            getPane().getChildren().add(acerto);
                        }
                        infoAnimal.moveSubScene();
                    } else {
                        System.out.println("Errou");
                        erro.setLayoutX(160);
                        erro.setLayoutY(500);
                        if (getPane().getChildren().contains(acerto)) {
                            infoAnimal.moveSubScene();
                            getPane().getChildren().remove(acerto);
                        }
                        if (!getPane().getChildren().contains(erro)) {
                            getPane().getChildren().add(erro);
                        }
                    }
                }
            }
            );

            this.getPane()
                    .getChildren().add(buttonComida);
            i += 200;
        }
        return false;
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

    public int getPontos() {
        return pontos;
    }

}
