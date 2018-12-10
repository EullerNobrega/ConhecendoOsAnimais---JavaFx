/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Telas.TelaJogo;

/**
 *
 * @author Euller Nóbrega
 */
public class CadastrarPontosArquivo {

    private CadastrarEmArquivo salvar;
    private String nomeArq = "pontosConhecendoAnimais.dat";

    public CadastrarPontosArquivo() {
        salvar = new CadastrarEmArquivo();
        
    }

    public void gravar() {
        salvar.openToWrite(nomeArq);
        salvar.gravaObjeto(TelaJogo.pontuacao, nomeArq);
        salvar.closeAfterWrite();
    }
    
    public int ler(){
        salvar.openToRead(nomeArq);
        int pont = salvar.leObjeto(nomeArq);
        salvar.closeAfterRead();
        
        return pont;
    }

    public CadastrarEmArquivo getSalvar() {
        return salvar;
    }

    public void setSalvar(CadastrarEmArquivo salvar) {
        this.salvar = salvar;
    }

    public String getNomeArq() {
        return nomeArq;
    }

    public void setNomeArq(String nomeArq) {
        this.nomeArq = nomeArq;
    }
    
    

}
