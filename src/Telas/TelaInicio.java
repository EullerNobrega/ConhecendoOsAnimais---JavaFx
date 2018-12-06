package Telas;

import model.CAButton;
import model.CASubScene;
import model.IconeUsuarioEscolhido;
import model.InfoLabel;
import model.IconeUsuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Euller
 */
public final class TelaInicio {

    private static final int MENU_BUTTONS_STARTS_X = 25;
    private static final int MENU_BUTTONS_STARTS_Y = 150;
    private static final int HEIGTH = 1300;
    private static final int WIDHT = 690;

    private final String FONT_PATH = "src/resources/fonts/KarmaFuture.ttf";

    private AnchorPane painelPrincipal;
    private Scene scenePrincipal;
    private Stage stagePrincipal;

    private CASubScene ajudaSubScene;
    private CASubScene creditosSubScene;
    private CASubScene escolhaUsuarioSubScene;

    private CASubScene sceneToHide;

    List<CAButton> menuButtons;

    List<IconeUsuarioEscolhido> iconList;
    private IconeUsuario choosenIcon;

    public TelaInicio() {
        menuButtons = new ArrayList<>();
        this.painelPrincipal = new AnchorPane();
        this.scenePrincipal = new Scene(painelPrincipal, HEIGTH, WIDHT);
        this.stagePrincipal = new Stage();
        this.stagePrincipal.setScene(scenePrincipal);
        this.stagePrincipal.setTitle("Conhecendo os Animais - By : Euller Nóbrega Honorato");
        criarBackGround();
        criarTitulo();
        createButtons();
        createSubsScenes();
    }

    public Stage getMainStage() {
        return stagePrincipal;
    }

    public void showSubScene(CASubScene subscene) {
        if (sceneToHide != null) {
            sceneToHide.moveSubScene();
        }
        subscene.moveSubScene();
        sceneToHide = subscene;
    }

    public void createSubsScenes() {
        ajudaSubScene = new CASubScene();
        painelPrincipal.getChildren().add(ajudaSubScene);

        creditosSubScene = new CASubScene();
        painelPrincipal.getChildren().add(creditosSubScene);

        escolhaUsuarioSubScene = new CASubScene();
        painelPrincipal.getChildren().add(escolhaUsuarioSubScene);

        createUserChooserSubScene();
    }

    private void createUserChooserSubScene() {
        escolhaUsuarioSubScene = new CASubScene();
        painelPrincipal.getChildren().add(escolhaUsuarioSubScene);

        InfoLabel chooseUserLabel = new InfoLabel(" Escolha seu animal");
        chooseUserLabel.setLayoutX(210);
        chooseUserLabel.setLayoutY(30);
        escolhaUsuarioSubScene.getPane().getChildren().add(chooseUserLabel);
        escolhaUsuarioSubScene.getPane().getChildren().add(createIconToChoose());
        escolhaUsuarioSubScene.getPane().getChildren().add(createButtonStart());
    }

    private TilePane createIconToChoose() {
        TilePane box = new TilePane();
        iconList = new ArrayList<>();
        for (IconeUsuario icon : IconeUsuario.values()) {
            IconeUsuarioEscolhido iconToPick = new IconeUsuarioEscolhido(icon);
            iconList.add(iconToPick);
            box.getChildren().add(iconToPick);
            iconToPick.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    for (IconeUsuarioEscolhido icon : iconList) {
                        icon.setIsCircleChoosen(false);
                    }
                    iconToPick.setIsCircleChoosen(true);
                    choosenIcon = iconToPick.getUserIcon();
                }
            }
            );
        }
        box.setHgap(20);
        box.setVgap(20);
        box.setLayoutX(110);
        box.setLayoutY(100);
        return box;
    }

    private CAButton createButtonStart() {
        CAButton startButton = new CAButton("start");
        startButton.setLayoutX(550);
        startButton.setLayoutY(460);

        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (choosenIcon != null) {
                    TelaJogo gameManager = new TelaJogo();
                    gameManager.createNewGame(stagePrincipal, choosenIcon);
                }
            }
        });

        return startButton;
    }

    public void createButtons() {
        criarStartButton();
        criarCreditsButton();
        criarHelpButton();
        criarExitButton();
    }

    public void criarStartButton() {
        CAButton startButton = new CAButton("JOGAR");
        addMenuButton(startButton);

        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showSubScene(escolhaUsuarioSubScene);
            }
        });
    }

    public void criarCreditsButton() {
        CAButton creditsButton = new CAButton("Creditos");
        addMenuButton(creditsButton);

        creditsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showSubScene(creditosSubScene);

            }
        });
    }

    public void criarHelpButton() {
        CAButton helpAButton = new CAButton("AJUDA");
        addMenuButton(helpAButton);

        helpAButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showSubScene(ajudaSubScene);

            }
        });
    }

    public void criarExitButton() {
        CAButton exitButton = new CAButton("SAIR");
        addMenuButton(exitButton);
        exitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stagePrincipal.close();
            }
        }
        );

    }

    public void addMenuButton(CAButton button) {
        button.setLayoutX(MENU_BUTTONS_STARTS_X);
        button.setLayoutY(MENU_BUTTONS_STARTS_Y + menuButtons.size() * 100);
        menuButtons.add(button);
        painelPrincipal.getChildren().add(button);
    }

    public void criarBackGround() {
        Image backgroundImage = new Image("resources/imagens/animal_mural.jpg");  // Imagem tela Inicio
        Canvas canvas = new Canvas(HEIGTH, WIDHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        painelPrincipal.getChildren().add(canvas);
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage(backgroundImage, 230, 35); // Desenha a imagem escolhida
    }

    public void criarTitulo() {
        Canvas canvas = new Canvas(HEIGTH, WIDHT);
        GraphicsContext gc = canvas.getGraphicsContext2D(); // classe é usada para emitir chamadas de desenho para um Canvas usando um buffer.
        gc.setFill(Color.BLUEVIOLET); // Seta cor do preenchimento
        gc.setStroke(Color.GREENYELLOW); // Seta cor do contorno
        gc.setLineWidth(1); // Seta a largura da linha
        try {
            gc.setFont(Font.loadFont(new FileInputStream(FONT_PATH), 60));
        } catch (FileNotFoundException e) {
            gc.setFont(Font.font("Verdana", 23));
        }
        gc.fillText("Conhecendo os Animais", 380, 80); // Escreve o preenchimento do texto
        gc.strokeText("Conhecendo os Animais", 380, 80); // Escreve o contorno do texto
        painelPrincipal.getChildren().add(canvas);
    }
}
