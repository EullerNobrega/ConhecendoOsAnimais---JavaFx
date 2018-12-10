package model;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author Euller Nóbrega
 */
public class PainelEscolhaComida extends VBox {

    private final ImageView circuloImagem;
    private final ImageView comidaIconeImagem;

    private final String circuloNaoEscolhido = "resources/imagens/users/grey_circle.png";
    private final String circuloEscolhido = "resources/imagens/users/blue_boxTick.png";

    private final Comida comidaIcone;
    private boolean isCirculoEscolhido;

    public PainelEscolhaComida(Comida comida) {
        this.circuloImagem = new ImageView(circuloNaoEscolhido);
        this.comidaIconeImagem = new ImageView(comida.getUrlComidaIcon());
        this.comidaIcone = comida;
        this.isCirculoEscolhido = false;
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.getChildren().add(circuloImagem);
        this.getChildren().add(comidaIconeImagem);
        comidaIconeImagem.setFitHeight(100);
        comidaIconeImagem.setFitWidth(100);
    }

    public Comida getComidaIcone() {
        return comidaIcone;
    }

    public boolean isCirculoEscolhido() {
        return isCirculoEscolhido;
    }

    public void setIsCirculoEscolhido(boolean isCircleChoosen) {
        this.isCirculoEscolhido = isCircleChoosen;
        String imageToSet = this.isCirculoEscolhido ? circuloEscolhido : circuloNaoEscolhido;
        circuloImagem.setImage(new Image(imageToSet));
    }

}
