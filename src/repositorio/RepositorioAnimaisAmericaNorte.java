package repositorio;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Animal;
import model.Comida;

/**
 *
 * @author Euller Nóbrega
 */
public class RepositorioAnimaisAmericaNorte {

    private final ArrayList<Animal> animaisANorte;
    private static RepositorioAnimaisAmericaNorte instancia;

    private String raposa, urso, lobo, onca, alce, lince, guaxinim, gamba, doninha, ursoPolar;
    private String raposa2, urso2, lobo2, onca2, alce2, lince2, guaxinim2, gamba2, doninha2, ursoPolar2;


    public RepositorioAnimaisAmericaNorte() {
        animaisANorte = new ArrayList<>();
        init();
    }

    public RepositorioAnimaisAmericaNorte obterInstancia() {
        if (instancia == null) {
            instancia = new RepositorioAnimaisAmericaNorte();
        }
        return instancia;
    }

    public ArrayList<Animal> getAnimais() {
        return animaisANorte;
    }

    private void declararCaminhosImg() {
        raposa = "resources/imagens/animais/america_norte/raposa_vermelha2.png";
        raposa2 = "resources/imagens/animais/america_norte/subscene/raposa_vermelha2.png";

        urso = "resources/imagens/animais/america_norte/urso_pardo2.png";
        urso2 = "resources/imagens/animais/america_norte/subscene/urso_pardo2.png";

        lobo = "resources/imagens/animais/america_norte/lobo.jpg";
        lobo2 = "resources/imagens/animais/america_norte/subscene/lobo2.png";

        onca = "resources/imagens/animais/america_norte/onca_parda2.png";
        onca2 = "resources/imagens/animais/america_norte/subscene/onca_parda2.png";

        alce = "resources/imagens/animais/america_norte/alce2.png";
        alce2 = "resources/imagens/animais/america_norte/subscene/alce2.png";

        lince = "resources/imagens/animais/america_norte/lince.jpg";
        lince2 = "resources/imagens/animais/america_norte/subscene/lince2.png";

        guaxinim = "resources/imagens/animais/america_norte/guaxinim2.png";
        guaxinim2 = "resources/imagens/animais/america_norte/subscene/guaxinim2.png";

        gamba = "resources/imagens/animais/america_norte/gamba2.png";
        gamba2 = "resources/imagens/animais/america_norte/subscene/gamba2.png";

        doninha = "resources/imagens/animais/america_norte/doninha_ana2.png";
        doninha2 = "resources/imagens/animais/america_norte/subscene/doninha_ana2.png";

        ursoPolar = "resources/imagens/animais/america_norte/urso_polar2.png";
        ursoPolar2 = "resources/imagens/animais/america_norte/subscene/urso_polar2.png";
    }

    public void criarComidas() {
        


        

       
        

        

        

        

        

       

        
    }

