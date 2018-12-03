package model;

/**
 *
 * @author Euller Nóbrega
 */
public enum ImgContinentes {
    AMERICA_DO_SUL("resources/imagens/AmericaSul.png"),
    AMERICA_DO_NORTE("resources/imagens/AmericaNorte.png"),
    AFRICA("resources/imagens/Africa.png"),
    ANTARTIDA("resources/imagens/Antartida.png"),
    ASIA("resources/imagens/Asia.png"),
    OCEANIA("resources/imagens/Oceania.png"),
    EUROPA("resources/imagens/Europa.png"),
    GROELANDIA("resources/imagens/Groelandia.png");
    
    private String urlImgCont;
    
    private ImgContinentes(String urlImgCont){
        this.urlImgCont = urlImgCont;
    }

    public String getUrlImgCont() {
        return urlImgCont;
    }
}
