package br.ufjf.dcc193.vitoriac.quest;

import org.springframework.stereotype.Component;

@Component
public class Guerreiro implements Heroi {

    private String nome = "";

    public Guerreiro(){
        this("desconhecido");
    }
    public Guerreiro(String nome) {
        this.nome = nome;
        System.out.println("O guerreiro "+this.nome+" chega no reino!");
    }

    @Override
    public void agir(){
        System.out.println("O guerreiro "+this.nome+" está agindo!");
    }

}
