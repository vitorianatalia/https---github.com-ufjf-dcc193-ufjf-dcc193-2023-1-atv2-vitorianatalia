package br.ufjf.dcc193.vitoriac.quest;

import org.springframework.stereotype.Component;

@Component
public class Clerigo implements Heroi {

    private String nome = "";
    public Clerigo() {
        this("desconhecido");
    }

    public Clerigo(String string) {
        this.nome = string;
        System.out.println("O clerigo "+this.nome+" chega no reino!");
    }

    @Override
    public void agir(){
        System.out.println("O clerigo "+this.nome+" está rezando!");
    }

}
