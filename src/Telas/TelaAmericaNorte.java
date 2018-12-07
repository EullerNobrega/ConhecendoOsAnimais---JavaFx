package Telas;

import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Animal;
import model.AnimalButton;
import repositorio.RepositorioAnimaisAmericaNorte;

/**
 *
 * @author Euller Nóbrega
 */
class TelaAmericaNorte {

    private AnchorPane americaNortePane;
    private Stage menuStage;
    private Scene americaNorteScene;
    private Stage americaNorteStage;

    private ArrayList<ImageView> animaisAmericaNorte;
    private final RepositorioAnimaisAmericaNorte americaNorteDAO;

    private static final int GAME_WIDTH = 1300;
    private static final int GAME_HEIGHT = 700;

    public TelaAmericaNorte() {
        americaNorteDAO = new RepositorioAnimaisAmericaNorte().obterInstancia();
        inicializarStage();
    }

    public void inicializarStage() {
        americaNortePane = new AnchorPane();
        americaNorteScene = new Scene(americaNortePane, GAME_WIDTH, GAME_HEIGHT);
        americaNorteStage = new Stage();
        americaNorteStage.setScene(americaNorteScene);
        americaNorteStage.setTitle("Conhecendo os Animais - By : Euller Nóbrega Honorato");
    }
    
     public void criarJogoContinente(Stage menuStage) {
        this.menuStage = menuStage;
        this.menuStage.hide();
//        criarBackGround();
//        criarElementosJogo();
        americaNorteStage.show();
    }

    public void animais() {
        ArrayList<Animal> animais = americaNorteDAO.getAnimais();
        for (Animal a : animais) {

        }
    }

    public void createButtons() {
        createButtonAlce();
        createButtonCobra();
        createButtonDoninha();
        createButtonGamba();
        createButtonGuaxinim();
        createButtonLince();
        createButtonLobo();
        createButtonOnca();
        createButtonRaposa();
        createButtonUrso();
    }

    public void createButtonAlce() {
        Animal alce = americaNorteDAO.consultar("alce");
        AnimalButton alceButton;
        alceButton = new AnimalButton(alce.getImagemAnimal());
    }

    public void createButtonCobra() {

    }

    public void createButtonDoninha() {

    }

    public void createButtonGamba() {

    }

    public void createButtonGuaxinim() {

    }

    public void createButtonLince() {
        
    }

    public void createButtonLobo() {
        
    }

    public void createButtonOnca() {
        
    }

    public void createButtonRaposa() {
        
    }

    public void createButtonUrso() {
        
    }

    private void criarBackGround() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void criarElementosJogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
