/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Euller Nóbrega
 */
public class CadastrarEmArquivo {

    private ObjectInputStream input;
    private ObjectOutputStream output;

    public void openToRead(String nomeArq) {
        try {
            FileInputStream arq = new FileInputStream(nomeArq);
            input = new ObjectInputStream(arq);
            System.out.println("Arquivo aberto para leitura");
        } catch (IOException ex) {
            System.err.println("Erro ao tentar abrir o arquivo para leitura");
            System.exit(1);
        }
    }

    public void openToWrite(String nomeArq) {
        File arq = new File(nomeArq);
        if (arq.exists() == false) {
            try {
                FileOutputStream fout = new FileOutputStream(nomeArq);
                output = new ObjectOutputStream(fout);
                System.out.println("Arquivo aberto para gravacao");
            } catch (IOException ex) {
                System.err.println("Erro ao tentar abrir o arquivo para gravação");
                System.exit(1);
            }
        } else {
            try {
                FileOutputStream fout = new FileOutputStream(nomeArq);
                output = new ObjectOutputStream(fout) {
                    @Override
                    protected void writeStreamHeader() throws IOException { //Serve para nao add o FileDescriptor pela 2°vez
                        reset();
                    }
                };
                System.out.println("Arquivo aberto para gravacao");
            } catch (IOException ex) {
                System.err.println("Erro ao tentar abrir o arquivo para gravação");
                System.exit(1);
            }
        }
    }

    public void closeAfterRead() {
        try {
            if (input != null) {
                input.close();
                input = null;
                System.out.println("Arquivo fechado com sucesso");
            }
        } catch (IOException ex) {
            System.err.println("Erro ao tentar fechar arquivo");
            System.exit(1);
        }
    }

    public void closeAfterWrite() {
        try {
            if (output != null) {
                output.close();
                output = null;
                System.out.println("Arquivo fechado com sucesso");
            }
        } catch (IOException ex) {
            System.err.println("Erro ao tentar fechar o arquivo");
            System.exit(1);
        }
    }

    public void gravaObjeto(int pontos, String nomeArq) { //Grava objeto no arquivo
        try {
            if (output != null) {
                output.writeObject(pontos);
                output.flush();
                System.out.println("Gravação efetuada com sucesso");
            }

        } catch (IOException ex) {
            System.err.println("Erro ao manipular arquivo");
            System.exit(1);
        }
    }

    public int leObjeto(String nomeArq) { //Ler Objeto do arquivo
        int pontos = 0;

        if (input != null) {
            try {
                while (true) {
                    pontos = (int) input.readObject();
                    return pontos;
                }
            } catch (EOFException ex) {
                System.out.println("Fim de arquivo");
            } catch (IOException ex) {
                System.err.println("Erro ao manipular arquivo");
                System.exit(1);
            } catch (ClassNotFoundException ex) {
                System.err.println("Classe nao existe");
                System.exit(1);
            }
        }
        return pontos;
    }
}
