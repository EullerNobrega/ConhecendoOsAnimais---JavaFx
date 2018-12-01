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
public abstract class AbstractRepositorio {
    private final ArrayList<Animal> animais;

    public AbstractRepositorio() {
        this.animais = new ArrayList<>();
        init();
    }
    
    public abstract void init();
    
    public ArrayList getAll(){
        return animais;
    }
    
    public Animal getAnimal(String nome){
        for(Animal a : animais){
            if(a.getNome().equalsIgnoreCase(nome)){
                return a;
            }
        }
        return null;
    }
    
}
