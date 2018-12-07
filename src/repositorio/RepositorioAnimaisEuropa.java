package repositorio;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Animal;

/**
 *
 * @author Euller Nóbrega
 */
public class RepositorioAnimaisEuropa extends AbstractRepositorio {

    private ArrayList<Animal> animais;

    public RepositorioAnimaisEuropa() {
        init();
    }

    @Override
    public void init() {
        final String javali, veado, esquilo, furao, foca, castor, lontra, bisonte, pato, ganso;
        javali = "resources/imagens/animais/europa/javali2.png";
        veado = "resources/imagens/animais/europa/veado_vermelho2.png";
        esquilo = "resources/imagens/animais/europa/esquilo_vermelho2.png";
        furao = "resources/imagens/animais/europa/furao2.png";
        foca = "resources/imagens/animais/europa/foca2.png";
        castor = "resources/imagens/animais/europa/castor_europeu2.png";
        lontra = "resources/imagens/animais/europa/lontra2.png";
        bisonte = "resources/imagens/animais/europa/bisonte_europeu.png";
        pato = "resources/imagens/animais/europa/pato_rabo_alcado.png";
        ganso = "resources/imagens/animais/europa/ganso_bico_curot2.png";

        Image javaliImg = new Image(javali);
        Image veadoImg = new Image(veado);
        Image esquiloImg = new Image(esquilo);
        Image furaoImg = new Image(furao);
        Image focaImg = new Image(foca);
        Image castorImg = new Image(castor);
        Image lontraImg = new Image(lontra);
        Image bisonteImg = new Image(bisonte);
        Image patoImg = new Image(pato);
        Image gansoImg = new Image(ganso);

        animais.add(new Animal("Javali.", "Sus scrofa.", "Se alimenta de raízes, frutos, pequenos mamíferos, caracóis, minhocas, insetos, entre outros.", "Vive em média de 2 a 10 anos.", "São noturnos, podem percorrer distâncias variáveis, que podem variar de 2 a 14 km/h por noite.", new ImageView(javaliImg)));
        animais.add(new Animal("Veado-vermelho.", "Cervus elaphus.", "Se alimenta de vegetais.", "Vive em média 20 anos em cativeiro e 13 anos na vida selvagem.", "O veado-vermelho é uma espécie de veado de grande porte do hemisfério norte, distribuído pela Europa, Ásia e norte da África.", new ImageView(veadoImg)));
        animais.add(new Animal("Esquilo-vermelho.", "Sciurus vulgaris.", "Se alimenta de sementes de árvores, cogumelos, ovos de pássaros, entre outros.", "Vive em média 3 anos na natureza.", "É um animal solitário, tímido e relutante em partilhar comida. No entanto, fora da estação de acasalamento e especialmente no inverno, diversos esquilos-vermelhos podem partilhar um ninho para se manterem quentes.", new ImageView(esquiloImg)));
        animais.add(new Animal("Furão.", "Mustela putorius furo.", "Se alimenta de uva passa, pasta de amendoim e pedaços de cereais.", "Vive em média 6 a 10 anos.", "Ao contrário dos cães e dos gatos, a maioria dos furões quando se encontram perdidos, têm pouco sentido de orientação para retornar ao lar.", new ImageView(furaoImg)));
        animais.add(new Animal("Foca.", "Phocidae.", "Mamífero, se alimenta principalmente de peixes.", "Vive em média 50 anos.", "As focas se comunicam entre si através de sons graves.", new ImageView(focaImg)));
        animais.add(new Animal("Castor-europeu.", "Castor fiber.", "Se alimenta de folhas, plantas aquáticas, cascas de árvores e herbáceas que crescem próximos aos rios.", "Vive em média 20 anos.", "Os castores são roedores anfíbios, o que significa que tem excelentes habilidades de natação, podendo ficar submersos até 15 minutos. ", new ImageView(castorImg)));
        animais.add(new Animal("Lontra.", "Lutrinae.", "Carnívoro, se alimenta de peixes, crustáceos, moluscos, aves que ficam na água ou no chão, entre outros.", "Vive em média 25 anos.", "As lontras se enrolam em longos pedaços de algas que crescem no chão até a superfície da água. Elas usam a alga como uma âncora para que possam dormir sem se se preocupar de sair flutuando para longe.", new ImageView(lontraImg)));
        animais.add(new Animal("Bisonte-europeu.", "Bison bonasus.", "Herbívoro, se alimenta de cascas de árvores.", "Vive em média 30 a 50 anos.", "Pode medir até 1,80 m de altura, 3 m de comprimento e pesar 1 tonelada.", new ImageView(bisonteImg)));
        animais.add(new Animal("Pato-de-rabo-alçado.", "Oxyura leucocephala.", "Se alimentam de vegetação aquática, moluscos e pequenos invertebrados.", "Vive em média 15 anos.", "O pato é a única ave capaz de voar, nadar e andar razoavelmente. Além disso, o pato é o único animal que consegue dormir com metade do cérebro e manter a outra em alerta.", new ImageView(patoImg)));
        animais.add(new Animal("Ganso-de-bico-curto.", "Anser brachyrhynchus.", "Se alimenta de capim, folhas verdes, legumes, frutas, grãos e batata.", "Vive em média 50 anos em cativeiro.", "Assim como todos os gansos, podem ser tão leais e companheiros como cão e gato e também podem ser ótimos animais de guarda por causa da sua territorialidade.", new ImageView(gansoImg)));
    }

}
