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
public class RepositorioAnimaisOceania extends AbstractRepositorio {

    private ArrayList<Animal> animais;

    public RepositorioAnimaisOceania() {
        init();
    }

    @Override
    public void init() {
        animais.add(new Animal("Diabo-da-tasmânia.", "Sarcophilus harrisii.", "Carnívoro, se alimenta de vertebrados, invertebrados, frutos e plantas.", "Vive em média 5 a 6 anos.", "O diabo-da-tasmânia possui uma aparência superficial de urso, exceto pela cauda. Possui porte robusto, com uma cabeça curta, larga e musculosa, focinho curto e orelhas arredondadas.", null));
        animais.add(new Animal("Cisne negro.", "Cygnus atratus.", "Se alimenta de vegetação aquática.", "Vive em média 25 anos.", "Ao contrário de muitas outras aves aquáticas, os cisnes negros não têm hábitos migratórios. Passam a sua vida no local onde nasceram.", null));
        animais.add(new Animal("Coala.", "Phascolarctos cinereus.", "Se alimenta de folhas de eucalipto.", "Vive em média 13 a 18 anos na natureza.", "Por volta dos cinco meses e meio, o coala começa a sair do seu tranquilo abrigo, mas não se afasta muito da mãe e ao primeiro sinal de perigo, torna a entrar ou então chora.", null));
        animais.add(new Animal("Canguru.", "Macropus giganteus.", "Se alimenta de frutas e vegetais.", "Vive em média 18 anos.", "Os cangurus têm tendência para preferir a mão esquerda à direita quando realizam tarefas, seja para se alimentarem, limparem ou se apoiarem.", null));
        animais.add(new Animal("Elefante-marinho.", "Mirounga spp.", "Se alimenta de lulas, sépias, pequenos crustáceos, polvos e raias.", "Vive em média 20 anos.", "Os elefantes-marinhos passam cerca de 80% das suas vidas a nadar nos oceanos, podem ficar até 80 minutos sem respirar e mergulhar até aos 1700 metros de profundidade.", null));
        animais.add(new Animal("Cacatua.", "Cacatuidae.", "Se alimenta de vegetais, sementes, grãos e castanhas.", "Vive em média 30 a 80 anos.", "Imitadora da fala humana, capaz de fazer acrobacias e se afeiçoar às pessoas, além de elegante e vistosa, esta ave vem conquistando espaço como companheira de estimação. ", null));
        animais.add(new Animal("Periquito-australiano.", "Melopsittacus undulatus.", "Se alimenta de sementes.", "Vive em média 5 a 10 anos em cativeiro.", "Os pontos pretos na garganta do periquito são capazes de refletir raios UV e podem ser usados para distinguir as aves entre si.", null));
        animais.add(new Animal("Equidna.", "Tachyglossidae.", "Se alimenta de insetos e vermes.", "Vive em média 50 anos em cativeiro.", "A equidna consegue escavar grandes buracos (tocas) em um tempo muito curto, cerca de 2 a 3 minutos.", null));
        animais.add(new Animal("Ornitorrinco.", "Ornithorhynchus anatinus.", "Carnívoros, se alimenta de anelídeos, larvas de insetos aquáticos, camarões de água doce, girinos, caramujos, lagostins de água doce e pequenos peixes.", "Vive em média 17 anos em cativeiro.", "O ornitorrinco não tem estômago.", null));
        animais.add(new Animal("Vombate.", "Vombatidae.", "Se alimenta de gramíneas, ciperáceas, ervas, cascas de árvores e raízes.", "Vive em média 15 anos.", "Os vombates cavam sistemas de tocas e túneis com seus dentes incisivos semelhantes aos dos roedores e com suas poderosas garras.", null));
    }

}
