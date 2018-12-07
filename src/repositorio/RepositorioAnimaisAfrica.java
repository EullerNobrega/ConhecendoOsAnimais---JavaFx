/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Animal;

/**
 *
 * @author Euller Nóbrega
 */
public class RepositorioAnimaisAfrica extends AbstractRepositorio {

    private ArrayList<Animal> animais;

    public RepositorioAnimaisAfrica() {
        init();
    }

    @Override
    public void init() {
        final String elefante, leao, girafa, chimpanze, hipopotamo, falcao, indri, elande, chacal, mabeco;
        elefante = "resources/imagens/animais/africa/elefante_africano2.png";
        leao = "resources/imagens/animais/africa/leao_africano2.png";
        girafa = "resources/imagens/animais/africa/girafa.jpg";
        chimpanze = "resources/imagens/animais/africa/chimpanze2.png";
        hipopotamo = "resources/imagens/animais/africa/hipopotamo2.png";
        falcao = "resources/imagens/animais/africa/falcao2.png";
        indri = "resources/imagens/animais/africa/indri2.png";
        elande = "resources/imagens/animais/africa/elande2.png";
        chacal = "resources/imagens/animais/africa/chacal2.png";
        mabeco = "resources/imagens/animais/africa/mabeco2.png";

        Image elefanteImg = new Image(elefante);
        Image leaoImg = new Image(leao);
        Image girafaImg = new Image(girafa);
        Image chimpanzeImg = new Image(chimpanze);
        Image hipopotamoImg = new Image(hipopotamo);
        Image falcaoImg = new Image(falcao);
        Image indriImg = new Image(indri);
        Image elandeImg = new Image(elande);
        Image chacalImg = new Image(chacal);
        Image mabecoImg = new Image(mabeco);

        animais.add(new Animal("Elefante-africano.", "Loxodonta.", "- Herbívoro, se alimenta de folhas de árvores, ervas, raízes, frutos e gramas.", "Vive em média 60 a 70 anos.", "Um elefante adulto ingere, em média, 100 quilos de alimento por dia. Um filhote pode nascer com até 80 quilos.", new ImageView(elefanteImg)));
        animais.add(new Animal("Leão-africano.", "Panthera leo.", "Se alimenta de carnes como zebras, antílopes, búfalos e javalis.", "Vive em média 10 a 14 anos.", "Os leões pertencem à família de gatos dos animais conhecida como felinos, eles são os segundos maiores felinos, perdendo somente para os tigres.", new ImageView(leaoImg)));
        animais.add(new Animal("Girafa.", "Giraffa.", "Se alimenta de folhas de árvores, principalmente acácias.", "Vive em média 15 a 20 anos.", "As girafas precisam comer grandes quantidades e passam quase 20 horas por dia comendo.", new ImageView(girafaImg)));
        animais.add(new Animal("Chimpanzé.", "Pan.", "Se alimenta de frutas, folhas, flores, sementes e presas animais.", "Vive em média 50 anos.", "Os chimpanzés vivem em grupos que podem variar de cinco até mais de cem indivíduos, aquando no seu estado natural.", new ImageView(chimpanzeImg)));
        animais.add(new Animal("Hipopótamo.", "Hippopotamus amphibius.", "Se alimenta da vegetação existente nas margens dos rios e lagos onde habita, como ervas e plantas aquáticas.", "Vive em média 40 a 50 anos.", "Os hipopótamos são, por natureza, agressivos. Hipopótamos que se envolvem em ataques a outros animais ou são machos dominantes, que tendem a ser territoriais e violentos, ou fêmeas bastante protetoras em relação às crias.", new ImageView(hipopotamo)));
        animais.add(new Animal("Falcão.", "Falco.", "Se alimenta de outras aves.", "Vive em média 25 anos.", "O falcão desempenha uma função muito importante nos aeroportos, pois afasta as aves que poderiam colidir com um avião durante a sua aterrissagem e descolagem.", new ImageView(falcaoImg)));
        animais.add(new Animal("Indri.", "Indri indri.", "Vegetariano, se alimenta de frutas, sementes e nozes.", "Vive em média 15 a 22 anos.", "Com frequência ouvem emitem uivos em coro, sendo respondidos pelos membros de outros grupos das redondezas.", new ImageView(indriImg)));
        animais.add(new Animal("Elande.", "Taurotragus oryx.", "Se alimenta de capim, folhas, ervas daninhas secas e duras, grama e frutas.", "Vive em média 15 a 20 anos.", "Ágeis, são capazes de pular 1,5 m de altura a partir de uma posição estacionária.", new ImageView(elandeImg)));
        animais.add(new Animal("Chacal.", "Canis aureus. ", "Onívoro, se alimenta de frutas, plantas, invertebrados, répteis, anfíbios, pássaros terrestres, ovos, pequenos mamíferos e carniça.", "Vive em média 16 anos em cativeiro.", "Os chacais são noturnos em áreas habitadas por homens, mas podem ser parcialmente diurnos em outros lugares. ", new ImageView(chacalImg)));
        animais.add(new Animal("Mabeco.", "Lycaon pictus.", "Carnívoro, se alimenta de lebres, raposas-orelha-de-morcego, búfalos, elandes, gazela-de-thomson, grande-cudo, impala e o bauala.", "Vive em média 11 anos.", "Além de praticarem uma educação comunitária, eles dividem a caça e cuidam dos membros doentes e idosos.", new ImageView(mabecoImg)));
    }

}
