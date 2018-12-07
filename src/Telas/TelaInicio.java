package Telas;

import model.CAButton;
import model.CASubScene;
import model.PainelEscolhaIcone;
import model.InfoLabel;
import model.Icone;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
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

    private final AnchorPane painelPrincipal;
    private final Scene scenePrincipal;
    private final Stage stagePrincipal;

    private CASubScene ajudaSubScene;
    private CASubScene creditosSubScene;
    private CASubScene escolhaUsuarioSubScene;
    private CASubScene sceneEsconder;

    List<CAButton> menuButtons; // Botoes de subscena

    private Icone escolhaIcone;

    public TelaInicio() {
        menuButtons = new ArrayList<>();
        this.painelPrincipal = new AnchorPane();
        this.scenePrincipal = new Scene(painelPrincipal, HEIGTH, WIDHT);
        this.stagePrincipal = new Stage();
        this.stagePrincipal.setScene(scenePrincipal);
        this.stagePrincipal.setTitle("Conhecendo os Animais - By : Euller Nóbrega Honorato");
        criarBackGround(); // Cria a imagem de fundo
        criarTitulo(); // Desenha o titulo "Conhecendo os animais" na tela inicial
        createButtons(); // Cria todos os botoes da tela inicial
        criarSubsScenes(); // Cria todas as subScenes da tela inicial
    }

    public Stage getMainStage() { // Retorna o stage da  tela
        return stagePrincipal;
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

    public void createButtons() {
        criarJogarButton();
        criarCreditosButton();
        criarAjudaButton();
        criarSairButton();
    }

    public void addMenuButton(CAButton button) { // Adiciona botoes na Tela inicial
        button.setLayoutX(MENU_BUTTONS_STARTS_X);
        button.setLayoutY(MENU_BUTTONS_STARTS_Y + menuButtons.size() * 100); // Espacamento entre botoes
        menuButtons.add(button); // Add botao a lista de botoes
        painelPrincipal.getChildren().add(button);
    }

    public void criarJogarButton() {
        CAButton startButton = new CAButton("JOGAR");
        addMenuButton(startButton);

        startButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(escolhaUsuarioSubScene);
        });
    }

    private CAButton criarButtonStart() { // Criar botao dentro de JOGAR para iniciar a Tela Jogo
        CAButton startButton = new CAButton("start");
        startButton.setLayoutX(550);
        startButton.setLayoutY(460);

        startButton.setOnAction((ActionEvent event) -> {
            if (escolhaIcone != null) {
                TelaJogo jogoInicio = new TelaJogo();
                jogoInicio.criarNovoJogo(stagePrincipal, escolhaIcone);
            }
        });

        return startButton;
    }

    public void criarCreditosButton() {
        CAButton creditosButton = new CAButton("Creditos");
        addMenuButton(creditosButton);

        creditosButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(creditosSubScene);
        });
    }

    public void criarAjudaButton() {
        CAButton ajudaAButton = new CAButton("AJUDA");
        addMenuButton(ajudaAButton);

        ajudaAButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(ajudaSubScene);
        });
    }

    public void criarSairButton() {
        CAButton sairButton = new CAButton("SAIR");
        addMenuButton(sairButton);
        sairButton.setOnAction((ActionEvent event) -> {
            stagePrincipal.close();
        });
    }

    public void criarSubsScenes() {
        ajudaSubScene = new CASubScene();
        painelPrincipal.getChildren().add(ajudaSubScene);

        creditosSubScene = new CASubScene();
        painelPrincipal.getChildren().add(creditosSubScene);

        escolhaUsuarioSubScene = new CASubScene();
        painelPrincipal.getChildren().add(escolhaUsuarioSubScene);

        criarEscolhaUsuarioSubScene();
    }

    public void mostrarSubScene(CASubScene subscene) {
        if (sceneEsconder != null) {
            sceneEsconder.moveSubScene();
        }
        subscene.moveSubScene();
        sceneEsconder = subscene;
    }

    private void criarEscolhaUsuarioSubScene() {
        escolhaUsuarioSubScene = new CASubScene();
        painelPrincipal.getChildren().add(escolhaUsuarioSubScene);

        InfoLabel escolhaUsuarioLabel = new InfoLabel(" Escolha seu animal");
        escolhaUsuarioLabel.setLayoutX(210);
        escolhaUsuarioLabel.setLayoutY(30);
        escolhaUsuarioSubScene.getPane().getChildren().add(escolhaUsuarioLabel);
        escolhaUsuarioSubScene.getPane().getChildren().add(criarIconeEscolha());
        escolhaUsuarioSubScene.getPane().getChildren().add(criarButtonStart());
    }

    private TilePane criarIconeEscolha() {
        List<PainelEscolhaIcone> iconeList; // Opcoes de escolha de icone
        iconeList = new ArrayList<>();
        TilePane box = new TilePane();

        for (Icone icon : Icone.values()) {
            PainelEscolhaIcone iconeSelecionado;
            iconeSelecionado = new PainelEscolhaIcone(icon);
            
            iconeList.add(iconeSelecionado);
            box.getChildren().add(iconeSelecionado); // Adiciona icones ao box de icones
            
            iconeSelecionado.setOnMouseClicked((MouseEvent event) -> {
                iconeList.forEach((icon1) -> {
                    icon1.setIsCirculoEscolhido(false);
                });
                iconeSelecionado.setIsCirculoEscolhido(true);
                escolhaIcone = iconeSelecionado.getUsuarioIcone();
            });
        }
        box.setHgap(20);
        box.setVgap(20);
        box.setLayoutX(110);
        box.setLayoutY(100);
        return box;
    }

}
