package model;

/**
 *
 * @author Euller
 */
public enum Icone {
    ELEFANTE("resources/imagens/users/elephant.png"),
    GIRAFA("resources/imagens/users/giraffe.png"),
    HIPOPOTAMO("resources/imagens/users/hippo.png"),
    MACACO("resources/imagens/users/monkey.png"),
    PANDA("resources/imagens/users/panda.png"),
    ARARA("resources/imagens/users/parrot.png"),
    PINGUIM("resources/imagens/users/penguin.png"),
    PORCO("resources/imagens/users/pig.png"),
    COELHO("resources/imagens/users/rabbit.png"),
    COBRA("resources/imagens/users/snake.png");

    private final String urlUserIcon;

    private Icone(String urlUserIcon) {
        this.urlUserIcon = urlUserIcon;
    }

    public String getUrlUserIcon() {
        return urlUserIcon;
    }

}
