/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.util.Scanner;
import model.IconeUsuario;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.CAContButton;
import model.CAContScene;
import model.ImgContinentes;
import model.InfoLabelGame;

/**
 *
 * @author Euller
 */
public class TelaJogo {

    private AnchorPane gamePane;
    private Scene gameScene;
    private Stage gameStage;

    private static final int GAME_WIDTH = 1300;
    private static final int GAME_HEIGHT = 700;

    private Stage menuStage;
    private ImageView userIcon;

    private InfoLabelGame pointsLabel;
    private int points;

    private CAContScene sceneToHide;
    private CAContButton americaDoNorte, americaDoSul, europa, africa, asia, oceania, antartida;

    private boolean isLeftKeyPressed;
    private boolean isRightKeyPressed;
    private boolean isUpKeyPressed;
    private boolean isDownKeyPressed;
    private int angle;

    private final static String BACKGROUND_IMAGE = "resources/imagens/animais_mundis.jpg";
    private final String BACKGROUND_GROELANDIA = "/resources/buttons/grey_panel.png";
    private final String BACKGROUND_ANTARTIDA = "/resources/buttons/blue_panel.png";
    private final String BACKGROUND_AMERICAS = "/resources/buttons/green_panel.png";
    private final String BACKGROUND_AFRICA_ASIA = "/resources/buttons/yellow_panel.png";
    private final String BACKGROUND_OCEANIA_EUROPA = "/resources/buttons/red_panel.png";
    private AnimationTimer gameTimer;

    public TelaJogo() {
        initializeStage();
        createKeyListeners();

    }

    public void showSubScene(CAContScene subscene) {
        if (sceneToHide != null) {
            sceneToHide.moveSubScene();
        }
        subscene.moveSubScene();
        sceneToHide = subscene;
    }

    public void createGameElements() {
        createAmericaSulButton();
        createAmericaNorteButton();
        createAfricaButton();
        createEuropaButton();
        createAsiaButton();
        createOceaniaButton();
        createAntartidaButton();
        pointsLabel = new InfoLabelGame("Pontos: 00");
        pointsLabel.setLayoutX(1150);
        pointsLabel.setLayoutY(624);
        gamePane.getChildren().add(pointsLabel);
    }

