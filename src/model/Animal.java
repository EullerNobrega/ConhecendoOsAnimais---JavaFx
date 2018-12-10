package model;

import javafx.scene.image.ImageView;

/**
 *
 * @author Euller
 */
public class Animal {

    private String nome;
    private String nomeCientifico;
    private String alimentacao;
    private String estimativaVida;
    private String curiosidade;
    private ImageView imagemAnimal, imagemAnimal2;
    private final Comida comida;

    public Animal(String nome, String nomeCientifico, String alimentacao, String estimativaVida, String curiosidade, ImageView imagemAnimal, ImageView imagemAnimal2, Comida comida) {
        this.nome = nome;
        this.nomeCientifico = nomeCientifico;
        this.alimentacao = alimentacao;
        this.estimativaVida = estimativaVida;
        this.curiosidade = curiosidade;
        this.imagemAnimal = imagemAnimal;
        this.imagemAnimal2 = imagemAnimal2;
        this.comida = comida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getEstimativaVida() {
        return estimativaVida;
    }

    public ImageView getImagemAnimal() {
        return imagemAnimal;
    }

    public void setImagemAnimal(ImageView imagemAnimal) {
        this.imagemAnimal = imagemAnimal;
    }

    public ImageView getImagemAnimal2() {
        return imagemAnimal2;
    }

    public void setImagemAnimal2(ImageView imagemAnimal2) {
        this.imagemAnimal2 = imagemAnimal2;
    }

    public void setEstimativaVida(String estimativaVida) {
        this.estimativaVida = estimativaVida;
    }

    public String getCuriosidade() {
        return curiosidade;
    }

    public void setCuriosidade(String curiosidade) {
        this.curiosidade = curiosidade;
    }

    public Comida getComida() {
        return comida;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + "\n\nNome Científico = " + nomeCientifico + "\n\nAlimentacao = " + alimentacao + "\n\nEstimativa de vida = " + estimativaVida + "\n\nCuriosidade = " + curiosidade;
    }

}
