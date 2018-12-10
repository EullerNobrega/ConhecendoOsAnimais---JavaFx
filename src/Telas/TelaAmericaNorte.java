package Telas;

import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import model.Animal;
import model.AnimalButton;
import model.CAButton;
import model.CASubSceneAnimal;
import model.Comida;
import repositorio.RepositorioAnimaisAmericaNorte;

/**
 *
 * @author Euller Nóbrega
 */
class TelaAmericaNorte {

    private AnchorPane americaNortePainel;
    private TilePane criarButtonsPainel;
    private Stage menuStage;
    private Scene americaNorteScene;
    private Stage americaNorteStage;

    private CASubSceneAnimal sceneEsconder;
    private CASubSceneAnimal raposaSc, ursoSc, loboSc, oncaSc, alceSc, linceSc, guaxinimSc, gambaSc, doninhaSc, ursoPolarSc;
    private List<Comida> loboList, ursoPolarList, guaxinimList, ursoPardoList, raposaVermelhaList, oncaPardaList, linceList, gambaList, doninhaAnaList, alceList;

    private final RepositorioAnimaisAmericaNorte americaNorteDAO;

    private static final int GAME_WIDTH = 1300;
    private static final int GAME_HEIGHT = 700;

    public TelaAmericaNorte() {
        americaNorteDAO = new RepositorioAnimaisAmericaNorte().obterInstancia();
        inicializarStage();
        criarButtonsPainel = criarButtons();
        americaNortePainel.getChildren().add(criarButtonsPainel);
        criarSubsScenes(); // Cria todas as subScenes da tela inicial
    }

    public void inicializarStage() {
        americaNortePainel = new AnchorPane();
        americaNorteScene = new Scene(americaNortePainel, GAME_WIDTH, GAME_HEIGHT);
        americaNorteStage = new Stage();
        americaNorteStage.setScene(americaNorteScene);
        americaNorteStage.setTitle("Conhecendo os Animais - By : Euller Nóbrega Honorato");
    }

    public void criarJogoContinente(Stage menuStage) {
        this.menuStage = menuStage;
        this.menuStage.hide();
        americaNorteStage.show();
    }

    public TilePane criarButtons() {
        TilePane box = new TilePane();

        createButtonAlce(box);
        createButtonUrsoPolar(box);
        createButtonDoninha(box);
        createButtonGamba(box);
        createButtonGuaxinim(box);
        createButtonLince(box);
        createButtonLobo(box);
        createButtonOnca(box);
        createButtonRaposa(box);
        createButtonUrso(box);

        box.setPadding(new Insets(20));
        box.setHgap(20);
        box.setVgap(20);
        return box;
    }

