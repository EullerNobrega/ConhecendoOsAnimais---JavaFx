//package repositorio;
//
//import java.util.ArrayList;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import model.Animal;
//
///**
// *
// * @author Euller Nóbrega
// */
//public class RepositorioAnimaisAsia extends AbstractRepositorio {
//
//    private ArrayList<Animal> animais;
//
//    public RepositorioAnimaisAsia() {
//        init();
//    }
//
//    @Override
//    public void init() {
//        final String pavao, panda, tigre, dragao, gibao, iaque, gaivota, leopardo, pandaVermelho, orangotango;
//        pavao = "resources/imagens/animais/asia/pavao2.png";
//        panda = "resources/imagens/animais/asia/panda.png";
//        tigre = "resources/imagens/animais/asia/tigre2.png";
//        dragao = "resources/imagens/animais/asia/dragao_komodo2.png";
//        gibao = "resources/imagens/animais/asia/gibao2.png";
//        iaque = "resources/imagens/animais/asia/iaque2.png";
//        gaivota = "resources/imagens/animais/asia/gaivota2.png";
//        leopardo = "resources/imagens/animais/asia/leopardo_neves2.png";
//        pandaVermelho = "resources/imagens/animais/asia/panda_vermelho2.png";
//        orangotango = "resources/imagens/animais/asia/orangotango2.png";
//
//        Image pavaoImg = new Image(pavao);
//        Image pandaImg = new Image(panda);
//        Image tigreImg = new Image(tigre);
//        Image dragaoImg = new Image(dragao);
//        Image gibaoImg = new Image(gibao);
//        Image iaqueImg = new Image(iaque);
//        Image gaivotaImg = new Image(gaivota);
//        Image leopardoImg = new Image(leopardo);
//        Image pandaVermelhoImg = new Image(pandaVermelho);
//        Image orangotangoImg = new Image(orangotango);
//
//        animais.add(new Animal("Pavão.", "Pavo cristatus.", "Se alimenta de insetos, pequenos invertebrados, sementes e frutas.", "Vive em média 10 a 25 anos.", "O pavão só consegue voar depois de correr uma determinada distância. Seu vôo é barulhento e desajeitado.", new ImageView(pavaoImg)));
//        animais.add(new Animal("Panda-gigante.", "Ailuropoda melanoleuca.", "Herbívoro, se alimenta de folhas de bambus .", "Vive em média 20 anos na natureza.", "Os pandas gigantes são geralmente solitários.", new ImageView(pandaImg)));
//        animais.add(new Animal("Tigre.", "Panthera tigres.", "Carnívoro, se alimenta de javali, cervos, crocodilos, entre outros.", "Vive em média 16 a 18 anos em cativeiro.", "Ao contrário de muitos felinos, os tigres são nadadores fortes e muitas vezes intencionalmente banham-se em lagoas, lagos e rios, como forma de se refrescar no calor do dia.", new ImageView(tigreImg)));
//        animais.add(new Animal("Dragão de komodo.", "Varanus komodoensis.", "Carnívoro, se alimenta de invertebrados, aves, ovos de aves, pequenos mamíferos, macacos, javalis, cabras, veados, cavalos e búfalos.", "Vive em média 50 anos.", "É a maior espécie de lagarto conhecida, chegando a atingir 40 cm de altura e 2–3 m de comprimento e até 166 kg de peso no caso dos maiores indivíduos. ", new ImageView(dragaoImg)));
//        animais.add(new Animal("Gibão.", "Hylobatidae.", "Se alimentam de frutas.", "Vive em média 35 anos.", "O Gibão desloca-se no chão sob 2 patas com os braços no ar ou nas árvores, segurando-se para manter o equilíbrio. ", new ImageView(gibaoImg)));
//        animais.add(new Animal("Iaque.", "Bos grunniens.", "Herbívoro, se alimenta de gramas, líquens e outras plantas.", "Vive em média 25 anos.", "Gosta de sombra e neve macia.", new ImageView(iaqueImg)));
//        animais.add(new Animal("Gaivota.", "Larus.", "Se alimenta de peixes, ovos de aves e pequenos roedores.", "Vive em média 30 anos.", "Sua presença é marcada com um grito característico, áspero e rouco.", new ImageView(gaivotaImg)));
//        animais.add(new Animal("Leopardo das neves.", "Panthera uncia.", "Carnívoro, pode caçar desde um grande iaque até um pequeno veado almiscarado.", "Vive em média 21 anos em cativeiro.", "Sua cauda é uma de suas principais adaptações, não só ao frio, mas também ao seu habitat rochoso. Ela é cheia de gordura e coberta de pêlos, o que permite que ele a use como um cachecol durante a noite. ", new ImageView(leopardoImg)));
//        animais.add(new Animal("Panda-vermelho.", "Ailurus fulgens.", "Se alimenta de ervas, frutos, raízes, brotos de bambu, insetos e crias de pássaros.", "Vive em média 8 a 10 anos.", "Mede até 60 cm; mais 40 cm de cauda.", new ImageView(pandaVermelhoImg)));
//        animais.add(new Animal("Orangotango.", "Pongo.", "Se alimentam de frutas, folhas, cascas de árvores, insetos, entre outros.", "Vive em média 35 a 45 anos.", "Os orangotangos estão ameaçados de extinção, principalmente, devido às atividades humanas que desmatam as florestas e diminuem as chances de encontrar alimento.", new ImageView(orangotangoImg)));
//    }
//
//}
