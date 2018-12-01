/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import javafx.scene.image.Image;
import model.Animal;

/**
 *
 * @author Euller Nóbrega
 */
public class RepositorioAnimaisAmericaNorte extends AbstractRepositorio {

    private ArrayList<Animal> animais;

    public RepositorioAnimaisAmericaNorte() {
        init();
    }

    @Override
    public void init() {
        final String raposa, urso, lobo, onca, alce, lince, guaxinim, gamba, cobra, doninha;
        raposa = "resources/imagens/animais/america_norte/raposa_vermelha.jpg";
        urso = "resources/imagens/animais/america_norte/urso_pardo2.png";
        lobo = "resources/imagens/animais/america_norte/lobo.jpg";
        onca = "resources/imagens/animais/america_norte/onca_parda2.png";
        alce = "resources/imagens/animais/america_norte/alce2.png";
        lince = "resources/imagens/animais/america_norte/lince.jpg";
        guaxinim = "resources/imagens/animais/america_norte/guaxinim2.png";
        gamba = "resources/imagens/animais/america_norte/gamba2.png";
        cobra = "resources/imagens/animais/america_norte/cobra_coral2.png";
        doninha = "resources/imagens/animais/america_norte/doninha_ana2.png";
        
        animais.add(new Animal("Raposa-vermelha.", "Vulpes-vulpes.", "Se alimenta de roedores, aves, insetos, peixes, ovos e frutos.", "Vive em média 9 anos.", "A raposa-vermelha vive em grupos formados em sua maioria por um macho adulto e várias fêmeas. Vivem em tocas protegidas pela vegetação escavadas por elas mesmas, ou em antigas tocas de coelhos. O tamanho das raposas dessa espécie varia de 90 cm a 1,38 m de comprimento, da cabeça à extremidade da cauda. Os machos pesam entre 6 e 10 kg, e as fêmeas, entre 4 e 8 kg.", new Image(raposa)));
        animais.add(new Animal("Urso-pardo.", "Ursus arctos.", "Se alimenta de pequenos roedores, mariposas, larvas, frutas silvestres, mel e grandes animais como cervos e alces.", "Vive em média 25 a 30 anos.", "O urso pardo é o mais variável em tamanho dentre todos os ursídeos vivos. Tamanho e peso variam consideravelmente de acordo com a subespécie, ou em vista de que quando saem da hibernação na primavera estão relativamente magros, ou quando estão na época de acúmulo de gordura, para se preparar para a hibernação.", new Image(urso)));
        animais.add(new Animal("Lobo.", "Canis lúpus.", "Se alimenta de javali, corço, veado, ovelha, cabra, vaca e cavalo.", "Vive em média 16/17 anos.", "Os lobos durante um período de 24 horas efetuam trajetos com cerca de 20 a 40 km à procura de presas que possam abater com sucesso. A sua velocidade máxima em corrida pode atingir os 55-70 km/h e podem manter, para grandes distâncias, uma velocidade média de 8 km/h. Estas deslocações efetuam-se, em geral, durante a noite, período durante o qual os lobos são mais ativos.", new Image(lobo)));
        animais.add(new Animal("Onça-parda.", "Puma concolor.", "- Apesar de se alimentar muitas vezes de ungulados terrestres, a onça-parda pode se alimentar de animais arborícolas, principalmente de primatas de porte médio, como bugios e macacos-aranhas.", "Vive em média 8 a 13 anos na natureza.", "É um animal solitário e mais ativo à noite.", new Image(onca)));
        animais.add(new Animal("Alce.", "Alces alces.", "Herbívoro, se alimenta de vegetais e frutas.", "Vive em média 15 a 25 anos.", "Os alces têm pernas longas e pescoço curto, o que os impede de pastar das ervas rasteiras.", new Image(alce)));
        animais.add(new Animal("Lince.", "Lynx.", "Carnívoro, sua principal presa é a lebre, mas também se alimenta de roedores, lagomorfos e cervos.", "Vive em média 7 anos.", "Os recém-nascidos são cegos e surdos, com uma camada de pêlos fina. Permanecem com a mãe durante um ano.", new Image(lince)));
        animais.add(new Animal("Guaxinim.", "Procyon lotor.", "Se alimenta de plantas, roedores, anfíbios, ovos, frutas e sementes.", "Vive em média 2 a 3 anos na natureza.", "Geralmente se aproximam dos leitos dos rios para comer e se lavar, por isso são conhecidos como ursos lavadores.", new Image(guaxinim)));
        animais.add(new Animal("Gambá.", "Didelphis.", "Se alimenta de raízes, frutas, vermes, insetos, moluscos, crustáceos, anfíbios, entre outros.", "Vive em média 2 a 4 anos.", "Alguns gambás são imunes ao veneno de serpentes, podendo atacá-las pela cabeça e ingeri-las.", new Image(gamba)));
        animais.add(new Animal("Cobra-coral.", "Micrurus corallinus.", "Se alimenta de lagartos, anfíbios e répteis.", "Vive em média 9 anos.", "A cobra-coral é tão peçonhenta quanto uma naja. A sua peçonha atinge o sistema nervoso, causando dormência na área da picada, problemas respiratórios e caimento das pálpebras.", new Image(cobra)));
        animais.add(new Animal("Doninha-anã.", "Mustela.", "Se alimenta de roedores, coelhos e outros pequenos mamíferos.", "Vive em média 4 a 6 anos.", "No inverno, a doninha troca a sua pelagem e fica inteiramente branca para se camuflar na neve.", new Image(doninha)));
    }

}