    public void createButtonAlce(TilePane boxPane) {
        Animal alce = americaNorteDAO.consultar("Alce.");
        AnimalButton alceButton;
        alceButton = new AnimalButton(alce.getImagemAnimal());
        boxPane.getChildren().add(alceButton);
        alceButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(alceSc);
        });
    }

    public void createButtonUrsoPolar(TilePane boxPane) {
        Animal urso = americaNorteDAO.consultar("Urso-polar.");
        AnimalButton ursoPolarButton;
        ursoPolarButton = new AnimalButton(urso.getImagemAnimal());
        boxPane.getChildren().add(ursoPolarButton);
        ursoPolarButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(ursoPolarSc);
        });
    }

    public void createButtonDoninha(TilePane boxPane) {
        Animal doninha = americaNorteDAO.consultar("Doninha-anã.");
        AnimalButton doninhaButton;
        doninhaButton = new AnimalButton(doninha.getImagemAnimal());
        boxPane.getChildren().add(doninhaButton);
        doninhaButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(doninhaSc);
        });
    }

    public void createButtonGamba(TilePane boxPane) {
        Animal gamba = americaNorteDAO.consultar("Gambá.");
        AnimalButton gambaButton;
        gambaButton = new AnimalButton(gamba.getImagemAnimal());
        boxPane.getChildren().add(gambaButton);
        gambaButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(gambaSc);
        });

    }

    public void createButtonGuaxinim(TilePane boxPane) {
        Animal guaxinim = americaNorteDAO.consultar("Guaxinim.");
        AnimalButton guaxinimButton;
        guaxinimButton = new AnimalButton(guaxinim.getImagemAnimal());
        boxPane.getChildren().add(guaxinimButton);
        guaxinimButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(guaxinimSc);
        });

    }

    public void createButtonLince(TilePane boxPane) {
        Animal lince = americaNorteDAO.consultar("Lince.");
        AnimalButton linceButton;
        linceButton = new AnimalButton(lince.getImagemAnimal());
        boxPane.getChildren().add(linceButton);
        linceButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(linceSc);
        });

    }

    public void createButtonLobo(TilePane boxPane) {
        Animal lobo = americaNorteDAO.consultar("Lobo.");
        AnimalButton loboButton;
        loboButton = new AnimalButton(lobo.getImagemAnimal());
        boxPane.getChildren().add(loboButton);
        loboButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(loboSc);
        });

    }

    public void createButtonOnca(TilePane boxPane) {
        Animal onca = americaNorteDAO.consultar("Onça-parda.");
        AnimalButton oncaButton;
        oncaButton = new AnimalButton(onca.getImagemAnimal());
        boxPane.getChildren().add(oncaButton);
        oncaButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(oncaSc);
        });
    }

    public void createButtonRaposa(TilePane boxPane) {
        Animal raposa = americaNorteDAO.consultar("Raposa-vermelha.");
        AnimalButton raposaButton;
        raposaButton = new AnimalButton(raposa.getImagemAnimal());
        boxPane.getChildren().add(raposaButton);
        raposaButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(raposaSc);
        });
    }

    public void createButtonUrso(TilePane boxPane) {
        Animal urso = americaNorteDAO.consultar("Urso-pardo.");
        AnimalButton ursoButton;
        ursoButton = new AnimalButton(urso.getImagemAnimal());
        boxPane.getChildren().add(ursoButton);
        ursoButton.setOnAction((ActionEvent event) -> {
            mostrarSubScene(ursoSc);
        });
    }

    public void criarSubsScenes() {
        loboList = new ArrayList<>();
        ursoPolarList = new ArrayList<>();
        guaxinimList = new ArrayList<>();
        ursoPardoList = new ArrayList<>();
        raposaVermelhaList = new ArrayList<>();
        oncaPardaList = new ArrayList<>();
        linceList = new ArrayList<>();
        gambaList = new ArrayList<>();
        doninhaAnaList = new ArrayList<>();
        alceList = new ArrayList<>();

//        Animal raposa = americaNorteDAO.consultar("Raposa-vermelha.");
////        raposaVermelhaList.add(Comida.MOSCA.getUrlComidaIcon());
////        raposaVermelhaList.add(Comida.GRILO.getUrlComidaIcon());
////        raposaVermelhaList.add(Comida.CARNE.getUrlComidaIcon()); // Come esse
////        raposaSc = new CASubSceneAnimal(raposa, raposaVermelhaList);
//        americaNortePainel.getChildren().add(raposaSc);

        Animal urso = americaNorteDAO.consultar("Urso-pardo.");
//        ursoPardoList.add(Comida.PEIXE.getUrlComidaIcon()); // Come esse
        ursoPardoList.add(Comida.PEIXE); // Come esse
//        ursoPardoList.add(Comida.JOANINHA.getUrlComidaIcon());
        ursoPardoList.add(Comida.JOANINHA);
//        ursoPardoList.add(Comida.CEBOLA.getUrlComidaIcon());
        ursoPardoList.add(Comida.CEBOLA);
        ursoSc = new CASubSceneAnimal(urso, ursoPardoList);
        americaNortePainel.getChildren().add(ursoSc);
//
//        Animal lobo = americaNorteDAO.consultar("Lobo.");
//        loboList.add(Comida.PAO.getUrlComidaIcon());
//        loboList.add(Comida.CAMARAO.getUrlComidaIcon());
//        loboList.add(Comida.CARNE.getUrlComidaIcon()); // Come essa
//        loboSc = new CASubSceneAnimal(lobo, loboList);
//        americaNortePainel.getChildren().add(loboSc);
//
//        Animal onca = americaNorteDAO.consultar("Onça-parda.");
//        oncaPardaList.add(Comida.GRAMA.getUrlComidaIcon());
//        oncaPardaList.add(Comida.CARNE.getUrlComidaIcon()); // Come esse
//        oncaPardaList.add(Comida.VEGETAL.getUrlComidaIcon());
//        oncaSc = new CASubSceneAnimal(onca, oncaPardaList);
//        americaNortePainel.getChildren().add(oncaSc);
//
//        Animal alce = americaNorteDAO.consultar("Alce.");
//        alceList.add(Comida.VEGETAL.getUrlComidaIcon()); // Come esse
//        alceList.add(Comida.PIZZA.getUrlComidaIcon());
//        alceList.add(Comida.CARNE.getUrlComidaIcon());
//        alceSc = new CASubSceneAnimal(alce, alceList);
//        americaNortePainel.getChildren().add(alceSc);
//
//        Animal lince = americaNorteDAO.consultar("Lince.");
//        linceList.add(Comida.PAO.getUrlComidaIcon());
//        linceList.add(Comida.CARNE.getUrlComidaIcon()); // Come esse
//        linceList.add(Comida.BANANA.getUrlComidaIcon());
//        linceSc = new CASubSceneAnimal(lince, linceList);
//        americaNortePainel.getChildren().add(linceSc);
//
//        Animal guaxinim = americaNorteDAO.consultar("Guaxinim.");
//        guaxinimList.add(Comida.FOLHA.getUrlComidaIcon()); // Come esse
//        guaxinimList.add(Comida.HAMBURGUER.getUrlComidaIcon());
//        guaxinimList.add(Comida.BAMBOO.getUrlComidaIcon());
//        guaxinimSc = new CASubSceneAnimal(guaxinim, guaxinimList);
//        americaNortePainel.getChildren().add(guaxinimSc);
//
//        Animal gamba = americaNorteDAO.consultar("Gambá.");
//        gambaList.add(Comida.FRANGO.getUrlComidaIcon());
//        gambaList.add(Comida.GRILO.getUrlComidaIcon()); // Come esse
//        gambaList.add(Comida.CAMARAO.getUrlComidaIcon());
//        gambaSc = new CASubSceneAnimal(gamba, gambaList);
//        americaNortePainel.getChildren().add(gambaSc);
//
//        Animal doninha = americaNorteDAO.consultar("Doninha-anã.");
//        doninhaAnaList.add(Comida.RATO.getUrlComidaIcon()); // Come esse
//        doninhaAnaList.add(Comida.HAMBURGUER.getUrlComidaIcon());
//        doninhaAnaList.add(Comida.BANANA.getUrlComidaIcon());
//        doninhaSc = new CASubSceneAnimal(doninha, doninhaAnaList);
//        americaNortePainel.getChildren().add(doninhaSc);
//
//        Animal ursoPolar = americaNorteDAO.consultar("Urso-polar.");
//        ursoPolarList.add(Comida.CEBOLA.getUrlComidaIcon());
//        ursoPolarList.add(Comida.CENOURA.getUrlComidaIcon());
//        ursoPolarList.add(Comida.PEIXE.getUrlComidaIcon()); // Come essa
//        ursoPolarSc = new CASubSceneAnimal(ursoPolar, ursoPolarList);
//        americaNortePainel.getChildren().add(ursoPolarSc);

    }

    public void mostrarSubScene(CASubSceneAnimal subscene) {
        if (sceneEsconder != null) {
            sceneEsconder.moveSubScene();
        }
        subscene.moveSubScene();
        sceneEsconder = subscene;
    }

}