    public void init() {
        declararCaminhosImg();

        Image raposaImg = new Image(raposa);
        Image raposaImg2 = new Image(raposa2);
        Image ursoImg = new Image(urso);
        Image ursoImg2 = new Image(urso2);
        Image loboImg = new Image(lobo);
        Image loboImg2 = new Image(lobo2);
        Image oncaImg = new Image(onca);
        Image oncaImg2 = new Image(onca2);
        Image alceImg = new Image(alce);
        Image alceImg2 = new Image(alce2);
        Image linceImg = new Image(lince);
        Image linceImg2 = new Image(lince2);
        Image guaxinimImg = new Image(guaxinim);
        Image guaxinimImg2 = new Image(guaxinim2);
        Image gambaImg = new Image(gamba);
        Image gambaImg2 = new Image(gamba2);
        Image doninhaImg = new Image(doninha);
        Image doninhaImg2 = new Image(doninha2);
        Image ursoPolarImg = new Image(ursoPolar);
        Image ursoPolarImg2 = new Image(ursoPolar2);

        animaisANorte.add(new Animal("Raposa-vermelha.", "Vulpes-vulpes.", "Se alimenta de roedores, aves, insetos, peixes, ovos e frutos.", "Vive em média 9 anos.", "A raposa-vermelha vive em grupos formados em sua maioria por um macho adulto e várias fêmeas. Vivem em tocas protegidas pela vegetação escavadas por elas mesmas, ou em antigas tocas de coelhos. O tamanho das raposas dessa espécie varia de 90 cm a 1,38 m de comprimento, da cabeça à extremidade da cauda. Os machos pesam entre 6 e 10 kg, e as fêmeas, entre 4 e 8 kg.", new ImageView(raposaImg), new ImageView(raposaImg2), Comida.CARNE));
        animaisANorte.add(new Animal("Urso-pardo.", "Ursus arctos.", "Se alimenta de pequenos roedores, peixes, mariposas, larvas, frutas silvestres, mel e grandes animais como cervos e alces.", "Vive em média 25 a 30 anos.", "O urso pardo é o mais variável em tamanho dentre todos os ursídeos vivos. Tamanho e peso variam consideravelmente de acordo com a subespécie, ou em vista de que quando saem da hibernação na primavera estão relativamente magros, ou quando estão na época de acúmulo de gordura, para se preparar para a hibernação.", new ImageView(ursoImg), new ImageView(ursoImg2), Comida.PEIXE));
        animaisANorte.add(new Animal("Lobo.", "Canis lúpus.", "Se alimenta de javali, corço, veado, ovelha, cabra, vaca e cavalo.", "Vive em média 16/17 anos.", "Os lobos durante um período de 24 horas efetuam trajetos com cerca de 20 a 40 km à procura de presas que possam abater com sucesso. A sua velocidade máxima em corrida pode atingir os 55-70 km/h e podem manter, para grandes distâncias, uma velocidade média de 8 km/h. Estas deslocações efetuam-se, em geral, durante a noite, período durante o qual os lobos são mais ativos.", new ImageView(loboImg), new ImageView(loboImg2), Comida.CARNE));
        animaisANorte.add(new Animal("Onça-parda.", "Puma concolor.", "- Apesar de se alimentar muitas vezes de ungulados terrestres, a onça-parda pode se alimentar de animais arborícolas, principalmente de primatas de porte médio, como bugios e macacos-aranhas.", "Vive em média 8 a 13 anos na natureza.", "É um animal solitário e mais ativo à noite.", new ImageView(oncaImg), new ImageView(oncaImg2), Comida.CARNE));
        animaisANorte.add(new Animal("Alce.", "Alces alces.", "Herbívoro, se alimenta de vegetais e frutas.", "Vive em média 15 a 25 anos.", "Os alces têm pernas longas e pescoço curto, o que os impede de pastar das ervas rasteiras.", new ImageView(alceImg), new ImageView(alceImg2), Comida.VEGETAL));
        animaisANorte.add(new Animal("Lince.", "Lynx.", "Carnívoro, sua principal presa é a lebre, mas também se alimenta de roedores, lagomorfos e cervos.", "Vive em média 7 anos.", "Os recém-nascidos são cegos e surdos, com uma camada de pêlos fina. Permanecem com a mãe durante um ano.", new ImageView(linceImg), new ImageView(linceImg2), Comida.CARNE));
        animaisANorte.add(new Animal("Guaxinim.", "Procyon lotor.", "Se alimenta de plantas, roedores, anfíbios, ovos, frutas e sementes.", "Vive em média 2 a 3 anos na natureza.", "Geralmente se aproximam dos leitos dos rios para comer e se lavar, por isso são conhecidos como ursos lavadores.", new ImageView(guaxinimImg), new ImageView(guaxinimImg2), Comida.FOLHA));
        animaisANorte.add(new Animal("Gambá.", "Didelphis.", "Se alimenta de raízes, frutas, vermes, insetos, moluscos, crustáceos, anfíbios, entre outros.", "Vive em média 2 a 4 anos.", "Alguns gambás são imunes ao veneno de serpentes, podendo atacá-las pela cabeça e ingeri-las.", new ImageView(gambaImg), new ImageView(gambaImg2), Comida.GRILO));
        animaisANorte.add(new Animal("Doninha-anã.", "Mustela.", "Se alimenta de roedores, coelhos e outros pequenos mamíferos.", "Vive em média 4 a 6 anos.", "No inverno, a doninha troca a sua pelagem e fica inteiramente branca para se camuflar na neve.", new ImageView(doninhaImg), new ImageView(doninhaImg2), Comida.RATO));
        animaisANorte.add(new Animal("Urso-polar.", "Ursus maritimus.", "Se alimenta de focas, pequenos mamíferos, peixes, aves, ovos e vegetação.", "Vive em média 18 a 30 anos.", "Por baixo de toda pelagem branca, os ursos polares têm a pele preta para absorver melhor o calor do sol. A pelagem cresce até o topo das suas garras, o que os protege contra as superfícies geladas.", new ImageView(ursoPolarImg), new ImageView(ursoPolarImg2), Comida.PEIXE));

    }

    public Animal consultar(String nomeAnimal) {
        for (Animal a : animaisANorte) {
            if (a.getNome().equalsIgnoreCase(nomeAnimal)) {
                return a;
            }
        }
        return null;
    }
}
