package model;

import java.util.ArrayList;

/**
 *
 * @author Euller
 */
public class Jogador {

    private String nome;
    private double pontuacao;
    private ArrayList<Animal> animaisDesbloqueados;

    public Jogador(String nome, double pontuacao, ArrayList<Animal> animaisDesbloqueados) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.animaisDesbloqueados = animaisDesbloqueados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public ArrayList<Animal> getAnimaisDesbloqueados() {
        return animaisDesbloqueados;
    }

    public void setAnimaisDesbloqueados(ArrayList<Animal> animaisDesbloqueados) {
        this.animaisDesbloqueados = animaisDesbloqueados;
    }

}
