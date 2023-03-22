package br.ufjf.dcc193.vitoriac.quest;

public class Guerreiro {

    private String nome = "";

    public Guerreiro(String string) {
        this.nome = string;
        System.out.println("O guerreiro "+this.nome+" chega no reino!");
    }

    public void agir(){
        System.out.println("O guerreiro "+this.nome+" está agindo!");
    }

}