    private void createKeyListeners() {
        gameScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.LEFT) {
                    isLeftKeyPressed = true;
                } else if (event.getCode() == KeyCode.RIGHT) {
                    isRightKeyPressed = true;
                } else if (event.getCode() == KeyCode.UP) {
                    isUpKeyPressed = true;
                } else if (event.getCode() == KeyCode.DOWN) {
                    isDownKeyPressed = true;
                }
            }
        });
        gameScene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.LEFT) {
                    isLeftKeyPressed = false;
                } else if (event.getCode() == KeyCode.RIGHT) {
                    isRightKeyPressed = false;
                } else if (event.getCode() == KeyCode.UP) {
                    isUpKeyPressed = false;
                } else if (event.getCode() == KeyCode.DOWN) {
                    isDownKeyPressed = false;
                }
            }
        });
    }

    private void initializeStage() {
        gamePane = new AnchorPane();
        gameScene = new Scene(gamePane, GAME_WIDTH, GAME_HEIGHT);
        gameStage = new Stage();
        gameStage.setScene(gameScene);
        gameStage.setTitle("Conhecendo os Animais - By : Euller Nóbrega Honorato");

    }

    public void createNewGame(Stage menuStage, IconeUsuario choosenUserIcon) {
        this.menuStage = menuStage;
        this.menuStage.hide();
        createBackGround();
        createGameLoop();
        createGameElements();
        createUserIcon(choosenUserIcon);
        gameStage.show();
    }

    public void createUserIcon(IconeUsuario choosenUserIcon) {
        userIcon = new ImageView(choosenUserIcon.getUrlUserIcon());
        userIcon.setLayoutY(585);
        userIcon.setLayoutX(7);
        userIcon.setFitHeight(50);
        userIcon.setFitWidth(50);
        gamePane.getChildren().add(userIcon);
    }

    private void createGameLoop() {
        gameTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                moveIcon();
                abreCont();
            }
        };

        gameTimer.start();
    }

    public void createBackGround() {
        Image backgroundImage = new Image(BACKGROUND_IMAGE);  // Imagem tela Inicio
        Canvas canvas = new Canvas(GAME_WIDTH, GAME_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gamePane.getChildren().add(canvas);
        gc.setFill(Color.rgb(48, 175, 240));
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage(backgroundImage, 0, 0); // Desenha a imagem escolhida
    }

    public void moveIcon() {

        if (isLeftKeyPressed && !isRightKeyPressed && !isDownKeyPressed && !isUpKeyPressed) { // Aperta tecla para esquerda
            if (angle > -30) {
                angle -= 5;
            }
            userIcon.setRotate(angle);
            if (userIcon.getLayoutX() > 0) {
                userIcon.setLayoutX(userIcon.getLayoutX() - 3);
            }
        }

        if (isRightKeyPressed && !isLeftKeyPressed && !isDownKeyPressed && !isUpKeyPressed) { // Aperta tecla para direita
            if (angle < 30) {
                angle += 5;
            }
            userIcon.setRotate(angle);
            if (userIcon.getLayoutX() < 1250) {
                userIcon.setLayoutX(userIcon.getLayoutX() + 3);
            }
        }

        if (isDownKeyPressed && !isRightKeyPressed && !isUpKeyPressed && !isLeftKeyPressed) { // Aperta tecla para baixo
            if (userIcon.getLayoutY() < 650) {
                userIcon.setLayoutY(userIcon.getLayoutY() + 3);
            }
        }

        if (isUpKeyPressed && !isLeftKeyPressed && !isDownKeyPressed && !isRightKeyPressed) { // Aperta tecla para cima
            if (userIcon.getLayoutY() > 0) {
                userIcon.setLayoutY(userIcon.getLayoutY() - 3);
            }
        }

        if (!isRightKeyPressed && !isLeftKeyPressed && !isDownKeyPressed && !isRightKeyPressed) {
            if (angle < 0) {
                angle += 5;
            } else if (angle > 0) {
                angle -= 5;
            }
            userIcon.setRotate(angle);
        }

        if (isLeftKeyPressed && isRightKeyPressed && isDownKeyPressed && isUpKeyPressed) {
            if (angle < 0) {
                angle += 5;
            } else if (angle > 0) {
                angle -= 5;
            }
            userIcon.setRotate(angle);
        }
    }

    private void createAmericaSulButton() {
        Image americaSul = new Image(ImgContinentes.AMERICA_DO_SUL.getUrlImgCont());
        americaDoSul = new CAContButton(americaSul);
        gamePane.getChildren().add(americaDoSul);

    }

    private void createAmericaNorteButton() {
        Image americaNorte = new Image(ImgContinentes.AMERICA_DO_NORTE.getUrlImgCont());
        americaDoNorte = new CAContButton(americaNorte);
        gamePane.getChildren().add(americaDoNorte);
    }

    private void createAfricaButton() {
        Image africa_ = new Image(ImgContinentes.AFRICA.getUrlImgCont());
        africa = new CAContButton(africa_);
        gamePane.getChildren().add(africa);
    }

    private void createEuropaButton() {
        Image europa_ = new Image(ImgContinentes.EUROPA.getUrlImgCont());
        europa = new CAContButton(europa_);
        gamePane.getChildren().add(europa);
    }

    private void createAsiaButton() {
        Image asia_ = new Image(ImgContinentes.ASIA.getUrlImgCont());
        asia = new CAContButton(asia_);
        gamePane.getChildren().add(asia);
    }

    private void createOceaniaButton() {
        Image oceania_ = new Image(ImgContinentes.OCEANIA.getUrlImgCont());
        oceania = new CAContButton(oceania_);
        gamePane.getChildren().add(oceania);
    }

    private void createAntartidaButton() {
        Image antartida_ = new Image(ImgContinentes.ANTARTIDA.getUrlImgCont());
        antartida = new CAContButton(antartida_);
        gamePane.getChildren().add(antartida);
    }

    private boolean verificaPosicao(double xIni, double xFim, double yIni, double yFim, CAContButton cont) {
        System.out.println("X = " + userIcon.getLayoutX());
        System.out.println("Y = " + userIcon.getLayoutY());
        System.out.println("\n");

        if ((userIcon.getLayoutX() >= xIni && userIcon.getLayoutX() <= xFim) && (userIcon.getLayoutY() >= yIni && userIcon.getLayoutY() <= yFim)) {
            cont.setIconEntered(userIcon);
            return true;
        } else {
            cont.setIconExit(userIcon);
            return false;
        }
    }

    public void abreCont() {

        if (verificaPosicao(757, 1111, 60, 291, asia)) { // xIni, xFim, yIni, yFim (dimensoes do cont)
            asia.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    if (event.equals(KeyCode.ENTER)) {
                        System.out.println("Abrindo tela de asia");
                        TelaAsia telaAsia = new TelaAsia();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);
                    }
                }
            });
        }

        if (verificaPosicao(1027, 1162, 378, 483, oceania)) {
            oceania.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    if (event.equals(KeyCode.ENTER)) {
                        System.out.println("Abrindo tela de oceania");
                        TelaOceania telaOceania = new TelaOceania();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);
                    }
                }

            });
        }
        if (verificaPosicao(139, 1099, 597, 651, antartida)) {
            antartida.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    if (event.equals(KeyCode.ENTER)) {
                        System.out.println("Abrindo tela de antartida");
                        TelaAntartida telaAntartida = new TelaAntartida();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);
                    }

                }
            });
        }
        if (verificaPosicao(583, 700, 105, 210, europa)) {
            europa.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    if (event.equals(KeyCode.ENTER)) {
                        System.out.println("Abrindo tela de europa");
                        TelaEuropa telaEuropa = new TelaEuropa();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);
                    }
                }
            });
        }
        if (verificaPosicao(547, 712, 267, 460, africa)) {
            africa.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    if (event.equals(KeyCode.ENTER)) {
                        System.out.println("Abrindo tela de africa");
                        TelaAfrica telaAfrica = new TelaAfrica();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);
                    }
                }
            });
        }
        if (verificaPosicao(58, 331, 108, 303, americaDoNorte)) {
            telaButtonAmericaDoNorte();
        }

        if (verificaPosicao(292, 418, 363, 543, americaDoSul)) {
            americaDoSul.setOnKeyReleased(new EventHandler<KeyEvent>() {
                public void handle(KeyEvent event) {
                    System.out.println("Entrou");
                    if (event.getCode() == KeyCode.ENTER) {
                        System.out.println("Abrindo tela de americaDoSul");
                        TelaAmericaSul telaAmericaSul = new TelaAmericaSul();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);
                    }
                }
            });

        }
    }

    private void telaButtonAmericaDoNorte() {
        Button americaDoNorte = new Button("America Do Norte");
        americaDoNorte.setLayoutX(30);
        americaDoNorte.setLayoutY(800);

        americaDoNorte.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println("Entrou");
                if (event.getCode() == KeyCode.ENTER) {
                    System.out.println("Abrindo tela de americaDoNorte");
                    TelaAmericaNorte telaAmericaNorte = new TelaAmericaNorte();
//                    telaAmericaNorte.
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);
                }
            }
        });
        gamePane.getChildren().add(americaDoNorte);
    }
}
