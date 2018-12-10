package model;

/**
 *
 * @author Euller Nóbrega
 */
public enum Comida {
    BAMBOO("resources/imagens/comidas/bamboo.png"),
    BANANA("resources/imagens/comidas/banana.png"),
    PAO("resources/imagens/comidas/pao.png"),
    CARNE("resources/imagens/comidas/carne.png"),
    CENOURA("resources/imagens/comidas/cenoura.png"),
    FRANGO("resources/imagens/comidas/frango.png"),
    PEIXE("resources/imagens/comidas/peixe.png"),
    FOLHA("resources/imagens/comidas/folha.png"),
    GRAMA("resources/imagens/comidas/grama.png"),
    GRILO("resources/imagens/comidas/grilo.png"),
    HAMBURGUER("resources/imagens/comidas/hamburguer.png"),
    JOANINHA("resources/imagens/comidas/joaninha.png"),
    CEBOLA("resources/imagens/comidas/cebola.png"),
    PIZZA("resources/imagens/comidas/pizza.png"),
    RATO("resources/imagens/comidas/rato.png"),
    VEGETAL("resources/imagens/comidas/vegetal.png"),
    MOSCA("resources/imagens/comidas/mosca.png"),
    CAMARAO("resources/imagens/comidas/camarao.png"),
    FORMIGA("resources/imagens/comidas/formiga.png"),
    FLOR("resources/imagens/comidas/flor.png"),
    CARANGUEJO("resources/imagens/comidas/caranguejo.png");
    
    private final String urlComidaIcon;
    
    private Comida(String urlComidaIcon){
        this.urlComidaIcon = urlComidaIcon;
    }
    
    public String getUrlComidaIcon(){
        return urlComidaIcon;
    }
}
