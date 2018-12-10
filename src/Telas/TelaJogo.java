package Telas;

import java.io.File;
import model.Icone;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.CAContButton;
import model.CadastrarPontosArquivo;
import model.ImgContinentes;
import model.InfoLabelGame;

/**
 *
 * @author Euller
 */
public class TelaJogo {

    private AnchorPane gamePainel;
    private Scene gameScene;
    private Stage gameStage;
    private static TelaJogo instancia;

    private static final int GAME_WIDTH = 1300;
    private static final int GAME_HEIGHT = 700;

    private Stage menuStage;
    private ImageView usuarioIcone;

    private InfoLabelGame pontosLabel;

    private CAContButton americaDoNorte, americaDoSul, europa, africa, asia, oceania, antartida;

    private boolean isSetaEsquerdaPressionada;
    private boolean isSetaDireitaPressionada;
    private boolean isSetaCimaPressionada;
    private boolean isSetaBaixoPressionada;
    private int angulo;
    private CadastrarPontosArquivo cadastro;

    public static int pontuacao;

    private final static String BACKGROUND_IMAGE = "resources/imagens/animais_mundis.jpg";
    private AnimationTimer gameTimer;

    public TelaJogo() {
        inicializarStage();
        criarSetasListeners();
        cadastro = new CadastrarPontosArquivo();
        pontuacao = iniciaPontuacao();
    }
    
    public int iniciaPontuacao(){
        
        String nomeArq = cadastro.getNomeArq();
        File arq = new File(nomeArq);
        if(arq.exists()){
            int pontos = cadastro.ler();
            return pontos;
        }
        return 0;
    }

    public TelaJogo obterInstancia() {
        if (instancia == null) {
            instancia = new TelaJogo();
        }
        return instancia;
    }

    private void inicializarStage() {
        gamePainel = new AnchorPane();
        gameScene = new Scene(gamePainel, GAME_WIDTH, GAME_HEIGHT);
        gameStage = new Stage();
        gameStage.setScene(gameScene);
        gameStage.setTitle("Conhecendo os Animais - By : Euller Nóbrega Honorato");
    }

    public void criarNovoJogo(Stage menuStage, Icone iconeUsuarioEscolhido) {
        this.menuStage = menuStage;
        this.menuStage.hide();
        criarBackGround();
        criarLoopJogo();
        criarElementosJogo();
        criarUsuarioIcone(iconeUsuarioEscolhido);
        gameStage.show();
    }

