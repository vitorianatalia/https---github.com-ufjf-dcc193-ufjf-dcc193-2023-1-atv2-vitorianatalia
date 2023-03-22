package br.ufjf.dcc193.vitoriac.quest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroiFactory {
    public static Heroi createGuerreiro(String nome){
        return new Guerreiro(nome);
    }

    public static Heroi createClerigo(String nome){
        return new Clerigo(nome);
    }

    public static Heroi createHeroi(String nome, int tipo){
        if(tipo == 1){
            return createGuerreiro(nome);
        }
        return createClerigo(nome);
    }
}
