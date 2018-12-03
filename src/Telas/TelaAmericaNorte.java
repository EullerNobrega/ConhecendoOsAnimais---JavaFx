/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    private AnchorPane gamePane;
    private Scene gameScene;
    private Stage gameStage;

    private ArrayList<ImageView> animaisAmericaNorte;
    private RepositorioAnimaisAmericaNorte americaNorteDao;

    private static final int GAME_WIDTH = 1300;
    private static final int GAME_HEIGHT = 700;

    public TelaAmericaNorte() {
        initializeStage();
        americaNorteDao = new RepositorioAnimaisAmericaNorte();
    }

    public void initializeStage() {
        gamePane = new AnchorPane();
        gameScene = new Scene(gamePane, GAME_WIDTH, GAME_HEIGHT);
        gameStage = new Stage();
        gameStage.setScene(gameScene);
        gameStage.setTitle("Conhecendo os Animais - By : Euller Nóbrega Honorato");
    }

    public void animais() {
        ArrayList<Animal> animais = americaNorteDao.getAnimais();
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
        Animal alce = americaNorteDao.consultar("alce");
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

}
