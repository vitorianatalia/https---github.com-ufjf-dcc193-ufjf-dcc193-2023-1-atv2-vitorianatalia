package br.ufjf.dcc193.vitoriac.quest;

public class Clerigo {

    private String nome = "";

    public Clerigo(String string) {
        this.nome = string;
        System.out.println("O clerigo "+this.nome+" chega no reino!");
    }

    public void agir(){
        System.out.println("O clerigo "+this.nome+" está agindo!");
    }

}
