/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.image.Image;
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
    private ImageView imagemAnimal;

    public Animal(String nome, String nomeCientifico, String alimentacao, String estimativaVida, String curiosidade, ImageView imagemAnimal) {
        this.nome = nome;
        this.nomeCientifico = nomeCientifico;
        this.alimentacao = alimentacao;
        this.estimativaVida = estimativaVida;
        this.curiosidade = curiosidade;
        this.imagemAnimal = imagemAnimal;
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

    public void setEstimativaVida(String estimativaVida) {
        this.estimativaVida = estimativaVida;
    }

    public String getCuriosidade() {
        return curiosidade;
    }

    public void setCuriosidade(String curiosidade) {
        this.curiosidade = curiosidade;
    }

    @Override
    public String toString() {
        return "Animal\n" + "Nome = " + nome + "\nNome Científico = " + nomeCientifico + "\nAlimentacao = " + alimentacao + "\nEstimativa de vida = " + estimativaVida + "\nCuriosidade = " + curiosidade;
    }
    
    
    
}
