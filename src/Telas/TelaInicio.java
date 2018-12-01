/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
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

    private CASubScene helpSubScene;
    private CASubScene creditsSubScene;
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
        createBackGround();
        createTitulo();
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
        helpSubScene = new CASubScene();
        painelPrincipal.getChildren().add(helpSubScene);

        creditsSubScene = new CASubScene();
        painelPrincipal.getChildren().add(creditsSubScene);

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
                   for(IconeUsuarioEscolhido icon : iconList){
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
    
    private CAButton createButtonStart(){
        CAButton startButton = new CAButton("start");
        startButton.setLayoutX(550);
        startButton.setLayoutY(460);
        
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(choosenIcon != null){
                    TelaJogo gameManager = new TelaJogo();
                    gameManager.createNewGame(stagePrincipal, choosenIcon);
                }
            }
        });
                
        return startButton;
    }

    public void createButtons() {
        createStartButton();
        createCreditsButton();
        createHelpButton();
        createExitButton();
    }

    public void createStartButton() {
        CAButton startButton = new CAButton("JOGAR");
        addMenuButton(startButton);

        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showSubScene(escolhaUsuarioSubScene);
            }
        });
    }

    public void createCreditsButton() {
        CAButton creditsButton = new CAButton("Creditos");
        addMenuButton(creditsButton);

        creditsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showSubScene(creditsSubScene);

            }
        });
    }

    public void createHelpButton() {
        CAButton helpAButton = new CAButton("AJUDA");
        addMenuButton(helpAButton);

        helpAButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showSubScene(helpSubScene);

            }
        });
    }

    public void createExitButton() {
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

    public void createBackGround() {
        Image backgroundImage = new Image("resources/imagens/animal_mural.jpg");  // Imagem tela Inicio
        Canvas canvas = new Canvas(HEIGTH, WIDHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        painelPrincipal.getChildren().add(canvas);
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage(backgroundImage, 230, 35); // Desenha a imagem escolhida
    }

    public void createTitulo() {
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

    public void TelaInicio(Stage primaryStage) {

        Font font = Font.font(FONT_PATH, FontPosture.REGULAR, 60); // Define tipo da fonte ao ser escrito

//        Layout
        AnchorPane root = new AnchorPane();
        root.setMaxSize(1024, 720);

//        Scene
        Scene scene = new Scene(root, 1024, 720);
        scene.setFill(Color.WHITE);
        scene.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println(event.getCharacter());
                StackPane root = new StackPane();
                Label labelMenu = new Label("Vamos explorar alguns \nanimais do mundo");
                labelMenu.setFont(font);
                labelMenu.setTextFill(Color.CRIMSON);
                root.getChildren().add(labelMenu);
                Scene scene = new Scene(root, 1024, 720);
                scene.setFill(Color.WHITE);
                primaryStage.setScene(scene);
                System.out.println("Entrou");
            }
        });

//        No
        Canvas canvas = new Canvas(1024, 720);
        Image telaInicial = new Image("resources/imagens/animal_mural.jpg");  // Imagem tela Inicio

        ImageView imageView = new ImageView(telaInicial);
        root.getChildren().add(imageView);

        GraphicsContext gc = canvas.getGraphicsContext2D(); // classe é usada para emitir chamadas de desenho para um Canvas usando um buffer.

        gc.setFill(Color.BLUEVIOLET); // Seta cor do preenchimento

        gc.setStroke(Color.GREENYELLOW); // Seta cor do contorno

        gc.setLineWidth(
                1); // Seta a largura da linha

        gc.setFont(font); // Seta a fonte escolhida

//        gc.drawImage(telaInicial,
//                0, 68); // Desenha a imagem escolhida
        gc.fillText(
                "Conhecendo os Animais", 160, 80); // Escreve o preenchimento do texto
        gc.strokeText(
                "Conhecendo os Animais", 160, 80); // Escreve o contorno do texto

//        Add elementos na cena
        root.getChildren()
                .add(canvas);

//       Add scene ao stage
        primaryStage.setScene(scene);

//      Apresenta o Stage
        primaryStage.show();

    }

}
