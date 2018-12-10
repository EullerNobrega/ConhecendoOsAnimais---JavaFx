//package Telas;
//
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.TilePane;
//import javafx.stage.Stage;
//import model.Animal;
//import model.AnimalButton;
//import model.CASubSceneAnimal;
//import repositorio.RepositorioAnimaisAmericaSul;
//
///**
// *
// * @author Euller Nóbrega
// */
//public class TelaAmericaSul {
//
//    private AnchorPane americaSulPainel;
//    private TilePane criarButtonsPainel;
//    private Stage menuStage;
//    private Scene americaSulScene;
//    private Stage americaSulStage;
//
//    private CASubSceneAnimal sceneEsconder;
//    private CASubSceneAnimal quatiSc, jacareSc, abroniaSc, jaguatiricaSc, tamanduaSc, ovelhaSc, capivaraSc, condorSc, vicunhaSc, beijaflorSc;
//
//    private final RepositorioAnimaisAmericaSul americaSulDAO;
//
//    private static final int GAME_WIDTH = 1300;
//    private static final int GAME_HEIGHT = 700;
//
//    public TelaAmericaSul() {
//        americaSulDAO = new RepositorioAnimaisAmericaSul().obterInstancia();
//        inicializarStage();
//        criarButtonsPainel = criarButtons();
//        americaSulPainel.getChildren().add(criarButtonsPainel);
//        criarSubsScenes(); // Cria todas as subScenes da tela inicial
//    }
//
//    public void inicializarStage() {
//        americaSulPainel = new AnchorPane();
//        americaSulScene = new Scene(americaSulPainel, GAME_WIDTH, GAME_HEIGHT);
//        americaSulStage = new Stage();
//        americaSulStage.setScene(americaSulScene);
//        americaSulStage.setTitle("Conhecendo os Animais - By : Euller Nóbrega Honorato");
//    }
//
//    public void criarJogoContinente(Stage menuStage) {
//        this.menuStage = menuStage;
//        this.menuStage.hide();
//        americaSulStage.show();
//    }
//
//    public TilePane criarButtons() {
//        TilePane box = new TilePane();
//
//        createButtonAlce(box);
//        createButtonUrsoPolar(box);
//        createButtonDoninha(box);
//        createButtonGamba(box);
//        createButtonGuaxinim(box);
//        createButtonLince(box);
//        createButtonLobo(box);
//        createButtonOnca(box);
//        createButtonRaposa(box);
//        createButtonUrso(box);
//
//        box.setPadding(new Insets(20));
//        box.setHgap(20);
//        box.setVgap(20);
//        return box;
//    }
//
//    public void createButtonAlce(TilePane boxPane) {
//        Animal alce = americaSulDAO.consultar("Alce.");
//        AnimalButton alceButton;
//        alceButton = new AnimalButton(alce.getImagemAnimal());
//        boxPane.getChildren().add(alceButton);
//        alceButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                mostrarSubScene(tamanduaSc);
//            }
//        });
//    }
//
//    public void createButtonUrsoPolar(TilePane boxPane) {
//        Animal urso = americaSulDAO.consultar("Urso-polar.");
//        AnimalButton ursoPolarButton;
//        ursoPolarButton = new AnimalButton(urso.getImagemAnimal());
//        boxPane.getChildren().add(ursoPolarButton);
//        ursoPolarButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                mostrarSubScene(beijaflorSc);
//            }
//        });
//    }
//
//    public void createButtonDoninha(TilePane boxPane) {
//        Animal doninha = americaSulDAO.consultar("Doninha-anã.");
//        AnimalButton doninhaButton;
//        doninhaButton = new AnimalButton(doninha.getImagemAnimal());
//        boxPane.getChildren().add(doninhaButton);
//        doninhaButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                mostrarSubScene(vicunhaSc);
//            }
//        });
//    }
//
//    public void createButtonGamba(TilePane boxPane) {
//        Animal gamba = americaSulDAO.consultar("Gambá.");
//        AnimalButton gambaButton;
//        gambaButton = new AnimalButton(gamba.getImagemAnimal());
//        boxPane.getChildren().add(gambaButton);
//        gambaButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                mostrarSubScene(condorSc);
//            }
//        });
//
//    }
//
//    public void createButtonGuaxinim(TilePane boxPane) {
//        Animal guaxinim = americaSulDAO.consultar("Guaxinim.");
//        AnimalButton guaxinimButton;
//        guaxinimButton = new AnimalButton(guaxinim.getImagemAnimal());
//        boxPane.getChildren().add(guaxinimButton);
//        guaxinimButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                mostrarSubScene(capivaraSc);
//            }
//        });
//
//    }
//
//    public void createButtonLince(TilePane boxPane) {
//        Animal lince = americaSulDAO.consultar("Lince.");
//        AnimalButton linceButton;
//        linceButton = new AnimalButton(lince.getImagemAnimal());
//        boxPane.getChildren().add(linceButton);
//        linceButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                mostrarSubScene(ovelhaSc);
//            }
//        });
//
//    }
//
//    public void createButtonLobo(TilePane boxPane) {
//        Animal lobo = americaSulDAO.consultar("Lobo.");
//        AnimalButton loboButton;
//        loboButton = new AnimalButton(lobo.getImagemAnimal());
//        boxPane.getChildren().add(loboButton);
//        loboButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                mostrarSubScene(abroniaSc);
//            }
//        });
//
//    }
//
//    public void createButtonOnca(TilePane boxPane) {
//        Animal onca = americaSulDAO.consultar("Onça-parda.");
//        AnimalButton oncaButton;
//        oncaButton = new AnimalButton(onca.getImagemAnimal());
//        boxPane.getChildren().add(oncaButton);
//        oncaButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                mostrarSubScene(jaguatiricaSc);
//            }
//        });
//    }
//
//    public void createButtonRaposa(TilePane boxPane) {
//        Animal alce = americaSulDAO.consultar("Raposa-vermelha.");
//        AnimalButton raposaButton;
//        raposaButton = new AnimalButton(alce.getImagemAnimal());
//        boxPane.getChildren().add(raposaButton);
//        raposaButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                mostrarSubScene(quatiSc);
//            }
//        });
//    }
//
//    public void createButtonUrso(TilePane boxPane) {
//        Animal urso = americaSulDAO.consultar("Urso-pardo.");
//        AnimalButton ursoButton;
//        ursoButton = new AnimalButton(urso.getImagemAnimal());
//        boxPane.getChildren().add(ursoButton);
//        ursoButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                mostrarSubScene(beijaflorSc);
//            }
//        });
//    }
//
//    public void criarSubsScenes() {
//        Animal quati = americaSulDAO.consultar("Quati-de-cauda-anelada.");
//        quatiSc = new CASubSceneAnimal(quati);
//        americaSulPainel.getChildren().add(quatiSc);
//
//        Animal jacare = americaSulDAO.consultar("Jacaré-do-pantanal.");
//        jacareSc = new CASubSceneAnimal(jacare);
//        americaSulPainel.getChildren().add(jacareSc);
//
//        Animal abronia = americaSulDAO.consultar("Abronia (lagarto).");
//        abroniaSc = new CASubSceneAnimal(abronia);
//        americaSulPainel.getChildren().add(abroniaSc);
//
//        Animal jaguatirica = americaSulDAO.consultar("Jaguatirica.");
//        jaguatiricaSc = new CASubSceneAnimal(jaguatirica);
//        americaSulPainel.getChildren().add(jaguatiricaSc);
//
//        Animal tamandua = americaSulDAO.consultar("Tamanduá-bandeira.");
//        tamanduaSc = new CASubSceneAnimal(tamandua);
//        americaSulPainel.getChildren().add(tamanduaSc);
//
//        Animal ovelha = americaSulDAO.consultar("Ovelha.");
//        ovelhaSc = new CASubSceneAnimal(ovelha);
//        americaSulPainel.getChildren().add(ovelhaSc);
//
//        Animal capivara = americaSulDAO.consultar("Capivara.");
//        capivaraSc = new CASubSceneAnimal(capivara);
//        americaSulPainel.getChildren().add(capivaraSc);
//
//        Animal condor = americaSulDAO.consultar("Condor-dos-andes.");
//        condorSc = new CASubSceneAnimal(condor);
//        americaSulPainel.getChildren().add(condorSc);
//
//        Animal vicunha = americaSulDAO.consultar("Vicunha.");
//        vicunhaSc = new CASubSceneAnimal(vicunha);
//        americaSulPainel.getChildren().add(vicunhaSc);
//
//        Animal beijaflor = americaSulDAO.consultar("Beija-flor.");
//        beijaflorSc = new CASubSceneAnimal(beijaflor);
//        americaSulPainel.getChildren().add(beijaflorSc);
//
//    }
//
//    public void mostrarSubScene(CASubSceneAnimal subscene) {
//        if (sceneEsconder != null) {
//            sceneEsconder.moveSubScene();
//        }
//        subscene.moveSubScene();
//        sceneEsconder = subscene;
//    }
//
//}
