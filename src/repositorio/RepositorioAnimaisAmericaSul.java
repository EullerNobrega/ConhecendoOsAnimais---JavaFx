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
public class RepositorioAnimaisAmericaSul {

    private final ArrayList<Animal> animaisASul;
    private static RepositorioAnimaisAmericaSul instancia;

    private String quati, jacare, abronia, jaguatirica, tamandua, ovelha, capivara, condor, vicunha, beijaflor;
    private String quati2, jacare2, abronia2, jaguatirica2, tamandua2, ovelha2, capivara2, condor2, vicunha2, beijaflor2;

    public RepositorioAnimaisAmericaSul() {
        animaisASul = new ArrayList<>();
        init();
    }

    public RepositorioAnimaisAmericaSul obterInstancia() {
        if (instancia == null) {
            instancia = new RepositorioAnimaisAmericaSul();
        }
        return instancia;
    }

    public ArrayList<Animal> getAnimais() {
        return animaisASul;
    }

    public void declararCaminhosImg() {
        quati = "resources/imagens/animais/america_sul/quati_cauda_anelada2.png";
        quati2 = "resources/imagens/animais/america_sul/subscene/quati_cauda_anelada2.png";

        jacare = "resources/imagens/animais/america_sul/jacare_pantanal2.png";
        jacare2 = "resources/imagens/animais/america_sul/subscene/jacare_pantanal2.png";

        abronia = "resources/imagens/animais/america_sul/abronia2.png";
        abronia2 = "resources/imagens/animais/america_sul/subscene/abronia2.png";

        jaguatirica = "resources/imagens/animais/america_sul/jaguatirica2.png";
        jaguatirica2 = "resources/imagens/animais/america_sul/subscene/jaguatirica2.png";

        tamandua = "resources/imagens/animais/america_sul/tamandua_bandeira2.png";
        tamandua2 = "resources/imagens/animais/america_sul/subscene/tamandua_bandeira2.png";

        ovelha = "resources/imagens/animais/america_sul/ovelha2.png";
        ovelha2 = "resources/imagens/animais/america_sul/subscene/ovelha2.png";

        capivara = "resources/imagens/animais/america_sul/capivara2.png";
        capivara2 = "resources/imagens/animais/america_sul/subscene/capivara2.png";

        condor = "resources/imagens/animais/america_sul/condor_andes.jpg";
        condor2 = "resources/imagens/animais/america_sul/subscene/condor_andes.jpg";

        vicunha = "resources/imagens/animais/america_sul/vicunha_2.png";
        vicunha2 = "resources/imagens/animais/america_sul/subscene/vicunha_2.png";

        beijaflor = "resources/imagens/animais/america_sul/beija_flor2.png";
        beijaflor2 = "resources/imagens/animais/america_sul/subscene/beija_flor2.png";

    }

