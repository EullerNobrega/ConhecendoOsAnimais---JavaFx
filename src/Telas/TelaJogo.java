/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import model.IconeUsuario;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.DropShadow;
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

    private CAContScene sceneToHide;
    private CAContScene americaSulSubScene;
    private CAContScene americaNorteSubScene;
    private CAContScene europaSubScene;
    private CAContScene asiaSubScene;
    private CAContScene antartidaSubScene;
    private CAContScene oceaniaSubScene;
    private CAContScene africaSubScene;
    private CAContScene SubScene;

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
//        createSubsScenes();

    }

    public void showSubScene(CAContScene subscene) {
        if (sceneToHide != null) {
            sceneToHide.moveSubScene();
        }
        subscene.moveSubScene();
        sceneToHide = subscene;
    }

//    public void createSubsScenes() {
//        americaNorteSubScene = new CAContScene(BACKGROUND_AMERICAS);
//        gamePane.getChildren().add(americaNorteSubScene);
//
//        americaSulSubScene = new CAContScene(BACKGROUND_AMERICAS);
//        gamePane.getChildren().add(americaSulSubScene);
//
//        africaSubScene = new CAContScene(BACKGROUND_AFRICA_ASIA);
//        gamePane.getChildren().add(africaSubScene);
//
//        asiaSubScene = new CAContScene(BACKGROUND_AFRICA_ASIA);
//        gamePane.getChildren().add(asiaSubScene);
//
//        europaSubScene = new CAContScene(BACKGROUND_OCEANIA_EUROPA);
//        gamePane.getChildren().add(europaSubScene);
//
//        oceaniaSubScene = new CAContScene(BACKGROUND_OCEANIA_EUROPA);
//        gamePane.getChildren().add(oceaniaSubScene);
//
//        antartidaSubScene = new CAContScene(BACKGROUND_ANTARTIDA);
//        gamePane.getChildren().add(antartidaSubScene);
//
//    }
//    public void createGameSubScene() {
//        
//
//    }
    public void createButtons() {
        createAmericaSulButton();
        createAmericaNorteButton();
        createAfricaButton();
        createEuropaButton();
        createAsiaButton();
        createOceaniaButton();
        createAntartidaButton();
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
        createButtons();
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

        CAContButton americaDoSul = new CAContButton(americaSul);
        americaDoSul.setLayoutX(0);
        americaDoSul.setLayoutY(0);

        americaDoSul.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println("i");
//                    TelaAmericaSul telaAmericaSul = new TelaAmericaSul();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);

            }
        });
        gamePane.getChildren().add(americaDoSul);

    }

    private void createAmericaNorteButton() {
       Image americaNorte = new Image(ImgContinentes.AMERICA_DO_NORTE.getUrlImgCont());

        CAContButton americaDoNorte = new CAContButton(americaNorte);
        americaDoNorte.setLayoutX(0);
        americaDoNorte.setLayoutY(0);

        americaDoNorte.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println("i");
//                    TelaAmericaSul telaAmericaSul = new TelaAmericaSul();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);

            }
        });
        gamePane.getChildren().add(americaDoNorte);
    }

    private void createAfricaButton() {
        Image africa_ = new Image(ImgContinentes.AFRICA.getUrlImgCont());

        CAContButton africa = new CAContButton(africa_);
        africa.setLayoutX(0);
        africa.setLayoutY(0);

        africa.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println("i");
//                    TelaAmericaSul telaAmericaSul = new TelaAmericaSul();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);

            }
        });
        gamePane.getChildren().add(africa);
    }

    private void createEuropaButton() {
        Image europa_ = new Image(ImgContinentes.AMERICA_DO_SUL.getUrlImgCont());

        CAContButton europa = new CAContButton(europa_);
        europa.setLayoutX(0);
        europa.setLayoutY(0);

        europa.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println("i");
//                    TelaAmericaSul telaAmericaSul = new TelaAmericaSul();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);

            }
        });
        gamePane.getChildren().add(europa);
    }

    private void createAsiaButton() {
       Image asia_ = new Image(ImgContinentes.AMERICA_DO_SUL.getUrlImgCont());

        CAContButton asia = new CAContButton(asia_);
        asia.setLayoutX(0);
        asia.setLayoutY(0);

        asia.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println("i");
//                    TelaAmericaSul telaAmericaSul = new TelaAmericaSul();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);

            }
        });
        gamePane.getChildren().add(asia);
    }

    private void createOceaniaButton() {
        Image oceania_ = new Image(ImgContinentes.AMERICA_DO_SUL.getUrlImgCont());

        CAContButton oceania = new CAContButton(oceania_);
        oceania.setLayoutX(0);
        oceania.setLayoutY(0);

        oceania.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println("i");
//                    TelaAmericaSul telaAmericaSul = new TelaAmericaSul();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);

            }
        });
        gamePane.getChildren().add(oceania);
    }

    private void createAntartidaButton() {
        Image antartida_ = new Image(ImgContinentes.AMERICA_DO_SUL.getUrlImgCont());

        CAContButton antartida = new CAContButton(antartida_);
        antartida.setLayoutX(0);
        antartida.setLayoutY(0);

        antartida.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println("i");
//                    TelaAmericaSul telaAmericaSul = new TelaAmericaSul();
//                    gameManager.createNewGame(stagePrincipal, choosenIcon);

            }
        });
        gamePane.getChildren().add(antartida);
    }

}
