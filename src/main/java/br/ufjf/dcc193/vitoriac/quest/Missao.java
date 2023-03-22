package br.ufjf.dcc193.vitoriac.quest;

public class Missao {

    private Heroi heroi;

    public Missao(){
        System.out.println("O rei tem uma nova missão importante!");
    }
    public void iniciar() {
        System.out.println("A missão teve inicio!");
        this.heroi.agir();
    }

    public void concluir() {
        System.out.println("A missão foi concluída!");
    }
    public void setHeroi(Heroi h) {
        this.heroi = h;
    }

}
