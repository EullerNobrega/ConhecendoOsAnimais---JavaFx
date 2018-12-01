/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
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
        animais.add(new Animal("Javali.", "Sus scrofa.", "Se alimenta de raízes, frutos, pequenos mamíferos, caracóis, minhocas, insetos, entre outros.", "Vive em média de 2 a 10 anos.", "São noturnos, podem percorrer distâncias variáveis, que podem variar de 2 a 14 km/h por noite.", null));
        animais.add(new Animal("Veado-vermelho.", "Cervus elaphus.", "Se alimenta de vegetais.", "Vive em média 20 anos em cativeiro e 13 anos na vida selvagem.", "O veado-vermelho é uma espécie de veado de grande porte do hemisfério norte, distribuído pela Europa, Ásia e norte da África.", null));
        animais.add(new Animal("Esquilo-vermelho.", "Sciurus vulgaris.", "Se alimenta de sementes de árvores, cogumelos, ovos de pássaros, entre outros.", "Vive em média 3 anos na natureza.", "É um animal solitário, tímido e relutante em partilhar comida. No entanto, fora da estação de acasalamento e especialmente no inverno, diversos esquilos-vermelhos podem partilhar um ninho para se manterem quentes.", null));
        animais.add( new Animal("Furão.", "Mustela putorius furo.", "Se alimenta de uva passa, pasta de amendoim e pedaços de cereais.", "Vive em média 6 a 10 anos.", "Ao contrário dos cães e dos gatos, a maioria dos furões quando se encontram perdidos, têm pouco sentido de orientação para retornar ao lar.", null));
        animais.add( new Animal("Foca.", "Phocidae.", "Mamífero, se alimenta principalmente de peixes.", "Vive em média 50 anos.", "As focas se comunicam entre si através de sons graves.", null));
        animais.add(new Animal("Castor-europeu.", "Castor fiber.", "Se alimenta de folhas, plantas aquáticas, cascas de árvores e herbáceas que crescem próximos aos rios.", "Vive em média 20 anos.", "Os castores são roedores anfíbios, o que significa que tem excelentes habilidades de natação, podendo ficar submersos até 15 minutos. ", null));
        animais.add(new Animal("Lontra.", "Lutrinae.", "Carnívoro, se alimenta de peixes, crustáceos, moluscos, aves que ficam na água ou no chão, entre outros.", "Vive em média 25 anos.", "As lontras se enrolam em longos pedaços de algas que crescem no chão até a superfície da água. Elas usam a alga como uma âncora para que possam dormir sem se se preocupar de sair flutuando para longe.", null));
        animais.add(new Animal("Bisonte-europeu.", "Bison bonasus.", "Herbívoro, se alimenta de cascas de árvores.", "Vive em média 30 a 50 anos.", "Pode medir até 1,80 m de altura, 3 m de comprimento e pesar 1 tonelada.", null));
        animais.add(new Animal("Pato-de-rabo-alçado.", "Oxyura leucocephala.", "Se alimentam de vegetação aquática, moluscos e pequenos invertebrados.", "Vive em média 15 anos.", "O pato é a única ave capaz de voar, nadar e andar razoavelmente. Além disso, o pato é o único animal que consegue dormir com metade do cérebro e manter a outra em alerta.", null));
        animais.add(new Animal("Ganso-de-bico-curto.", "Anser brachyrhynchus.", "Se alimenta de capim, folhas verdes, legumes, frutas, grãos e batata.", "Vive em média 50 anos em cativeiro.", "Assim como todos os gansos, podem ser tão leais e companheiros como cão e gato e também podem ser ótimos animais de guarda por causa da sua territorialidade.", null));
    }

}