    public void init() {
        declararCaminhosImg();

        Image quatiImg = new Image(quati);
        Image quatiImg2 = new Image(quati);
        Image jacareImg = new Image(jacare);
        Image jacareImg2 = new Image(jacare);
        Image abroniaImg = new Image(abronia);
        Image abroniaImg2 = new Image(abronia);
        Image jaguatiricaImg = new Image(jaguatirica);
        Image jaguatiricaImg2 = new Image(jaguatirica);
        Image tamanduaImg = new Image(tamandua);
        Image tamanduaImg2 = new Image(tamandua);
        Image ovelhaImg = new Image(ovelha);
        Image ovelhaImg2 = new Image(ovelha);
        Image capivaraImg = new Image(capivara);
        Image capivaraImg2 = new Image(capivara);
        Image condorImg = new Image(condor);
        Image condorImg2 = new Image(condor);
        Image vicunhaImg = new Image(vicunha);
        Image vicunhaImg2 = new Image(vicunha);
        Image beijaflorImg = new Image(beijaflor);
        Image beijaflorImg2 = new Image(beijaflor);

        animaisASul.add(new Animal("Quati-de-cauda-anelada.", "Nasua nasua.", "Onívoro, se alimenta de insetos, larvas, aranhas, serpentes, crustáceos e peixes.", "Vive em média 7 anos.", "O quati-de-cauda-anelada é um mamífero diurno, capaz de viver tanto nos solos como nas árvores  como nas árvores.", new ImageView(quatiImg), new ImageView(quatiImg2), Comida.GRILO));
        animaisASul.add(new Animal("Jacaré-do-pantanal.", "Caiman yacare.", "Se alimenta de peixes, moluscos e crustáceos.", "Vive em média 80 anos.", "Põe seus ovos, que pode ser uma quantidade de 20 a 30 dentro de um ninho na mata nos meses de janeiro a março.", new ImageView(jacareImg), new ImageView(jacareImg2), Comida.CARNE));
        animaisASul.add(new Animal("Abronia (lagarto).", "Abronia.", "É vivíparo, se alimenta de insetos.", "Vive em média 15 anos.", "Ao contrário de outros membros da família, esses lagartos possuem quatro pernas e hábitos arborícolas.", new ImageView(abroniaImg), new ImageView(abroniaImg2), Comida.GRILO));
        animaisASul.add(new Animal("Jaguatirica.", "Leopardus pardalis.", "Se alimenta de roedores maiores, como a paca e a cutia.", "Vive em média 20 anos.", "Costuma caçar à noite.", new ImageView(jaguatiricaImg), new ImageView(jaguatiricaImg2), Comida.CARNE));
        animaisASul.add(new Animal("Tamanduá-bandeira.", "Myrmecophaga tridactyla.", "Se alimenta principalmente de formigas e cupins.", "Vive em média 16 anos em cativeiro.", "Mede entre 1,8 e 2,1 metros de comprimento e pesa até 41 kg. É facilmente reconhecido pelo seu focinho longo e padrão característico de pelagem.", new ImageView(tamanduaImg), new ImageView(tamanduaImg2), Comida.FORMIGA));
        animaisASul.add(new Animal("Ovelha.", "Ovis aries.", "Se alimentam de feno, grama e trevos. ", "Vive em média 10 a 12 anos.", "As ovelhas são capazes de distinguir diferentes expressões da face de outros integrantes do rebanho, bem como identificar até 50 componentes do grupo e lembrar-se de acontecimentos ocorridos há dois anos.", new ImageView(ovelhaImg), new ImageView(ovelhaImg2), Comida.GRAMA));
        animaisASul.add(new Animal("Capivara.", "Hydrochoerus hydrochoeris.", "Se alimenta de gramas curtas e algas.", "Vive em média 10 a 12 anos.", "Olhos, orelhas e narinas em linha: quando nada, a capivara mantém apenas essa parte da cabeça acima da flor d’água. Possui muito fôlego e é capaz de ficar sem respirar por 5 minutos ou mais.", new ImageView(capivaraImg), new ImageView(capivaraImg2), Comida.GRAMA));
        animaisASul.add(new Animal("Condor-dos-andes.", "Vultur gryphus.", "Se alimenta de animais pequenos e de médio porte, como ratos, coiotes, veados e esquilos.", "Vive em média 50 anos.", "É a maior ave voadora do planeta, pode atingir 1,42 metros de altura e os machos pesam 45 quilos. Quando desdobra suas asas, atinge 3,30 metros.", new ImageView(condorImg), new ImageView(condorImg2), Comida.RATO));
        animaisASul.add(new Animal("Vicunha.", "Vicugna vicugna.", "Se alimenta de gramíneas, arbustos, forrageiras anuais e graminóides.", "Vive em média 15 anos.", "Sua pelagem é constituída da lã da melhor qualidade que se conhece.", new ImageView(vicunhaImg), new ImageView(vicunhaImg2), Comida.GRAMA));
        animaisASul.add(new Animal("Beija-flor.", "Trochilidae.", "Se alimenta do néctar das flores e artrópodes, em particular moscas e formigas.", "Vive em média 3 a 5 anos.", "Como a maioria das aves, o sentido do olfato não está muito desenvolvido nos beija-flores, a visão é muito apurada.", new ImageView(beijaflorImg), new ImageView(beijaflorImg2), Comida.FLOR));
    }

    public Animal consultar(String nomeAnimal) {
        for (Animal a : animaisASul) {
            if (a.getNome().equalsIgnoreCase(nomeAnimal)) {
                return a;
            }
        }
        return null;
    }

}
