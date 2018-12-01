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
public class RepositorioAnimaisAmericaSul extends AbstractRepositorio {

    private ArrayList<Animal> animais;

    public RepositorioAnimaisAmericaSul() {
        init();
    }

    @Override
    public void init() {
        animais.add(new Animal("Quati-de-cauda-anelada.", "Nasua nasua.", "Onívoro, se alimenta de insetos, larvas, aranhas, serpentes, crustáceos e peixes.", "Vive em média 7 anos.", "O quati-de-cauda-anelada é um mamífero diurno, capaz de viver tanto nos solos como nas árvores  como nas árvores.", null));
        animais.add(new Animal("Jacaré-do-pantanal.", "Caiman yacare.", "Se alimenta de peixes, moluscos e crustáceos.", "Vive em média 80 anos.", "Põe seus ovos, que pode ser uma quantidade de 20 a 30 dentro de um ninho na mata nos meses de janeiro a março.", null));
        animais.add(new Animal("Abronia (lagarto).", "Abronia.", "É vivíparo.", "Vive em média 15 anos.", "Ao contrário de outros membros da família, esses lagartos possuem quatro pernas e hábitos arborícolas.", null));
        animais.add(new Animal("Jaguatirica.", "Leopardus pardalis.", "Se alimenta de roedores maiores, como a paca e a cutia.", "Vive em média 20 anos.", "Costuma caçar à noite.", null));
        animais.add(new Animal("Tamanduá-bandeira.", "Myrmecophaga tridactyla.", "Se alimenta principalmente de formigas e cupins.", "Vive em média 16 anos em cativeiro.", "Mede entre 1,8 e 2,1 metros de comprimento e pesa até 41 kg. É facilmente reconhecido pelo seu focinho longo e padrão característico de pelagem.", null));
        animais.add(new Animal("Ovelha.", "Ovis aries.", "Se alimentam de feno, grama e trevos. ", "Vive em média 10 a 12 anos.", "As ovelhas são capazes de distinguir diferentes expressões da face de outros integrantes do rebanho, bem como identificar até 50 componentes do grupo e lembrar-se de acontecimentos ocorridos há dois anos.", null));
        animais.add(new Animal("Capivara.", "Hydrochoerus hydrochoeris.", "Se alimenta de gramas curtas e algas.", "Vive em média 10 a 12 anos.", "Olhos, orelhas e narinas em linha: quando nada, a capivara mantém apenas essa parte da cabeça acima da flor d’água. Possui muito fôlego e é capaz de ficar sem respirar por 5 minutos ou mais.", null));
        animais.add(new Animal("Condor-dos-andes.", "Vultur gryphus.", "Se alimenta de animais pequenos e de médio porte, como ratos, coiotes, veados e esquilos.", "Vive em média 50 anos.", "É a maior ave voadora do planeta, pode atingir 1,42 metros de altura e os machos pesam 45 quilos. Quando desdobra suas asas, atinge 3,30 metros.", null));
        animais.add(new Animal("Vicunha.", "Vicugna vicugna.", "Se alimenta de gramíneas, arbustos, forrageiras anuais e graminóides.", "Vive em média 15 anos.", "Sua pelagem é constituída da lã da melhor qualidade que se conhece.", null));
        animais.add(new Animal("Beija-flor.", "Trochilidae.", "Se alimenta do néctar das flores e artrópodes, em particular moscas e formigas.", "Vive em média 3 a 5 anos.", "Como a maioria das aves, o sentido do olfato não está muito desenvolvido nos beija-flores, a visão é muito apurada.", null));
    }

}