    public void criarBackGround() {
        Image backgroundImage = new Image(BACKGROUND_IMAGE);  // Imagem tela Inicio
        Canvas canvas = new Canvas(GAME_WIDTH, GAME_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gamePainel.getChildren().add(canvas);
        gc.setFill(Color.rgb(48, 175, 240));
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage(backgroundImage, 0, 0); // Desenha a imagem escolhida
    }

    public void criarUsuarioIcone(Icone choosenUserIcon) {
        usuarioIcone = new ImageView(choosenUserIcon.getUrlUserIcon());
        usuarioIcone.setLayoutY(585);
        usuarioIcone.setLayoutX(7);
        usuarioIcone.setFitHeight(50);
        usuarioIcone.setFitWidth(50);
        gamePainel.getChildren().add(usuarioIcone);
    }

    public void criarElementosJogo() {
        criarAmericaSulButton();
        criarAmericaNorteButton();
        criarAfricaButton();
        criarEuropaButton();
        criarAsiaButton();
        criarOceaniaButton();
        criarAntartidaButton();

    }

    private void criarLoopJogo() {
        gameTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                movimentarIcone();
                abreContinente();
                pontosLabel = new InfoLabelGame("Pontos: " + pontuacao);
                pontosLabel.setLayoutX(1150);
                pontosLabel.setLayoutY(624);
                gamePainel.getChildren().add(pontosLabel);
            }
        };
        gameTimer.start();
    }

    private void criarSetasListeners() {
        gameScene.setOnKeyPressed((KeyEvent event) -> {
            if (event.getCode() == KeyCode.LEFT) {
                isSetaEsquerdaPressionada = true;
            } else if (event.getCode() == KeyCode.RIGHT) {
                isSetaDireitaPressionada = true;
            } else if (event.getCode() == KeyCode.UP) {
                isSetaCimaPressionada = true;
            } else if (event.getCode() == KeyCode.DOWN) {
                isSetaBaixoPressionada = true;
            }
        });
        gameScene.setOnKeyReleased((KeyEvent event) -> {
            if (event.getCode() == KeyCode.LEFT) {
                isSetaEsquerdaPressionada = false;
            } else if (event.getCode() == KeyCode.RIGHT) {
                isSetaDireitaPressionada = false;
            } else if (event.getCode() == KeyCode.UP) {
                isSetaCimaPressionada = false;
            } else if (event.getCode() == KeyCode.DOWN) {
                isSetaBaixoPressionada = false;
            }
        });
    }

    private void criarAmericaSulButton() {
        Image americaSul = new Image(ImgContinentes.AMERICA_DO_SUL.getUrlImgCont());
        americaDoSul = new CAContButton(americaSul);
        gamePainel.getChildren().add(americaDoSul);

    }

    private void criarAmericaNorteButton() {
        Image americaNorte = new Image(ImgContinentes.AMERICA_DO_NORTE.getUrlImgCont());
        americaDoNorte = new CAContButton(americaNorte);
        gamePainel.getChildren().add(americaDoNorte);
    }

    private void criarAfricaButton() {
        Image africa_ = new Image(ImgContinentes.AFRICA.getUrlImgCont());
        africa = new CAContButton(africa_);
        gamePainel.getChildren().add(africa);
    }

    private void criarEuropaButton() {
        Image europa_ = new Image(ImgContinentes.EUROPA.getUrlImgCont());
        europa = new CAContButton(europa_);
        gamePainel.getChildren().add(europa);
    }

    private void criarAsiaButton() {
        Image asia_ = new Image(ImgContinentes.ASIA.getUrlImgCont());
        asia = new CAContButton(asia_);
        gamePainel.getChildren().add(asia);
    }

    private void criarOceaniaButton() {
        Image oceania_ = new Image(ImgContinentes.OCEANIA.getUrlImgCont());
        oceania = new CAContButton(oceania_);
        gamePainel.getChildren().add(oceania);
    }

    private void criarAntartidaButton() {
        Image antartida_ = new Image(ImgContinentes.ANTARTIDA.getUrlImgCont());
        antartida = new CAContButton(antartida_);
        gamePainel.getChildren().add(antartida);
    }

    private boolean verificaPosicao(double xIni, double xFim, double yIni, double yFim, CAContButton cont) {

        if ((usuarioIcone.getLayoutX() >= xIni && usuarioIcone.getLayoutX() <= xFim) && (usuarioIcone.getLayoutY() >= yIni && usuarioIcone.getLayoutY() <= yFim)) {
            cont.setIconeEntrou(usuarioIcone);
            return true;
        } else {
            cont.setIconeSaiu(usuarioIcone);
            return false;
        }
    }

    public void movimentarIcone() {

        if (isSetaEsquerdaPressionada && !isSetaDireitaPressionada && !isSetaBaixoPressionada && !isSetaCimaPressionada) { // Aperta tecla para esquerda
            if (angulo > -30) {
                angulo -= 5;
            }
            usuarioIcone.setRotate(angulo);
            if (usuarioIcone.getLayoutX() > 0) {
                usuarioIcone.setLayoutX(usuarioIcone.getLayoutX() - 5);
            }
        }

        if (isSetaDireitaPressionada && !isSetaEsquerdaPressionada && !isSetaBaixoPressionada && !isSetaCimaPressionada) { // Aperta tecla para direita
            if (angulo < 30) {
                angulo += 5;
            }
            usuarioIcone.setRotate(angulo);
            if (usuarioIcone.getLayoutX() < 1250) {
                usuarioIcone.setLayoutX(usuarioIcone.getLayoutX() + 5);
            }
        }

        if (isSetaBaixoPressionada && !isSetaDireitaPressionada && !isSetaCimaPressionada && !isSetaEsquerdaPressionada) { // Aperta tecla para baixo
            if (usuarioIcone.getLayoutY() < 650) {
                usuarioIcone.setLayoutY(usuarioIcone.getLayoutY() + 5);
            }
        }

        if (isSetaCimaPressionada && !isSetaEsquerdaPressionada && !isSetaBaixoPressionada && !isSetaDireitaPressionada) { // Aperta tecla para cima
            if (usuarioIcone.getLayoutY() > 0) {
                usuarioIcone.setLayoutY(usuarioIcone.getLayoutY() - 5);
            }
        }

        if (!isSetaDireitaPressionada && !isSetaEsquerdaPressionada && !isSetaBaixoPressionada && !isSetaCimaPressionada) {
            if (angulo < 0) {
                angulo += 5;
            } else if (angulo > 0) {
                angulo -= 5;
            }
            usuarioIcone.setRotate(angulo);
        }

        if (isSetaEsquerdaPressionada && isSetaDireitaPressionada && isSetaBaixoPressionada && isSetaCimaPressionada) {
            if (angulo < 0) {
                angulo += 5;
            } else if (angulo > 0) {
                angulo -= 5;
            }
            usuarioIcone.setRotate(angulo);
        }
    }

    public void abreContinente() {
        if (verificaPosicao(757, 1111, 60, 291, asia)) { // xIni, xFim, yIni, yFim (dimensoes do cont)
            asia.setOnKeyPressed((KeyEvent event) -> {
                if (event.equals(KeyCode.ENTER)) {
                    System.out.println("Abrindo tela de asia");
                    TelaAsia telaAsia = new TelaAsia();
                }
            });
        }

        if (verificaPosicao(1027, 1162, 378, 483, oceania)) {
            oceania.setOnKeyPressed((KeyEvent event) -> {
                if (event.equals(KeyCode.ENTER)) {
                    System.out.println("Abrindo tela de oceania");
                    TelaOceania telaOceania = new TelaOceania();
                }
            });
        }
        if (verificaPosicao(139, 1099, 597, 651, antartida)) {
            antartida.setOnKeyPressed((KeyEvent event) -> {
                if (event.equals(KeyCode.ENTER)) {
                    System.out.println("Abrindo tela de antartida");
                    TelaAntartida telaAntartida = new TelaAntartida();
                }
            });
        }
        if (verificaPosicao(583, 700, 105, 210, europa)) {
            europa.setOnKeyPressed((KeyEvent event) -> {
                if (event.equals(KeyCode.ENTER)) {
                    System.out.println("Abrindo tela de europa");
                    TelaEuropa telaEuropa = new TelaEuropa();
                }
            });
        }
        if (verificaPosicao(547, 712, 267, 460, africa)) {
            africa.setOnKeyPressed((KeyEvent event) -> {
                if (event.equals(KeyCode.ENTER)) {
                    System.out.println("Abrindo tela de africa");
                    TelaAfrica telaAfrica = new TelaAfrica();
                }
            });
        }

        if (verificaPosicao(58, 391, 24, 303, americaDoNorte)) {
            americaDoNorte.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    System.out.println("Abrindo tela de americaDoNorte");
                    TelaAmericaNorte telaAmericaNorte = new TelaAmericaNorte(obterInstancia());
                    System.out.println("Abriu");
                    telaAmericaNorte.criarJogoContinente(menuStage);
                }
            });

            americaDoNorte.setOnKeyPressed((KeyEvent event) -> {
                System.out.println("Entrou");
                if (event.getCode() == (KeyCode.ENTER)) {
                    System.out.println("Abrindo tela de americaDoNorte");
                    TelaAmericaNorte telaAmericaNorte = new TelaAmericaNorte(obterInstancia());
                    telaAmericaNorte.criarJogoContinente(menuStage);
                }
            });
        }

        if (verificaPosicao(292, 418, 363, 543, americaDoSul)) {
            americaDoSul.setOnKeyReleased((KeyEvent event) -> {
                System.out.println("Entrou");
                if (event.getCode() == KeyCode.ENTER) {
                    System.out.println("Abrindo tela de americaDoSul");
//                    TelaAmericaSul telaAmericaSul = new TelaAmericaSul();
                }
            });

        }
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    

}
