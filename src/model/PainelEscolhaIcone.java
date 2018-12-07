package model;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author Euller
 */
public class PainelEscolhaIcone extends VBox {

    private final ImageView circuloImagem;
    private final ImageView usuarioIconeImagem;

    private final String circuloNaoEscolhido = "resources/imagens/users/grey_circle.png";
    private final String circuloEscolhido = "resources/imagens/users/blue_boxTick.png";

    private final Icone usuarioIcone;
    private boolean isCirculoEscolhido;

    public PainelEscolhaIcone(Icone userIcon) {
        circuloImagem = new ImageView(circuloNaoEscolhido);
        usuarioIconeImagem = new ImageView(userIcon.getUrlUserIcon());
        this.usuarioIcone = userIcon;
        isCirculoEscolhido = false;
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        this.getChildren().add(circuloImagem);
        this.getChildren().add(usuarioIconeImagem);
        usuarioIconeImagem.setFitHeight(100);
        usuarioIconeImagem.setFitWidth(100);
    }

    public Icone getUsuarioIcone() {
        return usuarioIcone;
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
