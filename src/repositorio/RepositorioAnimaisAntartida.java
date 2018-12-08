package repositorio;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Animal;

/**
 *
 * @author Euller Nóbrega
 */
public class RepositorioAnimaisAntartida extends AbstractRepositorio {

    private ArrayList<Animal> animais;

    public RepositorioAnimaisAntartida() {
        init();
    }

    @Override
    public void init() {
        final String pinguim, krill, orca, skua, baleia, rena, coruja, beluga, narval;
        pinguim = "resources/imagens/animais/antartida/pinguim2.png";
        krill = "resources/imagens/animais/antartida/krill2.png";
        orca = "resources/imagens/animais/antartida/orca2.png";
        skua = "resources/imagens/animais/antartida/skua2.png";
        baleia = "resources/imagens/animais/antartida/baleia_franca2.png";
        rena = "resources/imagens/animais/antartida/coruja_neves2.png";
        coruja = "resources/imagens/animais/antartida/coruja_neves2.png";
        beluga = "resources/imagens/animais/antartida/coruja_neves2.png";
        narval = "resources/imagens/animais/antartida/narval2.png";

        Image pinguimImg = new Image(pinguim);
        Image krillImg = new Image(krill);
        Image orcaImg = new Image(orca);
        Image skuaImg = new Image(skua);
        Image baleiaImg = new Image(baleia);
        Image renaImg = new Image(rena);
        Image corujaImg = new Image(coruja);
        Image belugaImg = new Image(beluga);
        Image narvalImg = new Image(narval);

        animais.add(new Animal("Pinguim.", "Spheniscidae.", "Se alimenta de peixes, plâncton e cefalópodes.", "Vive em média 6 a 20 anos.", "Pinguins são muito adaptados à vida marinha. As asas não desenvolvidas são inúteis para voo no ar, porém na água são muito ágeis. Na terra, os pinguins usam a cauda e asas para manter o equilíbrio na postura ereta.", new ImageView(pinguimImg)));
        animais.add(new Animal("Krill.", "Euphausiacea.", "Se alimenta de algas.", "Vive em média 8 meses a 6 anos, dependendo da espécie.", "Passa o dia em profundidades maiores e vai em direção à superfície durante a noite. Quanto maior for a profundidade em que se encontre, menor é a sua atividade.", new ImageView(krillImg)));
        animais.add(new Animal("Orca.", "Orcinus orca.", "Se alimenta de peixes, moluscos, aves, tartarugas, focas, tubarões e baleias.", "Vive em média 17 a 29 anos em cativeiro, na natureza chegam a 80 anos.", "Mesmo tendo fama de “baleias assassinas”, as orcas não agridem humanos. Os únicos incidentes registrados ocorreram quando estes mamíferos estavam em cativeiro.", new ImageView(orcaImg)));
        animais.add(new Animal("Skua.", "Stercorarius.", "Se alimenta de aves pequenas, peixes, vermes, insetos, algas e líquens.", "Vive em média 50 a 60 anos.", "Vive solitário em alto mar e vem para a costa somente na época do acasalamento.", new ImageView(skuaImg)));
        animais.add(new Animal("Baleia franca.", "Eubalaena.", "Se alimenta de pequenos crustáceos, como o krill.", "Vive em média 70 anos.", "É um animal robusto e forte, que pode pesar 100 toneladas. Alcançam entre 13,5 m a 16,5 m de comprimento. ", new ImageView(baleiaImg)));
        animais.add(new Animal("Rena.", "Rangifer tarandus.", "Se alimenta de bambus, folhas de sempre-vivas, ervas rasteiras, ovos, pequenos pássaros e líquenes.", "Vive em média 15 anos.", "Quando nascem, não têm galhos nas cabeças, mas eles começam a crescer com 15 dias de vida.", new ImageView(renaImg)));
        animais.add(new Animal("Coruja-das-neves.", "Bubo scandiacus.", "Se alimenta de lemingues, aves, coelhos, carniça e peixe.", "Vive em média 9 anos.", "Na estação quente, a coruja regula a temperatura estendendo e batendo as asas. Estas aves pousam frequentemente sobre as elevações, com os olhos semicerrados, mas sempre alertas a qualquer ruído.", new ImageView(corujaImg)));
        animais.add(new Animal("Beluga.", "Delphinapterus leucas.", "Se alimenta de peixes, salmão, crustáceos e outros invertebrados do mar.", "Vive em média 35 a 50 anos.", "É uma das menores baleias existentes, mede entre 4 e 6 metros de comprimento e pesa menos de 1200 quilos.", new ImageView(belugaImg)));
        animais.add(new Animal("Narval.", "Monodon monóceros.", "Se alimenta de alabotes, bacalhaus do ártico, chocos, camarão, lula, peixe lobo, entre outros.", "Vive em média 50 anos.", "Conhecido como unicórnio do mar, por parecer ter um chifre saindo do meio de sua testa, que na verdade são os dentes, a presa do narval é oca e pesa 10 quilos, aproximadamente. São raros os casos, mas alguns machos da espécie podem apresentar duas presas.", new ImageView(narvalImg)));
    }

}
